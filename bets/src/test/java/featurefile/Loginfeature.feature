Feature: Title of your feature
  I want to use this template for my feature file

  Background: loginpage
    Given open url
      And Enter username
      And Enter Password
      And Click submitButton

  @taskcreation
  Scenario: HourSpark Task
    Given Click Bizgurd Task
      And Click CrateTask
      And Enter TASK title String "task24"
      And Select The Priority
      And Select Department
      And Enter The Description
      And Upload the document
      And Click the createtaskButton
      And Open task
      And Click Task detail
      And Click CloseTask

  @ProjectEnquiry
  Scenario: create Project
    Given We clicked the Project enquiryTAB
      And Click InitiateProject
      And Enter Project Title
      And Select the pPriority
      And Select the Category
      And Select the Budget range
      And choose Start Date
      And choose Ending date
      And Enter Description
      And Upload Document
      And Click SubmitButton

  @Strategyhub
  Scenario: StrategyHub Tab
    Given Cick strategy hub
      And Click Taskdetails
