Feature: Remove

Scenario Outline: Positive test validation to Remove
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php?controller=authentication&back=my-account" Site
And Enter <username> and <password>
And click on login 
When User clicks on add to cart button
Then Item should be added in the cart
When User click on Remove
Then Item should be removed from thre cart
And close browsers

Examples:
|username			|password	|
|demo251999demo@gmail.com	|demo1234		|