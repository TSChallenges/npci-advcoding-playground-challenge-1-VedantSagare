class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.currentPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        return (currentPrice - buyingPrice) * quantity;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        return currentPrice * quantity;
    }
    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}
