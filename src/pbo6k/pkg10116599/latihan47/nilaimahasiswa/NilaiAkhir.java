/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan47.nilaimahasiswa;

/**
 *
 * @author eka
 */
public class NilaiAkhir {

    private double QUIZ;
    private double UTS;
    private double UAS;

    public double getQUIZ() {
        return QUIZ;
    }

    public void setQUIZ(int QUIZ) {
        this.QUIZ = QUIZ;
    }

    public double getUTS() {
        return UTS;
    }

    public void setUTS(int UTS) {
        this.UTS = UTS;
    }

    public double getUAS() {
        return UAS;
    }

    public void setUAS(int UAS) {
        this.UAS = UAS;
    }

    public double nilaiAkhir() {
        return (QUIZ * 0.2) + (UTS * 0.3) + (UAS * 0.5);
    }

    public String index() {
        if ((nilaiAkhir() >= 80) && (nilaiAkhir() <= 100)) {
            System.out.println("Index = A");
            System.out.println("Keterangan = Sangat Baik");
        } else if ((nilaiAkhir() >= 68) && (nilaiAkhir() < 80)) {
            System.out.println("Index = B");
            System.out.println("Keterangan = Baik");
        } else if ((nilaiAkhir() >= 56) && (nilaiAkhir() < 68)) {
            System.out.println("Index = C");
            System.out.println("Keterangan = Cukup");
        } else if ((nilaiAkhir() >= 45) && (nilaiAkhir() < 56)) {
            System.out.println("Index = D");
            System.out.println("Keterangan = Kurang");
        } else if ((nilaiAkhir() >= 0) && (nilaiAkhir() < 45)) {
            System.out.println("Index = E");
            System.out.println("Keterangan = Sangat Kurang");
        }
        return null;

    }

}
