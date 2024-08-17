pipeline{
    agent any
    triggers{
        pollSCM ( '* * * * *')
    }
    
    stages{
        stage('Checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/builderHub/CICD-01.git'
            }
        }
        stage('Code Compilation'){
            steps{
                sh 'mvn clean compile'
            }
        }
        stage('Code checkstyle'){
            steps{
                sh 'mvn checkstyle:checkstyle'
            }
        }
        stage('Code Build'){
            steps{
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }
        stage('Code Test'){
            steps{
                sh 'mvn test'
            }
        }
    }
    
    post{
        success{
             archiveArtifacts 'target/*.jar'
             jacoco()
             mail bcc: '', body: 'Job success', cc: '', from: '', replyTo: '', subject: 'Test', to: 'imran.ahmad@opstree.com'
        }
    }
    
}
