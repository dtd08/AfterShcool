package level4.generics.ex3;

public class CoffeeOrder <T extends Customer> {
    private T customer;
    private String coffeeName;

    public CoffeeOrder(T customer, String coffeeName) {
        this.customer = customer;
        this.coffeeName = coffeeName;
    }

    public T getCustomer() {
        return customer;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Coffee: " + coffeeName);
    }
}
