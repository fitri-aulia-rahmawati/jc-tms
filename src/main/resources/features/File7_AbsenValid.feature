Feature: Absen Valid for Izin, Sakit, and Off Page Test

#        T63
  Scenario:Valid Absen Izin Absen WFH
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done


#T64
#  Scenario:Valid Absen Izin Absen WFO
#    When User click Laporan Kegiatan Page
#    And User click Absen Izin Page
#    And User Upload File
#    And User Choose Non Shift
#    And User Choose Tipe Absen WFO
#    And User click Button Submit
#    Then User get text Absen Done

  #  T65
  Scenario:Valid Absen Sakit Absen WFH
    When Profile Logout
    And User enter valid username2
    And User enter valid password2
    And User click button login
    And User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done


#  T66
#  Scenario:Absen Sakit Valid Absen WFO
#    When Profile Logout
#    And User enter valid username2
#    And User enter valid password2
#    And User click button login
#    And User click Laporan Kegiatan Page
#    And User click Absen Sakit Page
#    And User Upload File
#    And User Choose Non Shift
#    And User Choose Tipe Absen WFO
#    And User click Button Submit
#    Then User get text Absen Done

#  #  T67
  Scenario:Valid Absen Sakit Absen WFH
    When Profile Logout
    And User enter valid username3
    And User enter valid password3
    And User click button login
    And User click Laporan Kegiatan Page
    And User click Absen Off Page
    And User Upload File
    And User Choose Non Shift
    And User Choose Tipe Absen WFH
    And User click Button Submit
    Then User get text Absen Done


#  T68
#  Scenario:Valid Absen Off Absen WFO
#    When Profile Logout
#    And User enter valid username3
#    And User enter valid password3
#    And User click button login
#    And User click Laporan Kegiatan Page
#    And User click Absen Off Page
#    And User Upload File
#    And User Choose Non Shift
#    And User Choose Tipe Absen WFO
#    And User click Button Submit
#    Then User get text Absen Done


