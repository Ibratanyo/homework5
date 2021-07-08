import java.util.Random;

public class Hero {

        public int health;
        public int damage;
        public int superPowerDamage;

        public int getHealth(){
            return health;
        }

        public void setHealth(int health){
            this.health = health;

        }

        public int getDamage(){
            return damage;

        }

        public void setDamage(int damage){
            this.damage = damage;

        }

    public int getSuperPowerDamage() {
        return superPowerDamage;

    }

    public void setSuperPowerDamage(int superPowerDamage) {
        this.superPowerDamage = superPowerDamage;

    }

    public void superpower(){
        Random random = new Random();
        int power = random .nextInt(5);
        if(power == 1){
            System.out.println("using power: Rasengan");

        }

        if(power == 2){
            System.out.println("using power: rasenshuriken");

        }

        if(power == 3) {
            System.out.println("using power: odama rasengan");

        }


            if(power == 4){
                System.out.println("using power: shadow cloning");

            }

            if(power == 5){
                System.out.println("using power: barion");

            }

        }



    }



