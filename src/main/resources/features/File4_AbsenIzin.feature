Feature: Absen Izin Page Test
#T30
  Scenario: Absen Izin Test
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    Then User get text Absen Izin

#  T31
  Scenario:Absen Izin Without Any Input
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T32
  Scenario:Absen Izin Just Upload Selfie Photo
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Upload File
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T33
  Scenario:Absen Izin Just Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T34
  Scenario:Absen Izin just Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T35
  Scenario:Absen Izin Just Choose WFO In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#T36
  Scenario:Absen Izin Just Upload Selfie Photo And Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Upload File
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Tipe Absen Required


#   T37
  Scenario:Absen Izin Just Upload Selfie Photo And Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Upload File
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T38
  Scenario:Absen Izin Just Upload Selfie And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Upload File
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T39
  Scenario:Absen Izin Just Input Nama Shift And Choose WFH in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T40
  Scenario:Absen Izin Just Input Nama Shift And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required

