
package br.com.stdy_soap.courses;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-07-15T21:58:25.851-03:00
 * Generated source version: 3.3.2
 *
 */
public final class CoursePort_CoursePortSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://stdy-soap.com.br/courses", "CoursePortService");

    private CoursePort_CoursePortSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CoursePortService.WSDL_LOCATION;
        
        System.out.println(wsdlURL);
        System.out.println(args);
        
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CoursePortService ss = new CoursePortService(wsdlURL, SERVICE_NAME);
        CoursePort port = ss.getCoursePortSoap11();

        {
        System.out.println("Invoking getCourseDetails...");
        GetCourseDetailsRequest request = new GetCourseDetailsRequest();
        request.setId(2);
        
        
        GetCourseDetailsResponse response = port.getCourseDetails(request);
        System.out.println("getCourseDetails.result=" + response.getCourseDetails().toString());
        }
//        
//        {
//        System.out.println("Invoking getAllCourseDetails...");
//        GetAllCourseDetailsRequest _getAllCourseDetails_getAllCourseDetailsRequest = null;
//        GetAllCourseDetailsResponse _getAllCourseDetails__return = port.getAllCourseDetails(_getAllCourseDetails_getAllCourseDetailsRequest);
//        System.out.println("getAllCourseDetails.result=" + _getAllCourseDetails__return);
//        }


        System.exit(0);
    }

}
