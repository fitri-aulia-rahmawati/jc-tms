Feature: Master Position
  Scenario: Masuk Halaman Master Position
    When User click menu master
    And User click sub menu master position
    Then User berhasil masuk ke menu master position

  Scenario: Valid Input Data Master Position Active
    When User input jenis pekerjaan
    And User input posisi
    And User input standarisasi upah
    And User click status posisi
    And User click pilih posisi active
    And User click button save
    And User get text pop up success add position
    Then User click button ok

  Scenario: Valid Input Data Master Position Non Active
    When User input jenis pekerjaan
    And User input posisi
    And User input standarisasi upah
    And User click status posisi
    And User click pilih posisi non active
    And User click button save
    And User get text pop up success add position
    Then User click button ok

  Scenario: Invalid Jenis Pekerjaan Tidak Diinputkan
    When User input posisi
    And User input standarisasi upah
    And User click status posisi
    And User click pilih posisi active
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Posisi Tidak Diinputkan
    When Clear data master posisi
    And User input jenis pekerjaan
    And User input standarisasi upah
    And User click status posisi
    And User click pilih posisi non active
    And User click button save
    Then User get text popup position

  Scenario: Invalid Standarisasi Upah Tidak Diinputkan
    When Clear data master posisi
    And User input jenis pekerjaan
    And User input posisi
    And User click status posisi
    And User click pilih posisi active
    And User click button simpan
    Then User get text popup standar wage

  Scenario: Invalid Status Posisi Tidak Dipilih
    When Clear data master posisi
    And User input jenis pekerjaan
    And User input posisi
    And User input standarisasi upah
    And User click button save
    Then User get text popup status position

  Scenario: Invalid Jenis Pekerjaan dan Posisi Tidak Diinput
    When Clear data master posisi
    And User input standarisasi upah
    And User click status posisi
    And User click pilih posisi non active
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Posisi dan Standarisasi Upah Tidak Diinput
    When Clear data master posisi
    And User input jenis pekerjaan
    And User click status posisi
    And User click pilih posisi active
    And User click button save
    Then User get text popup position

  Scenario: Invalid Standarisasi Upah dan Status Tidak Diinput
    When Clear data master posisi
    And User input jenis pekerjaan
    And User input posisi
    And User click button save
    Then User get text popup standar wage

  Scenario: Invalid Jenis Pekerjaan dan Status Tidak Diinput
    When Clear data master posisi
    And User input posisi
    And User input standarisasi upah
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Jenis Pekerjaan dan Standarisasi Upah Tidak Diinput
    When Clear data master posisi
    And User input posisi
    And User click status posisi
    And User click pilih posisi non active
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Posisi dan Status Tidak Diinput
    When Clear data master posisi
    And User input jenis pekerjaan
    And User input standarisasi upah
    And User click button simpan
    Then User get text popup position

  Scenario: Invalid Hanya Input Jenis Pekerjaan
    When Clear data master posisi
    And User input jenis pekerjaan
    And User click button save
    Then User get text popup position

  Scenario: Invalid Hanya Input Posisi
    When Clear data master posisi
    And User input posisi
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Hanya Input Standarisasi Upah
    When Clear data master posisi
    And User input standarisasi upah
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Hanya Input Status Posisi
    When Clear data master posisi
    And User click status posisi
    And User click pilih posisi active
    And User click button save
    Then User get text popup type of work

  Scenario: Invalid Tidak Ada Data yang Diinput
    When Clear data master posisi
    And User click button save
    Then User get text popup type of work

  Scenario: Mencari Jenis Pekerjaan Active yang Diinput
    When User mencari jenis pekerjaan active
    And User get text type of work
    Then User get text status of work active

  Scenario: Mencari Posisi yang Diinput
    When User mencari posisi
    Then User get text position

  Scenario: Mencari Standarisasi Upah yang Diinput
    When User mencari standarisasi upah
    Then User get text standar wage

  Scenario: Mencari Status Pekerjaan Non Active yang Diinput
    When User mencari status pekerjaan non active
    And User get text type of work non active

  Scenario: Mencari Data Invalid Master Posisi
    When User invalid data master posisi
    Then User get text position no matching records found