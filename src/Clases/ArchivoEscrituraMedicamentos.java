
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoEscrituraMedicamentos {
    private String nombreMedicamento; 
    
    private double precioUnitario;

    
    
    
    
    
    public ArchivoEscrituraMedicamentos() {
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

   

  

   
    
    
    public boolean save() throws IOException{
        
        //Variable que guarda el resultado
        boolean res=false;
        File datos =new File("BaseDeDatosMedicamentos.txt");
        FileWriter fw;
        
        try{
            
            fw=new FileWriter(datos,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String cad=nombreMedicamento+"#"+precioUnitario+"#";
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
    
     public void GuardarMedicamento2(){
        try{
            FileWriter fw = new FileWriter("BaseDeDatosMedicamentos.txt",true);
            
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(getNombreMedicamento()+"#"+getPrecioUnitario()+"#");   
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
 public void BorrarMedicamentos(){
        try {
            FileWriter fw = new FileWriter("BaseDeDatosMedicamentos.txt");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoEscrituraMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
  
    
    
    
    
}
