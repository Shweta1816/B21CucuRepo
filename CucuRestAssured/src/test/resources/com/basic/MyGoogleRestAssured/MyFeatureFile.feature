Feature: Testing basics

#Scenario: 1.I want to test google is up and running
#Given google have website
#When I hit google application
#Then I validate status code

#Scenario: 2.I want to test google is up and running
#When I hit google application
#Then I validate status code

#Scenario: 3.validate fb login

Scenario: 2.I want to test that I am gettinfg data from F1 circuit 
When I hit the F1 race application
Then I validate the status code of F1 app
Then I want F1 race data