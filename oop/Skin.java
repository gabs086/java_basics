public class Skin extends Organ {
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness){
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    //Override the getDetails method in the Organ class
    @Override
    public void getDetails(){
        super.getDetails();
         System.out.println("Skin Color: " + this.getColor());
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSoftness(){
        return this.softness;
    }

    public void setSoftness(int softness){
        this.softness = softness;
    }

}
