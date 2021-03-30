Feature: Login functionality for Adactin Application

Scenario: user enters username and password 
Given user launch the application 
When user enter "BossPremaSuba" as username
And user enter "subaprem27" as password
Then user verify valid username and valid password

Given user select the Location
When user select the Hotels
And user select the Room Type
When user select the Number of Rooms
And user select the Check In Date
When user select the Check Out Date
And user select Adult Per Room
When user select the Children per Room
Then click the Search


When click the radiobtn
And click the continue

When user enter firstname
And user enter lastname
When user enter address
And user enter credit card no
When user enter credit card type
And user select expiry month
When user select expiry year 
When user enter cvv number
Then click booknow




 
  


