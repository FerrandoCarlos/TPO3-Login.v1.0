/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import modelo.Login;
import view.loginView;

/**
 *
 * @author nn
 */
public class ctrlViewLogin {
    public static ArrayList<Login> listaUser; 
    private static Login loginModel;
    private static loginView lv;
    
    
    public static void CargarInstancia(loginView log){
        lv=log;
        listaUser= new  ArrayList<>();
        
    }
    
    
    public static void jBtnLogin(){
        loginModel=new Login(lv.getjTxtUser().getText(),lv.getjTxtClave().getText());
        
        if(loginModel.verificarDatos(loginModel)){
            listaUser.add(loginModel);
            main.viewDialogo("Credenciales correctas", "Usuario autorizado", 1);
            resetText();
        }else{
            main.viewDialogo("Credenciales incorrectas", "Usuario no autorizado", 0);
            lv.getjTxtUser().requestFocus();
        }
    }
    
    
    public static void resetText(){
        lv.getjTxtUser().setText("");
        lv.getjTxtClave().setText("");
    }
    
    public static void mostarLista(){
        for (Login login : listaUser) {
            System.out.println("Usuarios registrados" + login);
        }
    }
    
}
