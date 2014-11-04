
package net.webservicex;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CCChecker", targetNamespace = "http://www.webservicex.net", wsdlLocation = "http://www.webservicex.net/CreditCard.asmx?WSDL")
public class CCChecker
    extends Service
{

    private final static URL CCCHECKER_WSDL_LOCATION;
    private final static WebServiceException CCCHECKER_EXCEPTION;
    private final static QName CCCHECKER_QNAME = new QName("http://www.webservicex.net", "CCChecker");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/CreditCard.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CCCHECKER_WSDL_LOCATION = url;
        CCCHECKER_EXCEPTION = e;
    }

    public CCChecker() {
        super(__getWsdlLocation(), CCCHECKER_QNAME);
    }

    public CCChecker(WebServiceFeature... features) {
        super(__getWsdlLocation(), CCCHECKER_QNAME, features);
    }

    public CCChecker(URL wsdlLocation) {
        super(wsdlLocation, CCCHECKER_QNAME);
    }

    public CCChecker(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CCCHECKER_QNAME, features);
    }

    public CCChecker(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CCChecker(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CCCheckerSoap
     */
    @WebEndpoint(name = "CCCheckerSoap")
    public CCCheckerSoap getCCCheckerSoap() {
        return super.getPort(new QName("http://www.webservicex.net", "CCCheckerSoap"), CCCheckerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CCCheckerSoap
     */
    @WebEndpoint(name = "CCCheckerSoap")
    public CCCheckerSoap getCCCheckerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "CCCheckerSoap"), CCCheckerSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CCCHECKER_EXCEPTION!= null) {
            throw CCCHECKER_EXCEPTION;
        }
        return CCCHECKER_WSDL_LOCATION;
    }

}
