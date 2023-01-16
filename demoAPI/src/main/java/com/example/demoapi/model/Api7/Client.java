package com.example.demoapi.model.Api7;

import com.example.demoapi.model.Batch;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns1:Client")
public class Client {
    @JacksonXmlProperty(localName = "ns1:SourceAppID")
    String SourceAppID;
    @JacksonXmlProperty(localName = "ns1:UserDetail")
    UserDetail userDetail;
}
