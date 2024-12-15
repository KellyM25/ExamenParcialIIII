/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicakmu;

/**
 *
 * @author Kelly
 */
public class MedicoKU {
    private int IdKU;
    private String NombreKU;
    private String EspecialidadKU;
    
    public MedicoKU(int IdKU, String NombreKU, String EspecialidadKU){
       this.IdKU= IdKU;
       this.NombreKU= NombreKU;
       this.EspecialidadKU = EspecialidadKU;
}
public int getIdKU(){
       return IdKU;
   }
   
   public void setIdKU(int IdKU){
       this.IdKU = IdKU;
   }
   
   public String getNombreKU(){
       return NombreKU;
   }
   
   public void setNombreKU(String NombreKU){
       this.NombreKU = NombreKU;
   }
   public String getEspecialidadKU(){
       return EspecialidadKU;
   }
   
   public void setEspecialidadKU(String EspecialidadKU){
       this.EspecialidadKU= EspecialidadKU;
   } 
}


