package com.pbo;
import java.util.Scanner;

public class DaftarNilai {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in); // Fungsi untuk menginputkan data atau nilai
        int i,jumlahMk;  // Deklarsi variabel i dan jumlahMK yang merupakan tipe data Integer
        String nama,nim;   // Deklarasi variabel nama dan nim yang merupakan tipe data String
        String mataKuliah[]=new String[50]; // Deklarasi variabel mataKuliah bertipe data string arrray memiliki maksimal 50 data
        String grade[]=new String[20];  // Deklarasi variabel grade bertipe data string arrray memiliki maksimal 20 data
        int tgs[]=new int[20];  // Deklarasi variabel tgs bertipe data integer array memiliki maksimal 20 data
        double nilai[]=new double[20];  // Deklarasi variabel nilai bertipe data double array memiliki maksimal 20 data

        System.out.println("=========================");
        System.out.println("|Daftar Nilai Mahasiswa |");      
        System.out.println("========================="); 
        System.out.print("Masukan Jumlah Mata Kuliah: ");   // Itputkan Jumlah Mata Kuliah
        jumlahMk=input.nextInt(); 

        System.out.println("=========================");  
        System.out.print("Nama Mahasiswa    : ");   // Inputkan Nama Mahasiswa
        nama=input.next(); 
        System.out.print("NIM               : ");   // Inputkan NIM Mahasiswa
        nim=input.next(); 

        for(i=1; i<=jumlahMk; i++){ // Perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
            System.out.print("\n Mata kuliah ke-"+i+" : "); // Inputkan berapa jumlah mata kuliah yang ingin ditampilkan
            mataKuliah[i]=input.next(); //untuk meminta inputan berupa string ke variabel mataKuliah arrray pada saat i
            System.out.print(" Masukkan Nilai: ");  // Inputkan Nilai
            tgs[i]=input.nextInt(); // Meminta inputan berupa integer ke variabel tugas array pada saat i
            nilai[i]=((tgs[i]*1)); // Perhitungan di input ke nilai pada saat i
            if (nilai[i]>=85){
                grade[i]="A";   // Jika nilai ke-i 85 keatas maka grade ke-i isinya A
            }
            else if (nilai[i]>=75){
                grade[i]="B";   // Jika nilai ke-i 75 keatas maka grade ke-i isinya B
            }
            else if (nilai[i]>=65){
                grade[i]="C";   // Jika nilai ke-i 65 keatas maka grade ke-i isinya C
            }          
            else if (nilai[i]>=50){
                grade[i]="D";   // Jika nilai ke-i 50 keatas maka grade ke-i isinya D
            }
            else{
                grade[i]="E";   // Jika nilai ke-i dibawah 50 maka grade ke-i isinya E
            }
            
        }

        // Output Nama,NIM,Mata Kuliah, Nilai, dan Grade
        System.out.println("\n========================"); 
        System.out.println("\n\n Nama: "+nama+"   NIM: "+nim); 
        System.out.println("========================="); 
        System.out.println("|Mata Kuliah|Nilai|Grade|"); 
        System.out.println("========================="); 
        for(i=1;i<=jumlahMk;i++){   // Perintah perulangan dari i=1 sampai jumlahMk dengan step i=1
        System.out.println("  "+mataKuliah[i]+    "      "+nilai[i]+      "      "   +grade[i]); // Menampilkan jumlah mata kuliah, nilai, dan grade
            }
      
        System.exit(0); // Keluar dari program dengan interasi 0 artinya program tidak ada eror
        }
  }
