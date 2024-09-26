package chp08.lab08;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        this.name = s;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public void attack(Monster enemy){

    }
    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;

        }
    }
}
