// PortfolioHolding object is for a single holding within the portfolio

import java.util.Comparator;

public class PortfolioHolding implements Comparable<PortfolioHolding> {
    private final String symbol;
    private Double shares;
    private Double price;
    private Double total;

    public PortfolioHolding(String symbol, Double shares, Double price) {
        // Future: Code goes here to validate the correct format for inputs
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.total = shares*price;
    }

    // Getter methods
    public String getSymbol() {
        return symbol;
    }
    public Double getShares() {
        return shares;
    }
    public Double getPrice() {
        return price;
    }
    public Double getTotal() { return total; }

    // Setter methods
    public void setShares(double shares) {
        this.shares = shares;
        // price must be in place already - compute total again
        this.total = this.shares*this.price;
    }

    public void setPrice(double price) {
        this.price = price;
        // shares must be in place already - compute total again
        this.total = this.shares*this.price;
    }

    // Return a string for printing (as single line - formatted)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String formattedSymbol = String.format("%-9s", this.symbol);
        String formattedShares = String.format("%-9s", this.shares);
        String formattedPrice = String.format("%-9s", this.price);
        String formattedTotal = String.format("%-11s", this.total);
        String outputString = formattedSymbol + " " + formattedShares + " " + formattedPrice + " " + formattedTotal;
        return outputString;
    }

    // Write the compareTo to define the default "natural" ordering of portfolio holdings
    // based on symbol
    // Relevant to Skillbuilder Part 5
    @Override
    public int compareTo(PortfolioHolding p2) {
        // Use the String's compareTo method for lexicographical comparison
        return this.getSymbol().compareTo(p2.getSymbol());
    }

    // Alternate comparators for other factors
    // Did shares already as a separate object
    // Relevant to Skillbuilder Part 6
    public static Comparator<PortfolioHolding> sharesComparator =
            (p1, p2) -> p1.getShares().compareTo(p2.getShares());
    public static Comparator<PortfolioHolding> priceComparator =
            (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());
    public static Comparator<PortfolioHolding> symbolComparatorZtoA =
            (p1, p2) -> p2.getSymbol().compareTo(p1.getSymbol());
    public static Comparator<PortfolioHolding> combinedComparator =
            sharesComparator.thenComparing(priceComparator);
}
