import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopsAndCompare {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 4, 432, 6, 63, 4, 56, 8, 8, 8, 8, 6, 76, 576, 8576, 4, 5678, 58, 5, 45, 456, 4, 1, 28, 28, 839, 326, 215, 278, 3};
        String str = "Bob,Carroll,Bill,Ted,Alice,Hal,Dave,Billy,Jake,Sam,Joseph,Phil,Garth,Mark,Craig,Cathy,Barb,Adele,Julie";
        String[] names = str.split(",");

        //  how many 4s
        int count4s = 0;
        //  how many numbers evenly divisible by 7
        int divisibleBy7 = 0;
        //  add up all numbers that are greater than 300
        int totalOfLargeNumbers = 0;
        //  count numbers less than 100
        int countLT100 = 0;
        //  total numbers between 30 and 99
        int sumOfNumbers30to99 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                count4s++;          //  number is 4 so count it
            }
            if (numbers[i] % 7 == 0) {
                divisibleBy7++;
            }
            if (numbers[i] > 300) {                      //  we just found a number GT 300
                totalOfLargeNumbers += numbers[i];      //  so add it to our total
            }
            if (numbers[i] < 100) {
                countLT100++;
            }
            if (numbers[i] > 30 && numbers[i] < 99) {
                sumOfNumbers30to99 += numbers[i];
            }
        }
        System.out.printf("There are %d 4s\n", count4s);
        System.out.printf("Count of #s < 100 %d\n", countLT100);
        System.out.printf("Total of #s between 30 and 99 %d\n", sumOfNumbers30to99);

        //  how many names are longer than 4
        int namesLonger4 = 0;
        //  how many names have 'a' as their second letter (Carroll, Hal, Dave.......)
        int namesWithAat1 = 0;
        //  how many names end with 'e'
        int namesEndingWithE = 0;
        //  how many names contain an 'h'
        int namesWithAnH = 0;

        for (var name : names) {            //  get the next name is the array
            if (name.startsWith("B")) {     //  does that name start with a B
                System.out.println("name with a 'B' = " + name);
            }
            if (name.length() > 4) namesLonger4++;
            if (name.charAt(1) == 'a') namesWithAat1++;
            if (name.endsWith("e")) namesEndingWithE++;
            if (name.contains("h")) namesWithAnH++;
        }
        System.out.println("namesLonger4 = " + namesLonger4);
        System.out.println("namesWithAat1 = " + namesWithAat1);
        System.out.println("namesEndingWithE = " + namesEndingWithE);
        System.out.println("namesWithAnH = " + namesWithAnH);

        //  how many states start with 'New'
        //  how many states are longer than 8 characters
        //  what states contain 'ss'
        //  what is the shortest name for a state
        String strStates = "Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming";
        String[] states = strStates.split(",");
        String shortState = states[0];
        List<String> newStates = new ArrayList<>();
        List<String> longStates = new ArrayList<>();

        for (String state : states) {
            if (state.startsWith("New"))    newStates.add(state);
            if (state.length() > 8)         longStates.add(state);
            if (state.contains("ss"))       System.out.println(state);
            if (shortState.length() < state.length())   shortState = state;
        }
        newStates.forEach (s -> System.out.println("New "  + s));
        longStates.forEach(s -> System.out.println("Long " + s));

        List<State> listOfStates = new ArrayList<>();
        String everything;
        try {
            everything = Utils.readFile("C:/projects/csv/states.csv");
        } catch (IOException ex) {
            System.out.printf("File not accessible: %s%n", ex.getMessage());
            return;
        }
        //  put a break point here and look at the contents of the everything String
        //  what is the line delimiter?
        //  what will you use to split it into individual lines of data
        //  now put a break point here
        //  now look at the individual lines of data, what separates the fields
        //  what will you use to split the fields apart in order to use them
        //  but before you create a State object with the data look at line 0
        //  how do we toss out line 0. We can't convert it into a state object

        String[] lines = everything.split("\r\n");
        List<String> list = Arrays.asList(lines);
        try {
            String x = list.remove(0);
        } catch (Exception ex) {
            System.out.println("ex = " + ex);
        }
        boolean line1 = true;
        for (var line : lines) {
            if (line1) {
                line1 = false;
                continue;
            }
            System.out.println("line = " + line);
            String[] stateInfo = line.split(",");
            State state = new State(stateInfo[0], stateInfo[1], stateInfo[2], stateInfo[3], Integer.parseInt(stateInfo[4]), Integer.parseInt(stateInfo[5]), Integer.parseInt(stateInfo[6]));
            listOfStates.add(state);
        }

        int count = listOfStates.stream().mapToInt(s -> 1).sum();
        System.out.println("count = " + count);
        var ss = listOfStates.stream().filter(s -> s.getName().contains("ss"));
        ss.forEach(s -> System.out.println(s));
//            ss.forEach(System.out::println);
    }
}
