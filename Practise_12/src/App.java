public class App {
    public static void main(String[] args) throws Exception {
        // --- Task 1 ---
        System.out.println("Stack:");
        StackGame stackGame = new StackGame();
        stackGame.init();
        System.out.println();
        // --- /Task 1 ---

        // --- Task 2 ---
        System.out.println("Queue:");
        QueueGame queueGame = new QueueGame();
        queueGame.init();
        System.out.println();
        // --- /Task 2 ---

        // --- Task 3 ---
        System.out.println("Dequeue:");
        DequeueGame dequeueGame = new DequeueGame();
        dequeueGame.init();
        System.out.println();
        // --- /Task 3 ---

        // --- Task 4 ---
        System.out.println("Doublie List:");
        DoubleListGame doubleListGame = new DoubleListGame();
        doubleListGame.init();
        // --- Task 4 ---
    }
}
