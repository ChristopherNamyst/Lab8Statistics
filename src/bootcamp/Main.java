package bootcamp; ////Calculate the batting average and slugging percentage for one or more ball players////


import java.util.Scanner;

class BaseballStats {

    public static void main(String[] args) {

        //////INITIALIZE SCANNER FOR USER COACHES' INPUT/////////
        Scanner scan = new Scanner(System.in);
        String coachInput;
        do {
            ////GREET USER////////
            System.out.println("Hello Coach! Lets get started with my App that " +
                    "calculates slugging percentage and batting average..."  + "\n");

            /////ASK USER FOR NUMBER OF AT BATS//////////
            System.out.println("Please enter the number of at-bats. ");
            int atBats = scan.nextInt();


            ////PROMPT USER FOR NUMBER OF BASES EARNED////////
            System.out.println("Enter number of bases earned? ");
            double[] atBatsArray = new double[atBats];

            ///SUMAGE/////
            double sum = 0;

            for (int i = 0; i < atBats; i++) {
                atBatsArray[i] = scan.nextInt();
            }

            ///DISPLAYS BATTING AVERAGE///////////
            double battingAve = calculateBatAverage(atBatsArray);
            System.out.println("Your batting average is: " + battingAve);

            ///DISPLAYS SLUGGING PERCENTAGE///////
            double sluggingPercentage = calculateSlugPercentage(atBatsArray);
            System.out.println("Your slugging percentage is: " + sluggingPercentage);


        System.out.println("Would  you like to enter another batter? Type Yes or no");
        coachInput = scan.next();
    } while (coachInput.equalsIgnoreCase("yes")) ;
    }

    public static double calculateSlugPercentage(double[] atBatsArray) {
        int total = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
            total += atBatsArray[i];
        }

        double sluggingPercentage = (double) total / atBatsArray.length;
        return sluggingPercentage;
    }

    ///INITIATE BATTING AVERAGE CALCULATOR//////
    public static double calculateBatAverage(double[] atBatsArray) {
        int i = 0;
        int total = 0;
        for (i = 0; i < atBatsArray.length; i++) {
            if (atBatsArray[i] > 0) {
                total = total + 1;
            }
        }
        double atBatsAve = (double) total / atBatsArray.length;
        //////RETURN THE AVERAGE AND CONTINUE THRU LOOP//////
        return atBatsAve;


    }
}

