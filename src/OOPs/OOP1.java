package OOPs;

    class Animal {
        String name;
    }

    class Dog extends Animal{
        String name;
        void print(){
            super.name="Animal";
            name="jypsy";
            System.out.println("Parent name = "+super.name+" Child name = "+this.name);
        }

    }


public class OOP1 {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.print();
        }   
    }
