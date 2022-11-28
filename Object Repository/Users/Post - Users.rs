<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Post - Users</name>
   <tag></tag>
   <elementGuidId>8d0dafbb-addd-4faa-93a8-4a261467917c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;${N}\&quot;,\n    \&quot;username\&quot;: \&quot;${UN}\&quot;,\n    \&quot;email\&quot;: \&quot;${M}\&quot;\n}&quot;,
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
      <webElementGuid>51fd2d65-f319-427e-b7e7-bd7ea9d4cd6b</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Aldo Sunan'</defaultValue>
      <description></description>
      <id>3c2fbced-38ea-4229-91d7-79b82241f0a6</id>
      <masked>false</masked>
      <name>N</name>
   </variables>
   <variables>
      <defaultValue>'Sunan'</defaultValue>
      <description></description>
      <id>e3d8c813-0fd9-42f8-9034-2d960ba4dd12</id>
      <masked>false</masked>
      <name>UN</name>
   </variables>
   <variables>
      <defaultValue>'nans@mailsac.com'</defaultValue>
      <description></description>
      <id>5ec77624-70a8-439a-9d11-e602e14f0c5e</id>
      <masked>false</masked>
      <name>M</name>
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
WS.verifyElementPropertyValue(response, 'id', '11')
WS.verifyElementPropertyValue(response, 'name', 'Aldo Sunan')
WS.verifyElementPropertyValue(response, 'username', 'Sunan')
WS.verifyElementPropertyValue(response, 'email', 'nans@mailsac.com')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
