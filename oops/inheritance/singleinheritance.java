class singleinheritance{
    public static void main(String [] args){
mamal m = new mamal(); 
m.eat();
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