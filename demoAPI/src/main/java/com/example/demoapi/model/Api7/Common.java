package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Common {
    @JacksonXmlProperty(localName = "ServiceVersion")
    int ServiceVersion;
    @JacksonXmlProperty(localName = "MessageId")
    String MessageId;
    @JacksonXmlProperty(localName = "TransactionId")
    String TransactionId;
    @JacksonXmlProperty(localName = "TransactionId")
    String MessageTimestamp;
}
