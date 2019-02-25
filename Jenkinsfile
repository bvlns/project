node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project'
 }
 
 stage('Compile-Package'){
    // Path for mavenHome
   def mvnHome = tool name: 'Maven-3', type: 'maven'
   sh "${mvnHome}/bin/mvn package"
 
   
  }
}
