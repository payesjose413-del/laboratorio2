/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2;

import java.util.ArrayList;

public class Usuario {
    // ESTA ES LA LÍNEA QUE TE FALTA. Por eso marca error rojo
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    private String nombreUsuario;
    private String clave;
    private boolean activo;

    public Usuario(String nombreUsuario, String clave, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public String getClave() { return clave; }
    public boolean isActivo() { return activo; }
    public void setClave(String clave) { this.clave = clave; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
    
