package PaneelGen;



import com.sun.xml.ws.developer.SchemaValidation;

import javax.jws.WebService;
import java.math.BigInteger;

/**
 * Created by KevinPC on 11/03/2017.
 */
@WebService( endpointInterface= "PaneelGen.WSInterface")
@SchemaValidation
public class PaneelImpl implements WSInterface{
    @Override
    public Response storePaneel(Request request) throws Error_Exception {
        PaneelGen.ObjectFactory factory = new PaneelGen.ObjectFactory();
        PaneelGen.Response response = factory.createResponse();
        BigInteger result = request.getId();
        response.setStoredPaneelID(result);
        return response;
    }
}
