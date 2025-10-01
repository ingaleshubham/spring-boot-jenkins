
pipeline {
    agent any

    tools {
        maven 'Maven3'   // Must match name from Jenkins Global Tool Config
        jdk 'JDK17'      // Must match name from Jenkins Global Tool Config
    }

    environment {
        TOMCAT_HOME = 'D:\\Software\\apache-tomcat-10.1.46-windows-x64\\apache-tomcat-10.1.46'
        WAR_NAME    = 'spring-boot-jenkins-project-0.0.1-SNAPSHOT.war'
        DEPLOY_NAME = 'springapp.war'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                bat """
                del /Q "%TOMCAT_HOME%\\webapps\\%DEPLOY_NAME%"
                del /Q "%TOMCAT_HOME%\\webapps\\%DEPLOY_NAME%.war"
                copy /Y "target\\%WAR_NAME%" "%TOMCAT_HOME%\\webapps\\%DEPLOY_NAME%"
                """
            }
        }
    }

    post {
        success {
            echo "✅ Deployment successful: http://localhost:8080/${DEPLOY_NAME.replace('.war','')}"
        }
        failure {
            echo "❌ Build or deploy failed, check console logs"
        }
    }
}
