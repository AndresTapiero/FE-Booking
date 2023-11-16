#language: es
  Característica: Como usuario quiero ingresar datos para realizar una busqueda

    Escenario: Como usuario de Booking quiero encontrar en donde hospedarme en Cusco
      Dado Que estoy en la pagina principal de Booking
      Cuando ingrese los datos de busqueda seleccionando habitacion
      Entonces podre ver el precio del alojamiento seleccionado

    Escenario: Como usuario de Booking quiero ver la alerta de Error al no ingresar un destino y presionar Buscar
      Cuando seleccione buscar sin ingresar un destino
      Entonces podre ver el mensaje de error

    Escenario: Como usuario de Booking quiero ver la alerta de Error al no ingresar un destino y presionar Buscar
      Dado Que estoy en la pagina reservas
      Cuando presione iniciar sesión
      Entonces Entonces veré la pantalla de Iniciar sesión