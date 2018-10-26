// Powered by Infostretch 

timestamps {

node ('raptor-builder') { 

	stage ('FreeStyleProject - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: 'master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '2c9d93af-6ff4-43d5-87a9-5a618aed1ce0', url: 'https://github.com/ravikiranbukka/Codes']]]) 
	}
	stage ('FreeStyleProject - Build') {
 	
withEnv(["JAVA_HOME=${ tool '"+JDK+"' }", "PATH=${env.JAVA_HOME}/bin"]) { 

// Unable to convert a build step referring to "EnvInjectBuildWrapper". Please verify and convert manually if required.
// Unable to convert a build step referring to "com.cloudbees.jenkins.plugins.sshagent.SSHAgentBuildWrapper". Please verify and convert manually if required.
// Unable to convert a build step referring to "org.jenkinsci.plugins.conditionalbuildstep.singlestep.SingleConditionalBuilder". Please verify and convert manually if required.		// Shell build step
sh """ 
ls -l

env 
 """
// Unable to convert a build step referring to "hudson.plugins.parameterizedtrigger.TriggerBuilder". Please verify and convert manually if required. 
	}
}
}
}