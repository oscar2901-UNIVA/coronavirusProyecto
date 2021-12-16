/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscarjavierpereztorres
 */
public class ArchivoEscrituraAdministrador {
   
    public String nombre;
    public String password;

    public ArchivoEscrituraAdministrador(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public ArchivoEscrituraAdministrador() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

   
    
    
    
    
      public boolean saveAdministradores() throws IOException{
        
        //Variable que guarda el resultado
        boolean res=false;
        File datos =new File("BaseDeDatosAdministradores.txt");
        FileWriter fw;
        
        try{
            
            fw=new FileWriter(datos,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String cad=nombre+"#"+password+"#";
            bw.write(cad);
            bw.newLine();
            res=true;
            bw.close();
            fw.close();
            
            
            
        }catch(IOException ex){
            System.out.println("Error: "+ex.getLocalizedMessage());
            
           
            
        }
        
     
        return res;
        
    }

    
     public void GuardarAdministrador2(){
        try{
            FileWriter fw = new FileWriter("BaseDeDatosAdministradores.txt",true);
            
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(getNombre()+"#"+getPassword()+"#");   
            bw.newLine();
            bw.close();  
            System.out.println("Success");  

        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }
    }
    
     public void BorrarAdministrador(){
        try {
            FileWriter fw = new FileWriter("BaseDeDatosAdministradores.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEscrituraAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
     public boolean Compare(ArchivoEscrituraAdministrador administrador){
        
        return (administrador.getNombre().equals(this.getNombre())&&administrador.getPassword().equals(this.getPassword()));
    }
    
}
