Feature: Master Unit Kerja Penempatan
  Scenario: Masuk Halaman Unit Kerja Penempatan
    When User click menu master
    And User click sub menu unit kerja penempatan
    Then User berhasil masuk ke menu master unit kerja penempatan

  Scenario: Valid Input Data Unit Kerja Penempatan Active
    When User input unit kerja penempatan
    And User input kode cabang pembayaran
    And User input rcc pembayaran
    And User click status
    And User click pilih active
    And User click button simpan
    And User get text pop up success
    Then User click ok

  Scenario: Valid Input Data Unit Kerja Penempatan Non Active
    When User input unit kerja penempatan
    And User input kode cabang pembayaran
    And User input rcc pembayaran
    And User click status
    And User click pilih non active
    And User click button simpan
    And User get text pop up success
    Then User click ok

  Scenario: Invalid Unit Kerja Penempatan Tidak Diinputkan
    When User input kode cabang pembayaran
    And User input rcc pembayaran
    And User click status
    And User click pilih active
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Kode Cabang Pembayaran Tidak Diinputkan
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User input rcc pembayaran
    And User click status
    And User click pilih non active
    And User click button simpan
    Then User get text popup branch code

  Scenario: Invalid RCC Pembayaran Tidak Diinputkan
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User input kode cabang pembayaran
    And User click status
    And User click pilih active
    And User click button simpan
    Then User get text popup rcc code

  Scenario: Invalid Status Tidak Dipilih
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User input kode cabang pembayaran
    And User input rcc pembayaran
    And User click button simpan
    Then User get text popup status

  Scenario: Invalid Unit Kerja Penempatan dan Kode Cabang Tidak Diinput
    When Clear data master unit kerja
    And User input rcc pembayaran
    And User click status
    And User click pilih non active
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Kode Cabang dan RCC Pembayaran Tidak Diinput
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User click status
    And User click pilih active
    And User click button simpan
    Then User get text popup branch code

  Scenario: Invalid RCC Pembayaran dan Status Tidak Diinput
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User input kode cabang pembayaran
    And User click button simpan
    Then User get text popup rcc code

  Scenario: Invalid Unit Kerja Penempatan dan Status Tidak Diinput
    When Clear data master unit kerja
    And User input kode cabang pembayaran
    And User input rcc pembayaran
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Unit Kerja Penempatan dan RCC Pembayaran Tidak Diinput
    When Clear data master unit kerja
    And User input kode cabang pembayaran
    And User click status
    And User click pilih non active
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Kode Cabang Pembayaran dan Status Tidak Diinput
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User input rcc pembayaran
    And User click button simpan
    Then User get text popup branch code

  Scenario: Invalid Hanya Input Unit Kerja Penempatan
    When Clear data master unit kerja
    And User input unit kerja penempatan
    And User click button simpan
    Then User get text popup branch code

  Scenario: Invalid Hanya Input Kode Cabang Pembayaran
    When Clear data master unit kerja
    And User input kode cabang pembayaran
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Hanya Input RCC Pembayaran
    When Clear data master unit kerja
    And User input rcc pembayaran
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Hanya Input Status
    When Clear data master unit kerja
    And User click status
    And User click pilih active
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Invalid Tidak Ada Data yang Diinput
    When Clear data master unit kerja
    And User click button simpan
    Then User get text popup workplacement

  Scenario: Mencari Unit Kerja yang Diinput
    When User mencari unit kerja active
    And User scrolldown unit active
    And User get text unit kerja active
    And User scrolldown unit non active
    Then User get text unit kerja non active

  Scenario: Mencari Kode Cabang Pembayaran yang Diinput
    When User mencari kode cabang pembayaran
    Then User get text branch code

  Scenario: Mencari RCC Pembayaran yang Diinput
    When User mencari rcc pembayaran
    Then User get text rcc code

  Scenario: Mencari Data Invalid Master Unit Kerja
    When User invalid data
    Then User get text workplacement no matching records found