package interfaces;

public class Horse implements Mammal, Mythical {
    public String whatAmI () {
        return "I am a horse.";
    }
    public String liveBirth() {
        return "Standing Birth";
    }
    public String magicPower() {
        return "I can Fly!";
    }
}
