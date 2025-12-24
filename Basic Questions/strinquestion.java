class strinquestion{
    public static void main(String[] args){
Vehicle c = new Car();
c.print();//always call the derived class function 
Vehicle v = new Vehicle();
v.print();
    }
}

class Vehicle {
    void print(){
        System.out.println("Base Class(vehicle)");
    }
}

class Car extends Vehicle {
    void print(){
        System.out.println("Derived class(Car)");
    }
}

