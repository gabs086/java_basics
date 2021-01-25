public class Test {

    //static keywords are elements that belong to the object itself
    //Non static fields cannot be reference in a static field

    public static String name;
    public int age;
    public String skinColor;

    public Test(int age, String skinColor){
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printSomething(){
        System.out.println("Print...");
    }

    public static String getName(){
        return name;
    }

    public static void setName(String name) {
        Test.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSkinColor(){
        return this.skinColor;
    }

    public void setSkinColor(String skinColor){
        this.skinColor = skinColor;
    }

}
