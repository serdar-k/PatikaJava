public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int maxWeight;
    int minWeight;

    public Match(Fighter fighter1, Fighter fighter2, int maxWeight, int minWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                double randomStart = Math.random() * 100;
                if (randomStart > 50) {
                    fighter2.health = fighter1.hit(fighter2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    fighter1.health = fighter2.hit(fighter1);
                    if (isWin()) {
                        break;
                    }
                }
                showHealth();
            }
        } else {
            System.out.println("Sporcularin Agirliklari Uyusmuyor!");
        }
    }

    public boolean checkWeight() {
        return ((fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight));
    }

    public boolean isWin() {
        if (fighter1.health > 0 && fighter2.health <= 0) {
            showHealth();
            System.out.println("Kazanan: " + fighter1.name);
            System.out.println("Oyun Bitti!");

            return true;
        } else if (fighter2.health > 0 && fighter1.health <= 0) {
            showHealth();
            System.out.println("Kazanan: " + fighter2.name);
            System.out.println("Oyun Bitti!");

            return true;
        }
        return false;
    }

    public void showHealth() {
        System.out.println(fighter1.name + " Adli Oyuncunun Sagligi: " + fighter1.health);
        System.out.println(fighter2.name + " Adli Oyuncunun Sagligi: " + fighter2.health);
    }
}
