Feature: Register
    Scenario: User can register with valid infomation
        When I fill email "tien@gmail.com"
        When I fill "password" is "tranduytien"
        When I fill "confirmPassword" is "tranduytien"
        When I fill "PID" is "12345678"
        Then Register successfully