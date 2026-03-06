public class Player extends Character {

    int level;
    int exp;

    public Player(String name, int hp, int attack, int defense){
        super(name, hp, attack, defense);
    }

    public void levelUp() {
        level++;
        attack += 2;
        hp += 10;
    }
}