import java.util.Scanner;

public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";

    }

    public String verifyTextAndNumber2(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }

    public void printToHundred(int x){
        for (int i = x; i <= 100; i++){
            System.out.println(i);
        }
    }

    public double sumAndAverage(){
        int sum=0;
        for (int i = 1; i <= 100; i++){
            sum+=i;
            System.out.println(sum);
        }
        return sum / 100d;
    }

    public double getAverageInInterval(int start, int finish){

        int sum = 0;
        double count = 0;
        while(start <= finish){
            sum = sum + start;
            start++;
            count++;
        }

        return (sum/count);
    }

    public double getAverageForEvenInInterval(int start, int finish){

    }

}
