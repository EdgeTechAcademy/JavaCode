package interfaces;

public class Horse implements Mammal {

    public static void main(String[] args) {
        Horse horse = new Horse();
    }

    @Override
    public String liveBirth() {
        return "your stuff here";
    }

    @Override
    public String whatAmI() {
        return null;
    }
}
