pipelineJob('Pipeline2') {
  description("Pipeline created automatically through Task3")
  displayName('Project D')
 scm {git {
         remote {
                name('origin')
                url('https://github.com/vsindhu-2k19/myautomationjenkins2.git')
               }
           }
      }  
   
definition {
         cps  {
                script(readFileFromWorkspace('C2.groovy'))
                sandbox()
              }
           }   
}

  
               
