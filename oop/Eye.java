public class Eye extends Organ {
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened){
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    //Override the getDetails method in the Organ class
    @Override
    public void getDetails(){
        super.getDetails();
         System.out.println("Color: " + this.getColor());
    }

    // Open the eye method 
    public void open(){
        this.setIsOpened(true);
        System.out.println(this.getName() + " opened");
    }

    // close the ey method 
    public void close(){
        this.setIsOpened(false);
        System.out.println(this.getName() + " closed");
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isOpened(){
        return this.isOpened;
    }

    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }
}
