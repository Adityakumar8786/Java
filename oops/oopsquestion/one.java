class one {
public static void main(String [] args){
    Vehicle v = new Vehicle();
    Vehicle c = new Car(); 

    v.print();    
    c.print();

    //due to method over riding only 
    //it always follows derived class's function 
    // we can create base class object using derived class object but we cant do vice versa


v.run1();
c.run1();
//here it will thrw error because there is 2 function run and run 1 if both had same name then 
//it woould run but here instance of vehicle can't access run1 function 
//both will throw error 

}
}




class Vehicle {
void print(){
    System.out.println("This is a base class");
}



void run(){
    System.out.println("This is a base class");
}


}






class Car extends Vehicle{

void print(){
    System.out.println("This is a derived class");
}


void run1(){
    System.out.println("This is a base class");
}


}