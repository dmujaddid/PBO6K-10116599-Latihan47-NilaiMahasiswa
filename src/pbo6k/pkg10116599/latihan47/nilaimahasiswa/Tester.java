/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan47.nilaimahasiswa;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program : Program untuk menghitung Nilai Akhir
 *
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Inisialisasi
        NilaiAkhir na = new NilaiAkhir();
        na.setQUIZ(75);
        na.setUTS(45);
        na.setUAS(34);

        System.out.println("QUIZ\t\t= " + na.getQUIZ());
        System.out.println("UTS\t\t= " + na.getUTS());
        System.out.println("UAS\t\t= " + na.getUAS());
        System.out.println();
        System.out.println("NIlai Akhir\t= " + na.nilaiAkhir());
        System.out.println();
        na.index();
        System.out.println();

    }

}
