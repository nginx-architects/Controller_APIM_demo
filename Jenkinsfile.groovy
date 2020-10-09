pipeline {
    agent any

    stages {
        stage('Login to Controller') {
            steps {
                sh '''
                echo 'Hello World'
                node --version
                npm --version
                '''
            }
        }
    }
}
