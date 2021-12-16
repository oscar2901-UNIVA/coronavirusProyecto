
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoEscrituraFarmacias {
    
    
    private String nombreFarmacia; 
    private String municipio;
    private String precio;

    public ArchivoEscrituraFarmacias() {
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

   
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
     public boolean save() throws IOException{
        
        //Variable que guarda el resultado
        boolean res=false;
        File datos =new File("BaseDeDatosFarmacia.txt");
        FileWriter fw;
        
        try{
            
            fw=new FileWriter(datos,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String cad=nombreFarmacia+"#"+municipio+"#"+precio+"#";
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

    public void GuardarFarmacia2(){
        try{
            FileWriter fw = new FileWriter("BaseDeDatosFarmacia.txt",true);
            
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(getNombreFarmacia()+"#"+getMunicipio()+"#"+getPrecio()+"#");   
            bw.newLine();
            bw.close();  
            System.out.println("Success");  

        }catch(IOException e){
            //System.out.println("Error E/S: "+e);
        }
    }
    
     public void BorrarFarmacia(){
        try {
            FileWriter fw = new FileWriter("BaseDeDatosFarmacia.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEscrituraFarmacias.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
