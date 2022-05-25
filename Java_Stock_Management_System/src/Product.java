package sumit;


public class Product {

    // used to store productcode
    private String productCode;
    // used to store product name
    private String productName;
    //used to store product price
    private double productPrice;
    //used to store product stock
    private int productStock;

    // constructor of product class takes arguments
    public Product(String productCode, String productName, double productPrice,int productStock) {

        //values from arguments are store in above declares strings,doubles and integer
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock=productStock;

    }

    // get method to for productCode
    public String getproductCode() {
        return this.productCode;
    }
    // get method to for productName
    public String getproductName() {
        return this.productName;
    }
    // get method to for productPrice
    public double getproductPrice() {
        return this.productPrice;
    }
    // get method to for productStock
    public int getproductStock() {
        return this.productStock;
    }
    // set method to for productCode
    public void setproductCode(String code) {
        this.productCode=code;
    }
    // set method to for productName
    public void setproductName(String name) {
        this.productName=name;
    }
    // set method to for productPrice
    public void setproductPrice(double price) {
        this.productPrice=price;
    }
    // set method to for productStock
    public void setproductStock(int amount) {
        this.productStock=amount;
    }
}
