public class CatRunner {
    public static void main(String[]args){
        Cat cat1 = new Cat("Mik", 6, 12);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Miko", 9, 6);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
