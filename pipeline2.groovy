pipelineJob('Pipeline2') {
description("Pipeline created automatically through Task3")
displayName('Project D')
  scm {
      git {
            remote {
                url('https://github.com/vsindhu-2k19/myautomationjenkins2.git') 
                  }
          }
      }    
  steps {  
         dsl {
                external('task1.groovy') 
             }
         }
}

  
               
