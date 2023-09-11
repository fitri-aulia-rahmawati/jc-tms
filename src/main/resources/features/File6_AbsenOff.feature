Feature: Absen Off Page Test
#T52
  Scenario: Absen Off Test
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    Then User get text Absen Off

#  T53
  Scenario:Absen Off Without Any Input
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T54
  Scenario:Absen Off Just Upload Selfie Photo
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Upload File
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T55
  Scenario:Absen Off Just Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T56
  Scenario:Absen Off just Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T57
  Scenario:Absen Off Just Choose WFO In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#T58
  Scenario:Absen Off Just Upload Selfie Photo And Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Upload File
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Tipe Absen Required


#   T59
  Scenario:Absen Off Just Upload Selfie Photo And Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Upload File
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T60
  Scenario:Absen Off Just Upload Selfie And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Upload File
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#   T61
  Scenario:Absen Off Just Input Nama Shift And Choose WFH in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#   T62User click Laporan Kegiatan Page
  Scenario:Absen Off Just Input Nama Shift And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


