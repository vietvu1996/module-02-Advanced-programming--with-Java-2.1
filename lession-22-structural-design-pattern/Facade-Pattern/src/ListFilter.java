import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> numbers) {
        List<Integer> evenNumbersList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }
        return evenNumbersList;
    }
}
