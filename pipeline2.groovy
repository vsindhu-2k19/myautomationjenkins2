pipelineJob('Pipeline2') {

checkout([$class: 'GitSCM', 
branches: [[name: '*/master']], 
browser: [$class: 'GithubWeb', repoUrl: 'https://github.com/vsindhu-2k19/myautomationjenkins2.git'], 
doGenerateSubmoduleConfigurations: false, 
extensions: [], 
submoduleCfg: [], 
userRemoteConfigs: [[url: 'https://github.com/vsindhu-2k19/myautomationjenkins2.git']]])

  definition {
        cps {
            script(readFileFromWorkspace('project-a-workflow.groovy'))
            sandbox()
        }
      }
}

  
               
