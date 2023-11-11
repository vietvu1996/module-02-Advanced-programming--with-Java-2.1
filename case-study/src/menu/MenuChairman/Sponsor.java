package menu.MenuChairman;

public class Sponsor {
    private final String name;
    private final double offerAmount;
    private final int conditionSponsor;

    public Sponsor(String name, double offerAmount, int conditionSponsor) {
        this.name = name;
        this.offerAmount = offerAmount;
        this.conditionSponsor = conditionSponsor;
    }

    public String getName() {
        return name;
    }

    public double getOfferAmount() {
        return offerAmount;
    }

    public int getConditionSponsor() {
        return conditionSponsor;
    }
}
