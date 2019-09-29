pipelineJob('P4DSJ') {
    parameters {
		stringParam('ApplRepoPL',"$AppRepoSeed", "Application code repo to build")
    }
    definition {
        cps {
			def jobScript = readFileFromWorkspace('cit4.groovy')
			script(jobScript)
			def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
			approvals.approveScript(approvals.hash(jobScript,"groovy"))
        }
    }
}
