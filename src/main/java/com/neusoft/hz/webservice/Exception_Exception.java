
package com.neusoft.hz.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-03-18T10:15:39.219+08:00
 * Generated source version: 3.3.1
 */

@WebFault(name = "Exception", targetNamespace = "http://hz.neusoft.com")
public class Exception_Exception extends Exception {

    private com.neusoft.hz.webservice.Exception exception;

    public Exception_Exception() {
        super();
    }

//    public Exception_Exception(String message) {
//        super(message);
//    }
//
//    public Exception_Exception(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public Exception_Exception(String message, com.neusoft.hz.webservice.Exception exception) {
//        super(message);
//        this.exception = exception;
//    }
//
//    public Exception_Exception(String message, com.neusoft.hz.webservice.Exception exception, Throwable cause) {
//        super(message, cause);
//        this.exception = exception;
//    }

    public com.neusoft.hz.webservice.Exception getFaultInfo() {
        return this.exception;
    }
}
