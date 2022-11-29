package com.example.demoapi.model.Api7;

import com.example.demoapi.model.Batch;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    @JacksonXmlProperty(localName = "SourceAppID")
    String SourceAppID;
    @JacksonXmlProperty(localName = "UserDetail")
    UserDetail userDetail;
}
