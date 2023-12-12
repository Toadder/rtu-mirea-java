import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // -- WaitList ---
        System.out.println("WaitList");

        WaitList<Integer> waitList = new WaitList<>();

        System.out.println("isEmpty: " + waitList.isEmpty());

        waitList.add(1);
        waitList.add(2);

        System.out.println("isEmpty: " + waitList.isEmpty());
        System.out.println("Contains 2: " + waitList.contains(2));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        System.out.println("Contains 2 & 1: " + waitList.containsAll(list));

        System.out.println("Remove: " + waitList.remove() + " " + waitList.remove());
        System.out.println("isEmpty: " + waitList.isEmpty());
        // -- /WaitList ---

        System.out.println("-------------------------------");

        // -- BoundedWaitList ---
        System.out.println("BoundedWaitList");

        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(2);

        System.out.println("Capacity: " + boundedWaitList.getCapacity());
        System.out.println("isEmpty: " + boundedWaitList.isEmpty());

        boundedWaitList.add(3);
        boundedWaitList.add(4);

        System.out.println("isEmpty: " + boundedWaitList.isEmpty());
        // -- /BoundedWaitList ---

        System.out.println("-------------------------------");

        // -- UnfairWaitList ---
        System.out.println("UnfairWaitList");

        UnfairWaitList unfairWaitList = new UnfairWaitList<>();

        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);
        unfairWaitList.printQueue();

        unfairWaitList.remove(3);
        unfairWaitList.printQueue();

        unfairWaitList.moveToBack(2);
        unfairWaitList.printQueue();
        // -- /UnfairWaitList ---

    }
}
