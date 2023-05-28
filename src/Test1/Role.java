package Test1;
import java.util.Random;

public class Role {

        private String name;
        private int blood;


        public Role() {
        }

        public Role(String name, int blood) {
            this.name = name;
            this.blood = blood;
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         * @return blood
         */
        public int getBlood() {
            return blood;
        }

        /**
         * 设置
         * @param blood
         */
        public void setBlood(int blood) {
            this.blood = blood;
        }

        public String toString() {
            return "Role{name = " + name + ", blood = " + blood + "}";
        }

        //定义一个方法用于攻击别人
//谁攻击谁
        public void attack(Role role){
            //计算造成伤害
            Random random=new Random();
            int hurt=    random.nextInt(20)+1;
            int remainBoold=role.getBlood()-hurt;

            remainBoold= remainBoold<0?0:remainBoold;
            role.setBlood(remainBoold);
            System.out.println(this.getName()+"举起拳头打了"+role.getName()+"一下，造成了"+hurt+"伤害，+role.getName()+还剩下"+remainBoold+"血");
        }

}
