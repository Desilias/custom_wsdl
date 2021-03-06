package org.ddesilias.customerorders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2022-03-21T23:34:27.477-04:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://www.ddesilias.org/customerOrders/", name = "customerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod(action = "http://www.ddesilias.org/customerOrders/getOrders")
    @WebResult(name = "getOrdersResponse", targetNamespace = "http://www.ddesilias.org/customerOrders/", partName = "parameters")
    public GetOrdersResponse getOrders(
        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "http://www.ddesilias.org/customerOrders/")
        GetOrdersRequest parameters
    );

    @WebMethod(action = "http://www.ddesilias.org/customerOrders/createOrders")
    @WebResult(name = "createOrdersResponse", targetNamespace = "http://www.ddesilias.org/customerOrders/", partName = "parameters")
    public CreateOredersResponse createOrders(
        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "http://www.ddesilias.org/customerOrders/")
        GetOrdersRequest parameters
    );
}
