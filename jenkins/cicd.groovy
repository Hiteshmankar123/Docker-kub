pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
              git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        stage('Build') { 
            steps {  
                     
            }
        }
        stage('Test') { 
            steps {
                echo "Test successful"                
            }
        }
        stage('Deploy') { 
            steps {  
               echo "deploy successful"       
            }
        }
    }
}