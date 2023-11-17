#language: es
  Característica: Como usuario quiero validar  alertas de errores

    Escenario: Como usuario de Booking quiero ver la alerta de Error al no ingresar un destino y presionar Buscar
      Dado Que estoy en la pagina principal de Booking
      Cuando seleccione buscar sin ingresar un destino
      Entonces podre ver el mensaje de error

