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

//    1,2,3,4,.....97,98,99,100
}
