package services;

import java.util.*;
import entity.*;

public class ServiceMotor {

    private static List<Motor> data = new LinkedList<Motor>();

    public void tambahData(Motor mtr) {
        data.add(mtr);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(Motor mtr) {
        int idx = data.indexOf(mtr);
        if(idx >= 0) data.set(idx, mtr);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String plat) {
        int idx = data.indexOf(new Motor(plat, "", ""));
        if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Urutan Antrian =--");
        int urutan = 1;
        for(Motor mtr : data) {
            System.out.println("Antrian ke-" + urutan++);
            System.out.println("  PLAT : " + mtr.getPlat());
            System.out.println("  NAMA   : " + mtr.getNama());
            System.out.println("  MOTOR  : " + mtr.getMotor());
        }
    }

}