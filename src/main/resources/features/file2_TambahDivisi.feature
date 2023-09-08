Feature: Tambah Divisi Test
#1
#Masuk Halaman
  Scenario: Masuk ke Halaman Tambah Divisi
    When User click Master menu
    And User click submenu Tambah Divisi
    Then Get text Tambah Divisi page
#2
# Update nama divisi
  Scenario: Membatalkan update
    When User klik tombol edit
    And User klik tombol cancel
    Then Get text nama yang tak diubah
#3
  Scenario: Update data tanpa ubah data
    When User klik tombol edit
    And User klik tombol update
    Then Get text notifikasi peringatan
#4
  Scenario: Update nama divisi
    When User klik tombol edit
    And User mengubah isi teks
    And User klik tombol update
    Then Get text Success Input Data
#5
# tambah nama divisi ============================================================
  Scenario: Menginputkan nama divisi baru
    When User masukan nama divisi baru
    And User klik tombol simpan
    Then Get text Success Input Data
#6
  Scenario: Tanpa menginputkan nama divisi
    When User klik tombol simpan
    Then Get text popup perintah isi
#7
  Scenario: Menginputkan nama divisi yang telah ada
    When User masukan nama divisi yang telah terdaftar
    And User klik tombol simpan
    Then Get text notifikasi peringatan
#8
  Scenario: Upload data dengan template divisi
    When User klik tombol upload data
    And User memilih file
    And User klik tombol save
    Then Get text Success Input Data
#9
  Scenario: Tanpa memilih file
    When User klik tombol upload data
    And User klik tombol save
    Then Get text notifikasi peringatan
#10
  Scenario: Mengupload file dan data yang sama
    When User klik tombol upload data
    And User memilih file sama
    And User klik tombol save
    Then Get text notifikasi peringatan


