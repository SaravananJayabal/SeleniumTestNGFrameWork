pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Running Maven Build...'
                bat 'mvn clean test'
            }
        }
    }
     post {

            success {
                echo 'Build completed successfully.'
            }

            failure {
                echo 'Build failed.'
            }

            always {
                echo 'Pipeline execution finished.'
            }
        }
}