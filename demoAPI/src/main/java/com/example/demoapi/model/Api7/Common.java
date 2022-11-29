package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns1:Common")
public class Common {
    @JacksonXmlProperty(localName = "ns1:ServiceVersion")
    int ServiceVersion;
    @JacksonXmlProperty(localName = "ns1:MessageId")
    String MessageId;
    @JacksonXmlProperty(localName = "ns1:TransactionId")
    String TransactionId;
    @JacksonXmlProperty(localName = "ns1:MessageTimestamp")
    String MessageTimestamp;
}
