Feature: Employee Search
 Scenario: Search employee by Id
  Given user is navigated to HRMS
  And user logins with valid admin credentials to HRMS application
  And user navigates to EmployeeList page
  When user enters valid employee ID
  And user clicks on the search button
  Then user see employee information is displayed
  
Scenario: Search employee by name
  Given user is navigated to HRMS
  And user logins with valid admin credentials to HRMS application
  And user navigates to EmployeeList page
  When user enters valid employee name
  And user clicks on the search button
  Then user see employee information is displayed

