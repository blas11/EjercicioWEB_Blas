@CompraWeb
Feature: Flujo de compra en demoblaze

  @Compra
  Scenario Outline: Validar que un usuario registrado pueda realizar una compra en abstracta
    Given que me logueo a abstracta
    When agrego <cantProds> productos de la categoria <categoria>
    And visualizo el carrito
    And completo el 'Checkout' como invitado: 'Guest Checkout'
    Then finalizo la compra
    And visualizo la confirmación: “Your order has been placed!”
    Examples:
      | cantProds | categoria     |
      |           | Phones & PDAs |
