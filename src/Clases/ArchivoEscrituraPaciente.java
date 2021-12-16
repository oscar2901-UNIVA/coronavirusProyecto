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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscarjavierpereztorres
 */
public class ArchivoEscrituraPaciente {
    private String nombre; 
    private int edad;
    private long numero;
    private String sintomas;
    private String correo;
    private String sexo;
    private String municipio;
   

    
    

    public ArchivoEscrituraPaciente() {
    }

    public String getMuniciopio() {
        return municipio;
    }

    public void setMuniciopio(String municiopio) {
        this.municipio = municiopio;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   

        
    
    
    //Metodo para "guardar los archivos" de alumno
    public boolean GuardarPacientes() throws IOException{
        
        //Variable que guarda el resultado
        boolean res=false;
        File datos =new File("BaseDeDatosPacientes.txt");
        FileWriter fw;
        
        try{
            
            fw=new FileWriter(datos,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String cad=nombre+"#"+sexo+"#"+edad+"#"+municipio+"#"+numero+"#"+correo+"#";
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
    
    public void GuardarPaciente2(){
        try{
            FileWriter fw = new FileWriter("BaseDeDatosPacientes.txt",true);
            
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(getNombre()+"#"+getSexo()+"#"+getEdad()+"#"+getMuniciopio()+"#"+getNumero()+"#"+getCorreo()+"#");   
            bw.newLine();
            bw.close();  
            System.out.println("Success");  

        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }
    }
    
    
//    
//    
//    
//    
//    
//    
//    
 public void BorrarPacientes(){
        try {
            FileWriter fw = new FileWriter("BaseDeDatosPacientes.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEscrituraPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
  
    
   
    
    
    
    
}



