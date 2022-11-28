<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Patch - Photos</name>
   <tag></tag>
   <elementGuidId>1dbbbd48-c6d9-454d-af3e-319696fc605a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;thumbnailUrl\&quot;: \&quot;${TUrl}\&quot;,\n    \&quot;title\&quot;: \&quot;${Tittle}\&quot;,\n  \&quot;url\&quot;: \&quot;${Url}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>e1771d81-8118-4ed5-b2a8-ecb5569289f3</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/photos/1</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'twitter.com'</defaultValue>
      <description></description>
      <id>24a6058e-0f9c-4892-b600-05450c37ec80</id>
      <masked>false</masked>
      <name>TUrl</name>
   </variables>
   <variables>
      <defaultValue>'Zeus'</defaultValue>
      <description></description>
      <id>0277c730-351b-4d64-badf-e224b56d831d</id>
      <masked>false</masked>
      <name>Tittle</name>
   </variables>
   <variables>
      <defaultValue>'youtube.com'</defaultValue>
      <description></description>
      <id>8d00fc1b-b581-4ca8-9d3b-9e09732da395</id>
      <masked>false</masked>
      <name>Url</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)
WS.verifyElementPropertyValue(response, 'url', 'youtube.com')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'Zeus')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'twitter.com')
WS.verifyElementPropertyValue(response, 'albumId', '1')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
