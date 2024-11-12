/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinprogra.model;

/**
 *
 * @author Alex Alvarado
 */
public class Persona {
    private String nombres;
    private String numeroDocumento;
    private String telefono;
    private String estado;

    // Constructor y getters
    public Persona(String nombres, String numeroDocumento, String telefono, String estado) {
        this.nombres = nombres;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getNombres() { return nombres; }
    public String getNumeroDocumento() { return numeroDocumento; }
    public String getTelefono() { return telefono; }
    public String getEstado() { return estado; }
}
