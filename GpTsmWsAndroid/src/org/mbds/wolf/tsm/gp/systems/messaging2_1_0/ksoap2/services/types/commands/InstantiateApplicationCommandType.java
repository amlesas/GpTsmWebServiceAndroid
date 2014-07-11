package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands;

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

import java.math.BigInteger;

public class InstantiateApplicationCommandType extends SECommandType implements KvmSerializable
{
    
    public String ExecutableLoadFileAID;
    
    public String ExecutableModuleAID;
    
    public String ApplicationAID;
    
    public BigInteger ParametersProfileIdentifier;
    
    public String ApplicationSpecificParameters;
    
    public Boolean GenerateTAR;
    
    public Boolean MakeSelectable;

    public InstantiateApplicationCommandType ()
    {
    }

    public InstantiateApplicationCommandType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ExecutableLoadFileAID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ExecutableLoadFileAID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ExecutableLoadFileAID = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ExecutableLoadFileAID = (String)obj;
            }    
        }
        if (soapObject.hasProperty("ExecutableModuleAID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ExecutableModuleAID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ExecutableModuleAID = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ExecutableModuleAID = (String)obj;
            }    
        }
        if (soapObject.hasProperty("ApplicationAID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ApplicationAID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ApplicationAID = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ApplicationAID = (String)obj;
            }    
        }
        if (soapObject.hasProperty("ParametersProfileIdentifier"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ParametersProfileIdentifier");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ParametersProfileIdentifier = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.ParametersProfileIdentifier = (BigInteger)obj;
            }    
        }
        if (soapObject.hasProperty("ApplicationSpecificParameters"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ApplicationSpecificParameters");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ApplicationSpecificParameters = j.toString();
                }
	        }
	        else if (obj!= null){
                this.ApplicationSpecificParameters = obj.toString();
            }    
        }
        if (soapObject.hasProperty("GenerateTAR"))
        {	
	        java.lang.Object obj = soapObject.getProperty("GenerateTAR");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.GenerateTAR = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.GenerateTAR = (Boolean)obj;
            }    
        }
        if (soapObject.hasProperty("MakeSelectable"))
        {	
	        java.lang.Object obj = soapObject.getProperty("MakeSelectable");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.MakeSelectable = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.MakeSelectable = (Boolean)obj;
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return ExecutableLoadFileAID!=null?ExecutableLoadFileAID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return ExecutableModuleAID!=null?ExecutableModuleAID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return ApplicationAID!=null?ApplicationAID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return ParametersProfileIdentifier!=null?ParametersProfileIdentifier.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return ApplicationSpecificParameters!=null?ApplicationSpecificParameters:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return GenerateTAR!=null?GenerateTAR:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return MakeSelectable!=null?MakeSelectable:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ExecutableLoadFileAID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ExecutableModuleAID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ApplicationAID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ParametersProfileIdentifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ApplicationSpecificParameters";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "GenerateTAR";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "MakeSelectable";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}