package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Masuk Halaman Master Parameter Shifting"),
    T3("Valid Input Data Shifting"),
    T4("Invalid Input Data Unit Tidak Dipilih"),
    T5("Invalid Nama Shift Tidak Diinput"),
    T6("Invalid Jam Mulai Tidak Diinput"),
    T7("Invalid Jam Selesai Tidak Diinput"),
    T8("Invalid Unit dan Nama Shift Tidak Diinput"),
    T9("Invalid Nama Shift dan Jam Mulai Tidak Diinput"),
    T10("Invalid Jam Mulai dan Jam Selesai Tidak Diinput"),
    T11("Invalid Unit dan Jam Mulai Tidak Diinput"),
    T12("Invalid Unit dan Jam Selesai Tidak Diinput"),
    T13("Invalid Nama Shift dan Jam Selesai Tidak Diinput"),
    T14("Invalid Unit, Nama Shift dan Jam Mulai Tidak Diinput"),
    T15("Invalid Nama Shift, Jam Mulai dan Jam Selesai Tidak Diinput"),
    T16("Invalid Unit, Jam Mulai dan Jam Selesai Tidak Diinput"),
    T17("Invalid Unit, Nama Shift dan Jam Selesai Tidak Diinput"),
    T18("Invalid Data Tidak Diinput"),
    T19("Kembali ke halaman parameter shifting"),
    T20("Mencari Unit yang Diinput"),
    T21("Mencari Nama Shift yang Diinput"),
    T22("Mencari Jam Mulai yang Diinput"),
    T23("Mencari Jam Selesai yang Diinput"),
    T24("Mencari Invalid Data Master Unit yang Diinput"),
    T25("Masuk Halaman Unit Kerja Penempatan"),
    T26("Valid Input Data Unit Kerja Penempatan Active"),
    T27("Valid Input Data Unit Kerja Penempatan Non Active"),
    T28("Invalid Unit Kerja Penempatan Tidak Diinputkan"),
    T29("Invalid Kode Cabang Pembayaran Tidak Diinputkan"),
    T30("Invalid RCC Pembayaran Tidak Diinputkan"),
    T31("Invalid Status Tidak Dipilih"),
    T32("Invalid Unit Kerja Penempatan dan Kode Cabang Tidak Diinput"),
    T33("Invalid Kode Cabang dan RCC Pembayaran Tidak Diinput"),
    T34("Invalid RCC Pembayaran dan Status Tidak Diinput"),
    T35("Invalid Unit Kerja Penempatan dan Status Tidak Diinput"),
    T36("Invalid Unit Kerja Penempatan dan RCC Pembayaran Tidak Diinput"),
    T37("Invalid Unit Kode Cabang Pembayaran dan Status Tidak Diinput"),
    T38("Invalid Hanya Input Unit Kerja Penempatan"),
    T39("Invalid Hanya Input Kode Cabang Pembayaran"),
    T40("Invalid Hanya Input RCC Pembayaran"),
    T41("Invalid Hanya Input Status"),
    T42("Invalid Tidak Ada Data yang Diinput"),
    T43("Mencari Unit Kerja yang Diinput"),
    T44("Mencari Kode Cabang Pembayaran yang Diinput"),
    T45("Mencari RCC Pembayaran yang Diinput"),
    T46("Mencari Data Invalid Master Unit Kerja"),
    T47("Masuk Halaman Master Position"),
    T48("Valid Input Data Master Position Active"),
    T49("Valid Input Data Master Position Non Active"),
    T50("Invalid Jenis Pekerjaan Tidak Diinputkan"),
    T51("Invalid Posisi Tidak Diinputkan"),
    T52("Invalid Standarisasi Upah Tidak Diinputkan"),
    T53("Invalid Status Posisi Tidak Dipilih"),
    T54("Invalid Jenis Pekerjaan dan Posisi Tidak Diinput"),
    T55("Invalid Posisi dan Standarisasi Upah Tidak Diinput"),
    T56("Invalid Standarisasi Upah dan Status Tidak Diinput"),
    T57("Invalid Jenis Pekerjaan dan Status Tidak Diinput"),
    T58("Invalid Jenis Pekerjaan dan Standarisasi Upah Tidak Diinput"),
    T59("Invalid Posisi dan Status Tidak Diinput"),
    T60("Invalid Hanya Input Jenis Pekerjaan"),
    T61("Invalid Hanya Input Posisi"),
    T62("Invalid Hanya Input Standarisasi Upah"),
    T63("Invalid Hanya Input Status Posisi"),
    T64("Invalid Tidak Ada Data yang Diinput"),
    T65("Mencari Jenis Pekerjaan Active yang Diinput"),
    T66("Mencari Posisi yang Diinput"),
    T67("Mencari Standarisasi Upah yang Diinput"),
    T68("Mencari Status Pekerjaan Non Active yang Diinput"),
    T69("Mencari Data Invalid Master Posisi");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public  String getTestCaseName(){
        return testCaseName;
    }

}
