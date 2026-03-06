public class Character {

    String name;
    int hp;
    int attack;
    int defense;

    public Character(String name, int hp, int attack, int defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Character target){
        int damage = attack - target.defense;
        target.hp -= damage;
        System.out.println(name + " attacked " + target.name + " for " + damage);
    }

}