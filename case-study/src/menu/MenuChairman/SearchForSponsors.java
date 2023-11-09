package menu.MenuChairman;

import menu.Command;

public class SearchForSponsors implements Command {
    @Override
    public void execute() {
        System.out.println("""
                Search and attract sponsors and business partners.
                Sponsors: Spotify.
                Business partners: Nike
                """);
    }
}
