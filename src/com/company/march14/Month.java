package com.company.march14;

public enum Month {
    JANUARY("January", "Winter", 1),
    FEBRUARY("February", "Winter", 2),
    MARCH("March", "Spring", 3),
    APRIL("April", "Spring", 4),
    MAY("May", "Spring", 5),
    JUNE("June", "Summer", 6),
    JULY("July", "Summer", 7),
    AUGUST("August", "Summer", 8),
    SEPTEMBER("September", "Autumn", 9),
    OCTOBER("October", "Autumn", 10),
    NOVEMBER("November", "Autumn", 11),
    DECEMBER("December", "Winter", 12);

    private final String fullName;
    private final String season;
    private final int number;

    Month(String fullName, String season, int number) {
        this.fullName = fullName;
        this.season = season;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSeason() {
        return season;
    }

    public int getNumber() {
        return number;
    }
}