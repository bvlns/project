node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project/new/master'
 }
 
 stage('Compile-Package'){
    // 
   def mvnHome = tool name: 'maven-3', type: 'maven'
   sh "$(mvnHome)/bin/mvn package" 
 }
}
