pipeline {
    agent any
    
    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/pedroboga/inf335-trabalho5'
                sh "mvn -Fmaven.test.failure.ignore=true clean package"
            }
            
            post {
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'targe/*.jar'
        }
    }
        }
    }
}
