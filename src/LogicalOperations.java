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

    public void printToHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public double sumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum / 100d;
    }

    public double getAverageInInterval(int start, int finish) {

        int sum = 0;
        double count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }

        return (sum / count);
    }

    public double getAverageForEvenInInterval(int start, int finish) {
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            if (start % 2 != 0) {
                sum = sum + start;
                count++;
            }
            start++;
        }
        return sum / count;
    }

    public void printStars(int starsNumber) {
        String star = "*";
        for (int j = 0; j < starsNumber; j++) {
            for (int i = starsNumber - j; i >= 1; i--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    public void printCozaLoza() {
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Woza ");
            } else if (i % 7 == 0) {
                System.out.print("Loza ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }

    public int[] populateArrayUpToNumber(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public boolean isValueInArray(String[] array, String value){
        for (int i = 0; i< array.length;i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

}
