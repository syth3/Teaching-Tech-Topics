package error_handling;

public class BadYearException extends IllegalArgumentException{
    public BadYearException(int year) {
        // The super keyword makes a call to the parent constructor
        super("Passed in year past the current year: " + year);
    }
}
