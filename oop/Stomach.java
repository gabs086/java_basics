public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty){
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest() {
        System.out.println("Digesting food...");
    }

    @Override
    public void getDetails(){
        super.getDetails();

        // If boolean isEmpty is true 
        if(this.isEmpty){
            System.out.println("Need to be fed");
        } 
        else {
            System.out.println("Stomach is full");
        }
    }

    public boolean checkIsEmpty(){
        return this.isEmpty;
    }

    public void setIsEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }
}
