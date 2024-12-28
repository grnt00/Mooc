
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, 
            double initialBalance){
        
        super(productName, capacity);
        this.productHistory = new ChangeHistory();
        productHistory.add(initialBalance);
      // setting the initial balance as the warehouse balance
        super.addToWarehouse(initialBalance);   
    }
        
    public String history(){
        return productHistory.toString();
    }
    
}
