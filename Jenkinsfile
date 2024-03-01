pipeline {
    agent any
    tools {
        jdk 'jdk17'
        maven 'maven3.6'
    }
    environment {
        SCANNER_HOME= tool 'sonar-scanner'
    }

    stages {
        stage('Git checkout') {
            steps {
                git changelog: false, credentialsId: 'ee87ce82-b308-4487-90fd-acbea7fbe1d8', poll: false, url: 'https://github.com/petkanov/java-application.git'
            }
        }

        stage('Compile') {
            steps {
                sh "mvn clean verify"
            }
        }

        stage('SonarQube') {
            steps {
				withSonarQubeEnv('DockerSonarQube') {
					sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=java-application \
					-Dsonar.java.binaries=. \
					-Dsonar.projectKey=java-application '''
				}
			}
        }

        stage('Build') {
            steps {
				sh "mvn clean package"
			}
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    withDockerRegistry(credentialsId: '8b105c3d-a5b4-4318-8ee2-cf9488fdf16a', toolName: 'docker') {
                        sh "docker build -t java-application -f docker/Dockerfile ."
                        sh "docker tag java-application ppetkanov/java-application:latest"
                        sh "docker push ppetkanov/java-application:latest"
                    }
                }
            }
        }
    }
}