/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;

/**
 *
 * @author OKI
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
    Matematika bana =  new Matematika(2,3);
    System.out.println("Hasil Penjumlahan : " +bana.setPenjumlahan());
    System.out.println("Hasil Pengurangan : " +bana.setPengurangan());
    System.out.println("Hasil Perkalian : " +bana.setPerkalian());
    System.out.println("Hasil Pembagian : " +bana.setPembagian());
    }
}