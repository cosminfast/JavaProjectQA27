public class Main5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayUpToNumber(100);
//        op.printArray(myArray);
        System.out.println(myArray[5]);


        int[] secondArray = {1,2,45,123123,111,333};
//        System.out.println(op.getAverageFromArray(secondArray));


        String[] myArrayOfStrings = {"asdasd","aay","z111"};
        System.out.println();
        if (op.isValueInArray(myArrayOfStrings, "z111"))
            System.out.println("Valoarea e in array");
        else
            System.out.println("valoarea nu e in array");


        String[] newArray = {"asd","asd"};
        op.isValueInArray(newArray, "asd");
    }
}
