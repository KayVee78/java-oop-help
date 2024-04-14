public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String email;

    public Contact(String name, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Both constructors having same amount of parameters and those are also String
     * So the compiler can't figure out when to use which
     **/
//    public Contact(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }

    //As we are unable achieve above, a new class called PhoneNumber is created to make its own attribute called phoneNumber
    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
