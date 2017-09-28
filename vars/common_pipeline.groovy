pipeline {
    agent any 
    stages {
        //Pipeline script
        stage('Start') { 
            steps {
                echo "Start..."
            }   
        }
        
        stage('Compile') { 
            steps {
                sh "ls"
            } 
        }
    } 
}