public class Human {
    String lastName;
    String firstName;
    String secondName;
    String birthday;
    int phoneNumber;
    char male;

    public Human(String[] input) {
        Checker checker = new Checker();
        this.lastName = input[0];
        this.firstName = input[1];
        this.secondName = input[2];
        this.birthday = checker.dateChecker(input[3]);
        this.phoneNumber = checker.phoneChecker(input[4]);
        this.male = checker.maleChecker(input[5]);
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n", lastName, firstName, secondName, birthday, phoneNumber, male);
    }
}
