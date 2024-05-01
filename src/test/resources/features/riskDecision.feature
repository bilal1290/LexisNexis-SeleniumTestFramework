Feature: LexisNexis® Risk Solutions functionality tests

  Scenario: Verify Financial Services Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I verify heading "Transform Your Risk Decision Making"
    When I click on element financial services
    Then I verify sub heading "Financial Services"

  Scenario: Verify Insurance Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    When I click on element Insurance
    Then I verify sub heading "Insurance"

  Scenario: Verify Life and Pensions Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    When I click on element Life and Pensions
    Then I verify sub heading "Life and Pensions"

  Scenario: Verify Corporations and Non-Profits Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    When I click on element Corporations and Non-Profits
    Then I verify sub heading "Corporations and Non-Profits"