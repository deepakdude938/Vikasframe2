Feature: This feature will  add two nums and check whether the result is even or odd
@data
Scenario Outline: 
   Given User has two numbers <no1> and <no2>
   When  User add both the numbers
   Then  Addition of result must be even
   
   Examples:
   |no1|no2|
   |12|10|
   |15|17|
   |14|18|
   |11|19|
   |10|10|