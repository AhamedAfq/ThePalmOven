/**
 @author Ashfak Ahamed
 @version 21/07/2020
 */

public class DatabaseException extends Exception {
    public String errMsg;
    public DatabaseException(String msg)
    { 
        errMsg = msg;
    }
    
    public String getErrMessage()
    {
        return errMsg;
    }
}
