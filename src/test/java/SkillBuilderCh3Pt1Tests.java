import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SkillBuilderCh3Pt1Tests {
    // Create AnswerMap for use in all tests
    AnswerMap SB2AnswerMap = new AnswerMap();
    String Answer1 = SB2AnswerMap.map.get("Answer1");
    String Answer2 = SB2AnswerMap.map.get("Answer2");

    // Part 1
    @Test
    void testInsertionSort1() {
        char[] testArray = {'S', 'A', 'M', 'P', 'L', 'E'};
        InsertionSortFromBookModified.insertionSort(testArray);
        String testArrayOutputString = java.util.Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString);
        Assertions.assertEquals("[A, E, L, M, P, S]", testArrayOutputString);
    }

    // Part 2
    @Test
    void testInsertionSort2() {
        int[] testArray = {5, 3, 1, 2, 4};
        InsertionSortFromBookModified.insertionSort(testArray);
        String testArrayOutputString = java.util.Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString);
        Assertions.assertEquals("[1, 2, 3, 4, 5]", testArrayOutputString);
    }

    // Part 3
    @Test
    void testInsertionSort3() {
        Character[] testArray = {'S', 'A', 'M', 'P', 'L', 'E'};
        InsertionSortFromBookModified.insertionSort(testArray);
        String testArrayOutputString = java.util.Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString);
        Assertions.assertEquals("[A, E, L, M, P, S]", testArrayOutputString);
    }

    // Part 4
    @Test
    void testInsertionSort4() {
        String[] testArray = {"Rene", "Joseph", "Janet", "Jonas", "Helen", "Virginia"};
        InsertionSortFromBookModified.insertionSort(testArray);
        String testArrayOutputString = java.util.Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString);
        Assertions.assertEquals("[Helen, Janet, Jonas, Joseph, Rene, Virginia]", testArrayOutputString);
    }

    // Part 5
    @Test
    //void insertionSortPortfolioHoldingsArray() {
    void testInsertionSort5() {
        // Tests of InsertionSortGeneric here
        // Won't work with primitive types
        // First make sure it works with the String array
        String[] testArray = {"Rene", "Joseph", "Janet", "Jonas", "Helen", "Virginia"};;
        InsertionSortFromBookModified.insertionSortGeneric(testArray);
        String testArrayOutputString = java.util.Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString + '\n');
        Assertions.assertEquals("[Helen, Janet, Jonas, Joseph, Rene, Virginia]", testArrayOutputString);

        // Code here to create a portfolio, in this case
        // an array of PortfolioHoldings
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort
        InsertionSortFromBookModified.insertionSortGeneric(ourHoldings);
        // Now reprint
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        System.out.println("\n\n\n");
        // now put in the test to pass
        //String Answer1 = SB2AnswerMap.map.get("Answer1");
        //System.out.println("Answer1 is:\n" + Answer1);
        Assertions.assertEquals(Answer1, portfolioString);
    }

    // Part 6
    @Test
    //void insertionSortPortfolioHoldingsArray() {
    void testInsertionSort6() {
        // Tests of InsertionSortGeneric here
        // Has to be an object, not a primitive type
        // to work with the generic
        // Code here to create a portfolio, in this case
        // an array of PortfolioHoldings
        System.out.println("Part 6 Tests begin here...\n");
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort
        InsertionSortFromBookModified.insertionSortGeneric(ourHoldings, PortfolioHolding.sharesComparator);
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by shares, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Sort by price now
        InsertionSortFromBookModified.insertionSortGeneric(ourHoldings, PortfolioHolding.priceComparator);
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by price, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Next
        InsertionSortFromBookModified.insertionSortGeneric(ourHoldings, PortfolioHolding.symbolComparatorZtoA);
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by symbol decreasing, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Test this one for correctness
        String Answer2 = SB2AnswerMap.map.get("Answer2");
        //System.out.println("Answer2 is:\n" + Answer1);
        Assertions.assertEquals(Answer2, portfolioString);
    }

    // Part 7
    @Test
    void testInsertionSort7() {
        String portfolioString = JavaBuiltInArraysSortExamples.skillBuilderPart7();
        String Answer1 = SB2AnswerMap.map.get("Answer1");
        //System.out.println("Answer1 is:\n" + Answer1);
        Assertions.assertEquals(Answer1, portfolioString);
    }


    // Part 8
    @Test
    void testInsertionSort8() {
        String portfolioString = JavaBuiltInArraysSortExamples.skillBuilderPart8();
        //String Answer2 = SB2AnswerMap.map.get("Answer2");
        //System.out.println("Answer2 is:\n" + Answer1);
        Assertions.assertEquals(Answer2, portfolioString);
    }

}