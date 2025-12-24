// abstract class in which we cannot make instance 
// can have abstract/non abstract method 
// can have constructor 

class abstractclass{
    public static void main(String[] args){
Horse h1 = new Horse();
h1.eat();
h1.walk();
System.out.println(h1.color);
h1.color = "red";
System.out.println(h1.color);


Chicken c = new Chicken();
c.eat();
c.walk();
    }
}

abstract class Animal {
String color ; 
    Animal(){
        color = "brown";
    }
    void eat() {
        System.out.println("All animals eat");
    }

    abstract void walk ();
}

class Horse extends Animal {
    void changecolor(){
        color = "darkbrown";
    }
    void walk(){
        System.out.println("horse runs fast");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.print("Chicken cannot run fast");
    }
}