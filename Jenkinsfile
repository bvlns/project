node{
  stage('SCM Checkout'){
    git 'https://github.com/bvlns/project'
 }
 
 stage('Compile-Package'){
    // change
   def mvnHome = tool name: 'maven-3', type: 'maven'
   sh "${mvnHome}/bin/mvn package"
 }
  stage('upload-artifacts') {
  
   s3Upload consoleLogLevel: 'INFO', dontWaitForConcurrentBuildCompletion: false, entries: [[bucket: 'project-latestcode/artifacts', excludedFile: '', flatten: false, gzipFiles: false, keepForever: false, managedArtifacts: true, noUploadOnFailure: false, selectedRegion: 'us-east-1', showDirectlyInBrowser: false, sourceFile: '**/*.apk', storageClass: 'STANDARD', uploadFromSlave: false, useServerSideEncryption: true]], pluginFailureResultConstraint: 'FAILURE', profileName: 'Publish', userMetadata: []
  }
}
