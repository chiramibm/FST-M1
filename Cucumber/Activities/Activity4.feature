@Activity4
Feature:Data driven testing without examples

GIVEN: the user is on the login page
WHEN: the user enters "admin" and "password"
AND: clicks the submit button
THEN: get the confirmation text and verify message as "Welcome Back, admin"
In the LoginTestSteps Class, add another @When definition statement.
In this @When, the statement should have {string} in place of username and password.
The function below it should have two String arguments, username and password.