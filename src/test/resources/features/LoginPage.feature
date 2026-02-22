Feature: Login to HRM Application

  Background:
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login successfully and new page open

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples:
      | username | password  | errorMessage        |
      | Yasser   | yasser123 | Invalid credentials |
      | Noor     | noor123   | Invalid credentials |
      | Rahma    | rahma123  | Invalid credentials |

  @FacebookLink
  Scenario: Verify FaceBook Icon On Login Page
    Then User should be able to see FaceBook Icon

  @LinkedInLink
  Scenario: Verify LinkedIn Icon On Login Page
    Then User should be able to see LinkedIn Icon

  @ForgetPassword
  Scenario: Verify Forget Password Link On Login Page
    When User clicks on forgot your password link
    Then User should navigate to new Page