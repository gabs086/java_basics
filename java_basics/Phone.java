
public class Phone {
   private String name;
   private int screenSize;
   private int memoryRam;
   private int camera;

    //Writing a constructor
    public Phone(String name, int screenSize, int memoryRam, int camera){
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    // public void playGames(String game){
    //     System.out.println("You are now playing " + game);
    // }

    //Other ways to access the access modifier with private
    public void setNameThatIsInPrivate(String name) {
        this.name = name;
    }

    //Return the value of the string that is protected
    public String getName() {
        return this.name;
    }
}
