@CompraWeb
Feature: Flujo de compra en demoblaze

  @Compra
  Scenario Outline: Validar que un usuario registrado pueda realizar una compra en abstracta
    Given que me logueo a abstracta
    When agrego <cantProds> productos de la categoria <categoria>
    And visualizo el carrito
    And completo el 'Checkout' como invitado: 'Guest Checkout'
      | FirstName | LastName | Email            | Telefono  | Company    | Address        | City | PostCode | Country | Region |
      | Tomas     | Blas     | tblas@correo.com | 963214585 | Company123 | Jirón Peru 123 | LIMA | 150102   | Peru    | Lima   |
    Then finalizo la compra
    And visualizo la confirmación: <validacion>
    Examples:
      | cantProds | categoria     | validacion                  |
      | 2         | Phones & PDAs | Your order has been placed! |
