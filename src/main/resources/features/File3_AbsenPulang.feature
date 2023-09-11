Feature: Absen Pulang Page Test
#T17
  Scenario: Absen Pulang Test
    When User click Laporan Kegiatan Page1
    And User click Absen Pulang Page
    Then User get text Absen Pulang

#  T18
  Scenario:Absen Pulang Without Any Input
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T19
  Scenario:Absen Pulang Just Upload Selfie Photo
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T20
  Scenario:Absen Pulang Just Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T21
  Scenario:Absen Pulang just Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T22
  Scenario:Absen Pulang Just Choose WFO In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#T23
  Scenario:Absen Pulang Just Upload Selfie Photo And Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Tipe Absen Required


#  T24
  Scenario:Absen Pulang Just Upload Selfie Photo And Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T25
  Scenario:Absen Pulang Just Upload Selfie And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#   T26
  Scenario:Absen Pulang Just Input Nama Shift And Choose WFH in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T27
  Scenario:Absen Pulang Just Input Nama Shift And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T28
  Scenario:Valid Absen Pulang WFH
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done
#  T29
  Scenario:Valid Absen Pulang WFO
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User get text Absen Done
