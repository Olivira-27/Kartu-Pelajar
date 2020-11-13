/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartu.pelajar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KartuPelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama, Almt, Kota,Lahir,Tgl,Bln,Thn,Nisn;
        Scanner input=new Scanner(System.in);
        
        System.out.println("SMK TELKOM MALANG");
        System.out.println("--------------------------------------");
        System.out.println("KARTU PELAJAR SMK");
        System.out.println("--------------------------------------");
        System.out.print("Nama     :");
        Nama=input.nextLine();
        System.out.print("Nisn     :");
        Nisn=input.nextLine();
        System.out.print("Alamat   :");
        Almt=input.nextLine();
        System.out.print("Kota     :");
        Kota=input.nextLine();
        System.out.print("Tempat Lahir  :");
        Lahir=input.nextLine();
        System.out.print("Tanggal Lahir :");
        Tgl=input.nextLine();
        System.out.print("Bulan Lahir : ");
        Bln=input.nextLine();
        System.out.print("Tahun Lahir : ");
        Thn=input.nextLine();
        System.out.println("======================================");
        System.out.println("          Biodata           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap   : "+Nama);
        System.out.println("Nisn           :"+Nisn);
        System.out.println("Alamat         :"+Almt+", "+Kota);
        System.out.println("Tmpat/Tgl      :"+Lahir+", "+Tgl+","+Bln+","+Thn);
        System.out.println("======================================ilhm");
           
    }
    
    
}

    
    

