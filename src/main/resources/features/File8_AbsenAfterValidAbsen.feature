Feature: After Valid Absen

    #  T69
  Scenario: Valid Login Test 1
    When Profile Logout
    And User enter valid username1
    And User enter valid password1
    And User click button login

#  T70
  Scenario: Open Absen Masuk After Valid Absen Izin
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    Then alert popup

#T71
  Scenario:Open Absen Pulang After Valid Absen Izin
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    Then alert popup

#T72
  Scenario:Open Absen Izin After Valid Absen Izin
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    Then alert popup

#T73
  Scenario:Open Absen Sakit After Valid Absen Izin
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    Then alert popup

# T74
  Scenario:Open Absen Off After Valid Absen Izin
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    Then alert popup
    And Profile Logout

#  T75
  Scenario: Valid Login Test 2
    When User enter valid username2
    And User enter valid password2
    And User click button login

#T76
  Scenario:Open Absen Masuk After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    Then alert popup

#    T77
  Scenario:Open Absen Pulang After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    Then alert popup

#    T78
  Scenario:Open Absen Izin After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    Then alert popup

#    T79
  Scenario:Open Absen Sakit After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    Then alert popup

#    T80
  Scenario:Open Absen Off After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    Then alert popup
    And Profile Logout

#    T81
  Scenario:Valid Login Test 3
    When User enter valid username3
    And User enter valid password3
    And User click button login

#T82
  Scenario:Open Absen Masuk After Valid Absen Off
    When User click Laporan Kegiatan Page
    And User click Absen Masuk Page
    Then alert popup

#    T83
  Scenario:Open Absen Pulang After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Pulang Page
    Then alert popup

#    T84
  Scenario:Open Absen Izin After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Izin Page
    Then alert popup

#    T85
  Scenario:Open Absen Sakit After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Sakit Page
    Then alert popup

#    T86
  Scenario:Open Absen Off After Valid Absen Sakit
    When User click Laporan Kegiatan Page
    And User click Absen Off Page
    Then alert popup
    And Profile Logout
