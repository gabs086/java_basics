public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstances("db_java");

        System.out.println(database.toString()); 
    }
}