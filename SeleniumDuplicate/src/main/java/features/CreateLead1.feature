Feature: Create Leads in LeafTaps
#Scenario: Create Leads in LeafTaps application
#
#Given Open the browser
#And Load URL
#And Enter Username
#And Enter Password
#And click Login
#And CRMSFA
#And Click leadstab
#And Click createlead
#And Enter Companyname
#And Enter firstname
#And Enter Lastname
#And Click Create Lead button
#Then Leads created successfully

Scenario Outline: Create Leads in LeafTaps application

#Given Open the browser
#And Load URL
And Enter Username1 as <Uname>
And Enter Password1 as <Password>
And click Login1
And CRMSFA1
And Click leadstab1
And Click createlead1
And Enter Companyname1 as <Compname>
And Enter firstname1 as <fname>
And Enter Lastname1 as <lname>
And Click Create Lead button1
Then Leads created successfully
#And Close the browser


Examples:
|Uname|Password|Compname|fname|lname|
|DemosalesManager|crmsfa|Accenture|sugavanesh|chandrasekar|
|Democsr|crmsfa|Accenture|Satheesh|Marisamy|



