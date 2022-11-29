package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NameValuePairs {
    @JacksonXmlProperty(localName = "Name")
    String Name;
    @JacksonXmlProperty(localName = "Value")
    String Value;
}
