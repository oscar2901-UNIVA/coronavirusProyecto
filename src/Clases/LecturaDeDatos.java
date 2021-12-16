/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.ArchivoEscrituraMedicamentos;
import Clases.ArchivoEscrituraPaciente;
import Clases.ArchivoEscrituraFarmacias;
import Clases.ArchivoEscrituraAdministrador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author apple
 */
public class LecturaDeDatos {
    List<ArchivoEscrituraPaciente> listaPacientes= new ArrayList<>();
    List<ArchivoEscrituraAdministrador> listaAdministradores= new ArrayList<>();
    List<ArchivoEscrituraFarmacias> listaFarmacias= new ArrayList<>();
    List<ArchivoEscrituraMedicamentos> listaMedicamentos= new ArrayList<>();
    List<ArchivoEscrituraHospitales> listaHospitales= new ArrayList<>();
    
    
    public LecturaDeDatos() {
    }
    
    
    
    
    
 public List<ArchivoEscrituraPaciente> ObtenerUsuario(){

        
        
        ArchivoEscrituraPaciente tempArchivoEscrituraPaciente = new ArchivoEscrituraPaciente(); 
        
        try{
            int i=0;
            java.io.FileReader fr=new java.io.FileReader("BaseDeDatosPacientes.txt");
            String Dato="";

            int valor=fr.read();

            Object[] row= new Object[5];
            while(valor!=-1){
                
        
        
          if((char)valor!='#'){
                    if((char)valor!='\n'&& valor!=13) Dato+=(char)valor;
                    
                }
                else{
                    if(i==0)tempArchivoEscrituraPaciente.setNombre(Dato);
                    if(i==1)tempArchivoEscrituraPaciente.setSexo(Dato);
                    if(i==2)tempArchivoEscrituraPaciente.setEdad(Integer.parseInt(Dato));
                    if(i==3)tempArchivoEscrituraPaciente.setMuniciopio(Dato);
                    if(i==4)tempArchivoEscrituraPaciente.setNumero(Long.parseLong(Dato));
                    if(i==5)tempArchivoEscrituraPaciente.setCorreo(Dato);
                   
                    i++;
                    Dato="";
                }
                if (i>5){
                    i=0;
                    listaPacientes.add(tempArchivoEscrituraPaciente);
                    tempArchivoEscrituraPaciente=new ArchivoEscrituraPaciente();

                }
                
                valor=fr.read();
            }
            Dato="";
            
            fr.close();
            
            
        }catch(IOException e){
            
        }

        return listaPacientes;
    
    }
 
    public int BuscarUsuario(String Nombre){
        boolean hayPacientes=false;
        int paciente=-1;
        int i=0;
        for (Iterator<ArchivoEscrituraPaciente> iterator = listaPacientes.iterator(); iterator.hasNext();) {
            ArchivoEscrituraPaciente next = iterator.next();
            if(next.getNombre().equals(Nombre)){
                hayPacientes=true;
                paciente=i;
            } 
            i++;
            
        }
        return paciente; 
    
    }
 
 
 
    public int BuscarAdministrador(String Nombre){
        boolean hayAdministrador=false;
        int admistrador=-1;
        int i=0;
        for (Iterator<ArchivoEscrituraAdministrador> iterator = listaAdministradores.iterator(); iterator.hasNext();) {
            ArchivoEscrituraAdministrador next = iterator.next();
            if(next.getNombre().equals(Nombre)){
                hayAdministrador=true;
                admistrador=i;
            } 
            i++;
            
        }
        return admistrador; 
    
    }
    
  public int BuscarFarmacia(String Nombre){
        boolean hayFarmacia=false;
        int farmacia=-1;
        int i=0;
        for (Iterator<ArchivoEscrituraFarmacias> iterator = listaFarmacias.iterator(); iterator.hasNext();) {
            ArchivoEscrituraFarmacias next = iterator.next();
            if(next.getNombreFarmacia().equals(Nombre)){
                hayFarmacia=true;
                farmacia=i;
            } 
            i++;
            
        }
        return farmacia; 
    
    }
 
 
 public int BuscarHospital(String Nombre){
        boolean hayHospital=false;
        int hospital=-1;
        int i=0;
        for (Iterator<ArchivoEscrituraHospitales> iterator = listaHospitales.iterator(); iterator.hasNext();) {
            ArchivoEscrituraHospitales next = iterator.next();
            if(next.getNombreHospital().equals(Nombre)){
                hayHospital=true;
                hospital=i;
            } 
            i++;
            
        }
        return hospital; 
    
    }
 
 public int BuscarMedicamentos(String Nombre){
        boolean hayMedicamentos=false;
        int medicamentos=-1;
        int i=0;
        for (Iterator<ArchivoEscrituraMedicamentos> iterator = listaMedicamentos.iterator(); iterator.hasNext();) {
            ArchivoEscrituraMedicamentos next = iterator.next();
            if(next.getNombreMedicamento().equals(Nombre)){
                hayMedicamentos=true;
                medicamentos=i;
            } 
            i++;
            
        }
        return medicamentos; 
    
    }
 
 
 

 public List<ArchivoEscrituraAdministrador> ObtenerAdministrador(){

        
        
        ArchivoEscrituraAdministrador tempArchivoAdministradorEscritura=new ArchivoEscrituraAdministrador(); 
        
        try{
            int i=0;
            java.io.FileReader fr=new java.io.FileReader("BaseDeDatosAdministradores.txt");
            String Dato="";

            int valor=fr.read();

            Object[] row= new Object[2];
            while(valor!=-1){
                
        
        
          if((char)valor!='#'){
                    if((char)valor!='\n'&& valor!=13) Dato+=(char)valor;
                    
                }
                else{
                    if(i==0)tempArchivoAdministradorEscritura.setNombre(Dato);
                    if(i==1)tempArchivoAdministradorEscritura.setPassword(Dato);
                    i++;
                    Dato="";
                }
                if (i>1){
                    i=0;
                    listaAdministradores.add(tempArchivoAdministradorEscritura);
                    tempArchivoAdministradorEscritura=new ArchivoEscrituraAdministrador();

                }
                
                valor=fr.read();
            }
            Dato="";
            
            fr.close();
            
            
        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }

        return listaAdministradores;
    
    }
 
 
 
 
 
 
 public List<ArchivoEscrituraFarmacias> ObtenerFarmacias(){
   ArchivoEscrituraFarmacias tempEscrituraFarmacias=new ArchivoEscrituraFarmacias();
   try{
            int i=0;
            java.io.FileReader fr=new java.io.FileReader("BaseDeDatosFarmacia.txt");
            String Dato="";

            int valor=fr.read();

            Object[] row= new Object[3];
            while(valor!=-1){
                
        
        
          if((char)valor!='#'){
                    if((char)valor!='\n'&& valor!=13) Dato+=(char)valor;
                    
                }
                else{
                    if(i==0)tempEscrituraFarmacias.setNombreFarmacia(Dato);
                    if(i==1)tempEscrituraFarmacias.setMunicipio(Dato);
                    if(i==2)tempEscrituraFarmacias.setPrecio(Dato);
                    i++;
                    Dato="";
                }
                if (i>2){
                    i=0;
                    listaFarmacias.add(tempEscrituraFarmacias);
                    tempEscrituraFarmacias=new ArchivoEscrituraFarmacias();

                }
                
                valor=fr.read();
            }
            Dato="";
            
            fr.close();
            
            
        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }

        return listaFarmacias;
    
    }

public List<ArchivoEscrituraMedicamentos> ObtenerMedicamentos(){
   ArchivoEscrituraMedicamentos tempEscrituraMedicamentos=new ArchivoEscrituraMedicamentos();
   try{
            int i=0;
            java.io.FileReader fr=new java.io.FileReader("BaseDeDatosMedicamentos.txt");
            String Dato="";

            int valor=fr.read();

            Object[] row= new Object[2];
            while(valor!=-1){
                
        
        
          if((char)valor!='#'){
                    if((char)valor!='\n'&& valor!=13) Dato+=(char)valor;
                    
                }
                else{
                    if(i==0)tempEscrituraMedicamentos.setNombreMedicamento(Dato);
                   
                    if(i==1)tempEscrituraMedicamentos.setPrecioUnitario(Double.parseDouble(Dato));
                    i++;
                    Dato="";
                }
                if (i>1){
                    i=0;
                    listaMedicamentos.add(tempEscrituraMedicamentos);
                    tempEscrituraMedicamentos=new ArchivoEscrituraMedicamentos();

                }
                
                valor=fr.read();
            }
            Dato="";
            
            fr.close();
            
            
        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }

        return listaMedicamentos;
    
    }

public List<ArchivoEscrituraHospitales> ObtenerHospitales(){
   ArchivoEscrituraHospitales tempHospitales=new ArchivoEscrituraHospitales();
   try{
            int i=0;
            java.io.FileReader fr=new java.io.FileReader("BaseDeDatosHospitaes.txt");
            String Dato="";

            int valor=fr.read();

            Object[] row= new Object[3];
            while(valor!=-1){
                
        
        
          if((char)valor!='#'){
                    if((char)valor!='\n'&& valor!=13) Dato+=(char)valor;
                    
                }
                else{
                    if(i==0)tempHospitales.setNombreHospital(Dato);
                    
                    if(i==1)tempHospitales.setSeguro(Dato);
                    i++;
                    Dato="";
                }
                if (i>1){
                    i=0;
                    listaHospitales.add(tempHospitales);
                    tempHospitales=new ArchivoEscrituraHospitales();

                }
                
                valor=fr.read();
            }
            Dato="";
            
            fr.close();
            
            
        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }

        return listaHospitales;
    
    }
   
 }
 
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

