package sit.demo;

public class ProductQueries {
    public static final String ADD_PROJECT="Insert into product values(?,?,?,?)";
    //read all products
    public static final String GET_ALL_PRODUCT = "select * from products";
    //read single product
    public static final String GET_PRODUCT_BY_ID = "select * from product where id=?";

    //update price

    public static final String UPDATE_PRICE = "update products set price=? where id=?";

    //update quantity
    public static final String UPDATE_QUANTITY = "update products set quantity-? where id = ?";

    //remove product
    public static final String REMOVE_PRODUCT= "delete product where id=?";
}
