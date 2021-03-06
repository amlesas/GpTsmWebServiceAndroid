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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class SDKeyType extends AttributeContainer implements KvmSerializable
{
    
    public Integer KeyIdentifier=0;
    
    public String EncryptedKeyValue;
    
    public String KCV;

    public SDKeyType ()
    {
    }

    public SDKeyType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("KeyIdentifier"))
        {	
	        java.lang.Object obj = soapObject.getProperty("KeyIdentifier");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.KeyIdentifier = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.KeyIdentifier = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("EncryptedKeyValue"))
        {	
	        java.lang.Object obj = soapObject.getProperty("EncryptedKeyValue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.EncryptedKeyValue = j.toString();
                }
	        }
	        else if (obj!= null){
                this.EncryptedKeyValue = obj.toString();
            }    
        }
        if (soapObject.hasProperty("KCV"))
        {	
	        java.lang.Object obj = soapObject.getProperty("KCV");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.KCV = j.toString();
                }
	        }
	        else if (obj!= null){
                this.KCV = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return KeyIdentifier;
        }
        if(propertyIndex==1)
        {
            return EncryptedKeyValue;
        }
        if(propertyIndex==2)
        {
            return KCV!=null?KCV:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "KeyIdentifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "EncryptedKeyValue";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "KCV";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
