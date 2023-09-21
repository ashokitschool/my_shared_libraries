def call(sonar) {           
   withSonarQubeEnv(${sonar}) {
	    sh "mvn sonar:sonar"
   }
}