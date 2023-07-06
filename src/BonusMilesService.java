public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesForMoney = 20;
        int miles = ticketPrice / milesForMoney;
        return miles;
    }
}

