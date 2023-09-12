package com.juaracoding.utils;

public enum TestCases {
    T1("Test Login Valid"),
    T2("User hanya input Position"),
    T3("User hanya input Branch"),
    T4("User hanya input Unit"),
    T5("User hanya input Start Date"),
    T6("User hanya input End Date"),
    T7("User Add Absen Masuk"),
    T8("User hanya input Position"),
    T9("User hanya input Branch"),
    T10("User hanya input Unit"),
    T11("User hanya input Start Date"),
    T12("User hanya input End Date"),
    T13("User Add Absen Pulang"),
    T14("User hanya input Position"),
    T15("User hanya input Branch"),
    T16("User hanya input Unit"),
    T17("User hanya input Start Date"),
    T18("User hanya input End Date"),
    T19("User Add Absen Sakit"),
    T20("User hanya input Position"),
    T21("User hanya input Branch"),
    T22("User hanya input Unit"),
    T23("User hanya input Start Date"),
    T24("User hanya input End Date"),
    T25("User Add Absen Izin");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
