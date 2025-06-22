package Day14;

		class Counter {
		    private int count = 0;

		    // Synchronized method to ensure thread safety
		    public synchronized void increment() {
		        count++;
		    }

		    public int getCount() {
		        return count;
		    }
		}

		class CounterThread extends Thread {
		    private Counter counter;

		    public CounterThread(Counter counter) {
		        this.counter = counter;
		    }

		    @Override
		    public void run() {
		        // Each thread increments the counter 1000 times
		        for (int i = 0; i < 1000; i++) {
		            counter.increment();
		        }
		    }
		}

		public class SynchronizeInMultithreading {
		    public static void main(String[] args) {
		        Counter counter = new Counter();

		        // Create multiple threads sharing the same counter
		        CounterThread t1 = new CounterThread(counter);
		        CounterThread t2 = new CounterThread(counter);
		        CounterThread t3 = new CounterThread(counter);

		        // Start threads
		        t1.start();
		        t2.start();
		        t3.start();

		        // Wait for all threads to finish
		        try {
		            t1.join();
		            t2.join();
		            t3.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Final counter value should be 3000
		        System.out.println("Final counter value: " + counter.getCount());
		    }
		

	

}
