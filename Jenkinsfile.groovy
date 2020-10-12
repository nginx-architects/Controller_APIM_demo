pipeline {
    agent any

    tools {nodejs "node"}

    stages {
        stage('Login to Controller') {
            steps {
                sh '''
                echo 'Hello World'
                ./login.sh
                '''
            }
        }
    }
}
