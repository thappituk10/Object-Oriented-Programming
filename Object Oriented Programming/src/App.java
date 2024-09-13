public class App {
    public static void main(String[] args) throws Exception {
        MemberCard platinumCard = new PlatinumCard("Anna", 2000);
        System.out.println("Platinum info");
        platinumCard.display();
        System.out.println("****************");
        MemberCard silverCard = new SilverCard("Peter", 2500);
        System.out.println("Silver info");
        silverCard.display();
        System.out.println("****************");
        MemberCard DiamondCard = new DiamondCard("Marcus", 3500);
        System.out.println("Diamond info");
        DiamondCard.display();
        System.out.println("****************");
        MemberCard GoldCard = new GoldCard("Zero", 2050);
        System.out.println("Gold info");
        GoldCard.display();
    }
}