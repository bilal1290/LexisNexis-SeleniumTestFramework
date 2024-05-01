Feature: Risk Solutions Financial Services functionality tests

  Scenario: Verify FinancialServices/FinancialCrimeCompliance Element is Visible Under Industry Dropdown
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I verify heading "Transform Your Risk Decision Making"
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Financial Crime Compliance
    Then I verify sub heading "Financial Crime Compliance"

  Scenario: Verify FinancialServices/FraudAndIdentityManagement Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Fraud and Identity Management
    Then I verify sub heading "Fraud and Identity Management"

  Scenario: Verify FinancialServices/CustomerDataManagement Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Customer Data Management
    Then I verify sub heading "Customer Data Management"

  Scenario: Verify FinancialServices/CreditRiskAssessment Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Credit Risk Assessment
    Then I verify sub heading "Credit Risk Assessment"

  Scenario: Verify FinancialServices/CollectionsAndRecovery Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Collections and Recovery
    Then I verify sub heading "Collections and Recovery"

  Scenario: Verify FinancialServices/InvestigationsAndDueDiligence Element is Visible and Clickable
    Given I am on the LexisNexis Risk Solutions page
    And I accept cookies
    And I click Choose your industry dropdown
    And I click on element financial service from dropdown
    When I click on Investigations and Due Diligence
    Then I verify sub heading "Investigations and Due Diligence"

