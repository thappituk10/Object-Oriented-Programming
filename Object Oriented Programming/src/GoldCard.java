public class GoldCard extends MemberCard {
    public GoldCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .20f;
    }
    
}
