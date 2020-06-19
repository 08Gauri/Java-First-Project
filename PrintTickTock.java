class PrintTickTock implements Runnable {
	
	int count = 0;
	boolean isTick = true;
    @Override
    public void run() {
    	while(count < 10) {
    		if(isTick)
    			this.printTick();
    		else
    			this.printTock();
    		
    		count++;
    	}
    		
    }

    synchronized void printTick() {

        while (isTick == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tick");
        isTick = false;
        notifyAll();
    }

    synchronized void printTock() {
        while (isTick == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tock");
        isTick = true;
        notifyAll();
    }

}

