package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "ns1:UserDetail")
public class UserDetail {
    @JacksonXmlProperty(localName = "ns1:UserId")
    String UserId;
    @JacksonXmlProperty(localName = "ns1:UserPassword")
    String UserPassword;
}
