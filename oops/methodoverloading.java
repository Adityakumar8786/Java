class methodoverloading {
    public static void main(String [] args){
Calculator calc = new Calculator();
calc.sum(1,2);
calc.sum(1,2,3);
calc.sum(1.2f,2.3f);

    }
}

class Calculator {
    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(int a , int b,int c ){
        System.out.println(a+b+c);
    }
    void sum(float a , float b){
        System.out.println(a+b);
    }
}