package pass2_quan_ly_san_pham;

public class Products {
    private String id;
    private String nameProducts;
    private String priceProduct;
    public Products() {
    }
    public Products(String id, String nameProducts, String priceProduct) {
        this.id = id;
        this.nameProducts = nameProducts;
        this.priceProduct = priceProduct;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameProducts() {
        return nameProducts;
    }
    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }
    public String getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }
    @Override
    public String toString() {
        return id +
                "," + nameProducts +
                "," + priceProduct;
    }
    public String showInfor(){
        return "Products{" +
                "id=" + id +
                ", nameProducts='" + nameProducts + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

}
