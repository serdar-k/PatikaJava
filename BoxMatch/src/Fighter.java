public class Fighter {
    String name;
    int damageToFoe;
    int health;
    int weight;
    double dodgeFromFoe;

    public Fighter(String name, int damageToFoe, int health, int weight, double dodgeFromFoe) {
        this.name = name;
        this.damageToFoe = damageToFoe;
        this.health = health;
        this.weight = weight;
        this.dodgeFromFoe = dodgeFromFoe;
    }

    public int hit(Fighter foe) {
        System.out.println("===== YENI ROUND =====");
        System.out.println(this.name + " -> " + foe.name + " Oyuncusuna " + this.damageToFoe + " Puan Kadar Zarar Verdi!");
        if (foe.dodge()) {
            System.out.println(foe.name + " Gelen Darbeyi Savusturdu!");
            return foe.health;
        }
        if (foe.health - this.damageToFoe < 0) {
            return 0;
        }
        return foe.health - this.damageToFoe;
    }

    public boolean dodge() {
        double random = Math.random() * 100;
        return this.dodgeFromFoe >= random;
    }
}
