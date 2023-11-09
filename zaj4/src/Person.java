public class Person {
    private String firstName;

    protected String lastName;
    public Person(){};
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

class Employee extends Person{

    public void displayData(){
        System.out.println("First name:"+getFirstName());
        System.out.println("last name:"+getLastName());
    }

}
}
