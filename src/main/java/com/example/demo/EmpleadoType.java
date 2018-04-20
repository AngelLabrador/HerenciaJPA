package com.example.demo;

public enum EmpleadoType {

    BECARIO(Values.BECARIO),
    JUNIOR(Values.JUNIOR),
    EXPERTO(Values.EXPERTO);

    private String value;

    EmpleadoType(final String value) { this.value = value; }

    public static class Values {
        public static final String BECARIO = "Becario";
        public static final String JUNIOR = "Junior";
        public static final String EXPERTO = "Experto";
    }
}
