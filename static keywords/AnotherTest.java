public class AnotherTest {

    private int age;
    private String color;

    private class InnerClass {
        private String name;

        public InnerClass(String name){
            this.name = name;
        }

        //Access the data in the parent class
        private void printAge(){
            System.out.println(age); //this works
        }

    }
}
