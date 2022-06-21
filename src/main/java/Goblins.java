public class Goblins {
    int strength;
    String stamina;
    String name;
    String color;
    // Do not change the constructor for goblin please!
    public Goblins() {
    }
    public Goblins(int strength){
        this.strength = strength;
    }


    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        return "Goblin";
    }
}
