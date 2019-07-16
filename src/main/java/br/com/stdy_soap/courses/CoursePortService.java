package br.com.stdy_soap.courses;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-07-15T21:58:26.046-03:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "CoursePortService",
                  wsdlLocation = "http://localhost:8080/ws/courses.wsdl",
                  targetNamespace = "http://stdy-soap.com.br/courses")
public class CoursePortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://stdy-soap.com.br/courses", "CoursePortService");
    public final static QName CoursePortSoap11 = new QName("http://stdy-soap.com.br/courses", "CoursePortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/courses.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CoursePortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws/courses.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CoursePortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CoursePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoursePortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CoursePortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CoursePortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CoursePortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CoursePort
     */
    @WebEndpoint(name = "CoursePortSoap11")
    public CoursePort getCoursePortSoap11() {
        return super.getPort(CoursePortSoap11, CoursePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoursePort
     */
    @WebEndpoint(name = "CoursePortSoap11")
    public CoursePort getCoursePortSoap11(WebServiceFeature... features) {
        return super.getPort(CoursePortSoap11, CoursePort.class, features);
    }

}
