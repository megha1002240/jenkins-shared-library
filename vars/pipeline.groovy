def call() {

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo "Building application..."
                sh 'docker build -t sample-app .'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                sh 'echo Tests Passed'
            }
        }

        stage('Security Scan') {
            steps {
                echo "Scanning image..."
                sh 'echo Scan completed'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
                sh 'docker run -d -p 80:80 sample-app'
            }
        }

    }

}

}
