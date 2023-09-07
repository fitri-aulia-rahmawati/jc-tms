package com.juaracoding.utils;

public enum TestCases {
    T1("Login Invalid URL"),
    T2("Login Valid URL"),
    T3("Login Invalid Username"),
    T4("Login Invalid Password"),
    T5("Login Admin No Username"),
    T6("Login Admin No Password"),
    T7("Login Valid Credentials"),
    T8("Report Absen Just Position"),
    T9("Report Absen Just Branch"),
    T10("Report Absen Just Unit"),
    T11("Report Absen Just Start Date"),
    T12("Report Absen Just End Date"),
    T13("Report Absen Off"),
    T14("Logout");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
