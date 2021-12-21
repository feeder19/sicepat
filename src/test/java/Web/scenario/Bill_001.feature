@important
Feature: Login Feature
  Verify user ketika Login masuk ke aplikasi web billing
  Scenario: : Login as user aktif billing
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    Then success message is displayed