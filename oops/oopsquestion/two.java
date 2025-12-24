class two {
public static void main(String[] args){
    Test t = new Test(); 
    t.no = 2 ; 
    t.setdate(5) ;
    System.out.print(Test.date);//we can directly call through class name as the static member not belonging to any instances but belongs to a class 
}

}
class Test{
    int no ; 
    static int date ; 
    void setdate(int date){
        Test.date = date ; 
    }
}

// this.data X Test.data = data is correct as date is belong to the class not any instance 