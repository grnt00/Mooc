
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, 
            double initialBalance){
        
        super(productName, capacity);
        this.productHistory = new ChangeHistory();
        this.productHistory.add(initialBalance);
      // setting the initial balance as the warehouse balance
        super.addToWarehouse(initialBalance);   
    }
        
    public String history(){
        return this.productHistory.toString();
    }
    
    public void addToWarehouse(double amount) {
       super.addToWarehouse(amount);
       this.productHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
       this.productHistory.add(super.getBalance() - amount);
       return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\n" +
                            "History: " + productHistory.toString() + "\n" +
                            "Largest amount of product: " + this.productHistory.maxValue() + "\n" +
                            "Smallest amount of product: " + this.productHistory.minValue() + "\n" +
                            "Average: " + this.productHistory.average());       
    }
}
