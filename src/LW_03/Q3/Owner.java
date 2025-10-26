package LW_03.Q3;

public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String name, String num) {
        ownerName = name;
        phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}

