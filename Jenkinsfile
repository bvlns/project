node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project'
 }
 
 stage('Compile-Package'){
    // change
   def mvnHome = tool name: 'maven-3', type: 'maven'
   sh "${mvnHome}/bin/mvn package" 
 }
}
