/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicakmu;

/**
 *
 * @author Kelly
 */
public class PacienteKU {
    private int IdKU;
    private String NombreKU;
    private String PadecimientoKU;
    
    public PacienteKU(int IdKU, String NombreKU,String PadecimientoKU){
       this.IdKU= IdKU;
       this.NombreKU= NombreKU;
       this.PadecimientoKU = PadecimientoKU;
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
   public String getPadecimientoKU(){
       return PadecimientoKU;
   }
   
   public void setPadecimientoKU(String PadecimientoKU){
       this.PadecimientoKU= PadecimientoKU;
   } 
}
