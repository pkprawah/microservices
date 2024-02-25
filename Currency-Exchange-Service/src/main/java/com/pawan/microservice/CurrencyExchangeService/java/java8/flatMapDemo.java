package java8;


import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class flatMapDemo {

    public static void main(String[] args) {

        List<Order> orders  = findAll();

        System.out.println("orders :: "+ orders);

        Optional<Customers> customers11 ;

           Set<Integer> fones =orders.stream().flatMap(x->x.getLineItems().stream()).flatMap(y-> y.getCustomers().stream()).map(customer->customer.getPhone()).collect(Collectors.toSet());

        System.out.println("fones ::"+ fones);

    }
    private static List<Order> findAll() {

        Customers customer1 = new Customers();
        customer1.setId(1);
        customer1.setName("pawan");
        customer1.setPhone(12345);

        Customers customer2 = new Customers();
        customer2.setId(1);
        customer2.setName("Sushil");
        customer2.setPhone(12345567);

        List<Customers> customersList = new ArrayList<>();
        customersList.add(customer1);
        customersList.add(customer2);

        LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));

        item1.setCustomers(customersList);
        item2.setCustomers(customersList);
        order1.setCustomers(customersList);
        LineItem item3 = new LineItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
        item3.setCustomers(customersList);
        LineItem item4 = new LineItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
        item4.setCustomers(customersList);
        Order order2 = new Order(2, "A0000002", Arrays.asList(item3, item4), new BigDecimal("1695.00"));
        order2.setCustomers(customersList);
        LineItem item5 = new LineItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
        item5.setCustomers(customersList);
        Order order3 = new Order(3, "A0000003", Arrays.asList(item5), new BigDecimal("1497.00"));
        order3.setCustomers(customersList);
        return Arrays.asList(order1, order2, order3);

    }
}


class Order {

    private Integer id;
    private String invoice;
    private List<LineItem> lineItems;
    private BigDecimal total;

    private List<Customers> customers;

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public Order(Integer id, String invoice, List<LineItem> lineItems, BigDecimal total) {
        this.id = id;
        this.invoice = invoice;
        this.lineItems = lineItems;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", invoice='" + invoice + '\'' +
                ", lineItems=" + lineItems +
                ", total=" + total +
                ", customers=" + customers +
                '}';
    }
}

class LineItem {

    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;

    private List<Customers> customers;

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public LineItem(Integer id, String item, Integer qty, BigDecimal price, BigDecimal total) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", total=" + total +
                ", customers=" + customers +
                '}';
    }
}

class Customers {

    private Integer id;
    private String name;
    private Integer phone;

    public Customers(){

    }
    public Customers(Integer id, String name, Integer phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
