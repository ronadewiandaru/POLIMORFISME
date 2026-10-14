/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author rona
 */
public class Programmer extends Pegawai{
    public int bonus;
    
    @Override
    public void tampilData(){
         System.out.println("-----Tampil Data Programmer-----");
        super.tampilData();
        System.out.println("BONUS ="+ bonus);
        System.out.println("---------------------------------");
        System.out.println(" ");
        
    }
}
