import java.util.Scanner;

public class Recruiting {
    public static void main(String[] args) {
        boolean control1=true;
        Scanner sc = new Scanner(System.in);
        String option;

        System.out.println("-----RECRUITING PROCESS-----");
        System.out.println("Hiring Manager gets personnel request approved");
        System.out.println("Job description received from Hiring Manager");
        System.out.println("Create Ad placement to post on website and job portals");

        while (control1) {
            System.out.println("Receive and send resumes to Hiring Manager for review");
            System.out.println("---SUITABLE CANDIDATE FOUND?---");
            System.out.print("Answer YES/NO: ");
            option = sc.nextLine();
            //SUITABLE CANDIDATE FOUND?
            if (option.compareToIgnoreCase("yes") == 0) { //SUITABLE CANDIDATE
                System.out.println("Coordinate applicant interview process");
                System.out.println("Coordinate additional screening if necessary");
                System.out.println("If applicant passes screening, create offer letter / determine start date");
                System.out.println("---APPLICANT ACCEPTS OFFER?---");
                System.out.print("Answer YES/NO: ");
                option = sc.nextLine();
                //APPLICANT ACCEPTS OFFER?
                if (option.compareToIgnoreCase("yes") == 0) { //APPLICANT ACCEPTS
                    System.out.println("-----ON-BOARDING-----");
                    control1 = false;
                }
                else if (option.compareToIgnoreCase("no") == 0) { //APPLICANT DENIES
                    System.out.println("Continue running ad");
                }
                else {
                    System.out.println("You MUST answer YES or NO");
                }
            }
            else if (option.compareToIgnoreCase("no") == 0) { //NO SUITABLE CANDIDATE
                System.out.println("Continue running ad");
            }
            else {
                System.out.println("You MUST answer YES or NO");
            }
        }
    }
}
