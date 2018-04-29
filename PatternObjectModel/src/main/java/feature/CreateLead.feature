Feature: Leads in LeafTaps
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

#@smoke @sanity
#Scenario Outline: Create Leads in LeafTaps application
#
##Given Open the browser
##And Load URL
#And Enter Username as <Uname>
#And Enter Password as <Password>
#And click Login
#And CRMSFA
#And Click leadstab
#And Click createlead
#And Enter Companyname as <Compname>
#And Enter firstname as <fname>
#And Enter Lastname as <lname>
#And Click Create Lead button
##And Close the browser
#And verify the firstname as <fname>

#
#Examples:
#|Uname|Password|Compname|fname|lname|
#|DemosalesManager|crmsfa|Accenture|sugavanesh|chandrasekar|
#|Democsr|crmsfa|Accenture|Satheesh|Marisamy|

#Scenario Outline: Edit Leads in LeafTaps application
#
#And Enter Username as <Uname>
#And Enter Password as <Password>
#And click Login
#And CRMSFA
#And Click leadstab
#And Click FindLeads
#And Enter Firstname as <fname>
#And Clicking Leads button
#And Click Firstleadid
#And Click EditLead button
#And update Companyname as <compname>
#And Click update button
#Then verify company name as <compname>
#
#Examples:
#|Uname|Password|fname|compname|
#|DemosalesManager|crmsfa|sugavanesh|sugguupdate|
#|Democsr|crmsfa|Satheesh|Satupdate|


#Scenario Outline: Delete Leads in the LeafTaps application
#
#And Enter Username as <Uname>
#And Enter Password as <Password>
#And click Login
#And CRMSFA
#And Click leadstab
#And Click FindLeads
#And Click Phone tab
#And Enter Phonenumber as <phone>
#And Clicking Leads button
#And Store the firstLead id
#And Click Firstleadid
#And Click DeleteLead button
#And Click FindLeads
#And Enter Leadid
#And Clicking Leads button
#Then verify the text display as <text>
#
#Examples:
#|Uname|Password|phone|text|
#|DemosalesManager|crmsfa|1234567890|No records to display|

#Scenario Outline: Merge Leads in the LeafTaps Application
#
#And Enter Username as <Uname>
#And Enter Password as <Password>
#And click Login
#And CRMSFA
#And Click leadstab
#And Click MergeLeads
#And Click from lead link
#And first window switch as 1
#And Enter from leadid as <leadid>
#And Click findleads button
#And Click leadlink
#And Zero window switch as 0
#And click To Lead link
#And first window switch as 1
#And Enter from leadid as <secleadid>
#And Click findleads button
#And Click leadlink
#And Zero window switch as 0
#And Click Merge button
#And Click Yes Alert
#And Click Findleadbutton
#And Pass leadid as <leadid>
#And Clicking Leads button
#Then verify the text display as <text>;
#
#Examples:
#|Uname|Password|leadid|secleadid|text|
#|DemosalesManager|crmsfa|10134|10135|No records to display|

Scenario Outline: Duplicate Leads in LeafTaps Application

And Enter Username as <Uname>
And Enter Password as <Password>
And click Login
And CRMSFA
And Click leadstab
And Click FindLeads
And Click Email link
And Enter Emailid as <email>
And Clicking Leads button
And store first name value
And Click firstname
And click duplicate lead button
And click create lead button
Then compare first name 

Examples:
|Uname|Password|email|
|DemosalesManager|crmsfa|syed.musavir@leaftaps.com|