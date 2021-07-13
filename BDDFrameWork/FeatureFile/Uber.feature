Feature: Uber Bookiong Feature
Scenario: Booking Cab
Given User wants to select a car type "sedan" from uber app
When User select car "sedan" and pick up point "Banglore" and drop point "Pune"
Then Driver Starts the journey
And driver ends the journey
Then User pays 1000USD