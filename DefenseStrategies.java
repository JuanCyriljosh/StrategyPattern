public class DefenseStrategies {
    
    public static class Shield implements Defense {
        public void defend() {
            System.out.println("Using a shield to defend!");
        }
    }

    public static class Dodge implements Defense {
        public void defend() {
            System.out.println("Dodging to avoid attack!");
        }
    }

    public static class CreateMagicBarrier implements Defense {
        public void defend() {
            System.out.println("Creating a magic barrier for defense!");
        }
    }
}
