Feature: Test Background feature

Background: User is Logged in
Given I navigate to Login Page
Then I submit username and password
Then I should be logged in

Scenario: Search a product and add the first product to User basket
Given User search for Sony TV
Then Add the first product to User basket


Scenario: Search a product and add the second product to User basket
Given User search for Iphone
Then Add the second product to User basket
