package praktikum.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);
    ArrayList<String> nik = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> ttl = new ArrayList<>();
    ArrayList<String> jk = new ArrayList<>();
    ArrayList<String> gd = new ArrayList<>();

    public static void main(String[] args) {

        Main uhu = new Main();
        uhu.input();
        uhu.validasi();

    }

    void input() {

        String nik1, nama1, ttl1, jk1;
        System.out.println("DATA PENDUDUK");
        
        System.out.print("Masukkan NIK : ");
        nik1 = s.nextLine();
        nik.add(nik1);

        System.out.print("Masukkan Nama : ");
        nama1 = s.nextLine();
        nama.add(nama1);

        System.out.print("Masukkan TTL : ");
        ttl1 = s.nextLine();
        ttl.add(ttl1);

        System.out.print("Masukkan Jenis Kelamin *L/P : ");
        jk1 = s.nextLine();
        jk.add(jk1);

        gd();

    }

    void gd() {

        int gd1;
        System.out.print("Golongan Darah \n 1. A \n 2. B \n 3. AB \n 4. O \n Masukkan Golongan Darah *1/2/3/4 : ");
        gd1 = s.nextInt();

        if (gd1 == 1) {
            gd.add("A");
        } else if (gd1 == 2) {
            gd.add("B");
        } else if (gd1 == 3) {
            gd.add("AB");
        } else if (gd1 == 4) {
            gd.add("O");
        } else {
            System.out.println("Pilihan Tidak Ada");
            gd();

        }

    }

    void validasi() {

        int pilihanlagi;
        System.out.println("1. Cetak Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan : ");
        pilihanlagi = s.nextInt();
        switch (pilihanlagi) {
            case 1 :
                System.out.println("Data Inputan");
                for (int i = 0; i < nik.size(); i++) {
                    System.out.print("NIK : ");
                    System.out.println(nik.get(i));
                }
                for (int i = 0; i < nama.size(); i++) {
                    System.out.print("Nama : ");
                    System.out.println(nama.get(i));
                }
                for (int i = 0; i < ttl.size(); i++) {
                    System.out.print("TTL : ");
                    System.out.println(ttl.get(i));
                }
                for (int i = 0; i < jk.size(); i++) {
                    System.out.print("Jenis Kelamin : ");
                    System.out.println(jk.get(i));
                }
                for (int i = 0; i < gd.size(); i++) {
                    System.out.print("Golongan Darah : ");
                    System.out.println(gd.get(i));
                }
                validasi();
                break;
                
            case 2 :
                System.out.println("Input Data");
                input();
                break;
            case 3 :
                System.exit(0);

        }
    }

}

