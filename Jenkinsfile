node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project/new/master'
 }
 
 stage('Compile-Package'){
    // def mvnHome = tool 'maven3'
    tool name: 'maven-3', type: 'maven'
    sh "$(mvnHome)/bin/mvn package" 
 }
}
