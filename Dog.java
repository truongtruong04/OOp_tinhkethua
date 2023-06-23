public class Dog {
    public static void main(String [] args ){
        Cat cat = new Cat("budy " , 5 );
        System.out.println("name is "+cat.name);
        System.out.println("year old "+cat.year);
        cat.sleep();
        cat.playgame();
    }
}
