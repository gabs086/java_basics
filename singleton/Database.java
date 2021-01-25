public class Database {
    private String name;

    private static Database instance;

    public static synchronized Database getInstances(String name){
        if(instance == null){
            instance = new Database(name);
        }
            return instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String text = "Database class \n" +
                      "Db name: " + this.name;

        return text;
    }
}
