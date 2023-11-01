import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnexpress.net/bong-da");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            Pattern pattern = Pattern.compile("<h2 class=\"title-news\"><a(.*?)href=\"(.*?)\"title=\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println(matcher.group(3));
                System.out.println(matcher.group(2));
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}