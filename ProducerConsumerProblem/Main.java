package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        ProducerConsumerProblem pc= new ProducerConsumerProblem();

        Producer p= new Producer(pc);

        Consumer c1 = new Consumer(pc);

        p.start();
        c1.start();
    }

}
