Feature:Click tabs on Trendyol homepage and add a product into basket

  @smoke
  Scenario: user should be login
    Given user is on trendyol page
    When user click first login button
    Then login page should be open
    When user enter email and password
    And click second login button
    Then home page should be open
    When user click woman tab
    Then woman page should be open
    When user click man tab
    Then man page should be open
    When user click kid tab
    Then kid page should be open
    When user click home life tab
    Then home life page should be open
    When user click supermarket tab
    Then supermarket page should be open
    When user click cosmetic tab
    Then cosmetic page should be open
    When user click shoe bag tab
    Then shoe bag page should be open
    When user click watch accessory tab
    Then watch accessory page should be open
    When user click electronic tab
    Then electronic page should be open
    And user click man tshirt page
    Then verify the images loaded successfully for products
    And user select a product
    And user click add to basket button
    Then product should be added into basket
