$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search and place order for Vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Selenium"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.step_search.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Cucumber\" Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.step_search.user_searched_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.step_search.something_results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Selenium"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.step_search.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Brinjal\" Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.step_search.user_searched_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.step_search.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.step_search.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected \"Brinjal\" items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.step_search.verify_selected_something_items_are_displayed_in_check_out_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});