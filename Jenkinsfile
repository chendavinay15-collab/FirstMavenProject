pipeline {

    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {

        success {
            emailext(
                to: 'chendavinay.23.cse@anits.edu.in',
                subject: 'Jenkins SUCCESS - FirstMaven-CI',
                body: 'FirstMaven-CI build completed successfully.'
            )
        }

        failure {
            emailext(
                to: 'chendavinay.23.cse@anits.edu.in',
                subject: 'Jenkins FAILURE - FirstMaven-CI',
                body: 'FirstMaven-CI build failed. Please check Jenkins Console Output.'
            )
        }
    }
}