pipeline {
    agent any

    parameters {
        string(defaultValue: "10.1.1.6", description: 'Controller (UDF URL / IP Address)', name: 'controllerUrl')
        string(defaultValue: "admin@test.com", description: 'Controller Username', name: 'username')
        password(description: 'Controller Password', name: 'password')
    }

    tools {nodejs "node"}

    stages {
        stage('Login to Controller') {
            steps {
                sh '''
                set +x
                echo "Running Login Script"
                ./Scripts/login.sh $controllerUrl $username $password
                set -x
                '''
            }
        }
    }
}
