package lk.ijse.culinary.tm;

public class StudentTm {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String dob;

    public StudentTm() {
    }

    public StudentTm(String id, String name, String address, String contact, String dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "StudentTm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
