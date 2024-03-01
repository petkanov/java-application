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
    }
}