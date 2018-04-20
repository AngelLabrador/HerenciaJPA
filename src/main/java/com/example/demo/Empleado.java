package com.example.demo;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "numeroEmpleado")
public class Empleado {

    @Id
    @GeneratedValue
    private Long numeroEmpleado;

    private String nombre;

    private String apellidos;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EmpleadoType type;
}
