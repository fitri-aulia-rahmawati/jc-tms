package com.juaracoding.utils;

public enum TestCases {
    T1("Login Invalid URL"),
    T2("Login Valid URL"),
    T3("Login Invalid Username"),
    T4("Login Invalid Password"),
    T5("Login Staff1 No Username"),
    T6("Login Staff1 No Password"),
    T7("Login Staff1 Valid Credentials"),
    T8("Logout"),
    T9("Login Invalid Username"),
    T10("Login Invalid Password"),
    T11("Login Staff2 No Username"),
    T12("Login Staff2 No Password"),
    T13("Login Staff2 Valid Credentials"),
    T14("Logout"),
    T15("Login Invalid Username"),
    T16("Login Invalid Password"),
    T17("Login Staff3 No Username"),
    T18("Login Staff3 No Password"),
    T19("Login Staff3 Valid Credentials"),
    T20("Logout"),
    T21("Login Invalid Username"),
    T22("Login Invalid Password"),
    T23("Login Staff4 No Username"),
    T24("Login Staff4 No Password"),
    T25("Login Staff4 Valid Credentials"),
    T26("Logout"),
    T27("Login Invalid Username"),
    T28("Login Invalid Password"),
    T29("Login Staff5 No Username"),
    T30("Login Staff5 No Password"),
    T31("Login Staff5 Valid Credentials"),
    T32("Logout"),
    T33("Login Invalid Username"),
    T34("Login Invalid Password"),
    T35("Login Staff5 No Username"),
    T36("Login Staff5 No Password"),
    T37("Login Staff5 Valid Credentials"),
    T38("Get Into Report Absen Off Page"),
    T39("Report Absen Just Position"),
    T40("Report Absen Just Branch"),
    T41("Report Absen Just Unit"),
    T42("Report Absen Just Start Date"),
    T43("Report Absen Just End Date"),
    T44("Report Absen More Than One Month"),
    T45("Report Absen Off"),
    T46("Logout");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
