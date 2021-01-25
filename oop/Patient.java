public class Patient {
    private String name;
    private int age;

    //Inherit the class
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    // create a constructor 
    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Eye getLeftEye(){
        return this.leftEye;
    }

    public void setLeftEye(Eye leftEye){
        this.leftEye = leftEye;
    }

    public Eye getRightEye(){
        return this.rightEye;
    }

    public void setRightEye(Eye rightEye){
        this.rightEye = rightEye;
    }

    public Heart getHeart(){
        return this.heart;
    }

    public void setHeart(Heart heart){
        this.heart = heart;
    }

    public Stomach getStomach(){
        return this.stomach;
    }

    public void setStomach(Stomach stomach){
        this.stomach = stomach;
    }

    public Skin getSkin(){
        return this.skin;
    }

    public void setSkin(Skin skin){
        this.skin = skin;
    }
}
