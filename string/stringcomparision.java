class stringcomparision{
    public static void main(String[] args){
        String str1 = "Aditya";
        String str2 = "Aditya";
        String str3 = new String("Aditya");

        if(str1==str2){
            System.out.println("Strings are same");
        }else{
            System.out.println("Strings are not same");
        }
        if(str1==str3){
            System.out.println("Strings are same");
        }else{
            System.out.println("Strings are not same");
        }

        //comparing the values 
        if(str1.equals(str3)){
            System.out.println("Strings are same");
        }else{
            System.out.println("Strings are not same");
        }//now this will return true 
        
    }
}

//when we created the str2 it refered the the str1 but when we created the str3 a new string was created 
