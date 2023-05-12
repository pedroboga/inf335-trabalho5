pipeline {
    agent any
    
    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/pedroboga/inf335-trabalho5'
                //sh "mvn -Fmaven.test.failure.ignore=true clean package"
                dir('src-trabalho4') {
                    sh "mvn clean package -Dmaven.test.failure.ignore=true"
                }
            }
            
            post {
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts '*.jar'
        }
    }
        }
    }
}
