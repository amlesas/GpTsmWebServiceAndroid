

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Functions;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Functions.IFunc;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements.OperationResult;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.BasicRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetSECapabilityProfileIdRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetSECapabilityProfileIdResponseType;


public class SEInfoBinding
{
    interface IWcfMethod
    {
        ExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="http://globalplatform.org/systems-messaging/seinfo";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging = true;

    IServiceEvents callback;
//    public SEInfoBinding(){}
//
//    public SEInfoBinding (IServiceEvents callback)
//    {
//        this.callback = callback;
//    }
    public SEInfoBinding(IServiceEvents callback,String url)
    {
        this.callback = callback;
        this.url = url;
    }

    public SEInfoBinding(IServiceEvents callback,String url,int timeOut)
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
    
    private GetSECapabilityProfileIdResponseType GetSECapabilityProfileId(final GetSECapabilityProfileIdRequestType GetSECapabilityProfileIdRequest ) throws java.lang.Exception
    {
        return (GetSECapabilityProfileIdResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://namespaces.globalplatform.org/systems-messaging/2.1.0","GetSECapabilityProfileIdRequest",new GetSECapabilityProfileIdRequestType().getClass());
                __envelope.setOutputSoapObject(GetSECapabilityProfileIdRequest);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (GetSECapabilityProfileIdResponseType)getResult(GetSECapabilityProfileIdResponseType.class,__result,"GetSECapabilityProfileIdResponse",__envelope);
            }
        },"GetSECapabilityProfileId");
    }
    
    public android.os.AsyncTask GetSECapabilityProfileIdAsync(final GetSECapabilityProfileIdRequestType GetSECapabilityProfileIdRequest)
    {
        return executeAsync(
        		GetSECapabilityProfileIdRequest
//        	new Functions.IFunc< GetSECapabilityProfileIdResponseType>() {
//            public GetSECapabilityProfileIdResponseType Func() throws java.lang.Exception {
//                return GetSECapabilityProfileId( GetSECapabilityProfileIdRequest);
//            }
//        }
        		,"GetSECapabilityProfileId");
    }
    //TODO
//    private String GetSEMobileSubscriptionIdentifier(final String GetSEMobileSubscriptionIdentifierRequest ) throws java.lang.Exception
//    {
///*This feature is available in Premium account, Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account*/
//        return null;    
//    }
//    
//    public android.os.AsyncTask GetSEMobileSubscriptionIdentifierAsync(final String GetSEMobileSubscriptionIdentifierRequest)
//    {
//        return executeAsync(
//        		new Functions.IFunc< String>() {
//            public String Func() throws java.lang.Exception {
//                return GetSEMobileSubscriptionIdentifier( GetSEMobileSubscriptionIdentifierRequest);
//            }
//        },"GetSEMobileSubscriptionIdentifier");
//    }
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
    protected < T> android.os.AsyncTask  executeAsync(final BasicRequestType req,final java.lang.String methodName)
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
					Functions.IFunc<T> func = null;
					if (req instanceof GetSECapabilityProfileIdRequestType) {
						func = (IFunc<T>) new Functions.IFunc<GetSECapabilityProfileIdResponseType>() {
							public GetSECapabilityProfileIdResponseType Func()
									throws java.lang.Exception {
								return GetSECapabilityProfileId((GetSECapabilityProfileIdRequestType) req);
							}
						};
					}
					if (func != null)
						result.Result = func.Func();
					else
						throw new NullPointerException();
				} catch (java.lang.Exception ex) {
					ex.printStackTrace();
					result.Exception = ex;
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


