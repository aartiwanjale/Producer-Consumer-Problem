package ExceptionHandling;

public class Consumer extends Thread {
    ProducerConsumerProblem c;

    Consumer (ProducerConsumerProblem c){
        this.c=c;
    }
    public  void run(){
        while (true){
            try {
                this.c.Consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
        }
    }

}

