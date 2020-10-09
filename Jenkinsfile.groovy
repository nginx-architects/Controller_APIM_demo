pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                node --version
                npm --version
            }
        }
    }
}
