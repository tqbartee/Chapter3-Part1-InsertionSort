import java.util.Arrays;

public class JavaBuiltInArraysSortExamples {

    // Skillbuilder Part 7
    // Use Arrays to sort
    public static String skillBuilderPart7() {
        // Build the portfolio
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("\nSkillBuilder Part 7");
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort
        // TODO: put in sorting code here - don't overthink)
        // Here
        // Now reprint
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        //JSONUtilities.printObjectAsJson(ourHoldings);
        return portfolioString;
    }


    // Skillbuilder Part 8
    // Use arrays.sort to sort, using Java
    public static String skillBuilderPart8() {
        // Build portfolio
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // TODO: Sort by shares (similar to tests for InsertionSort)
        //
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by shares, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort by price
        // TODO: Sort by price here (one-line)
        //
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by price, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Next sort by symbol in reverse
        // TODO: Sort by symbol reverse here
        //
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by symbol decreasing, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        return portfolioString;
    }
}
