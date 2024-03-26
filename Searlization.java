import java.io.*;


class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    
    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Searlization {
    public static void main(String[] args) {
        
        Customer customer = new Customer(1, "John Doe", "123-456-7890", "123 Main St");

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaObject.txt"))) {
            oos.writeObject(customer);
            System.out.println("Customer object serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred during serialization: " + e.getMessage());
        }
    }
}
