package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.elements;

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

public class DataSet extends AttributeContainer implements KvmSerializable
{
    
    public ArrayList< Data>Data =new ArrayList<Data>();
    
    public String Name;

    public DataSet ()
    {
    }

    public DataSet (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Data"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.Data = new ArrayList<Data>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("Data"))
	            {
                    java.lang.Object j =info.getValue();
	                Data j1= (Data)envelope.get(j,Data.class);
	                this.Data.add(j1);
	            }
	        }
        }


        if (inObj.hasAttribute("Name"))
        {	
            java.lang.Object j = inObj.getAttribute("Name");
            if (j != null)
            {
	            Name = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex>=+0 && propertyIndex< + 0+this.Data.size())
        {
            return Data.get(propertyIndex-(+0));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 0+Data.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=+0 && propertyIndex <= +0+this.Data.size())
        {
            info.type = Data.class;
            info.name = "Data";
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
            info.name = "Name";
            info.namespace= "";
            info.setValue(Name);
        }
    }}