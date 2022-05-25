package sumit;


//custom exception class designed to throw invalid exceptions
public class InvalidEntryExcepion extends Exception {

    public InvalidEntryExcepion(String message){
        //uses the arguement passed when throwing them
        super(message);
    }
}
