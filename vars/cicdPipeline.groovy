def call(Map config) {

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
                }
            }

            stage('Deploy') {
                steps {
                    echo "Deploying application..."
                }
            }

        }

    }

}
