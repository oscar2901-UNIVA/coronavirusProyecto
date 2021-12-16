
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoEscrituraHospitales {
    
    
    private String nombreHospital; 
    
    private String Seguro;

    public ArchivoEscrituraHospitales() {
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

   

    

    public String getSeguro() {
        return Seguro;
    }

    public void setSeguro(String Seguro) {
        this.Seguro = Seguro;
    }
    
     public boolean save() throws IOException{
        
        //Variable que guarda el resultado
        boolean res=false;
        File datos =new File("BaseDeDatosHospitaes.txt");
        FileWriter fw;
        
        try{
            
            fw=new FileWriter(datos,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String cad=nombreHospital+"#"+Seguro+"#";
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
    
    public void GuardarHospital2(){
        try{
            FileWriter fw = new FileWriter("BaseDeDatosHospitaes.txt",true);
            
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(getNombreHospital()+"#"+getSeguro()+"#");   
            bw.newLine();
            bw.close();  
            System.out.println("Success");  

        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }
    }
    
     public void BorrarHospitales(){
        try {
            FileWriter fw = new FileWriter("BaseDeDatosHospitaes.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEscrituraHospitales.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
}
