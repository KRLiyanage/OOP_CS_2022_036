package LW_03.Q3;

public class Bicycle {

    private final Owner owner;

    public Bicycle() {
        owner = new Owner("Unknown", "N/A");
    }

    public Bicycle(String name, String num) {
        owner = new Owner(name, num);
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Phone No: " + getPhoneNo());
    }
}

