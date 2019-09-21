node ('master')
   {
     stage ('prepare')  
          {println("Preparing...")}
     stage ('Clone git') 
          load(app/clne.groovy)
     stage ('Build') { }
     stage ('Deploy') { }
     stage ('Notify') { }
   }

  
               
