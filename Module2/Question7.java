
public class Question7 {
    public static void main(String[] args) {
      System.out.println("Kaushik Jain 22BCP357");
            Car car = new Car();
            car.start();
            car.playMusic();
            car.stop();

    }
}
    // First interface
    interface Vehicle {
        void start();
        void stop();
    }

    // Second interface
    interface MusicPlayer {
        void playMusic();
    }

    // Class implementing both interfaces
    class Car implements Vehicle, MusicPlayer {
        @Override
        public void start() {
            System.out.println("Car started");
        }

        @Override
        public void stop() {
            System.out.println("Car stopped");
        }

        @Override
        public void playMusic() {
            System.out.println("Car playing music");
        }
    }


