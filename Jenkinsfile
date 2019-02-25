node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project'
 }
 
 stage('Compile-Package'){
    // Path for mavenHome
   def mvnHome = tool name: 'Maven-3', type: 'maven'
   sh "${mvnHome}/bin/mvn package"
 }
  stage('Upload-artifacts'){
   s3Upload consoleLogLevel: 'INFO', dontWaitForConcurrentBuildCompletion: false, entries: [[bucket: 'srini.com', excludedFile: '', flatten: false, gzipFiles: false, keepForever: false, managedArtifacts: false, noUploadOnFailure: false, selectedRegion: 'us-east-1', showDirectlyInBrowser: false, sourceFile: '/var/lib/jenkins/workspace/Publish-to-S3/target/jobassist*', storageClass: 'STANDARD_IA', uploadFromSlave: false, useServerSideEncryption: false]], pluginFailureResultConstraint: 'SUCCESS', profileName: 's3upload', userMetadata: [] 
  }
  }
