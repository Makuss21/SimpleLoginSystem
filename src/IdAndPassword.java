import java.util.HashMap;

public class IdAndPassword {

    HashMap<String,String> logincred = new HashMap<String,String>();

    IdAndPassword(){

        logincred.put("Username1","Password");
        logincred.put("Username2","Password");
        logincred.put("Username3","Password");

    }
    protected HashMap<String,String> getLogincred() {
        return logincred;
    }
}
