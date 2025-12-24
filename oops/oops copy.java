public class oops {
    public static void main(String []args){
Pen p1 = new Pen();
p1.setcolor("Blue");
System.out.println(p1.color);

bankaccount b1 = new bankaccount() ; 
b1.username = "Aditya";
// b1.password = "123";
b1.setpassword("123");
    }
}

class Pen {
    String color ; 
    int tip ; 
    void setcolor(String newcolor){
        color = newcolor ; 
    }

    void settip(int newtip){
        tip = newtip ; 
    }
}
class bankaccount {
    public String username ;
    private String password ; 
    public void setpassword(String newpassword){ //seters 
        this.password = newpassword ; 
    }
    public void getpassword(String newpassword){ // geters 
        System.out.println(password);
    }
}