package Enums;

public enum Size {
    SMALL("0,10"),
    MEDIUM("0,15"),
    LARGE("0,20");

    String prise;

    Size(String prise) {
        this.prise = prise;
    }

    public String getPrise() {
        return prise;
    }
}
