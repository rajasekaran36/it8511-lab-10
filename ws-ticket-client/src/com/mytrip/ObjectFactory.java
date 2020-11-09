
package com.mytrip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mytrip package. 
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

    private final static QName _GetFlightsByDate_QNAME = new QName("http://mytrip.com/", "getFlightsByDate");
    private final static QName _GetFlightsByDateResponse_QNAME = new QName("http://mytrip.com/", "getFlightsByDateResponse");
    private final static QName _GetLowestFareByDate_QNAME = new QName("http://mytrip.com/", "getLowestFareByDate");
    private final static QName _GetLowestFareByDateResponse_QNAME = new QName("http://mytrip.com/", "getLowestFareByDateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mytrip
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlightsByDate }
     * 
     */
    public GetFlightsByDate createGetFlightsByDate() {
        return new GetFlightsByDate();
    }

    /**
     * Create an instance of {@link GetFlightsByDateResponse }
     * 
     */
    public GetFlightsByDateResponse createGetFlightsByDateResponse() {
        return new GetFlightsByDateResponse();
    }

    /**
     * Create an instance of {@link GetLowestFareByDate }
     * 
     */
    public GetLowestFareByDate createGetLowestFareByDate() {
        return new GetLowestFareByDate();
    }

    /**
     * Create an instance of {@link GetLowestFareByDateResponse }
     * 
     */
    public GetLowestFareByDateResponse createGetLowestFareByDateResponse() {
        return new GetLowestFareByDateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mytrip.com/", name = "getFlightsByDate")
    public JAXBElement<GetFlightsByDate> createGetFlightsByDate(GetFlightsByDate value) {
        return new JAXBElement<GetFlightsByDate>(_GetFlightsByDate_QNAME, GetFlightsByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mytrip.com/", name = "getFlightsByDateResponse")
    public JAXBElement<GetFlightsByDateResponse> createGetFlightsByDateResponse(GetFlightsByDateResponse value) {
        return new JAXBElement<GetFlightsByDateResponse>(_GetFlightsByDateResponse_QNAME, GetFlightsByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLowestFareByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mytrip.com/", name = "getLowestFareByDate")
    public JAXBElement<GetLowestFareByDate> createGetLowestFareByDate(GetLowestFareByDate value) {
        return new JAXBElement<GetLowestFareByDate>(_GetLowestFareByDate_QNAME, GetLowestFareByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLowestFareByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mytrip.com/", name = "getLowestFareByDateResponse")
    public JAXBElement<GetLowestFareByDateResponse> createGetLowestFareByDateResponse(GetLowestFareByDateResponse value) {
        return new JAXBElement<GetLowestFareByDateResponse>(_GetLowestFareByDateResponse_QNAME, GetLowestFareByDateResponse.class, null, value);
    }

}
