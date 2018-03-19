public class dataStructure {

    /* LIST */

    private static String[] list = new String[100];

    private static int listLength = 0;

    private static void add(String item) {
        if (listLength == 100) {
            return;
        }
        list[listLength++] = item;
    }

    private static String get(int index) {
        if(!(index < listLength)) {
            return "";
        }
        return list[index];
    }

    private static void clearList() {
        listLength = 0;
    }

    /* STACK */

    private static String[] stack = new String[100];

    private static int stackHeight = 0;

    private static void push(String item) {

    }

    private static String pop() {
        return null;
    }

    private static void clearStack() {

    }

    /* QUEUE */

    private static String[] queue = new String[100];

    private static int queueStart = 0;

    private static int queueLength = 0;

    private static void enqueue(String item) {
        if (queueLength == 100) {
            return;
        }
        queue[(queueStart + queueLength++) % 100] = item;
    }

    private static String dequeue() {
        return;
    }

    private static void clearQueue() {
        return;
    }

    /* MAIN */

    public static void main(String[] args) {
        add("Red");
        add("Yellow");
        add("Orange");
        System.out.println(get(2));
        add("Purple");
        System.out.println(get(0));
    }
}