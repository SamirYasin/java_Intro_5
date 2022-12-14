package oop_principles.encapsulation;


public class AccountHolder {

    String firstName;
    String lastName;
    String address;
    String phoneNumber;
    private String SSN;

    private double balance;

    //Create an double balance instance variable and encapsulate it


    public String getSSN() {
        return this.SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setBalance(double balance){
        this.balance = 0.0;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
