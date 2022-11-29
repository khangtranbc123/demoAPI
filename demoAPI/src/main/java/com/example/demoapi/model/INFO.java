package com.example.demoapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class INFO {

    @JacksonXmlProperty(localName = "API_KEY")
    String API_KEY;

    @JacksonXmlProperty(localName = "API_SOURCEAPPID")
    String API_SOURCEAPPID;

    @JacksonXmlProperty(localName = "API_USERID")
    String API_USERID;

    @JacksonXmlProperty(localName = "API_USERPASSWORD")
    String API_USERPASSWORD;


}
