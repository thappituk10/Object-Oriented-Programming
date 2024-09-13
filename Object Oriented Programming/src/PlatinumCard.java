public class PlatinumCard extends MemberCard {
    public PlatinumCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .25f;
    }
    
}