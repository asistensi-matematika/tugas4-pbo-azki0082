package tugas4;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class TestBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang diinginkan"+
                "\n1. Persegi \n2. Lingkaran \n3. Segitiga");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:{
                System.out.print("\nMasukkan panjang sisi = ");
                double s = input.nextDouble();
                Persegi p = new Persegi(s);
                p.view();
                break;
            }
            case 2:
            {
                System.out.print("\nMasukkan jari-jari = ");
                double r = input.nextDouble();
                Lingkaran l = new Lingkaran(r);
                l.view();
                break;
            }
            case 3:
            {
                System.out.println("\nPilih segitiga yang diinginkan"
                        + "\n1. Segitiga Siku-Siku \n2. Segitiga Sama Sisi");
                System.out.print("Masukkan pilihan anda : ");
                int milih = input.nextInt();
                switch(milih){
                    case 1:{
                        System.out.print("\nMasukkan panjang alas = ");
                        double a = input.nextDouble();
                        System.out.print("Masukkan panjang tinggi = ");
                        double t = input.nextDouble();
                        Siku2 s = new Siku2(a,t);
                        s.view();
                        break;}
                    case 2:{
                        System.out.print("\nMasukkan panjang sisi = ");
                        double sisi = input.nextDouble();
                        samaSisi s = new samaSisi(sisi);
                        s.view();}
                }
            }
        }
    }
}
