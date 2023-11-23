class OrderManager {
    private volatile int orderNumber = 1;

    public synchronized void placeOrder() {
        try {
            while (orderNumber % 2 == 0) {
                wait();
            }

            System.out.println("Order Placed - " + orderNumber);
            orderNumber++;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deliverOrder() {
        try {
            while (orderNumber % 2 != 0) {
                wait();
            }

            System.out.println("Delivered Order - " + orderNumber);
            orderNumber++;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CustomerOrder extends Thread {
    private OrderManager orderManager;
    private boolean isDelivery;

    CustomerOrder(OrderManager orderManager, boolean isDelivery) {
        this.orderManager = orderManager;
        this.isDelivery = isDelivery;
    }

    @Override
    public void run() {
        if (isDelivery) {
            orderManager.deliverOrder();
        } else {
            orderManager.placeOrder();
        }
    }
}

public class ZomatoFoodDelivery {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                threads[i] = new CustomerOrder(orderManager, false);
            } else {
                threads[i] = new CustomerOrder(orderManager, true);
            }
        }

        // Start threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Join threads
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
