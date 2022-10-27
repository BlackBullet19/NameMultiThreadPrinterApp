package multithreadnamecount;

public class ThreadNameMainApp {

    public static void main(String[] args) {

        NameOutputThread nameOutputThreadOne = new NameOutputThread();
        NameOutputThread nameOutputThreadTwo = new NameOutputThread();
        NameOutputThread nameOutputThreadThree = new NameOutputThread();
        NameOutputThread nameOutputThreadFour = new NameOutputThread();

        Thread threadOne = new Thread(nameOutputThreadOne);
        nameOutputThreadOne.setName("First name");
        threadOne.start();

        Thread threadTwo = new Thread(nameOutputThreadTwo);
        nameOutputThreadTwo.setName("Second name");
        threadTwo.start();

        Thread threadThree = new Thread(nameOutputThreadThree);
        nameOutputThreadThree.setName("Third name");
        threadThree.start();

        Thread threadFour = new Thread(nameOutputThreadFour);
        nameOutputThreadFour.setName("Fourth name");
        threadFour.start();
    }
}
