public class DiamondCard extends MemberCard {
    public DiamondCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .30f;
    }
    
}
