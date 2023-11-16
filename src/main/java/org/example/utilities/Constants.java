package org.example.utilities;

public enum Constants {

    TITLE_AUTH_PAGE("Inicia sesión o crea una cuenta"),
    CUSCO("CUSCO"),
    FINISH_DATE("28 febrero 2024"),
    ENTER("Entrada"),
    EXIT("Salida"),
    FIVE_YEARS("5 años"),
    BOY("Niño 1"),
    CARD_NUMBER_INVALID("El número de tarjeta no es válido"),
    ALERT_ERROR("Por favor, introduce tu destino");
    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
