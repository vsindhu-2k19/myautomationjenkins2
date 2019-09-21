pipelineJob('Pipeline2') {

  definition {
        cps {
            script(readFileFromWorkspace('C2.groovy'))
            sandbox()
        }
      }
}

  
               
