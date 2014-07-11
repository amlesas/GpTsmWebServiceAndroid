package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceInstanceReferenceType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.ServiceCommandType;

public class UpgradeServiceRequestType extends BasicRequestType implements KvmSerializable
{
    
    public ServiceInstanceReferenceType CurrentServiceInstanceReference;
    
    public ServiceInstanceReferenceType NewServiceInstanceReference;
    
    public ArrayList< ServiceCommandType>ServiceCommand =new ArrayList<ServiceCommandType>();

    public UpgradeServiceRequestType ()
    {
    }

    public UpgradeServiceRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("CurrentServiceInstanceReference"))
        {	
	        java.lang.Object j = soapObject.getProperty("CurrentServiceInstanceReference");
	        this.CurrentServiceInstanceReference = (ServiceInstanceReferenceType)envelope.get(j,ServiceInstanceReferenceType.class);
        }
        if (soapObject.hasProperty("NewServiceInstanceReference"))
        {	
	        java.lang.Object j = soapObject.getProperty("NewServiceInstanceReference");
	        this.NewServiceInstanceReference = (ServiceInstanceReferenceType)envelope.get(j,ServiceInstanceReferenceType.class);
        }
        if (soapObject.hasProperty("ServiceCommand"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ServiceCommand = new ArrayList<ServiceCommandType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ServiceCommand"))
	            {
                    java.lang.Object j =info.getValue();
	                ServiceCommandType j1= (ServiceCommandType)envelope.get(j,ServiceCommandType.class);
	                this.ServiceCommand.add(j1);
	            }
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
            return CurrentServiceInstanceReference;
        }
        if(propertyIndex==count+1)
        {
            return NewServiceInstanceReference;
        }
        if(propertyIndex>=count+2 && propertyIndex< count+ 2+this.ServiceCommand.size())
        {
            return ServiceCommand.get(propertyIndex-(count+2));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+ServiceCommand.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = ServiceInstanceReferenceType.class;
            info.name = "CurrentServiceInstanceReference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = ServiceInstanceReferenceType.class;
            info.name = "NewServiceInstanceReference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=count+2 && propertyIndex <= count+2+this.ServiceCommand.size())
        {
            info.type = ServiceCommandType.class;
            info.name = "ServiceCommand";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}