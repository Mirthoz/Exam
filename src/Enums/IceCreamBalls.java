package Enums;

public enum IceCreamBalls {
    BERRY("1,40"),
    CHERRY("1,00"),
    CHOCOLATE("1,50"),
    CARAMEL("1,30"),
    NUTS("1,7");
    String prise;

    public String getPrise() {
        return prise;
    }

    IceCreamBalls(String prise) {
        this.prise = prise;
    }
}
