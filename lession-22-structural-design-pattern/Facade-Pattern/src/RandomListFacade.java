import java.util.List;

public class RandomListFacade {
    private final ListFilter listFilter;
    private final ListPrinter listPrinter;
    private final RandomList randomList;

    public RandomListFacade() {
        randomList = new RandomList();
        listPrinter = new ListPrinter();
        listFilter = new ListFilter();
    }

    public void printRandomEvenList(int size) {
        List<Integer> randomNumbers = randomList.generateList(size, 1, 100);
        List<Integer> evenNumbers = listFilter.filterOdd(randomNumbers);
        listPrinter.printList(evenNumbers);
    }
}
