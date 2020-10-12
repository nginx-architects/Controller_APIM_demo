pipeline {
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
        stage('Create environment based on params') {
            steps {
                sh'''
                set +x
                sed "s/controller_host/$controllerUrl/;s/controller_username/$username/;s/controller_password/$password/" ./PostmanCollections/Controller3.x_Env.postman_environment.json > temp_env.json
                set -x
                '''
            }
        }
        stage('Clean up Controller') {
            steps {
                sh './Scripts/CleanupArtifact.sh'
            }
        }
        stage('Remove temporary environment file') {
            steps {
                sh 'rm ./temp_env.json'
            }
        }
    }
}
