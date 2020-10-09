pipeline {
    agent any

    tools {nodejs "node"}

    stages {
        stage('Login to Controller') {
            steps {
                sh '''
                echo 'Hello World'
                node -v
                npm -v
                newman -v
                '''
            }
        }
    }
}
