node ('master')
   {
     stage ('prepare')  
          {println("Preparing...")}
     stage ('Clone git') 
          {println("CLoning the git...") }
     stage ('Build') { }
     stage ('Deploy') { }
     stage ('Notify') { }
   }

  
               
