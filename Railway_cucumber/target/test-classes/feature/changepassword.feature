Feature: Change password
    Scenario: user can change password when click tab change password
        Given Login with valid account
        When Fill current password
        When Fill new password
        When Fill confirmpassword
        When Click Change Password button
        Then Change password successfully
