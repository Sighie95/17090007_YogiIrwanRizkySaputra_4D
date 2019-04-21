import entity.*;
import services.*;
import java.util.*;

public class Aplikasi {

    private static Scanner scanner;
    private static ServiceMotor service= new ServiceMotor();

    public static void main(String[] args) {
        int opsi = 5;
        do {
            tampilkanMenu();
            scanner = new Scanner(System.in);
            opsi = scanner.nextInt();
            proses(opsi);
        }while(opsi !=5);
    }
    private static void proses(int  opsi){
        switch (opsi){
            case 1:
                TambahData();
                break;
            case 2:
                UbahData();
                break;
            case 3:
                HapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
            case 5:
                System.out.println("Mohon Tunggu Antriannya :) ");
                System.out.println("Semoga senang dengan pelayanan kami");
        }
    }
    private static void HapusData() {
        scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("PLAT : ");
        String plat = scanner.nextLine();
        service.hapusData(plat);
    }

    private static void UbahData(){
        scanner = new  Scanner(System.in);
        String plat, nama, motor;

        System.out.println("\n--= Form Ubah Data");

        System.out.print ("PLAT : ");
        plat = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MOTOR : ");
        motor = scanner.nextLine();
        service.ubahData(new Motor(plat, nama, motor));
    }

    private static void TambahData() {
        scanner = new  Scanner(System.in);
        String plat, nama, motor;

        System.out.println("\n--= Form Tambah Data");
        System.out.print ("PLAT : ");
        plat = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("MOTOR : ");
        motor = scanner.nextLine();
        service.tambahData(new Motor(plat, nama, motor));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--= MEnu Aplikasi =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("--------------");
        System.out.print ("opsi > ");
    }

}