class comparestrings{
    public static void compare(String str1,String str2){
if(str1.compareTo(str2) == 0 ){
    System.out.println("Both Strings are same");
}
else if (str1.compareTo(str2) < 0 ){
    System.out.println("2nd string is greater than 1st string ");
}
else{
    System.out.println("1st string is greater than 2nd string ");
}
    }
    public static void main(String [] args){
        String str1 = "Aditya Kumar Pradhan";
        String str2 = "Bditya Kumar Pradhan";
        compare(str1,str2);
    }
}