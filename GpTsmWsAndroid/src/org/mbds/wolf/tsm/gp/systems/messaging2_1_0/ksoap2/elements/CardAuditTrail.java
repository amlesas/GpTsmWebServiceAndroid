package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------


import java.util.Hashtable;


import org.ksoap2.serialization.*;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class CardAuditTrail extends AttributeContainer implements KvmSerializable
{
    
    public LogIdentifierCode LogIdentifierCode;
    
    public String BatchID;

    public CardAuditTrail ()
    {
    }

    public CardAuditTrail (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("LogIdentifierCode"))
        {	
	        java.lang.Object j = soapObject.getProperty("LogIdentifierCode");
	        this.LogIdentifierCode = (LogIdentifierCode)envelope.get(j,LogIdentifierCode.class);
        }


        if (inObj.hasAttribute("BatchID"))
        {	
            java.lang.Object j = inObj.getAttribute("BatchID");
            if (j != null)
            {
	            BatchID = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return LogIdentifierCode;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = LogIdentifierCode.class;
            info.name = "LogIdentifierCode";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }


    @Override
    public int getAttributeCount() {
        return 1;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "BatchID";
            info.namespace= "";
            info.setValue(BatchID);
        }
    }}
