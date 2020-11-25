package Level2_Lesson3;

public class Contact {
    public Contact(String lastName, String foneNumber) {
        this.lastName = lastName;
        this.foneNumber = foneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFoneNumber() {
        return foneNumber;
    }

    public void setFoneNumber(String foneNumber) {
        this.foneNumber = foneNumber;
    }

    private String lastName;
    private String foneNumber;
}
