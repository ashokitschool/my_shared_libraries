def call() {           
  withSonarQubeEnv('Sonar-Server-7.8') {
	    sh "mvn sonar:sonar"
   }
}
