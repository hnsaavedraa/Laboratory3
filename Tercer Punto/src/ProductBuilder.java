public class ProductBuilder implements IBuilder {
    private long productCode;
    private String distributor;
    private String productSection;
    private String productDescription;
    private int price;

public ProductBuilder(long productCode) {
        this.productCode = productCode;
    }

    public ProductBuilder withDistributor(String distributor){
        this.distributor = distributor;
        return this;  //By returning the builder each time, we can create a fluent interface.
    }

    public ProductBuilder withProductSection(String productSection){
        this.productSection = productSection;
        return this;
    }

    public ProductBuilder withProductDescription(String productDescription){
        this.productDescription = productDescription;
        return this;
    }

    public ProductBuilder withPrice(int price){
        this.price = price;
        return this;
    }

    @Override
    public Product build(){
        Product account = new Product();
        account.setProductCode(this.productCode);
        account.setDistributor(this.distributor);
        account.setPrice(this.price);
        account.setProductSection(this.productSection);
        account.setProductDescription(this.productDescription);
        return account;
    }


}
