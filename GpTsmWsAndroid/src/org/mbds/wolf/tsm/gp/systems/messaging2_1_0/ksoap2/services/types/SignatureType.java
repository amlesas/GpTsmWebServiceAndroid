package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types;

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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class SignatureType extends AttributeContainer implements KvmSerializable
{
    
    public SignedInfoType SignedInfo;
    
    public SignatureValueType SignatureValue;
    
    public KeyInfoType KeyInfo;
    
    public ArrayList< ObjectType>Object =new ArrayList<ObjectType>();
    
    public String Id;

    public SignatureType ()
    {
    }

    public SignatureType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("SignedInfo"))
        {	
	        java.lang.Object j = soapObject.getProperty("SignedInfo");
	        this.SignedInfo = (SignedInfoType)envelope.get(j,SignedInfoType.class);
        }
        if (soapObject.hasProperty("SignatureValue"))
        {	
	        java.lang.Object obj = soapObject.getProperty("SignatureValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.SignatureValue = (SignatureValueType)envelope.get(j,SignatureValueType.class);
                }
	        }
        }
        if (soapObject.hasProperty("KeyInfo"))
        {	
	        java.lang.Object j = soapObject.getProperty("KeyInfo");
	        this.KeyInfo = (KeyInfoType)envelope.get(j,KeyInfoType.class);
        }
        if (soapObject.hasProperty("Object"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.Object = new ArrayList<ObjectType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("Object"))
	            {
                    java.lang.Object j =info.getValue();
	                ObjectType j1= (ObjectType)envelope.get(j,ObjectType.class);
	                this.Object.add(j1);
	            }
	        }
        }


        if (inObj.hasAttribute("Id"))
        {	
            java.lang.Object j = inObj.getAttribute("Id");
            if (j != null)
            {
	            Id = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return SignedInfo;
        }
        if(propertyIndex==1)
        {
            return SignatureValue!=null?SignatureValue.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return KeyInfo;
        }
        if(propertyIndex>=+3 && propertyIndex< + 3+this.Object.size())
        {
            return Object.get(propertyIndex-(+3));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3+Object.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = SignedInfoType.class;
            info.name = "SignedInfo";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = SignatureValueType.class;
            info.name = "SignatureValue";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==2)
        {
            info.type = KeyInfoType.class;
            info.name = "KeyInfo";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex>=+3 && propertyIndex <= +3+this.Object.size())
        {
            info.type = ObjectType.class;
            info.name = "Object";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
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
            info.name = "Id";
            info.namespace= "";
            info.setValue(Id);
        }
    }}