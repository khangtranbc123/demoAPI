package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "Common")
public class Common {
    @JacksonXmlProperty(localName = "ServiceVersion")
    int ServiceVersion;
    @JacksonXmlProperty(localName = "MessageId")
    String MessageId;
    @JacksonXmlProperty(localName = "TransactionId")
    String TransactionId;
    @JacksonXmlProperty(localName = "MessageTimestamp")
    String MessageTimestamp;
}
