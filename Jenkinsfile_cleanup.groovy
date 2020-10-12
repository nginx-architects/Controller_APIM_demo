pipeline {
    agent any

    parameters {
        string(defaultValue: "10.1.1.6", description: 'Controller (UDF URL / IP Address)', name: 'controllerUrl')
        string(defaultValue: "admin@test.com", description: 'Controller Username', name: 'username')
        password(defaultValue: "Admin123", description: 'Controller Password', name: 'password')
    }

    tools {
        nodejs "node"
    }

    stages {
        stage('Clean up Controller') {
            steps {
                sh '''
                set +x
                ./Scripts/CleanupArtifact.sh $controllerUrl $username $password
                set -x
                '''
            }
        }
    }
}
