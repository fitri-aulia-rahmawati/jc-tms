package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),

// File 1 Tambah Divisi ====================================================================================

    T2("Masuk ke Halaman Tambah Divisi"),
    T3("Membatalkan update"),
    T4("Update data tanpa ubah data"),
    T5("Update nama divisi"),
    T6("Menginputkan nama divisi baru"),
    T7("Tanpa menginputkan nama divisi"),
    T8("Menginputkan nama divisi yang telah ada"),
    T9("Upload data dengan template divisi"),
    T10("Tanpa memilih file"),
    T11("Mengupload file dan data yang sama"),


// File 3 Management Divisi =====================================================================
    T12("Masuk Halaman Managemen Divisi"),
    T13("Menambahkan data baru pada management divisi"),
    T14("Tambah data tanpa ada mengisi data"),
    T15("Tambah data hanya memasukan nama divisi"),
    T16("Tambah data hanya memasukan tipe divisi"),
    T17("Tambah data tanpa nama divisi"),
    T18("Tambah data tanpa user client"),
    T19("Tambah data yang sudah ada"),
    T20("Tambah data duplikat namun tanpa user client"),
    T21("Upload data yang benar"),
    T22("Upload data yang sama"),
    T23("Upload file sama tapi beda divisi"),
    T24("Upload file tanpa pilih divisi"),
    T25("Upload data tanpa masukan file"),
    T26("Upload data tanpa memasukan divisi dan file"),

// File 4 Management User v1 Client ===============================================================
    T27("Masuk ke halaman managemen user v1 client"),
    T28("Tambah user yang sesuai"),
    T29("Menambahkan user tanpa isi data"),
    T30("Menambahkan data yang sama"),
    T31("Menambahkan user tanpa nama"),
    T32("Menambahkan user tanpa email"),
    T33("Menambahkan data dengan format email yang salah"),
    T34("Menambahkan data user dengan nama user sama dan email berbeda"),
    T35("Menambahkan data user dengan nama berbeda dan email sama");
    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public  String getTestCaseName(){
        return testCaseName;
    }

}
