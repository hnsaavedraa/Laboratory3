public class Product {
    private long productCode;
    private String distributor;
    private String productSection;
    private String productDescription;
    private int price;

    public Product() {
    }

    public long getProductCode() {
        return productCode;
    }

    public void setProductCode(long productCode) {
        this.productCode = productCode;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getProductSection() {
        return productSection;
    }

    public void setProductSection(String productSection) {
        this.productSection =productSection;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Codigo del producto: " + this.productCode + "\n" + "Descripcion del producto: "
                + productDescription + "\n" + "Distribuidor del producto: " + distributor + "\n"
                + "Seccion del producto: " + productSection + "\n"
                + "Precio de producto: " + price + "\n";
    }
}
