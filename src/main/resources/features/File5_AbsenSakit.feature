Feature: Absen Sakit Page Test
#T41
  Scenario: Absen Sakit Test
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    Then User get text Absen Sakit

#  T42
  Scenario:Absen Sakit Without Any Input
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T43
  Scenario:Absen Sakit Just Upload Selfie Photo
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Upload File
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T44
  Scenario:Absen Sakit Just Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T45
  Scenario:Absen Sakit just Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#  T46
  Scenario:Absen Sakit Just Choose WFO In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


#T47
  Scenario:Absen Sakit Just Upload Selfie Photo And Input Nama Shift
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Upload File
    And User Choose Non Shift
    And User click Button Submit
    Then User Get PopUp Tipe Absen Required


# T48
  Scenario:Absen Sakit Just Upload Selfie Photo And Choose WFH In Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Upload File
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T49
  Scenario:Absen Sakit Just Upload Selfie And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Upload File
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Nama Shift Required


#  T50
  Scenario:Absen Sakit Just Input Nama Shift And Choose WFH in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User Get PopUp Upload File Required


#   T51
  Scenario:Absen Sakit Just Input Nama Shift And Choose WFO in Tipe Absen
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Choose Non Shift
    And User Choose Tipe Absen WFO
    And User click Button Submit
    Then User Get PopUp Upload File Required


