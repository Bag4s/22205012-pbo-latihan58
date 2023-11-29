/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Bilangan {

    protected int x;
    protected int y;
    
    public Bilangan(){
       this.x = 3;
       this.y = 4;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class JumlahBilangan extends Bilangan {
    
    public void tampilHasilJumlah(){
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX()+ " - " + getY() + " = " + (getX() - getY()));
    }
}

class BilanganTest {
    
    public static void main(String[] args) {
        //Membuat objek JumlahBilangan
        JumlahBilangan jm = new JumlahBilangan();
        jm.tampilHasilJumlah();
        
        //Membuat objek Selisih Bilangan
        SelisihBilangan sb = new SelisihBilangan();
        sb.tampilSelisih();
    }
}
