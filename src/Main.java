public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15232;
        int bonusMilePrice = 20;
        int bonusesForTicket = (ticketPrice / bonusMilePrice);

        System.out.println("Стоимость билета: " + ticketPrice);
        System.out.println("Будет начислено бонусов: " + bonusesForTicket);
    }
}