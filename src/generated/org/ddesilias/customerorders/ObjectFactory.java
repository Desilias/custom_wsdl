
package org.ddesilias.customerorders;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ddesilias.customerorders package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOrdersRequest_QNAME = new QName("http://www.ddesilias.org/customerOrders/", "createOrdersRequest");
    private final static QName _GetOrdersRequest_QNAME = new QName("http://www.ddesilias.org/customerOrders/", "getOrdersRequest");
    private final static QName _CreateOrdersResponse_QNAME = new QName("http://www.ddesilias.org/customerOrders/", "createOrdersResponse");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://www.ddesilias.org/customerOrders/", "getOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ddesilias.customerorders
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOredersResponse }
     * 
     */
    public CreateOredersResponse createCreateOredersResponse() {
        return new CreateOredersResponse();
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link CreateOredersRequest }
     * 
     */
    public CreateOredersRequest createCreateOredersRequest() {
        return new CreateOredersRequest();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ddesilias.org/customerOrders/", name = "createOrdersRequest")
    public JAXBElement<GetOrdersRequest> createCreateOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_CreateOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ddesilias.org/customerOrders/", name = "getOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOredersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ddesilias.org/customerOrders/", name = "createOrdersResponse")
    public JAXBElement<CreateOredersResponse> createCreateOrdersResponse(CreateOredersResponse value) {
        return new JAXBElement<CreateOredersResponse>(_CreateOrdersResponse_QNAME, CreateOredersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ddesilias.org/customerOrders/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

}
