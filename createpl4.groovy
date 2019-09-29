pipelineJob('P4DSJ') {
    parameters {
		stringParam('EnvironmentPL',"$EnvironmentSeed", "Environment")
                stringParam('ApplicationPL',"$ApplicationSeed", "Application ")
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
