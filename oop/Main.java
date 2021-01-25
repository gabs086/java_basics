import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Gab", 22, 
                          new Eye("Left Eye", "Short sighted", "Blue", true),
                          new Eye("Right Eye", "Normal", "Blue", true),
                          new Heart("Heart", "Normal",  65),
                          new Stomach("Stomach", "LBM", false),
                          new Skin("Skin", "Shimering", "Brown", 40));
                          
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        //Get the inputs form the user
        Scanner input = new Scanner(System.in);

        boolean shouldFinish = false;
        
        while (!shouldFinish) {
        System.out.println("Choose an organ: " + 
                         "\n\t1. Left Eye" + 
                         "\n\t2. Righ Eye" +
                         "\n\t3. Heart" +
                         "\n\t4. Stomach" + 
                         "\n\t5. Skin" +
                         "\n\t6. Quit");

        //Get the choice of the user
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                patient.getLeftEye().getDetails();
                //Check if the eye is open
                if(patient.getLeftEye().isOpened()){
                    System.out.println("\t\t1. Close left Eye");

                    // if the user choose 1  
                    if(input.nextInt() == 1) {
                        patient.getLeftEye().close();
                    }
                    else {
                        continue;
                    }
                }
                // if not give a option for the user to open the eye 
                else {
                    System.out.println("\t\t1. Open left Eye");

                    if(input.nextInt() == 1){
                        patient.getLeftEye().open();
                    }
                    else {
                        continue;
                    }
                }

                break;

            case 2:
                patient.getRightEye().getDetails();
                    //Check if the eye is open
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close right Eye");

                        // if the user choose 1  
                        if(input.nextInt() == 1) {
                            patient.getRightEye().close();
                        }
                        else {
                            continue;
                        }
                    }
                    // if not give a option for the user to open the eye 
                    else {
                        System.out.println("\t\t1. Open right Eye");

                        if(input.nextInt() == 1){
                            patient.getRightEye().open();
                        }
                        else {
                            continue;
                        }
                    }

                    break;

            case 3:
                patient.getHeart().getDetails();
                System.out.println("\t\t1. Change the heart rate");

                if(input.nextInt() == 1) {
                    System.out.println("Enter new Heart rate");
                    int newHeartRate = input.nextInt();

                    //Set the new Heart rate
                    patient.getHeart().setRate(newHeartRate);
                    //Then display the new heartrate
                    System.out.println("Heart rate change to: " + patient.getHeart().getRate());
                } 
                else {
                    continue;
                }

                break;
            
            case 4:
                patient.getStomach().getDetails();
                System.out.println("\t\t1. Digest");

                if(input.nextInt() == 1){
                    patient.getStomach().digest();
                }
                else {
                    continue;
                }

                break;

            case 5: 
                patient.getSkin().getDetails();
                break;
                
            default:
                shouldFinish = true;
                break;
                
        }
            
        }
    }
}
