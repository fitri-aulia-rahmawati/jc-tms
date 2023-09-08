Feature: Managemen User V1 Client
#1
  Scenario: Masuk ke halaman managemen user v1 client
    When User click Master menu
    And Klik submenu managemen user v1 client
    Then Get text Page Managemen User V1 Client
#2
  Scenario: Tambah user yang sesuai
    When User klik tambah user
    And User masukan nama user
    And User masukan nama email
    And User klik tombol simpan managemen V1
    Then Get text notifikasi berhasil
#3
  Scenario: Menambahkan user tanpa isi data
    When User klik tambah user
    And User klik tombol simpan managemen V1
    Then Get text popup perintah isi data v1
#4
  Scenario: Menambahkan data yang sama
    When User klik tambah user
    And User masukan nama user
    And User masukan nama email
    And User klik tombol simpan managemen V1
    Then Get text notifikasi gagal
#5
  Scenario: Menambahkan user tanpa nama
    When User klik tambah user
    And User masukan nama email
    And User klik tombol simpan managemen V1
    Then Get text popup perintah isi data v1
#6
  Scenario: Menambahkan user tanpa email
    When User klik tambah user
    And User masukan nama user
    And User klik tombol simpan managemen V1
    Then Get text popup perintah isi data v1
#7
  Scenario: Menambahkan data dengan format email yang salah
    When User klik tambah user
    And User masukan nama user
    And User masukan nama email dengan format salah
    And User klik tombol simpan managemen V1
    Then Get text popup perintah isi format email benar
#8
  Scenario: Menambahkan data user dengan nama user sama dan email berbeda
    When User klik tambah user
    And User masukan nama user
    And User masukan nama email berbeda
    And User klik tombol simpan managemen V1
    Then Get text notifikasi gagal
#9
  Scenario: Menambahkan data user dengan nama berbeda dan email sama
    When User klik tambah user
    And User masukan nama user berbeda
    And User masukan nama email
    And User klik tombol simpan managemen V1
    Then Get text notifikasi gagal