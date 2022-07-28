package exceptionsExample.exceptions;

public class InvalidIdException extends Exception{
    String id;
    public InvalidIdException(String message, String id){
        super(message);
        this.id=id;
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" Your id= "+id;
    }
}
