
package PaneelGen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PaneelService", targetNamespace = "wsdlPaneel", wsdlLocation = "file:/C:/Users/KevinPC/Desktop/HU/WeekOpdracht/PraktijkOpdracht1/PaneelService.wsdl")
public class PaneelService
    extends Service
{

    private final static URL PANEELSERVICE_WSDL_LOCATION;
    private final static WebServiceException PANEELSERVICE_EXCEPTION;
    private final static QName PANEELSERVICE_QNAME = new QName("wsdlPaneel", "PaneelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/KevinPC/Desktop/HU/WeekOpdracht/PraktijkOpdracht1/PaneelService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PANEELSERVICE_WSDL_LOCATION = url;
        PANEELSERVICE_EXCEPTION = e;
    }

    public PaneelService() {
        super(__getWsdlLocation(), PANEELSERVICE_QNAME);
    }

    public PaneelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PANEELSERVICE_QNAME, features);
    }

    public PaneelService(URL wsdlLocation) {
        super(wsdlLocation, PANEELSERVICE_QNAME);
    }

    public PaneelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PANEELSERVICE_QNAME, features);
    }

    public PaneelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaneelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort() {
        return super.getPort(new QName("wsdlPaneel", "WS-Port"), WSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WSInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("wsdlPaneel", "WS-Port"), WSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PANEELSERVICE_EXCEPTION!= null) {
            throw PANEELSERVICE_EXCEPTION;
        }
        return PANEELSERVICE_WSDL_LOCATION;
    }


}
