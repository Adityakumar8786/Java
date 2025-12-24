class multilevel{
    public static void main(String [] args){
bird crow = new bird();
crow.eat();
    }
} 

class animal {
void eat(){
    System.out.println("Eat");
}
}
class mamal extends animal {
    void sleep(){
    System.out.println("sleep");
    }
}

class bird extends mamal {
    void fly(){
    System.out.println("fly");
    }
}