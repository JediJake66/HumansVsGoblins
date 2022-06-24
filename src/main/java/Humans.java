public class Humans {
    private String name;
    private int health;
    private int strength;
    private int stamina;

    private int[] cords={7,7};

    public Humans(){

    }
    public Humans(String name,int health,int strength,int stamina,int[] cords){
        this.name=name;
        this.health=health;
        this.strength=strength;
        this.stamina=stamina;
        this.cords=cords;
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

    public int[] getCords() {
        return cords;
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

    public void setCords(int[] cords) {
        this.cords = cords;
    }

    @Override
    public String toString(){
        return "Human";
    }
}
