package multithreadnamecount;

public class NameOutputThread implements Runnable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        printName();
    }

    private void printName() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("name: " + name + " index: " + i);
        }
    }
}
