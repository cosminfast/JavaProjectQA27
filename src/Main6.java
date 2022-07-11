import java.util.ArrayList;
import java.util.List;

public class Main6 {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();


//        System.out.println(myList.get(0));
//
//        myList.remove(Integer.valueOf(3));
//
//        System.out.println(myList.size());
//
//        List<Float> myListOfFloats = new ArrayList<>();
//        myListOfFloats.add(3.4F);
//
//        myListOfFloats.remove(3.4f);
//        System.out.println(myListOfFloats.size());
//
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//
//        myList.set(2, 5);
//        myList.add(2, 5);
//
//
//        int a = 1;
//        String z = "1";

//        List<String> myListOfStrings = new ArrayList<>();

        List<Integer> myListOfInt = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myListOfInt.add(i);
        }
//        System.out.println(myListOfStrings);
////
//        for (String value : myListOfStrings){
//            System.out.print(value+", ");
//        }


        LogicalOperations op = new LogicalOperations();

        op.printNumbersBackwardsFromList(myListOfInt);

        List<Integer> z = new ArrayList<>();
        op.addToEndOfList(myList,1);

        List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(13);
        unorderedList.add(11);
        unorderedList.add(123);
        unorderedList.add(12);

        System.out.println(op.getHighestNumber(unorderedList));

        Calculator calc = new Calculator();
        calc.sum(myList);

    }

}
