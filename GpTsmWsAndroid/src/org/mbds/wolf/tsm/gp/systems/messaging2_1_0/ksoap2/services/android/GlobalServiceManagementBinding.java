

package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------




import java.util.List;

import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.transport.HttpTransportSE;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.IServiceEvents;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.elements.OperationResult;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Functions;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Functions.IFunc;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.DeclareServiceInstanceReferenceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.DeployServiceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetServiceInstanceReferenceDescriptorRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetServiceStateRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.LookupServiceInstanceReferenceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.DeclareServiceInstanceReferenceResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetServiceInstanceReferenceDescriptorResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetServiceStateResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.LookupServiceInstanceReferenceResponseType;


public class GlobalServiceManagementBinding
{
    interface IWcfMethod
    {
        ExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="http://globalplatform.org/systems-messaging/globalservicemanagement";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging;

    IServiceEvents callback;
//    public GlobalServiceManagementBinding(){}
//
//    public GlobalServiceManagementBinding (IServiceEvents callback)
//    {
//        this.callback = callback;
//    }
    public GlobalServiceManagementBinding(IServiceEvents callback,String url)
    {
        this.callback = callback;
        this.url = url;
    }

    public GlobalServiceManagementBinding(IServiceEvents callback,String url,int timeOut)
    {
        this.callback = callback;
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        return new HttpTransportSE(url,timeOut);//use HttpsTransportSE if your address starts with HTTPS
    }
    
    protected ExtendedSoapSerializationEnvelope createEnvelope()
    {
        return new ExtendedSoapSerializationEnvelope();
    }
    
    protected void sendRequest(String methodName,ExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport) throws java.lang.Exception
    {
        transport.call(methodName, envelope,httpHeaders);
    }


    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,ExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj);
                return instance;
            }
            else if( soap.getName().equals(resultName)) {
                java.lang.Object instance=__envelope.get(source,destObj);
                return instance;
            }
        }

        return null;
    }
    
    public LookupServiceInstanceReferenceResponseType LookupServiceInstanceReference(final LookupServiceInstanceReferenceRequestType LookupServiceInstanceReferenceRequest ) throws java.lang.Exception
    {
        return (LookupServiceInstanceReferenceResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","LookupServiceInstanceReferenceRequest",new LookupServiceInstanceReferenceRequestType().getClass());
                __envelope.setOutputSoapObject(LookupServiceInstanceReferenceRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (LookupServiceInstanceReferenceResponseType)getResult(LookupServiceInstanceReferenceResponseType.class,__result,"LookupServiceInstanceReferenceResponse",__envelope);
            }
        },"");
    }
    
    public android.os.AsyncTask LookupServiceInstanceReferenceAsync(final LookupServiceInstanceReferenceRequestType LookupServiceInstanceReferenceRequest)
    {
        return executeAsync(new Functions.IFunc< LookupServiceInstanceReferenceResponseType>() {
            public LookupServiceInstanceReferenceResponseType Func() throws java.lang.Exception {
                return LookupServiceInstanceReference( LookupServiceInstanceReferenceRequest);
            }
        },"LookupServiceInstanceReference");
    }
    
    public DeclareServiceInstanceReferenceResponseType DeclareServiceInstanceReference(final DeclareServiceInstanceReferenceRequestType DeclareServiceInstanceReferenceRequest ) throws java.lang.Exception
    {
        return (DeclareServiceInstanceReferenceResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","DeclareServiceInstanceReferenceRequest",new DeclareServiceInstanceReferenceRequestType().getClass());
                __envelope.setOutputSoapObject(DeclareServiceInstanceReferenceRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (DeclareServiceInstanceReferenceResponseType)getResult(DeclareServiceInstanceReferenceResponseType.class,__result,"DeclareServiceInstanceReferenceResponse",__envelope);
            }
        },"");
    }
    
    public android.os.AsyncTask DeclareServiceInstanceReferenceAsync(final DeclareServiceInstanceReferenceRequestType DeclareServiceInstanceReferenceRequest)
    {
        return executeAsync(new Functions.IFunc< DeclareServiceInstanceReferenceResponseType>() {
            public DeclareServiceInstanceReferenceResponseType Func() throws java.lang.Exception {
                return DeclareServiceInstanceReference( DeclareServiceInstanceReferenceRequest);
            }
        },"DeclareServiceInstanceReference");
    }
    
    public GetServiceInstanceReferenceDescriptorResponseType GetServiceInstanceReferenceDescriptor(final GetServiceInstanceReferenceDescriptorRequestType GetServiceInstanceReferenceDescriptorRequest ) throws java.lang.Exception
    {
        return (GetServiceInstanceReferenceDescriptorResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","GetServiceInstanceReferenceDescriptorRequest",new GetServiceInstanceReferenceDescriptorRequestType().getClass());
                __envelope.setOutputSoapObject(GetServiceInstanceReferenceDescriptorRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (GetServiceInstanceReferenceDescriptorResponseType)getResult(GetServiceInstanceReferenceDescriptorResponseType.class,__result,"GetServiceInstanceReferenceDescriptorResponse",__envelope);
            }
        },"");
    }
    
    public android.os.AsyncTask GetServiceInstanceReferenceDescriptorAsync(final GetServiceInstanceReferenceDescriptorRequestType GetServiceInstanceReferenceDescriptorRequest)
    {
        return executeAsync(new Functions.IFunc< GetServiceInstanceReferenceDescriptorResponseType>() {
            public GetServiceInstanceReferenceDescriptorResponseType Func() throws java.lang.Exception {
                return GetServiceInstanceReferenceDescriptor( GetServiceInstanceReferenceDescriptorRequest);
            }
        },"GetServiceInstanceReferenceDescriptor");
    }
    
    public GetServiceStateResponseType GetServiceState(final GetServiceStateRequestType GetServiceStateRequest ) throws java.lang.Exception
    {
        return (GetServiceStateResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","GetServiceStateRequest",new GetServiceStateRequestType().getClass());
                __envelope.setOutputSoapObject(GetServiceStateRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (GetServiceStateResponseType)getResult(GetServiceStateResponseType.class,__result,"GetServiceStateResponse",__envelope);
            }
        },"");
    }
    
    public android.os.AsyncTask GetServiceStateAsync(final GetServiceStateRequestType GetServiceStateRequest)
    {
        return executeAsync(new Functions.IFunc< GetServiceStateResponseType>() {
            public GetServiceStateResponseType Func() throws java.lang.Exception {
                return GetServiceState( GetServiceStateRequest);
            }
        },"GetServiceState");
    }
    
    public void DeployService(final DeployServiceRequestType DeployServiceRequest ) throws java.lang.Exception
    {
        execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","DeployServiceRequest",new DeployServiceRequestType().getClass());
                __envelope.setOutputSoapObject(DeployServiceRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return null;
            }
        },"");
    }
    
    public android.os.AsyncTask DeployServiceAsync(final DeployServiceRequestType DeployServiceRequest)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                DeployService( DeployServiceRequest);
                return null;
            }
        },"DeployService");
    }
    
    public void UpgradeService(final String UpgradeServiceRequest ) throws java.lang.Exception
    {
/*This feature is available in Premium account, Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account*/
    }
    
    public android.os.AsyncTask UpgradeServiceAsync(final String UpgradeServiceRequest)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                UpgradeService( UpgradeServiceRequest);
                return null;
            }
        },"UpgradeService");
    }
    
    public void ExchangeServiceData(final String ExchangeServiceDataRequest ) throws java.lang.Exception
    {
/*This feature is available in Premium account, Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account*/
    }
    
    public android.os.AsyncTask ExchangeServiceDataAsync(final String ExchangeServiceDataRequest)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                ExchangeServiceData( ExchangeServiceDataRequest);
                return null;
            }
        },"ExchangeServiceData");
    }
    
    public void SuspendOrResumeService(final String SuspendOrResumeServiceRequest ) throws java.lang.Exception
    {
/*This feature is available in Premium account, Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account*/
    }
    
    public android.os.AsyncTask SuspendOrResumeServiceAsync(final String SuspendOrResumeServiceRequest)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                SuspendOrResumeService( SuspendOrResumeServiceRequest);
                return null;
            }
        },"SuspendOrResumeService");
    }
    
    public void TerminateService(final String TerminateServiceRequest ) throws java.lang.Exception
    {
/*This feature is available in Premium account, Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account*/
    }
    
    public android.os.AsyncTask TerminateServiceAsync(final String TerminateServiceRequest)
    {
        return executeAsync(new Functions.IFunc< Void>()
        {
            @Override
            public Void Func() throws java.lang.Exception {
                TerminateService( TerminateServiceRequest);
                return null;
            }
        },"TerminateService");
    }
    protected java.lang.Object execute(IWcfMethod wcfMethod,String methodName) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        ExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport);
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    android.util.Log.i("requestDump",__httpTransport.requestDump);
                }
                if (__httpTransport.responseDump != null) {
                    android.util.Log.i("responseDump",__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }
    protected < T> android.os.AsyncTask  executeAsync(final Functions.IFunc< T> func,final java.lang.String methodName)
    {
        return new android.os.AsyncTask< Void, Void, OperationResult< T>>()
        {
            @Override
            protected void onPreExecute() {
                callback.Starting();
            };
            @Override
            protected OperationResult< T> doInBackground(Void... params) {
                OperationResult< T> result = new OperationResult< T>();
                result.MethodName=methodName;
                try
                {
                    result.Result= func.Func();
                }
                catch(java.lang.Exception ex)
                {
                    ex.printStackTrace();
                    result.Exception=ex;
                }
                return result;
            }
            
            @Override
            protected void onPostExecute(OperationResult< T> result)
            {
                callback.Completed(result);
            }
        }.execute();
    }
        
   
      

    java.lang.Exception convertToException(org.ksoap2.SoapFault fault,ExtendedSoapSerializationEnvelope envelope)
    {
        return new java.lang.Exception(fault.faultstring);
    }
}

