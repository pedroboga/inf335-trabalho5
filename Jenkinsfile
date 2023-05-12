pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/main']],
                          userRemoteConfigs: [[url: 'https://github.com/pedroboga/inf335-trabalho5']]])
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Add deployment steps here, if applicable
            }
        }
    }

    post {
        always {
            // Clean up steps, if any
        }

        success {
            // Actions to perform when the pipeline is successful
        }

        failure {
            // Actions to perform when the pipeline fails
        }
    }
}
