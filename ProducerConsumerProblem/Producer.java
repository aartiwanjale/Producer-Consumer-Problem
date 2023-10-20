package ExceptionHandling;

public class Producer extends Thread{

    ProducerConsumerProblem c;

    Producer(ProducerConsumerProblem c)
    {
        this.c=c;
    }

    public void run(){
        int i= 1;
        while (true){
            try {
                this.c.Produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(10000);
            } catch (Exception e) {

            }
            i++;
        }
    }
}
