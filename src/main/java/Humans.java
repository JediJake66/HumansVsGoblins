import java.util.concurrent.ThreadLocalRandom;

public class Humans {
    Goblins goblin = new Goblins();
    private String name;
    private int health=100;
    private int strength= ThreadLocalRandom.current().nextInt(10, 20);
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

    public void attack(){
        while(health>0&&goblin.getHealth()>0) {
            goblin.setHealth(goblin.getHealth() - strength);
            setHealth(getHealth()- goblin.getStrength());
            System.out.println("player health" +health);
            System.out.println("Player Strength" + strength);
            System.out.println("Goblin health" + goblin.getHealth());
            System.out.println("Goblin Strength" + goblin.getStrength());
        }
        goblin.setHealth(30);
        goblin.setStrength(ThreadLocalRandom.current().nextInt(8, 30));
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
