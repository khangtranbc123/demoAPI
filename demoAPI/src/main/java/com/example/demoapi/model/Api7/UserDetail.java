package com.example.demoapi.model.Api7;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetail {
    @JacksonXmlProperty(localName = "UserId")
    String UserId;
    @JacksonXmlProperty(localName = "UserPassword")
    String UserPassword;
}
