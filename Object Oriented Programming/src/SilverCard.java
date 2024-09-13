public class SilverCard extends MemberCard {
    public SilverCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .05f;
    }
    
}