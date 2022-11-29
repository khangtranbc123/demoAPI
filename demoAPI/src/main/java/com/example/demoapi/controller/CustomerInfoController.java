package com.example.demoapi.controller;

import com.example.demoapi.model.Api7.Client;
import com.example.demoapi.model.Api7.Common;
import com.example.demoapi.model.Api7.GetCustomerInfoReq;
import com.example.demoapi.model.Api7.Header;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service/vn/party/customer/1")
public class CustomerInfoController {
    //    @PostMapping
//    public ResponseEntity<?> getInfo(@ModelAttribute GetCustomerInfoReq getCustomerInfoReq){
//        String a = getCustomerInfoReq.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs().get(0).getName();
//        String b = getCustomerInfoReq.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs().get(0).getValue();
//        String c = getCustomerInfoReq.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs().get(1).getName();
//        String d = getCustomerInfoReq.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs().get(1).getValue();
//        if (getCustomerInfoReq.getHeader().getCommon().getServiceVersion() == 1 &&
//                getCustomerInfoReq.getHeader().getCommon().getMessageId().equals(">${=java.util.UUID.randomUUID()}")&&
//                getCustomerInfoReq.getHeader().getCommon().getTransactionId().equals("${=java.util.UUID.randomUUID()}")&&
//                getCustomerInfoReq.getHeader().getCommon().getMessageTimestamp().equals("${=(new Date().format(\"yyyy-MM-dd'T'HH:mm:ss\"))}")&&
//                getCustomerInfoReq.getHeader().getClient().getSourceAppID().equals("TEST")&&
//                getCustomerInfoReq.getHeader().getClient().getUserDetail().getUserId().equals("ESB")&&
//                getCustomerInfoReq.getHeader().getClient().getUserDetail().getUserPassword().equals("RVNCMQ==")&&
//                getCustomerInfoReq.getBodyRequest().getAuxInfo().getXref().equals("ESB123334")&&
//                getCustomerInfoReq.getBodyRequest().getAuxInfo().getFunctionCode().equals("CUST-GETCUSINFOBYCIFMST-DB-FCC")&&
//                getCustomerInfoReq.getBodyRequest().getAccInfo().getCIFNo().equals("29092005")&&
//                a.equals("MST") &&
//                b.equals("0102100740") &&
//                c.equals("DKKD") &&
//                d.equals("040051000013")
//        ){
//            String result = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
//                    "   <soapenv:Body>\n" +
//                    "      <io3:GetCustomerInfoRes xmlns:io3=\"http://www.tpb.vn/entity/vn/party/customersvcs/1\" xmlns:io6=\"http://www.tpb.vn/common/envelope/commonheader/1\" xmlns:io7=\"http://www.tpb.vn/entity/vn/com/account/1\" xmlns:io4=\"http://tpb.vn/entity/vn/com/1\" xmlns:io=\"http://www.tpb.vn/entity/vn/com/party/1\">\n" +
//                    "         <io6:Header>\n" +
//                    "            <io6:Common>\n" +
//                    "               <io6:ServiceVersion>1</io6:ServiceVersion>\n" +
//                    "               <io6:MessageId>3333bfa2-0358-4f74-a55d-1d745689a019</io6:MessageId>\n" +
//                    "               <io6:TransactionId>286243d3-3d13-4371-b4da-1b75527a3f27</io6:TransactionId>\n" +
//                    "               <io6:MessageTimestamp>2022-10-03T09:20:16</io6:MessageTimestamp>\n" +
//                    "            </io6:Common>\n" +
//                    "            <io6:Client>\n" +
//                    "               <io6:SourceAppID/>\n" +
//                    "               <io6:UserDetail>\n" +
//                    "                  <io6:UserPassword>bnVsbA==</io6:UserPassword>\n" +
//                    "               </io6:UserDetail>\n" +
//                    "            </io6:Client>\n" +
//                    "         </io6:Header>\n" +
//                    "         <io6:ResponseStatus>\n" +
//                    "            <io6:Status>0</io6:Status>\n" +
//                    "            <io6:GlobalErrorCode>00</io6:GlobalErrorCode>\n" +
//                    "            <io6:GlobalErrorDescription>SUCCESS</io6:GlobalErrorDescription>\n" +
//                    "            <io6:ErrorInfo/>\n" +
//                    "         </io6:ResponseStatus>\n" +
//                    "         <io3:BodyResponse>\n" +
//                    "            <io3:ListCustInfo>\n" +
//                    "               <io3:Party>\n" +
//                    "                  <io:PartyInfo>\n" +
//                    "                     <io:PersonalPartyInfo>\n" +
//                    "                        <io:CIFNo>29092005</io:CIFNo>\n" +
//                    "                        <io:FullName>CUSTOMER29092005</io:FullName>\n" +
//                    "                        <io:ContactInfo>\n" +
//                    "                           <io4:AddressInfo>\n" +
//                    "                              <io4:Address>ADDRESS_1_29092005 ADDRESS_2_29092005 ADDRESS_3_29092005 ADDRESS_4_29092005</io4:Address>\n" +
//                    "                           </io4:AddressInfo>\n" +
//                    "                           <io4:MailAddress>\n" +
//                    "                              <io4:Name>hueht32@test.com.vn</io4:Name>\n" +
//                    "                           </io4:MailAddress>\n" +
//                    "                        </io:ContactInfo>\n" +
//                    "                     </io:PersonalPartyInfo>\n" +
//                    "                  </io:PartyInfo>\n" +
//                    "               </io3:Party>\n" +
//                    "               <io3:CustInfo>\n" +
//                    "                  <io3:CustomerType>I</io3:CustomerType>\n" +
//                    "                  <io3:CorporateTaxIdentNumb/>\n" +
//                    "               </io3:CustInfo>\n" +
//                    "               <io3:AccInfo>\n" +
//                    "                  <io7:AdditionInformation>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>AUTH_STAT</io6:Name>\n" +
//                    "                        <io6:Value>A</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>RECORD_STAT</io6:Name>\n" +
//                    "                        <io6:Value>O</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>DKKD</io6:Name>\n" +
//                    "                        <io6:Value>000000000769*2324</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD1</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD2</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD3</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD4</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD5</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                  </io7:AdditionInformation>\n" +
//                    "               </io3:AccInfo>\n" +
//                    "            </io3:ListCustInfo>\n" +
//                    "            <io3:ListCustInfo>\n" +
//                    "               <io3:Party>\n" +
//                    "                  <io:PartyInfo>\n" +
//                    "                     <io:PersonalPartyInfo>\n" +
//                    "                        <io:CIFNo>00006969</io:CIFNo>\n" +
//                    "                        <io:FullName>CUSTOMER00006969</io:FullName>\n" +
//                    "                        <io:ContactInfo>\n" +
//                    "                           <io4:AddressInfo>\n" +
//                    "                              <io4:Address>ADDRESS_1_00006969 ADDRESS_2_00006969 ADDRESS_3_00006969 ADDRESS_4_00006969</io4:Address>\n" +
//                    "                           </io4:AddressInfo>\n" +
//                    "                           <io4:MailAddress>\n" +
//                    "                              <io4:Name>huyen12@test.com.vn</io4:Name>\n" +
//                    "                           </io4:MailAddress>\n" +
//                    "                        </io:ContactInfo>\n" +
//                    "                     </io:PersonalPartyInfo>\n" +
//                    "                  </io:PartyInfo>\n" +
//                    "               </io3:Party>\n" +
//                    "               <io3:CustInfo>\n" +
//                    "                  <io3:CustomerType>C</io3:CustomerType>\n" +
//                    "                  <io3:CorporateTaxIdentNumb>0102100740</io3:CorporateTaxIdentNumb>\n" +
//                    "               </io3:CustInfo>\n" +
//                    "               <io3:AccInfo>\n" +
//                    "                  <io7:AdditionInformation>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>AUTH_STAT</io6:Name>\n" +
//                    "                        <io6:Value>A</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>RECORD_STAT</io6:Name>\n" +
//                    "                        <io6:Value>O</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>DKKD</io6:Name>\n" +
//                    "                        <io6:Value>0000696976575</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD1</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD2</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD3</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD4</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                      <io6:Name>FIELD5</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                  </io7:AdditionInformation>\n" +
//                    "               </io3:AccInfo>\n" +
//                    "            </io3:ListCustInfo>\n" +
//                    "            <io3:ListCustInfo>\n" +
//                    "               <io3:Party>\n" +
//                    "                  <io:PartyInfo>\n" +
//                    "                     <io:PersonalPartyInfo>\n" +
//                    "                        <io:CIFNo>00001232</io:CIFNo>\n" +
//                    "                        <io:FullName>CTY CP TONG CTY DAU TU XAY DUNG 194</io:FullName>\n" +
//                    "                        <io:ContactInfo>\n" +
//                    "                           <io4:AddressInfo>\n" +
//                    "                              <io4:Address>TOA NHA 194 GOLDEN BUILDING 473 DIEN BIEN PHU, PHUONG 25, QUAN BINH THANH, HO CHI MINH</io4:Address>\n" +
//                    "                           </io4:AddressInfo>\n" +
//                    "                           <io4:MailAddress>\n" +
//                    "                              <io4:Name/>\n" +
//                    "                           </io4:MailAddress>\n" +
//                    "                        </io:ContactInfo>\n" +
//                    "                     </io:PersonalPartyInfo>\n" +
//                    "                  </io:PartyInfo>\n" +
//                    "               </io3:Party>\n" +
//                    "               <io3:CustInfo>\n" +
//                    "                  <io3:CustomerType>I</io3:CustomerType>\n" +
//                    "                  <io3:CorporateTaxIdentNumb/>\n" +
//                    "               </io3:CustInfo>\n" +
//                    "               <io3:AccInfo>\n" +
//                    "                  <io7:AdditionInformation>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>AUTH_STAT</io6:Name>\n" +
//                    "                        <io6:Value>A</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>RECORD_STAT</io6:Name>\n" +
//                    "                        <io6:Value>O</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>DKKD</io6:Name>\n" +
//                    "                        <io6:Value>040051000013</io6:Value>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD1</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD2</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD3</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD4</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                     <io6:NameValuePairs>\n" +
//                    "                        <io6:Name>FIELD5</io6:Name>\n" +
//                    "                        <io6:Value/>\n" +
//                    "                     </io6:NameValuePairs>\n" +
//                    "                  </io7:AdditionInformation>\n" +
//                    "               </io3:AccInfo>\n" +
//                    "            </io3:ListCustInfo>\n" +
//                    "         </io3:BodyResponse>\n" +
//                    "      </io3:GetCustomerInfoRes>\n" +
//                    "   </soapenv:Body>\n" +
//                    "</soapenv:Envelope>\n";
//            return new ResponseEntity<>(result, HttpStatus.OK);
//        }
//        return null;
//    }
    @GetMapping("/get")
    public Common qwee() {
        Common common = new Common();
//        common.setServiceVersion(1);
//        common.setMessageId("${=java.util.UUID.randomUUID()}");
//        common.setTransactionId("${=java.util.UUID.randomUUID()}");
//        common.setMessageTimestamp("${=(new Date().format(\"yyyy-MM-dd'T'HH:mm:ss\"))}");
        return common;
    }
}
