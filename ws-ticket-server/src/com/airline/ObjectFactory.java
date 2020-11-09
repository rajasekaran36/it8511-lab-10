
package com.airline;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.airline package. 
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

    private final static QName _AddFlightResponse_QNAME = new QName("http://airline.com/", "addFlightResponse");
    private final static QName _CheckTicketAvailabilityResponse_QNAME = new QName("http://airline.com/", "checkTicketAvailabilityResponse");
    private final static QName _SetAirlineName_QNAME = new QName("http://airline.com/", "setAirlineName");
    private final static QName _AddFlight_QNAME = new QName("http://airline.com/", "addFlight");
    private final static QName _GetFare_QNAME = new QName("http://airline.com/", "getFare");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://airline.com/", "getFlightsResponse");
    private final static QName _SetFlights_QNAME = new QName("http://airline.com/", "setFlights");
    private final static QName _GetAirlineName_QNAME = new QName("http://airline.com/", "getAirlineName");
    private final static QName _GetFlights_QNAME = new QName("http://airline.com/", "getFlights");
    private final static QName _GetFareResponse_QNAME = new QName("http://airline.com/", "getFareResponse");
    private final static QName _CheckTicketAvailability_QNAME = new QName("http://airline.com/", "checkTicketAvailability");
    private final static QName _RemoveFlightResponse_QNAME = new QName("http://airline.com/", "removeFlightResponse");
    private final static QName _RemoveFlight_QNAME = new QName("http://airline.com/", "removeFlight");
    private final static QName _SetAirlineNameResponse_QNAME = new QName("http://airline.com/", "setAirlineNameResponse");
    private final static QName _GetAirlineNameResponse_QNAME = new QName("http://airline.com/", "getAirlineNameResponse");
    private final static QName _SetFlightsResponse_QNAME = new QName("http://airline.com/", "setFlightsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.airline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link GetFareResponse }
     * 
     */
    public GetFareResponse createGetFareResponse() {
        return new GetFareResponse();
    }

    /**
     * Create an instance of {@link CheckTicketAvailability }
     * 
     */
    public CheckTicketAvailability createCheckTicketAvailability() {
        return new CheckTicketAvailability();
    }

    /**
     * Create an instance of {@link RemoveFlightResponse }
     * 
     */
    public RemoveFlightResponse createRemoveFlightResponse() {
        return new RemoveFlightResponse();
    }

    /**
     * Create an instance of {@link RemoveFlight }
     * 
     */
    public RemoveFlight createRemoveFlight() {
        return new RemoveFlight();
    }

    /**
     * Create an instance of {@link GetAirlineNameResponse }
     * 
     */
    public GetAirlineNameResponse createGetAirlineNameResponse() {
        return new GetAirlineNameResponse();
    }

    /**
     * Create an instance of {@link SetAirlineNameResponse }
     * 
     */
    public SetAirlineNameResponse createSetAirlineNameResponse() {
        return new SetAirlineNameResponse();
    }

    /**
     * Create an instance of {@link SetFlightsResponse }
     * 
     */
    public SetFlightsResponse createSetFlightsResponse() {
        return new SetFlightsResponse();
    }

    /**
     * Create an instance of {@link AddFlightResponse }
     * 
     */
    public AddFlightResponse createAddFlightResponse() {
        return new AddFlightResponse();
    }

    /**
     * Create an instance of {@link CheckTicketAvailabilityResponse }
     * 
     */
    public CheckTicketAvailabilityResponse createCheckTicketAvailabilityResponse() {
        return new CheckTicketAvailabilityResponse();
    }

    /**
     * Create an instance of {@link SetAirlineName }
     * 
     */
    public SetAirlineName createSetAirlineName() {
        return new SetAirlineName();
    }

    /**
     * Create an instance of {@link AddFlight }
     * 
     */
    public AddFlight createAddFlight() {
        return new AddFlight();
    }

    /**
     * Create an instance of {@link GetFare }
     * 
     */
    public GetFare createGetFare() {
        return new GetFare();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link SetFlights }
     * 
     */
    public SetFlights createSetFlights() {
        return new SetFlights();
    }

    /**
     * Create an instance of {@link GetAirlineName }
     * 
     */
    public GetAirlineName createGetAirlineName() {
        return new GetAirlineName();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "addFlightResponse")
    public JAXBElement<AddFlightResponse> createAddFlightResponse(AddFlightResponse value) {
        return new JAXBElement<AddFlightResponse>(_AddFlightResponse_QNAME, AddFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTicketAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "checkTicketAvailabilityResponse")
    public JAXBElement<CheckTicketAvailabilityResponse> createCheckTicketAvailabilityResponse(CheckTicketAvailabilityResponse value) {
        return new JAXBElement<CheckTicketAvailabilityResponse>(_CheckTicketAvailabilityResponse_QNAME, CheckTicketAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAirlineName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "setAirlineName")
    public JAXBElement<SetAirlineName> createSetAirlineName(SetAirlineName value) {
        return new JAXBElement<SetAirlineName>(_SetAirlineName_QNAME, SetAirlineName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "addFlight")
    public JAXBElement<AddFlight> createAddFlight(AddFlight value) {
        return new JAXBElement<AddFlight>(_AddFlight_QNAME, AddFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getFare")
    public JAXBElement<GetFare> createGetFare(GetFare value) {
        return new JAXBElement<GetFare>(_GetFare_QNAME, GetFare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "setFlights")
    public JAXBElement<SetFlights> createSetFlights(SetFlights value) {
        return new JAXBElement<SetFlights>(_SetFlights_QNAME, SetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirlineName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getAirlineName")
    public JAXBElement<GetAirlineName> createGetAirlineName(GetAirlineName value) {
        return new JAXBElement<GetAirlineName>(_GetAirlineName_QNAME, GetAirlineName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getFareResponse")
    public JAXBElement<GetFareResponse> createGetFareResponse(GetFareResponse value) {
        return new JAXBElement<GetFareResponse>(_GetFareResponse_QNAME, GetFareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTicketAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "checkTicketAvailability")
    public JAXBElement<CheckTicketAvailability> createCheckTicketAvailability(CheckTicketAvailability value) {
        return new JAXBElement<CheckTicketAvailability>(_CheckTicketAvailability_QNAME, CheckTicketAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "removeFlightResponse")
    public JAXBElement<RemoveFlightResponse> createRemoveFlightResponse(RemoveFlightResponse value) {
        return new JAXBElement<RemoveFlightResponse>(_RemoveFlightResponse_QNAME, RemoveFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "removeFlight")
    public JAXBElement<RemoveFlight> createRemoveFlight(RemoveFlight value) {
        return new JAXBElement<RemoveFlight>(_RemoveFlight_QNAME, RemoveFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAirlineNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "setAirlineNameResponse")
    public JAXBElement<SetAirlineNameResponse> createSetAirlineNameResponse(SetAirlineNameResponse value) {
        return new JAXBElement<SetAirlineNameResponse>(_SetAirlineNameResponse_QNAME, SetAirlineNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirlineNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "getAirlineNameResponse")
    public JAXBElement<GetAirlineNameResponse> createGetAirlineNameResponse(GetAirlineNameResponse value) {
        return new JAXBElement<GetAirlineNameResponse>(_GetAirlineNameResponse_QNAME, GetAirlineNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://airline.com/", name = "setFlightsResponse")
    public JAXBElement<SetFlightsResponse> createSetFlightsResponse(SetFlightsResponse value) {
        return new JAXBElement<SetFlightsResponse>(_SetFlightsResponse_QNAME, SetFlightsResponse.class, null, value);
    }

}
