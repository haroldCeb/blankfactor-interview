#language: en
#project: example
#client: example
#made by: example
#email: example
#phone: example
#website: example
@blank-factor-homework
#noinspection CucumberTableInspection
Feature: It is required to navigate to blank factor homepage and perform some interactions

  @blank-factor-homepage-interactions
  Scenario: It is required to performs basic interactions on the homepage
    Given the user navigates up to the powering innovation in retirement services section
    When the user navigate to contact page
    Then URL and the title are validated
