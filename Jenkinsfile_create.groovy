def COLOR_MAP = ['SUCCESS': 'good', 'FAILURE': 'danger', 'UNSTABLE': 'danger', 'ABORTED': 'danger']
pipeline {
    environment {
        BUILD_USER = ''
    }
    agent any

    parameters {
        string(defaultValue: "10.1.1.4", description: 'Controller (UDF URL / IP Address)', name: 'controllerUrl')
        string(defaultValue: "admin@nginxcontrollerdemo.com", description: 'Controller Username', name: 'username')
        password(defaultValue: "", description: 'Controller Password', name: 'password')
        string(defaultValue: "#nginx_demo_slack_integ", name: 'slack_channel')
    }

    tools {
        nodejs "node"
    }

    stages {
        stage('Create Artifacts within Controller') {
            steps {
                sh '''
                set +x
                ./Scripts/CreateArtifact.sh $controllerUrl $username $password
                set -x
                '''
            }
        }
    } 
    post {
        always{
            slackSend channel: "${slack_channel}",
                color: COLOR_MAP[currentBuild.currentResult],
                message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}"
        }
    }
}
