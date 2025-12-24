class methodoverriding {
    public static void main(String [] args){
deer d = new deer();
d.eat();

animal a = new animal(); 
a.eat();
    }
}

class animal {
    void eat(){
        System.out.println("all animal eats");
    }
}

class deer{
    void eat(){
        System.out.println("Deer eats grass");
    }
}
