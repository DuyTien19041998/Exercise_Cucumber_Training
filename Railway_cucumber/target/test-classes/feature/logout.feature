Feature: Logout
    Scenario: User can logout when login with account valid
        Given Navigate to Railway website
        When Click login tab
        When  Fill username
        When  Fill password
        When  Click login button
        When Click tab logout
        Then Logout successfully