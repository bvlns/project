node{
  stage('Source'){
    git 'https://github.com/bvlns/project/new/master'
 }
 
 stage('Build'){
    // def mvnHome = tool 'maven3'
    sh "mvn clean package" 
 }
    
