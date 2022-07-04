public class Main5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayUpToNumber(100);
//        op.printArray(myArray);


        int[] secondArray = {1,2,45,123123,111,333};
        System.out.println(op.getAverageFromArray(secondArray));


    }
}
