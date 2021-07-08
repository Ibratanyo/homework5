import java.util.Random;

public class Boss {

        public int health;
        public int damage;
        public int TypeDefence;

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

        public int getTypeDefence(){
            return TypeDefence;

        }

        public void setTypeDefence(int typeDefence){
            this.TypeDefence = typeDefence;
        }

        public void Defend(){
            Random random = new Random();
            int def = random.nextInt(5);
            if(def == 1){
                System.out.println("using power: Rasengan");

            }

            if(def == 2){
                System.out.println("using power: rasenshuriken");

            }

            if(def == 3) {
                System.out.println("using power: odama rasengan");

            }

            if(def == 4){
                System.out.println("using power: shadow cloning");

            }

            if(def == 5){
                System.out.println("using power: barion");

            }
        }



}
