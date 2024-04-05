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
    private final String usuarioActual="alumno@ulp.edu.ar";
    private final String claveActual="12345678";
    
    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public Login() {
       
    }
     
    public boolean verificarDatos(Login loginIngresado) {
        return usuarioActual.equals(loginIngresado.getUsuario()) && claveActual.equals(loginIngresado.getClave());
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }

    public String getClaveActual() {
        return claveActual;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", clave=" + clave + '}';
    }
    
    
}
