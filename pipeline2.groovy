pipelineJob('Pipeline2') {
description("Pipeline created automatically through Task3")
displayName('Project D')
  
  scm {
        github('vsindhu-2k19/myautomationjenkins2',master)
      }  
 definition {
         cps  {
                script(readFileFromWorkspace('C2.groovy'))
                
              }
           }   
}

  
               
