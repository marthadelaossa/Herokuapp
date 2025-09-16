#language: es
Característica: CASO1 Registro de Usuario

  @CASO1
  Esquema del escenario: Registro Correcto de Usuario
    Dado       que el usuario se encuentra en la pagina <navegador> <url>
    Cuando     el usuario se registra como usuario <usuario> <clave>
    Entonces   el usuario valida el inicion de sesion

      Ejemplos:
      | navegador | url|usuario|clave|
      |chrome |https://the-internet.herokuapp.com/login| tomsmith | SuperSecretPassword!|



