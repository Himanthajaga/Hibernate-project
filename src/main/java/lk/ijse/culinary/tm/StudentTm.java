package lk.ijse.culinary.tm;

public class StudentTm {
    private String id;
    private String email;
    private String name;
    private String address;
    private String course;
    private String contact;
    private String dob;

    public StudentTm(String id, String email, String name, String address, String course, String contact, String dob) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.address = address;
        this.course = course;
        this.contact = contact;
        this.dob = dob;
    }

    public StudentTm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "StudentTm{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", contact='" + contact + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
