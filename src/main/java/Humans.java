public class Humans {
    private String name;
    private int health;
    private int strength;
    private int stamina;

    public Humans(){

    }
    public Humans(String name,int health,int strength,int stamina){
        this.name=name;
        this.health=health;
        this.strength=strength;
        this.stamina=stamina;
    }
    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString(){
        return "Human";
    }
}
