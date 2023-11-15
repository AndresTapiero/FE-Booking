package org.example.utilities;

public enum Constants {

    CUSCO("CUSCO"),
    INITIAL_DATE("14 febrero 2024");
    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
