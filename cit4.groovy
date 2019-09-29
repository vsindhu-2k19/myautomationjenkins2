node('master') {
	git(
		url: "$ApplRepoPL",
		
		branch: "master"
		)
	
    stage("Prepare"){
        println("Preparing...")
    }
    stage("Clone"){
        load ('app/clne4.groovy') 
    }
    stage("Build"){
        println("Building the app using maven")
    }
    stage("Test"){
        println("Testing...")
    }
    stage("Deploy"){
        println("Deploying...")
    }
}
