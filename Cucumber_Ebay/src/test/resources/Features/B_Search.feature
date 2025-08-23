Feature: Search
Scenario Outline:
Given Open Ebay home page for searching product
When search <search1>
Then Display result
Examples:
|search|
|watch|
|mobile|
|headphones|
