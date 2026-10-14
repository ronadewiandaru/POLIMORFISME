/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author rona
 */
public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();
        p = new Manajer();
        
       Manajer m = new Manajer();
       m.nama = "Rona";
       m.gajipokok = 8000000;
       m.tunjangan = 2000000;
       p = m;
       m.tampilData();
       p.tampilData();
      
       Pegawai[]arrPeg = new Pegawai [3];
       Programmer pr = new Programmer();
       pr.nama = "Febi"; 
       pr.gajipokok = 10000000; 
       pr.bonus = 1000000;
       pr.tampilData();
       arrPeg[0] = p;
       arrPeg[1] = m;
       arrPeg[2] = new Programmer();
       arrPeg[0].tampilData();
       arrPeg[1].tampilData();
       
       hitungGajiTotal(m);
       hitungGajiTotal(pr);
       
    }
    public static void hitungGajiTotal(Pegawai p){
        if ( p instanceof Programmer){
        Programmer prog = (Programmer) p;
        int gajiTot = prog.bonus+prog.gajipokok;
        System.out.println("Gaji Total Programmer ="+ gajiTot);
        }else if (p instanceof Manajer){
        Manajer man = (Manajer) p;
        int gajiTot = man.tunjangan+man.gajipokok;
        System.out.println("Gaji Total Manajer ="+ gajiTot);
        }
    }
        
}
    
