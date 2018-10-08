@Leads
Feature: Leads Creation
  As a Test Engineer I want to test Leads Creation functionality.

  Background: User should be on Home page
    Given I am on the Login page URL "http://localhost:8888/index.php?"
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button
    Then I sould see application homepage

  @sanity @regression
  Scenario: Create Leads
    When I click on leads link
    And I click on leads plus button
    And I select First Name title as "Mr."
    And I enter First Name "auto_firstName"
    And I enter last name "auto_lastName"
    And I enter Company name "auto_company"
    And I enter Title "auto_company"
    And I select Lead Source "Employee"
    And I select Industry "Banking"
    And I enter Annual Revenue "100"
    And I enter No Of Employees "2"
    And I enter Secondary Email "info.test@gmail.com"
    And I enter Street "7535 Torrey Santa Fe Road"
    And I enter Postal Code "92129"
    And I enter Country "US"
    And I enter Description "auto_Description"
    And I enter Phone "9999999999"
    And I enter Mobile "9999999999"
    And I enter Fax "Fax details"
    And I enter Email "info.test@gmail.com"
    And I enetr Website "auto_website"
    And I select Lead Status "Attempted to Contact"
    And I select Assigned To "Administrator"
    And I click on Save button
    Then I should see lead creation success message
    And I should verify leads information
