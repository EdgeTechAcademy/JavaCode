public class LoopsAndCompare {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 4, 432, 6, 63, 4, 56, 8, 8, 8, 8, 6, 76, 576, 8576, 4, 5678, 58, 5, 45, 456, 4, 1, 28, 28, 839, 326, 215, 278, 3};
        String str = "Bob,Carroll,Bill,Ted,Alice,Hal,Dave,Billy,Jake,Sam,Joseph,Phil,Garth,Mark,Craig,Cathy,Barb,Adele,Julie";
        String[] names = str.split(",");

        String strStates = "Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming";
        String[] states = strStates.split(",");

        //  how many 4s
        int count4s = 0;
        //  how many numbers evenly divisible by 7
        int divisibleBy7 = 0;
        //  add up all numbers that are greater than 300
        int sumOfBigNums = 0;
        //  count numbers less than 100
        int countOfNumsLessThan100 = 0;
        //  total numbers between 30 and 99
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                count4s++;          //  number is 4 so count it
            }
            if (numbers[i] % 7 == 0) {
                divisibleBy7++;     //  divisible by 7 count it
            }
            if (numbers[i] > 300) {       //   if > 300 add to total
                sumOfBigNums += numbers[i];
            }
            if (numbers[i] < 100) {
                countOfNumsLessThan100++;
            }
        }
        System.out.printf("There are %d 4s%n", count4s);
        System.out.println("Numbers divisible by 7 = " + divisibleBy7);

        //  how many names are longer than 4
        //  how many names have 'a' as their second letter (Carroll, Hal,, Dave.......)
        int charAt1 = 0;
        //  have many names end with 'e'
        int endsWithE = 0;
        //  how many names contain an 'h'
        int containsH = 0;
        for (var name : names) {            //  get the next name is the array
            if (name.startsWith("B")) {     //  does that name start with a B
                System.out.println("name with a 'B' = " + name);
            }
            if (name.length() > 4) {
                System.out.println("name longer than 4 = " + name);
            }
            if (name.charAt(1) == 'a') {
                charAt1++;
            }
            if (name.charAt(name.length() - 1) == 'e') {
                endsWithE++;
            }
            if (name.contains("h")) {
                containsH++;
            }

        }

        //  how many states start with 'New'
        //  how many states are longer than 8 characters
        //  what states contain 'ss'
        //  what is the shortest name for a state

    }
}
