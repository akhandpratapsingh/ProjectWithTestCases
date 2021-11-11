pipeline {
  agent any
  tools {
    maven "Maven"
  }
  stages {
      stage("Test1") {
        steps {
		echo'Test1'
		sh'mvn test -Dtest="Devops2.*" -Dpublish'
		}
	post{
		success{
		  echo'Test1-success'
		  junit"**/target/surefire-reports/*Devops2.*.xml"
		}
       	     } 
      }
      stage("Test2") {
        steps {
                 echo'Test2'
                 sh'mvn test -Dtest="DevOps3.*" -Dpublish'
              }
        post{
              success{
                echo'Test2-success'
                junit"**/target/surefire-reports/*DevOps3.*.xml"
              }
           } 
       }
      stage("Test3") {
        steps {
                 echo'Test3'
                 sh'mvn test -Dtest="EnterpriseDevops.*" -Dpublish'
              }
        post{
              success{
                echo'Test3-success'
                junit"**/target/surefire-reports/*EnterpriseDevops.*.xml"
              }
           } 
      }
  }
}
