Feature: Addtocart

Scenario Outline: Positive test validating to addtocart
Given Initialize the browser with chrome
And Navigate to  "http://automationpractice.com/index.php?controller=authentication&back=my-account"  Site
When User enters <username> and <password> and logs in
Then Click on add to cart
And close browsers

Examples:
|username			|password	|
|standard_user	|secret_sauce		|































































































































































































































