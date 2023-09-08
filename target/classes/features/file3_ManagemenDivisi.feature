Feature: Managemen Divisi
#1
  Scenario: Masuk Halaman Managemen Divisi
    When User click Master menu
    And User click submenu Managemen Divisi
    Then Get text Managemen Divisi Page
#2
  Scenario: Menambahkan data baru pada management divisi
    When User klik form nama divisi
    And User pilih divisi
    And User klik tipe divisi
    And User pilih tipe divisi
    And User klik user client
    And User pilih user client
    And User klik tombol simpan managemen divisi
    And Get text popup berhasil
    Then User klik ok pada popup
#3
  Scenario: Tambah data tanpa ada mengisi data
    When User klik tombol simpan managemen divisi
    Then Get text popup select item
#4
  Scenario: Tambah data hanya memasukan nama divisi
    When User klik form nama divisi
    And User pilih divisi
    And User klik tombol simpan managemen divisi
    Then Get text popup select item
#5
  Scenario: Tambah data hanya memasukan tipe divisi
    When User klik tipe divisi
    And User pilih tipe divisi
    And User klik tombol simpan managemen divisi
    And Get text popup select item
    Then User klik ok pada popup
#6
  Scenario: Tambah data tanpa nama divisi
    When User klik tipe divisi
    And User pilih tipe divisi
    And User klik user client
    And User pilih user client
    And User klik tombol simpan managemen divisi
    And Get text popup select item
    Then User klik ok pada popup
#7
  Scenario: Tambah data tanpa user client
    When User klik form nama divisi
    And User pilih divisi
    And User klik tipe divisi
    And User pilih tipe divisi
    And User klik tombol simpan managemen divisi
    And Get text popup select item
    Then User klik ok pada popup
#8
  Scenario: Tambah data yang sudah ada
    When User klik form nama divisi
    And User pilih divisi
    And User klik tipe divisi
    And User pilih tipe divisi
    And User klik user client
    And User pilih user client
    And User klik tombol simpan managemen divisi
    And Get text popup data duplikat beda
    Then User klik ok pada popup
#9
  Scenario: Tambah data duplikat namun tanpa user client
    When User klik form nama divisi
    And User pilih divisi
    And User klik tipe divisi
    And User pilih tipe divisi
    And User klik tombol simpan managemen divisi
    And Get text popup select item
    Then User klik ok pada popup
#10
  Scenario: Upload data yang benar
    When User klik upload data
    And User klik form nama divisi upload
    And User pilih divisi upload
    And User memilih file managemen divisi
    And User klik tombol save
    Then Get text notifikasi berhasil upload
#11
  Scenario: Upload data yang sama
    When User klik upload data
    And User klik form nama divisi upload
    And User pilih divisi upload
    And User memilih file managemen divisi
    And User klik tombol save
    Then Get text notifikasi peringatan upload
#12
  Scenario: Upload file sama tapi beda divisi
    When User klik upload data
    And User klik form nama divisi upload
    And User pilih divisi upload
    And User memilih file managemen divisi
    And User klik tombol save
    Then Get text notifikasi berhasil upload
#13
  Scenario: Upload file tanpa pilih divisi
    When User klik upload data
    And User memilih file managemen divisi
    And User klik tombol save
    Then Get text popup select item
    Then klik close
#14
  Scenario: Upload data tanpa masukan file
    When User klik upload data
    And User klik form nama divisi upload
    And User pilih divisi upload
    And User klik tombol save
    Then Get text notifikasi peringatan upload
#15
  Scenario: Upload data tanpa memasukan divisi dan file
    When User klik upload data
    And User klik tombol save
    Then Get text popup select item
    Then klik close

