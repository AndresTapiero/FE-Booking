package org.example.utilities;

public enum Constants {

    CUSCO("CUSCO");
    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
