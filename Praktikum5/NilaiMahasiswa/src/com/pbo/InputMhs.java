package com.pbo;

class siswa {
    private String nim;
    private String nama;
    protected String teori;
    protected String praktik;
 
    public String getNim() {
        return nim;
    }
 
    public void setNim(String nim) {
        this.nim = nim;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getTeori() {
        return teori;
    }
 
    public void setTeori(String teori) {
        this.teori = teori;
    }
 
    public String getPraktik() {
        return praktik;
    }
 
    public void setPraktik(String praktik) {
        this.praktik = praktik;
    }
 
}

    public class InputMhs{
    public static void main(String[] args) {
        // Mengeset nilai atribut objek-objek instance kelas
        // Menggunakan Getter Setter
        siswa objekKelas_1 = new siswa();
        objekKelas_1.setNama("Fajri");
        objekKelas_1.setNim("10270");
        objekKelas_1.setTeori("90");
        objekKelas_1.setPraktik("88");
 
        siswa objekKelas_2 = new siswa();
        objekKelas_2.setNama("Jono");
        objekKelas_2.setNim("10266");
        objekKelas_2.setTeori("95");
        objekKelas_2.setPraktik("95");

        siswa objekKelas_3 = new siswa();
        objekKelas_3.setNama("Andi");
        objekKelas_3.setNim("10267");
        objekKelas_3.setTeori("88");
        objekKelas_3.setPraktik("80");
 
        // Mengambil nilai atribut dari objek-objek instance kelas
        String nama_1 = objekKelas_1.getNama();
        String nim_1 = objekKelas_1.getNim();
        String teori_1 = objekKelas_1.getTeori();
        String praktik_1 = objekKelas_1.getPraktik();
 
        String nama_2 = objekKelas_2.getNama();
        String nim_2 = objekKelas_2.getNim();
        String teori_2 = objekKelas_2.getTeori();
        String praktik_2 = objekKelas_2.getPraktik();

        String nama_3 = objekKelas_3.getNama();
        String nim_3 = objekKelas_3.getNim();
        String teori_3 = objekKelas_3.getTeori();
        String praktik_3 = objekKelas_3.getPraktik();
 
        // Menampilkan output nilai atribut setiap objek
        System.out.println("=========================");
        System.out.println("Nama  : " + nama_1);
        System.out.println("NIM  : " + nim_1);
        System.out.println("Nilai Teori  : " + teori_1);
        System.out.println("Nilai Praktik  : " + praktik_1);
        System.out.println("\n");
        System.out.println("Nama  : " + nama_2);
        System.out.println("NIM  : " + nim_2);
        System.out.println("Nilai Teori  : " + teori_2);
        System.out.println("Nilai Praktik  : " + praktik_2);
        System.out.println("\n");
        System.out.println("Nama  : " + nama_3);
        System.out.println("NIM  : " + nim_3);
        System.out.println("Nilai Teori  : " + teori_3);
        System.out.println("Nilai Praktik  : " + praktik_3);
        System.out.println("=========================");
 
 
    }
}