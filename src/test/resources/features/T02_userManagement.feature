@userManagement
Feature: User Management on Contact List Application
  As an admin
  I want to manage users (create, update, delete, search)
  So that I can maintain the user database

  Background:
    Given I open the browser
    And I navigate to the Contact List login page
    And I login with valid credentials

  @smoke @create
  Scenario: Create a new user
    When I navigate to the Add Contact page
    And I enter valid user details
    And I click the save button
    Then I should see the new user in the contact list

  @update
  Scenario: Update existing user
    When I select an existing user
    And I update the user details
    And I save the changes
    Then I should see the updated information in the list

  @delete @critical
  Scenario: Delete a user
    When I select an existing user
    And I click the delete button
    And I confirm the deletion
    Then the user should be removed from the contact list

#  @smoke @search
#  Scenario: Search for a user
#    When I search for a user by name
#    Then I should see matching results
