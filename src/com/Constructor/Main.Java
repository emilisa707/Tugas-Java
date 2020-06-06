package com.Constructor;

//class dengan constructor

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(){
        System.out.println("ini adalah constructor");
    }

    Mahasiswa(String inputName, String inputNIM, String inputJurusan)
    {
        nama = inputName;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa("ucup", "123456", "teknik perteknikan");
        Mahasiswa mahasiswa3 = new Mahasiswa("otong", "678900", "teknik bercocok tanam");

        
    }
}