package menu.MenuChairman;

import entity.Finance;
import menu.Command;

import java.util.ArrayList;
import java.util.List;

public class SearchForSponsors implements Command {
    private List<Sponsor> sponsors;
    private Finance finance;
    private int clubRanking;

    public SearchForSponsors() {
    }

    public SearchForSponsors(Finance finance, int clubRanking) {
        this.sponsors = new ArrayList<>();
        this.finance = finance;
        this.clubRanking = clubRanking;
    }

    public void findSponsors() {
        sponsors.add((new Sponsor("Spotify", 1000000, 1)));
        sponsors.add((new Sponsor("Nike", 1500000, 1)));
        sponsors.add((new Sponsor("Rakuten", 2100000, 3)));
        sponsors.add((new Sponsor("Unicef", 900000, 2)));
        sponsors.add((new Sponsor("Qatar Foundation", 2000000, 4)));

        System.out.print("We have lists of Sponsors are: " );
        for (Sponsor sponsor: sponsors) {
            System.out.print(sponsor.getName() + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Based on standard/criteria between club and sponsors, we decided to accepted sponsored by these Sponsors:");
        System.out.println();
        for (Sponsor sponsor : sponsors) {
            dealWithSponsor(sponsor);
        }
    }

    private void dealWithSponsor(Sponsor sponsor) {
        if (finance.getBudget() > sponsor.getOfferAmount() && clubRanking <= sponsor.getConditionSponsor() && clubRanking != 0) {
            System.out.println("The deal with " + sponsor.getName() + " has been made successfully.");
            System.out.println();
        } else {
            System.out.println("The club's budget is less than the offer amount. The deal with " + sponsor.getName() + " cannot be made.");
            System.out.println();
        }
    }

    @Override
    public void execute() {
        Finance finance = new Finance();
        SearchForSponsors searchForSponsors = new SearchForSponsors(finance, 1);
        searchForSponsors.findSponsors();
    }


//    public static void main(String[] args) {
//        SearchForSponsors searchForSponsors = new SearchForSponsors();
//        searchForSponsors.execute();
//    }
}

