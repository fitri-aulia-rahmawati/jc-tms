Feature: Absen Masuk Page Test
#T2
  Scenario: Absen Masuk Test
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    Then User get text Absen Masuk

#  T3
  Scenario:Just Upload txt file
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File Txt
    Then User Get Error Message Wrong Type File

#T4
  Scenario:Absen Masuk Without Any Input
    When User click Button Submit
    Then User Get PopUp Upload File Required


#  T5
  Scenario:Absen Masuk Just Upload Selfie Photo
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User click Button Submit
    Then User Get PopUp Nama Shift Required

#  T6
  Scenario:Absen Masuk Just Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T7
  Scenario:Absen Masuk just Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T8
  Scenario:Absen Masuk Just Choose WFO In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#T9
  Scenario:Absen Masuk Just Upload Selfie Photo And Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Tipe Absen Required


#  T10
  Scenario:Absen Masuk Just Upload Selfie Photo And Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#     T11
  Scenario:Absen Masuk Just Upload Selfie And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#    T12
  Scenario:Absen Masuk Just Input Nama Shift And Choose WFH in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#    T13
  Scenario:Absen Masuk Just Input Nama Shift And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T14
  Scenario: Valid Absen Masuk WFH
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done
#  T15
  Scenario: Valid Absen Masuk WFO
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User get text Absen Done


    # T16
  Scenario: Valid Absen upload file 8mb
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    And User Upload file JPG 8mb
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done
