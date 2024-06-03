#FEATURE FILE********************
#All feature files have feature extensions
#Feature files are written in Gherkin language
#Feature files are used to create test scenarios/test cases
#All feature files must begin with Feature:keyword
#One feature file can not have more than one Feature:keyword
#Scenario keyword is used to create test cases
#One feature file can have more than one Scenario keyword
#Each step must begin with a Gherkin keyword:Given(mostly precondition),When,And,Then(verification),But,*
#STEP DEFINITIONS**************************
#I create test Scenarios,I need to generate step definitions to write my code

Feature: US001 Amazon SearchBox Test
  Scenario: TC01 iphone search
    Given user is on the google home page
    And user search for iphone
    Then verify the result contains iphone
    And closes the application