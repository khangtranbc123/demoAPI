package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AdditionInformation {
    @JacksonXmlProperty(localName = "NameValuePairs")
    List<NameValuePairs> nameValuePairs;
}
