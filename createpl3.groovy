pipelineJob('P3DSJ') {
    parameters {
		stringParam('ApplRepoPL',"$AppRepoSeed", "Application code repo to build")
    }
    definition {
        cps {
			def jobScript = readFileFromWorkspace('cit3.groovy')
			script(jobScript)
			def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
			approvals.approveScript(approvals.hash(jobScript,"groovy"))
        }
    }
}
