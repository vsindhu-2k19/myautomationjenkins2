node ("$NodeName") {
    wrks = env.WORKSPACE
    stage("Prepare"){
        println("Preparing...")
        git(
                url: "https://github.com/vsindhu-2k19/myautomationjenkins2.git",	
                branch: "master"
	    )
        dir('config') {
          git(
                url: "https://github.com/vsindhu-2k19/conf.git",
                branch: "master"
	        )  
        }
        
        
    }
    stage("Clone Application"){
        load 'app/clne4.groovy'
    }
    stage("Build"){
        load 'app/bld4.groovy'
    }
    stage("Test"){
        println("Testing...")
    }
    stage("Deploy"){
        println("Deploying...")
    }
}
