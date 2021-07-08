public class homework5 {
    public static void main(String[] args) {
        Hero naruto = new Hero();
        naruto.setHealth(400);
        naruto.setDamage(90);
        naruto.setSuperPowerDamage(120);
        System.out.println("naruto" + " health: " + naruto.getHealth() + ", damage: " + naruto.getDamage() + ", powerDamage: " + naruto.getSuperPowerDamage());



        Boss Boss = new Boss();
        Boss.setHealth(400);
        Boss.setDamage(88);
        Boss.setTypeDefence(120);
        System.out.println("Boss" + " health: " + Boss.getHealth() + ", damage: " + Boss.getDamage() + " TypeDefence: " + Boss.getTypeDefence());
        System.out.println("_____________________________");
        int fight = 0;

        while (fight < 5){
            fight = fight + 1;
            naruto.health = naruto.health - Boss.damage;
            System.out.println("naruto health: " + naruto.health);
            Boss.health = Boss.health - naruto.damage;
            System.out.println("Boss health:" + Boss.health);
            System.out.println("____________________________");
            naruto.superpower();

            Boss.Defend();
            System.out.println("_____________________________");

        }

        if (naruto.health < 0){
            System.out.println("Boss won");
        }else {
            System.out.println("naruto won");

        }

    }
}
