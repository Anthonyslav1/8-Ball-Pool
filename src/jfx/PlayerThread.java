package jfx;

import java.util.logging.Level;
import java.util.logging.Logger;

//the target is to play with the two players using thread inter communication;while one is playing the other will be kept in a wait
public class PlayerThread implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(PlayerThread.class.getName());
    boolean isPlaying;
    String name;
    Thread t;

    public PlayerThread(String name) {
        this.name = name;
        isPlaying = false;
        t = new Thread(this);
        t.start();
    }
    synchronized void setStatus(){
        if(!isPlaying){
            isPlaying = true;
            notify();
        }
        else{
            isPlaying = false;
        }
    }
    @Override
    public void run() {
        synchronized (this) {
                    try {
                        while (isPlaying) {
                            System.out.println(name + " is playing");
                        }
                        wait();
                    } catch (InterruptedException e) {
                        LOGGER.log(Level.SEVERE, "Interrupted while waiting", e);
                    }
                }
            }

}
class RunningGame{
    public static void main(String[] args) throws InterruptedException {
        PlayerThread p1 = new PlayerThread("swapnil");
        p1.setStatus();
        PlayerThread p2 = new PlayerThread("hisham");
        int counter = 0;
        while (counter <= 100){
            counter++;
        }
        p2.setStatus();
        p1.setStatus();
    }
}
