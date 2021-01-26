# Language: en
@stories
Feature: Shopping for garments

  @Scenario1
  Scenario: Amir purchases several garments at platform
    Given Register on the page
    |stremail|srtname|srtlast|strcontrasena|strcompania|strdireccion|strdireccion2|strcity|strpostal|strtelefono|
    |inge53@gmail.com|Alexander|Cordoba|1945854J47|SFT TEST|KR 22 21-45|Apto. 24|New York |54110    |354877521|
    When To make a purchase

    Then Confirm the completion of the purchase
    |strconfirmacion|
    |Order confirmation|