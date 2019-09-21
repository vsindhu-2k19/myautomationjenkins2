pipelineJob('Pipeline2') {

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

  
               
