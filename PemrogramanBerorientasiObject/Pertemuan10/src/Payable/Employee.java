package Payable;

public class Employee implements Payable {

    @Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    // three-argument constructor

    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // end three-argument Employee constructor
    // ……. Tambahkan method enkapsulasi // return String representation of Employee object

    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
