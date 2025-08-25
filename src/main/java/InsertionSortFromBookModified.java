import java.lang.Comparable;
import java.util.Comparator;

public class InsertionSortFromBookModified {

    // Skillbuilder Part 1
    // TODO: copy Base code for sorting - from book - Code Fragment 3.2.2
    // Put this as first line in method to see calls
    // System.out.println("\ninsertionSort called for char[] (Part 1)");
    public static void insertionSort(char[] data) {
        System.out.println("\ninsertionSort called for char[] (Part 1)");
    }

    // SkillBuilder Part 2
    // TODO: copy Base code for sorting - from book - Code Fragment 3.2.2
    // Fix to handle int[] data type
    // Works the same on primitive types
    // Put this as first line in method to see calls
    // System.out.println("insertionSort called for int[] (Part 2)");
    public static void insertionSort(int[] data) {
        System.out.println("\ninsertionSort called for int[] (Part 2)");
    }

    // SkillBuilder Part 3
    // TODO: copy Base code for sorting - from book - Code Fragment 3.2.2
    // Implement using Character objects in the array instead of char primitives
    // This works because of "unboxing" - < or > still works
    // Put this as first line in method to see calls
    // System.out.println("insertionSort called for Character[] (Part 3)");
    public static void insertionSort(Character[] data) {
        System.out.println("insertionSort called for Character[] (Part 3)");
    }

    // Skillbuilder Part 4
    // TODO: copy Base code for sorting - from book - Code Fragment 3.2.2
    // Implement for String[] type, fix all issues
    // Need to include compareTo as String comparator
    // Put this as first line in method to see calls
    // System.out.println("insertionSort called for String[] (Part 4)");
    public static void insertionSort(String[] data) {
        System.out.println("\ninsertionSort called for String[] (Part 4)");
    }

    // Skillbuilder Part 5: Do this generically using default comparator above
    // TODO: copy code from part 4, then edit to use generic Java object
    // Use Java generic framework
    // Call the method InsertionSortGeneric
    // Put this as first line in method to see calls
    // System.out.println("insertionSortGeneric called (Part 5)");
    public static <T extends Comparable<T>> void insertionSortGeneric(T[] data) {
        System.out.println("\ninsertionSortGeneric called (Part 5)");
    }

    // Skillbuilder Part 6: Do this generically using default comparator above
    // TODO: copy code from part 5, then edit to use comparator objects
    // See "Alternate comparators for other factors" section of PortfolioHolding
    // Use Java generic framework
    // Hint: first line will be
    // public static <T> void insertionSortGeneric(T[] data, Comparator<T> comparator)
    // Can't pass in array of primitive types, just array of objects
    // Put this as first line in method to see calls
    // System.out.println("insertionSortGeneric called (Part 6)");
    public static <T> void insertionSortGeneric(T[] data, Comparator<T> comparator) {
        System.out.println("\ninsertionSortGeneric called (Part 6)");
    }
}