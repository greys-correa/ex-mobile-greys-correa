Feature: login en el app
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @loginOK
  Scenario : Iniciar sesión
    Given El usuario abre el app login.
    When El usuario inicia sesión con sus credenciales
    Then valido que debería aparecer el título de "PRODUCTS"


  @loginBloqueado
  Scenario : Iniciar sesión user bloqueado
    Given El usuario inicia el app login.
    When El usuario inicia sesión con sus credenciales usuario  Bloqueado
    Then valido que debería aparecer el msn de "Sorry, this user has been locked out."


