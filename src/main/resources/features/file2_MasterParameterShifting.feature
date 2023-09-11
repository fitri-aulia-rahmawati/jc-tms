Feature: Master Parameter Shifting
  Scenario: Masuk Halaman Master Parameter Shifting
    When User click menu master
    And User click sub menu parameter shifting
    Then User berhasil masuk ke menu parameter shifting

  Scenario: Valid Input Data Shifting
    When User click button tambah
    And User click unit
    And User click pilih unit
    And User input nama shift
    And User input jam mulai
    And User input jam selesai
    And User click button submit
    And User get text succsess

  Scenario: Invalid Input Data Unit Tidak Dipilih
    When User click button tambah
    And User input nama shift
    And User input jam mulai
    And User input jam selesai
    And User click button submit
    And User get text unit required

  Scenario: Invalid Nama Shift Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input jam mulai
    And User input jam selesai
    And User click button submit
    And User get text nama shift required

  Scenario: Invalid Jam Mulai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input nama shift
    And User input jam selesai
    And User click button submit
    And User get text jam mulai required

  Scenario: Invalid Jam Selesai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input nama shift
    And User input jam mulai
    And User click button submit
    And User get text jam selesai required

  Scenario: Invalid Unit dan Nama Shift Tidak Diinput
    When Clear data
    And User input jam mulai
    And User input jam selesai
    And User click button submit
    And User get text unit required
    And User get text nama shift required

  Scenario: Invalid Nama Shift dan Jam Mulai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input jam selesai
    And User click button submit
    And User get text nama shift required
    And User get text jam mulai required

  Scenario: Invalid Jam Mulai dan Jam Selesai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input nama shift
    And User click button submit
    And User get text jam mulai required
    And User get text jam selesai required

  Scenario: Invalid Unit dan Jam Mulai Tidak Diinput
    When Clear data
    And User input nama shift
    And User input jam selesai
    And User click button submit
    And User get text unit required
    And User get text jam mulai required

  Scenario: Invalid Unit dan Jam Selesai Tidak Diinput
    When Clear data
    And User input nama shift
    And User input jam mulai
    And User click button submit
    And User get text unit required
    And User get text jam selesai required

  Scenario: Invalid Nama Shift dan Jam Selesai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User input jam mulai
    And User click button submit
    And User get text nama shift required
    And User get text jam selesai required

  Scenario: Invalid Unit, Nama Shift dan Jam Mulai Tidak Diinput
    When Clear data
    And User input jam selesai
    And User click button submit
    And User get text unit required
    And User get text nama shift required
    And User get text jam mulai required

  Scenario: Invalid Nama Shift, Jam Mulai dan Jam Selesai Tidak Diinput
    When Clear data
    And User click unit
    And User click pilih unit
    And User click button submit
    And User get text nama shift required
    And User get text jam mulai required
    And User get text jam selesai required

  Scenario: Invalid Unit, Jam Mulai dan Jam Selesai Tidak Diinput
    When Clear data
    And User input nama shift
    And User click button submit
    And User get text unit required
    And User get text jam mulai required
    And User get text jam selesai required

  Scenario: Invalid Unit, Nama Shift dan Jam Selesai Tidak Diinput
    When Clear data
    And User input jam mulai
    And User click button submit
    And User get text unit required
    And User get text nama shift required
    And User get text jam selesai required

  Scenario: Invalid Data Tidak Diinput
    When Clear data
    And User click button submit
    And User get text unit required
    And User get text nama shift required
    And User get text jam mulai required
    And User get text jam selesai required

  Scenario: Kembali ke halaman parameter shifting
    When User click button back
    Then User berhasil masuk ke menu parameter shifting

  Scenario: Mencari Unit yang Diinput
    When User mencari unit
    Then User get text unit

  Scenario: Mencari Nama Shift yang Diinput
    When User mencari nama shift
    Then User get text nama shift

  Scenario: Mencari Jam Mulai yang Diinput
    When User mencari jam mulai
    Then User get text jam mulai

  Scenario: Mencari Jam Selesai yang Diinput
    When User mencari jam selesai
    Then User get text jam selesai

  Scenario: Mencari Invalid Data Master Unit yang Diinput
    When User input invalid data master unit
    Then User get text no matching records found