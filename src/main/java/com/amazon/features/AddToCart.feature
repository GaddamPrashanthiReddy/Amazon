Feature: Adding Product to cart and payment methods

Background:

Given Open the browser and enter the url of the website
When I click on Accounts and Lists it opens SignIn Page 
Then I enter Valid Emailid and click on continue  
Then I enter Valid password and checks for remember me
When I click on login it enters into Homepage



# Scenario-1
Scenario: Shooping Cart Page should be opened
When I click on Open Menu it goes to shop by category
Then click on Beauty,Health,Grocery it goes to Grocery and Gourment foods
Then click on Tea,coffee and beverages it opens coffee tea page
When I click on cola and soft drinks it opens soft drinks page
Then click on coco cola product
When I click on Add to cart it goes to Amazon shopping cart
Then click on cart the product gets add to shopping cart 
Then close the browser of the website

#Scenario-2
Scenario: User should get the payment method page

When I click on Cart Icon it opens the shopping cart page
Then click on Proceed to buy it goes to delivery address page
When I click on deliver to this address it takes to shipping delivery page
Then click on continue it goes to payment method page
And close  browser of the website


