def COLOR_MAP = ['SUCCESS': 'good', 'FAILURE': 'danger', 'UNSTABLE': 'danger', 'ABORTED': 'danger']

def getBuildUser() {
  return currentBuild.rawBuild.getCause(Cause.UserIdCause).getUserId()
}
pipeline {
    environment {
        BUILD_USER = ''
    }
    agent any

    parameters {
        string(defaultValue: "10.1.1.6", description: 'Controller (UDF URL / IP Address)', name: 'controllerUrl')
        string(defaultValue: "admin@test.com", description: 'Controller Username', name: 'username')
        password(description: 'Controller Password', name: 'password')
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
        stage('Slack Message') {
            steps {
                
                sh 'BUILD_USER = getBuildUser()'
                
                slackSend channel: '#apim-garage-day',
                color: COLOR_MAP[currentBuild.currentResult],
                message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} by ${BUILD_USER}\n More info at: ${env.BUILD_URL}"
            }
        }
    } 
}
