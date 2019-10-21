 Feature: Verify content on regression page
 
 
 @HomeTest 
Scenario: Verify user can search for products for regression testing
 Given Read the Test data form Test data file for existing customer "TC_002"
 Given User naviagate to Home Page
When user logged with valid credentials
 When user search for products