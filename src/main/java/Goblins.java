public class Goblins {
    private int strength;
    private int stamina;
    private String name;
    private String color;
    // Do not change the constructor for goblin please!
    public Goblins() {
    }
    public Goblins(int strength, int stamina, String name, String color){
        this.strength = strength;
        this.stamina=stamina;
        this.name=name;
        this.color=color;
    }
    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Goblin";
    }
}
