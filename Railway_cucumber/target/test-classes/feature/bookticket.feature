Feature: Bookticket
    Scenario: User can book ticket when logined with valid account
        Given Navigate to Railway website ang login
        When Select depart date
        When Select depart from
        When Select arrive at
        When Select seat type
        When Select ticket amount
        When Click button book ticket
        Then BookTicket successfully
