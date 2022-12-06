package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns1:NameValuePairs")
public class NameValuePairs {
    @JacksonXmlProperty(localName = "ns1:Name")
    String Name;
    @JacksonXmlProperty(localName = "ns1:Value")
    String Value;
}
