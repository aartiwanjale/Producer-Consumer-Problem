package ExceptionHandling;

public class ProducerConsumerProblem {
    int n;
    boolean f= false;
    // f= false chance: Producer
    // f= True chance: consumer
    synchronized public  void Produce_item(int n) throws InterruptedException {// synchronized : at a time one thread
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Produce : "+this.n);
        f=true;
        notify();
    }

   synchronized public int  Consume_item() throws InterruptedException {
        if(!f) {
            wait();
        }

        System.out.println("Consume : "+this.n);
        f=false;
        notify();
        return this.n;
    }
}
