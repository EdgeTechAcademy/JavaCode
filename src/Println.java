/**
 * Created by Edge Tech Academy on 11/8/2016.
 *      Showing off the println and formatting functions
 */
public class Println {
    public static void main(String[] args) {

        String	schoolName	= "Edge Tech Academy";
        int	find_A	= schoolName.indexOf("A");							// returns 10
        int	find_G	= schoolName.indexOf("G");							// returns -1
        int	find_E	= schoolName.indexOf ("E");							// returns 0
        boolean		isEdgeThere	= schoolName.contains("Edge");			// returns true
        int			nameLength	= schoolName.length();					// returns 10
        String		newName	= schoolName.replace("e", "-");				// returns Edg- T-ch Acad-my
        String[]	phoneParts	= "682-334-5679".split("-");			// returns ["628", "334" "5679"]
        String		exchange	= "682-334-5679".substring(4,7);		// "334"
        String		phone	= String.join("628", "334", "5679");		// "682-334-5679"

        System.out.println(String.format("%s: is %d characters long",  schoolName, schoolName.length()));
        //	the \n inserts a carriage return
        System.out.println("Name with the e's replaced with '-': " + newName);
        System.out.println(String.format("Find the A: %d\nFind the G: %d\nFind the D: %d",  find_A, find_G, find_E));	// 1234.588
        System.out.println(String.format("%2.3f",  1234.587654321));	// 1234.588

        System.out.println(String.format("%6.3f",  1234.587654321));	//   1234.588
        System.out.println(String.format("%6.2f",  1234.587654321));	//   1234.59
        System.out.println(String.format("%06.1f", 1234.587654321));	// 001235.6
        System.out.println(String.format("%06.0f", 1234.587654321));	// 001235.0
        System.out.println(String.format("%2.3f",  1234.587654321));	// 1234.588
    }
}
