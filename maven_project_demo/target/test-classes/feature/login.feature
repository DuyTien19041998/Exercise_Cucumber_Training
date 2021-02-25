Feature: Test login
   Scenario: User can login with valid information
        Given Navigate to Railway website
        When   Click login tab
        When   Fill username
        When   Fill password
        When   Click button login
        Then Login successfully

#        Examples:
#        | username          | password
#        | demo@gmail.com    | tranduytien
#        | tien@gmail.com    | tranduytien
#        | duytien@gmail.com | tranduytien