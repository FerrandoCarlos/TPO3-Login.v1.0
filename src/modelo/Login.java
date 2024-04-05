/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author agustin
 */
public class Login {
    private String usuario;
    private String clave;
    
    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
     
    public boolean verificarDatos(Login loginIngresado) {
        return this.usuario.equals(loginIngresado.getUsuario()) && this.clave.equals(loginIngresado.getClave());
    }

    
    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
