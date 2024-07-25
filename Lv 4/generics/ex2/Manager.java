package level4.generics.ex2;

public class Manager<U extends User, P extends Product> {
    private U user;
    private P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    public U getUser() {
        return user;
    }

    public P getProduct() {
        return product;
    }

    public void displayInfo() {
        System.out.println("User: " + user.getName());
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
    }
}
