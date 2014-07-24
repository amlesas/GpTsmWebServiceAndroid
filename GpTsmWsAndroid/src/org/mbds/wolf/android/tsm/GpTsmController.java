package org.mbds.wolf.android.tsm;


import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.IServiceEvents;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements.OperationResult;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.CAInfoBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.CAInfoCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.CCCMCertificatesManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.CardContentManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DelegatedManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceApplicationBindingBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceApplicationBindingCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceApplicationLifeCycleNotificationBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceApplicationManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceApplicationManagementCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.DeviceInfoBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.GlobalEligibilityInfoBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.GlobalServiceManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.GlobalServiceManagementCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.MobileSubscriptionInfoBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.MobileSubscriptionLifeCycleNotificationBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SCWSManagementBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SCWSManagementCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SEAuditBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SEAuditCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SEInfoBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.SELifeCycleNotificationBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.ScriptSendingBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.ScriptSendingCallBackBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.ServiceEnvironmentChangeNotificationBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.android.ServiceLifeCycleNotificationBinding;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.BeginConversationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.BindDeviceApplicationToSEApplicationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.CheckGlobalEligibilityRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.CheckMobileSubscriptionEligibilityRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.DeclareServiceInstanceReferenceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.DeployServiceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.EnrollSSDOwnerCertificateRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GenerateDMTokenRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetApplicationOrELFStatusRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetCAInformationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetDeviceCapabilityProfileIdRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetMobileSubscriptionAlternateIdentifierRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetSECapabilityProfileIdRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetSEMobileSubscriptionIdentifierRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetServiceInstanceReferenceDescriptorRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.GetServiceStateRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleActionDoneOnDeviceApplicationNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleActionDoneOnServiceNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleEndServiceStateChangeNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleMobileSubscriptionIdentifierChangedNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleSEDeviceChangedNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleSEDeviceStatusChangeNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleSEMobileSubscriptionChangedNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleSERenewalNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleServiceEnvironmentChangeNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.HandleStartServiceStateChangeNotificationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.LoadDeviceApplicationRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.LoadSCWSServicePortalRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.LookupServiceInstanceReferenceRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.SECommandsGenerationAndRemoteExecutionRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.SendScriptRequestType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.BeginConversationResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.BindDeviceApplicationToSEApplicationResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.CheckGlobalEligibilityResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.CheckMobileSubscriptionEligibilityResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.DeclareServiceInstanceReferenceResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.DeployServiceResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.EnrollSSDOwnerCertificateResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.ExchangeServiceDataResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GenerateDMTokenResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetApplicationOrELFStatusResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetCAInformationResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetDeviceCapabilityProfileIdResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetMobileSubscriptionAlternateIdentifierResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetSECapabilityProfileIdResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetServiceInstanceReferenceDescriptorResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.GetServiceStateResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.LoadDeviceApplicationResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.LoadSCWSServicePortalResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.LookupServiceInstanceReferenceResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.SECommandsGenerationAndRemoteExecutionResponseType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.responses.UpgradeServiceResponseType;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * 
 * @author amles_000
 *
 */
public class GpTsmController implements IServiceEvents{
	public final static String TAG = GpTsmController.class.getCanonicalName();
	private Context context;
	private String url;
	private IServiceEvents callback;
	private TelephonyManager telephonyManager;
	private static GpTsmController _instance = null;
	
	/**
	 * Static getInstance
	 * @param context
	 * @param serverUrl
	 * @return GpTsmController instance
	 */
	public static GpTsmController getInstance(Context context, String serverUrl) {
		if (_instance==null) {
			_instance = new GpTsmController(context, serverUrl);
		}
		return _instance;
	}

	/**
	 * Private constructor
	 * @param context
	 * @param url
	 */
	private GpTsmController(Context context, String serverUrl) {
		this.context = context;
		this.url = serverUrl;
		telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
	}
	
	/**
	 * setServerUrl
	 * @param url
	 */
	public void setServerUrl(String url) {
		this.url = url;
	}
	
	/**
	 * getServerUrl
	 * @return
	 */
	 
	public String getServerUrl() {
		return url;
	}

	/**
	 * getWSurl
	 * @param serverUrl
	 * @param binderName
	 * @return
	 */
	public static String getWSurl(String serverUrl, String binderName) {
		if (serverUrl.endsWith("/") || serverUrl.endsWith("\\"))
			return serverUrl+binderName;
		else
			if (serverUrl.contains("\\"))
				return serverUrl+"\\"+binderName;
			else 
				return serverUrl+"/"+binderName;
	}
	
	/**
	 * getMNOName
	 * @return
	 */
	public String getMNOName() {
		return telephonyManager.getNetworkOperator();
	}
	/**
	 * getSIMSerialNumber
	 * @return
	 */
	public String getSIMSerialNumber() {
		return telephonyManager.getSimSerialNumber();
	}

	/**
	 * checkGlobalEligibility
	 * @param callback
	 * @param req
	 */
	public void checkGlobalEligibility(IServiceEvents callback, CheckGlobalEligibilityRequestType req) {
		this.callback = callback;
		GlobalEligibilityInfoBinding bind = new GlobalEligibilityInfoBinding(this, 
				getWSurl(url, GlobalEligibilityInfoBinding.class.getSimpleName()));
		try {
			bind.CheckGlobalEligibilityAsync(req);
		} catch (Exception e) {
			OperationResult<CheckGlobalEligibilityResponseType> res = 
					new OperationResult<CheckGlobalEligibilityResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
	
	/**
	 * GetCAInformation
	 * @param callback
	 * @param req
	 */
	public void GetCAInformation(IServiceEvents callback, GetCAInformationRequestType req) {
		this.callback = callback;
		CAInfoBinding bind = new CAInfoBinding(this, 
				getWSurl(url, CAInfoBinding.class.getSimpleName()));
		try {
			bind.GetCAInformationAsync(req);
		} catch (Exception e) {
			OperationResult<GetCAInformationResponseType> res = 
					new OperationResult<GetCAInformationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
	
	/**
	 * AuditCAInformation // TODO
	 * @param callback
	 * @param req
	 */
//	public void AuditCAInformation(IServiceEvents callback, AuditCAInformationRequest req) {
//		this.callback = callback;
//		CAInfoBinding bind = new CAInfoBinding(this, 
//							getWSurl(url, CAInfoBinding.class.getSimpleName()));
//		try {
//			bind.AuditCAInformationRequestAsync(req);
//		} catch (Exception e) {
//			OperationResult<AuditCAInformationRequest> res = 
//					new OperationResult<AuditCAInformationRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	/**
	 * AuditCAInformation
	 * @param callback
	 * @param req
	 */
	public void AuditCAInformation(IServiceEvents callback, GetCAInformationResponseType req) {
		this.callback = callback;
		CAInfoCallBackBinding bind = new CAInfoCallBackBinding(this, 
				getWSurl(url, CAInfoCallBackBinding.class.getSimpleName()));
		try {
			bind.AuditCAInformationAsync(req);
		} catch (Exception e) {
			OperationResult<GetCAInformationResponseType> res = 
					new OperationResult<GetCAInformationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "AuditCAInformation";
			e.printStackTrace();
		}
	}

	/**
	 * EnrollSSDOwnerCertificate
	 * @param callback
	 * @param req
	 */
	public void EnrollSSDOwnerCertificate(IServiceEvents callback, EnrollSSDOwnerCertificateRequestType req) {
		this.callback = callback;
		CCCMCertificatesManagementBinding bind = new CCCMCertificatesManagementBinding(this, 
				getWSurl(url, CCCMCertificatesManagementBinding.class.getSimpleName()));
		try {
			bind.EnrollSSDOwnerCertificateAsync(req);
		} catch (Exception e) {
			OperationResult<EnrollSSDOwnerCertificateResponseType> res = 
					new OperationResult<EnrollSSDOwnerCertificateResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * GenerateDMToken
	 * @param callback
	 * @param req
	 */
	public void GenerateDMToken(IServiceEvents callback, GenerateDMTokenRequestType req) {
		this.callback = callback;
		DelegatedManagementBinding bind = new DelegatedManagementBinding(this, 
				getWSurl(url, DelegatedManagementBinding.class.getSimpleName()));
		try {
			bind.GenerateDMTokenAsync(req);
		} catch (Exception e) {
			OperationResult<GenerateDMTokenResponseType> res = 
					new OperationResult<GenerateDMTokenResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
	
	/**
	 * VerifyDMReceipt //TODO
	 * @param callback
	 * @param req
	 */
//	public void VerifyDMReceipt(IServiceEvents callback, VerifyDMReceiptRequest req) {
//		this.callback = callback;
//		DelegatedManagementBinding bind = new DelegatedManagementBinding(this, getWSurl(url, DelegatedManagementBinding.class.getSimpleName()));
//		try {
//			bind.VerifyDMReceiptAsync(req);
//		} catch (Exception e) {
//			OperationResult<VerifyDMReceiptRequest> res = 
//					new OperationResult<VerifyDMReceiptRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}	
	
	/**
	 * SECommandsGenerationAndRemoteExecution
	 * @param callback
	 * @param req
	 */
	public void SECommandsGenerationAndRemoteExecution(IServiceEvents callback, SECommandsGenerationAndRemoteExecutionRequestType req) {
		this.callback = callback;
		CardContentManagementBinding bind = new CardContentManagementBinding(this, 
				getWSurl(url, CardContentManagementBinding.class.getSimpleName()));
		try {
			bind.SECommandsGenerationAndRemoteExecutionAsync(req);
		} catch (Exception e) {
			OperationResult<SECommandsGenerationAndRemoteExecutionResponseType> res = 
					new OperationResult<SECommandsGenerationAndRemoteExecutionResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
	
	/**
	 * BindDeviceApplicationToSEApplication
	 * @param callback
	 * @param req
	 */
	public void BindDeviceApplicationToSEApplication(IServiceEvents callback, BindDeviceApplicationToSEApplicationRequestType req) {
		this.callback = callback;
		DeviceApplicationBindingBinding bind = new DeviceApplicationBindingBinding(this, 
				getWSurl(url, DeviceApplicationBindingBinding.class.getSimpleName()));
		try {
			bind.BindDeviceApplicationToSEApplicationAsync(req);
		} catch (Exception e) {
			OperationResult<BindDeviceApplicationToSEApplicationResponseType> res = 
					new OperationResult<BindDeviceApplicationToSEApplicationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * UnbindDeviceApplicationToSEApplication //TODO
	 * @param callback
	 * @param req
	 */
//	public void UnbindDeviceApplicationToSEApplication(IServiceEvents callback, UnbindDeviceApplicationToSEApplicationRequest req) {
//		this.callback = callback;
//		DeviceApplicationBindingBinding bind = new DeviceApplicationBindingBinding(this, getWSurl(url, DeviceApplicationBindingBinding.class.getSimpleName()));
//		try {
//			bind.UnbindDeviceApplicationToSEApplicationAsync(req);
//		} catch (Exception e) {
//			OperationResult<UnbindDeviceApplicationToSEApplicationRequest> res = 
//					new OperationResult<UnbindDeviceApplicationToSEApplicationRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}

	/**
	 * BindDeviceApplicationToSEApplication
	 * @param callback
	 * @param req
	 */
	public void BindDeviceApplicationToSEApplication(IServiceEvents callback, BindDeviceApplicationToSEApplicationResponseType req) {
		this.callback = callback;
		DeviceApplicationBindingCallBackBinding bind = new DeviceApplicationBindingCallBackBinding(this, 
				getWSurl(url, DeviceApplicationBindingCallBackBinding.class.getSimpleName()));
		try {
			bind.BindDeviceApplicationToSEApplicationAsync(req);
		} catch (Exception e) {
			OperationResult<BindDeviceApplicationToSEApplicationResponseType> res = 
					new OperationResult<BindDeviceApplicationToSEApplicationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "BindDeviceApplicationToSEApplication";
			e.printStackTrace();
		}
	}	
	
	/**
	 * UnbindDeviceApplicationToSEApplication //TODO
	 * @param callback
	 * @param req
	 */
//	public void UnbindDeviceApplicationToSEApplication(IServiceEvents callback, UnbindDeviceApplicationToSEApplicationResponse req) {
//		this.callback = callback;
//		DeviceApplicationBindingCallBackBinding bind = new DeviceApplicationBindingCallBackBinding(this, getWSurl(url, DeviceApplicationBindingCallBackBinding.class.getSimpleName()));
//		try {
//			bind.UnbindDeviceApplicationToSEApplicationAsync(req);
//		} catch (Exception e) {
//			OperationResult<UnbindDeviceApplicationToSEApplicationResponse> res = 
//					new OperationResult<UnbindDeviceApplicationToSEApplicationResponse>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = "UnbindDeviceApplicationToSEApplication";
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * HandleActionDoneOnDeviceApplicationNotification
	 * @param callback
	 * @param req
	 */
	public void HandleActionDoneOnDeviceApplicationNotification(IServiceEvents callback, HandleActionDoneOnDeviceApplicationNotificationRequestType req) {
		this.callback = callback;
		DeviceApplicationLifeCycleNotificationBinding bind = new DeviceApplicationLifeCycleNotificationBinding(this, 
				getWSurl(url, DeviceApplicationLifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleActionDoneOnDeviceApplicationNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleActionDoneOnDeviceApplicationNotificationRequestType> res = 
					new OperationResult<HandleActionDoneOnDeviceApplicationNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * LoadDeviceApplication
	 * @param callback
	 * @param req
	 */
	public void LoadDeviceApplication(IServiceEvents callback, LoadDeviceApplicationRequestType req) {
		this.callback = callback;
		DeviceApplicationManagementBinding bind = new DeviceApplicationManagementBinding(this, 
				getWSurl(url, DeviceApplicationManagementBinding.class.getSimpleName()));
		try {
			bind.LoadDeviceApplicationAsync(req);
		} catch (Exception e) {
			OperationResult<LoadDeviceApplicationRequestType> res = 
					new OperationResult<LoadDeviceApplicationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	
	
	/**
	 * DeleteDeviceApplication //TODO
	 * @param callback
	 * @param req
	 */
//	public void DeleteDeviceApplication(IServiceEvents callback, DeleteDeviceApplicationRequest req) {
//		this.callback = callback;
//		DeviceApplicationManagementBinding bind = new DeviceApplicationManagementBinding(this, getWSurl(url, DeviceApplicationManagementBinding.class.getSimpleName()));
//		try {
//			bind.DeleteDeviceApplicationAsync(req);
//		} catch (Exception e) {
//			OperationResult<DeleteDeviceApplicationRequest> res = 
//					new OperationResult<DeleteDeviceApplicationRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * LoadDeviceApplication
	 * @param callback
	 * @param req
	 */
	public void LoadDeviceApplication(IServiceEvents callback, LoadDeviceApplicationResponseType req) {
		this.callback = callback;
		DeviceApplicationManagementCallBackBinding bind = new DeviceApplicationManagementCallBackBinding(this, 
				getWSurl(url, DeviceApplicationManagementCallBackBinding.class.getSimpleName()));
		try {
			bind.LoadDeviceApplicationAsync(req);
		} catch (Exception e) {
			OperationResult<LoadDeviceApplicationResponseType> res = 
					new OperationResult<LoadDeviceApplicationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "LoadDeviceApplication";
			e.printStackTrace();
		}
	}
	
	/**
	 * DeleteDeviceApplication //TODO
	 * @param callback
	 * @param req
	 */
//	public void DeleteDeviceApplication(IServiceEvents callback, LoadDeviceApplicationResponseType req) {
//		this.callback = callback;
//		DeviceApplicationManagementCallBackBinding bind = new DeviceApplicationManagementCallBackBinding(this, getWSurl(url, DeviceApplicationManagementCallBackBinding.class.getSimpleName()));
//		try {
//			bind.DeleteDeviceApplicationAsync(req);
//		} catch (Exception e) {
//			OperationResult<LoadDeviceApplicationResponseType> res = 
//					new OperationResult<LoadDeviceApplicationResponseType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = "DeleteDeviceApplication";
//			e.printStackTrace();
//		}
//	}	
	
	/**
	 * GetDeviceCapabilityProfileId
	 * @param callback
	 * @param req
	 */
	public void GetDeviceCapabilityProfileId(IServiceEvents callback, GetDeviceCapabilityProfileIdRequestType req) {
		this.callback = callback;
		DeviceInfoBinding bind = new DeviceInfoBinding(this, getWSurl(url, DeviceInfoBinding.class.getSimpleName()));
		try {
			bind.GetDeviceCapabilityProfileIdAsync(req);
		} catch (Exception e) {
			OperationResult<GetDeviceCapabilityProfileIdResponseType> res = 
					new OperationResult<GetDeviceCapabilityProfileIdResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * LookupServiceInstanceReference
	 * @param callback
	 * @param req
	 */
	public void LookupServiceInstanceReference(IServiceEvents callback, LookupServiceInstanceReferenceRequestType req) {
		this.callback = callback;
		GlobalServiceManagementBinding bind = new GlobalServiceManagementBinding(this, 
				getWSurl(url, GlobalServiceManagementBinding.class.getSimpleName()));
		try {
			bind.LookupServiceInstanceReferenceAsync(req);
		} catch (Exception e) {
			OperationResult<LookupServiceInstanceReferenceResponseType> res = 
					new OperationResult<LookupServiceInstanceReferenceResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * DeclareServiceInstanceReference
	 * @param callback
	 * @param req
	 */
	public void DeclareServiceInstanceReference(IServiceEvents callback, DeclareServiceInstanceReferenceRequestType req) {
		this.callback = callback;
		GlobalServiceManagementBinding bind = new GlobalServiceManagementBinding(this, 
				getWSurl(url, GlobalServiceManagementBinding.class.getSimpleName()));
		try {
			bind.DeclareServiceInstanceReferenceAsync(req);
		} catch (Exception e) {
			OperationResult<DeclareServiceInstanceReferenceResponseType> res = 
					new OperationResult<DeclareServiceInstanceReferenceResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * GetServiceInstanceReferenceDescriptor
	 * @param callback
	 * @param req
	 */
	public void GetServiceInstanceReferenceDescriptor(IServiceEvents callback, GetServiceInstanceReferenceDescriptorRequestType req) {
		this.callback = callback;
		GlobalServiceManagementBinding bind = new GlobalServiceManagementBinding(this, 
				getWSurl(url, GlobalServiceManagementBinding.class.getSimpleName()));
		try {
			bind.GetServiceInstanceReferenceDescriptorAsync(req);
		} catch (Exception e) {
			OperationResult<GetServiceInstanceReferenceDescriptorResponseType> res = 
					new OperationResult<GetServiceInstanceReferenceDescriptorResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}	

	/**
	 * GetServiceState
	 * @param callback
	 * @param req
	 */
	public void GetServiceState(IServiceEvents callback, GetServiceStateRequestType req) {
		this.callback = callback;
		GlobalServiceManagementBinding bind = new GlobalServiceManagementBinding(this, 
				getWSurl(url, GlobalServiceManagementBinding.class.getSimpleName()));
		try {
			bind.GetServiceStateAsync(req);
		} catch (Exception e) {
			OperationResult<GetServiceStateResponseType> res = 
					new OperationResult<GetServiceStateResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * DeployService
	 * @param callback
	 * @param req
	 */
	public void DeployService(IServiceEvents callback, DeployServiceRequestType req) {
		this.callback = callback;
		GlobalServiceManagementBinding bind = new GlobalServiceManagementBinding(this, 
				getWSurl(url, GlobalServiceManagementBinding.class.getSimpleName()));
		try {
			bind.DeployServiceAsync(req);
		} catch (Exception e) {
			OperationResult<DeployServiceResponseType> res = 
					new OperationResult<DeployServiceResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * DeployService
	 * @param callback
	 * @param req
	 */
	public void DeployService(IServiceEvents callback, DeployServiceResponseType req) {
		this.callback = callback;
		GlobalServiceManagementCallBackBinding bind = new GlobalServiceManagementCallBackBinding(this, 
				getWSurl(url, GlobalServiceManagementCallBackBinding.class.getSimpleName()));
		try {
			bind.DeployServiceAsync(req);
		} catch (Exception e) {
			OperationResult<LookupServiceInstanceReferenceResponseType> res = 
					new OperationResult<LookupServiceInstanceReferenceResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "DeployService";
			e.printStackTrace();
		}
	}
	
	/**
	 * DeployService
	 * @param callback
	 * @param req
	 */
	public void UpgradeService(IServiceEvents callback, UpgradeServiceResponseType req) {
		this.callback = callback;
		GlobalServiceManagementCallBackBinding bind = new GlobalServiceManagementCallBackBinding(this, 
				getWSurl(url, GlobalServiceManagementCallBackBinding.class.getSimpleName()));
		try {
			bind.UpgradeServiceAsync(req);
		} catch (Exception e) {
			OperationResult<UpgradeServiceResponseType> res = 
					new OperationResult<UpgradeServiceResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "UpgradeService";
			e.printStackTrace();
		}
	}
	
	/**
	 * DeployService
	 * @param callback
	 * @param req
	 */
	public void ExchangeServiceData(IServiceEvents callback, ExchangeServiceDataResponseType req) {
		this.callback = callback;
		GlobalServiceManagementCallBackBinding bind = new GlobalServiceManagementCallBackBinding(this, 
				getWSurl(url, GlobalServiceManagementCallBackBinding.class.getSimpleName()));
		try {
			bind.ExchangeServiceDataAsync(req);
		} catch (Exception e) {
			OperationResult<ExchangeServiceDataResponseType> res = 
					new OperationResult<ExchangeServiceDataResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "ExchangeServiceData";
			e.printStackTrace();
		}
	}

	/**
	 * SuspendOrResumeService //TODO
	 * @param callback
	 * @param req
	 */
//	public void SuspendOrResumeService(IServiceEvents callback, SuspendOrResumeServiceResponse req) {
//		this.callback = callback;
//		GlobalServiceManagementCallBackBinding bind = new GlobalServiceManagementCallBackBinding(this, getWSurl(url, GlobalServiceManagementCallBackBinding.class.getSimpleName()));
//		try {
//			bind.SuspendOrResumeServiceAsync(req);
//		} catch (Exception e) {
//			OperationResult<SuspendOrResumeServiceResponse> res = 
//					new OperationResult<SuspendOrResumeServiceResponse>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = "SuspendOrResumeService";
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * CheckMobileSubscriptionEligibility
	 * @param callback
	 * @param req
	 */
	public void CheckMobileSubscriptionEligibility(IServiceEvents callback, CheckMobileSubscriptionEligibilityRequestType req) {
		this.callback = callback;
		MobileSubscriptionInfoBinding bind = new MobileSubscriptionInfoBinding(this, 
				getWSurl(url, MobileSubscriptionInfoBinding.class.getSimpleName()));
		try {
			bind.CheckMobileSubscriptionEligibilityAsync(req);
		} catch (Exception e) {
			OperationResult<CheckMobileSubscriptionEligibilityResponseType> res = 
					new OperationResult<CheckMobileSubscriptionEligibilityResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	
	/**
	 * GetMobileSubscriptionAlternateIdentifier
	 * @param callback
	 * @param req
	 */
	public void GetMobileSubscriptionAlternateIdentifier(IServiceEvents callback, GetMobileSubscriptionAlternateIdentifierRequestType req) {
		this.callback = callback;
		MobileSubscriptionInfoBinding bind = new MobileSubscriptionInfoBinding(this, getWSurl(url, MobileSubscriptionInfoBinding.class.getSimpleName()));
		try {
			bind.GetMobileSubscriptionAlternateIdentifierAsync(req);
		} catch (Exception e) {
			OperationResult<GetMobileSubscriptionAlternateIdentifierResponseType> res = 
					new OperationResult<GetMobileSubscriptionAlternateIdentifierResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * GetMobileSubscriptionSEIdentifiers //TODO
	 * @param callback
	 * @param req
	 */
//	public void GetMobileSubscriptionSEIdentifiers(IServiceEvents callback, GetMobileSubscriptionSEIdentifiersRequest req) {
//		this.callback = callback;
//		MobileSubscriptionInfoBinding bind = new MobileSubscriptionInfoBinding(this, getWSurl(url, MobileSubscriptionInfoBinding.class.getSimpleName()));
//		try {
//			bind.GetMobileSubscriptionSEIdentifiersAsync(req);
//		} catch (Exception e) {
//			OperationResult<GetMobileSubscriptionSEIdentifiersRequest> res = 
//					new OperationResult<GetMobileSubscriptionSEIdentifiersRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * HandleMobileSubscriptionIdentifierChangedNotification
	 * @param callback
	 * @param req
	 */
	public void HandleMobileSubscriptionIdentifierChangedNotification(IServiceEvents callback, HandleMobileSubscriptionIdentifierChangedNotificationRequestType req) {
		this.callback = callback;
		MobileSubscriptionLifeCycleNotificationBinding bind = new MobileSubscriptionLifeCycleNotificationBinding(this, 
				getWSurl(url, MobileSubscriptionLifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleMobileSubscriptionIdentifierChangedNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleMobileSubscriptionIdentifierChangedNotificationRequestType> res = 
					new OperationResult<HandleMobileSubscriptionIdentifierChangedNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * HandleMobileSubscriptionStatusChangeNotification //TODO
	 * @param callback
	 * @param req
	 */
//	public void HandleMobileSubscriptionStatusChangeNotification(IServiceEvents callback, HandleMobileSubscriptionStatusChangeNotificationRequest req) {
//		this.callback = callback;
//		MobileSubscriptionLifeCycleNotificationBinding bind = new MobileSubscriptionLifeCycleNotificationBinding(this, getWSurl(url, MobileSubscriptionLifeCycleNotificationBinding.class.getSimpleName()));
//		try {
//			bind.HandleMobileSubscriptionStatusChangeNotificationAsync(req);
//		} catch (Exception e) {
//			OperationResult<HandleMobileSubscriptionStatusChangeNotificationRequest> res = 
//					new OperationResult<HandleMobileSubscriptionStatusChangeNotificationRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}	
	
	/**
	 * BeginConversation
	 * @param callback
	 * @param req
	 */
	public void BeginConversation(IServiceEvents callback, BeginConversationRequestType req) {
		this.callback = callback;
		ScriptSendingBinding bind = new ScriptSendingBinding(this, 
				getWSurl(url, ScriptSendingBinding.class.getSimpleName()));
		try {
			bind.BeginConversationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleMobileSubscriptionIdentifierChangedNotificationRequestType> res = 
					new OperationResult<HandleMobileSubscriptionIdentifierChangedNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * SendScript
	 * @param callback
	 * @param req
	 */
	public void SendScript(IServiceEvents callback, SendScriptRequestType req) {
		this.callback = callback;
		ScriptSendingBinding bind = new ScriptSendingBinding(this, 
				getWSurl(url, ScriptSendingBinding.class.getSimpleName()));
		try {
			bind.SendScriptAsync(req);
		} catch (Exception e) {
			OperationResult<SendScriptRequestType> res = 
					new OperationResult<SendScriptRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
	
	/**
	 * EndConversation //TODO
	 * @param callback
	 * @param req
	 */
//	public void EndConversation(IServiceEvents callback, EndConversationRequest req) {
//		this.callback = callback;
//		ScriptSendingBinding bind = new ScriptSendingBinding(this, getWSurl(url, ScriptSendingBinding.class.getSimpleName()));
//		try {
//			bind.EndConversationAsync(req);
//		} catch (Exception e) {
//			OperationResult<EndConversationRequest> res = 
//					new OperationResult<EndConversationRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	
	/**
	 * BeginConversation
	 * @param callback
	 * @param req
	 */
	public void BeginConversation(IServiceEvents callback, BeginConversationResponseType req) {
		this.callback = callback;
		ScriptSendingCallBackBinding bind = new ScriptSendingCallBackBinding(this, 
				getWSurl(url, ScriptSendingCallBackBinding.class.getSimpleName()));
		try {
			bind.BeginConversationAsync(req);
		} catch (Exception e) {
			OperationResult<BeginConversationResponseType> res = 
					new OperationResult<BeginConversationResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "BeginConversation";
			e.printStackTrace();
		}
	}
	
	/**
	 * SendScript //TODO
	 * @param callback
	 * @param req
	 */
//	public void SendScript(IServiceEvents callback, SendScriptResponse req) {
//		this.callback = callback;
//		ScriptSendingCallBackBinding bind = new ScriptSendingCallBackBinding(this, getWSurl(url, ScriptSendingCallBackBinding.class.getSimpleName()));
//		try {
//			bind.SendScriptAsync(req);
//		} catch (Exception e) {
//			OperationResult<SendScriptResponse> res = 
//					new OperationResult<SendScriptResponse>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = "SendScript";
//			e.printStackTrace();
//		}
//	}	

	/**
	 * LoadSCWSServicePortal
	 * @param callback
	 * @param req
	 */
	public void LoadSCWSServicePortal(IServiceEvents callback, LoadSCWSServicePortalRequestType req) {
		this.callback = callback;
		SCWSManagementBinding bind = new SCWSManagementBinding(this, 
				getWSurl(url, SCWSManagementBinding.class.getSimpleName()));
		try {
			bind.LoadSCWSServicePortalAsync(req);
		} catch (Exception e) {
			OperationResult<LoadSCWSServicePortalResponseType> res = 
					new OperationResult<LoadSCWSServicePortalResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * DeleteSCWSServicePortal //TODO
	 * @param callback
	 * @param req
	 */
//	public void DeleteSCWSServicePortal(IServiceEvents callback, DeleteSCWSServicePortalRequest req) {
//		this.callback = callback;
//		SCWSManagementBinding bind = new SCWSManagementBinding(this, getWSurl(url, SCWSManagementBinding.class.getSimpleName()));
//		try {
//			bind.DeleteSCWSServicePortalAsync(req);
//		} catch (Exception e) {
//			OperationResult<DeleteSCWSServicePortalRequest> res = 
//					new OperationResult<DeleteSCWSServicePortalRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * LoadSCWSServicePortal
	 * @param callback
	 * @param req
	 */
	public void LoadSCWSServicePortal(IServiceEvents callback, LoadSCWSServicePortalResponseType req) {
		this.callback = callback;
		SCWSManagementCallBackBinding bind = new SCWSManagementCallBackBinding(this, 
				getWSurl(url, SCWSManagementCallBackBinding.class.getSimpleName()));
		try {
			bind.LoadSCWSServicePortalAsync(req);
		} catch (Exception e) {
			OperationResult<LoadSCWSServicePortalResponseType> res = 
					new OperationResult<LoadSCWSServicePortalResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "LoadSCWSServicePortal";
			e.printStackTrace();
		}
	}
	
	/**
	 * DeleteSCWSServicePortal //TODO
	 * @param callback
	 * @param req
	 */
//	public void DeleteSCWSServicePortal(IServiceEvents callback, DeleteSCWSServicePortalResponse req) {
//	this.callback = callback;
//	SCWSManagementCallBackBinding bind = new SCWSManagementCallBackBinding(this, getWSurl(url, SCWSManagementCallBackBinding.class.getSimpleName()));
//	try {
//		bind.DeleteSCWSServicePortalAsync(req);
//	} catch (Exception e) {
//		OperationResult<DeleteSCWSServicePortalResponse> res = 
//				new OperationResult<DeleteSCWSServicePortalResponse>();
//		res.Exception = e;
//		res.Result = null;
//		res.MethodName = "DeleteSCWSServicePortal";
//		e.printStackTrace();
//	}
//}	
	
	/**
	 * GetApplicationOrELFStatus
	 * @param callback
	 * @param req
	 */
	public void GetApplicationOrELFStatus(IServiceEvents callback, GetApplicationOrELFStatusRequestType req) {
		this.callback = callback;
		SEAuditBinding bind = new SEAuditBinding(this, 
				getWSurl(url, SEAuditBinding.class.getSimpleName()));
		try {
			bind.GetApplicationOrELFStatusAsync(req);
		} catch (Exception e) {
			OperationResult<GetApplicationOrELFStatusResponseType> res = 
					new OperationResult<GetApplicationOrELFStatusResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "GetApplicationOrELFStatus";
			e.printStackTrace();
		}
	}

	/**
	 * GetSDFreeMemory //TODO
	 * @param callback
	 * @param req
	 */
//	public void GetSDFreeMemory(IServiceEvents callback, GetSDFreeMemoryRequest req) {
//		this.callback = callback;
//		SEAuditBinding bind = new SEAuditBinding(this, getWSurl(url, SEAuditBinding.class.getSimpleName()));
//		try {
//			bind.GetSDFreeMemoryAsync(req);
//		} catch (Exception e) {
//			OperationResult<GetSDFreeMemoryRequest> res = 
//					new OperationResult<GetSDFreeMemoryRequest>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * GetApplicationOrELFStatus
	 * @param callback
	 * @param req
	 */
	public void GetApplicationOrELFStatus(IServiceEvents callback, GetApplicationOrELFStatusResponseType req) {
		this.callback = callback;
		SEAuditCallBackBinding bind = new SEAuditCallBackBinding(this, 
				getWSurl(url, SEAuditCallBackBinding.class.getSimpleName()));
		try {
			bind.GetApplicationOrELFStatusAsync(req);
		} catch (Exception e) {
			OperationResult<GetApplicationOrELFStatusResponseType> res = 
					new OperationResult<GetApplicationOrELFStatusResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = "GetApplicationOrELFStatus";
			e.printStackTrace();
		}
	}
	
	/**
	 * GetSDFreeMemory //TODO
	 * @param callback
	 * @param req
	 */
//	public void GetSDFreeMemory(IServiceEvents callback, GetSDFreeMemoryResponse req) {
//	this.callback = callback;
//	SEAuditCallBackBinding bind = new SEAuditCallBackBinding(this, getWSurl(url, SEAuditCallBackBinding.class.getSimpleName()));
//	try {
//		bind.GetSDFreeMemoryAsync(req);
//	} catch (Exception e) {
//		OperationResult<GetSDFreeMemoryResponse> res = 
//				new OperationResult<GetSDFreeMemoryResponse>();
//		res.Exception = e;
//		res.Result = null;
//		res.MethodName = "GetSDFreeMemory";
//		e.printStackTrace();
//	}
//}	
		
	/**
	 * GetSECapabilityProfileId
	 * @param callback
	 * @param req
	 */
	public void GetSECapabilityProfileId(IServiceEvents callback, GetSECapabilityProfileIdRequestType req) {
		this.callback = callback;
		SEInfoBinding bind = new SEInfoBinding(this, 
				getWSurl(url, SEInfoBinding.class.getSimpleName()));
		try {
			bind.GetSECapabilityProfileIdAsync(req);
		} catch (Exception e) {
			OperationResult<GetSECapabilityProfileIdResponseType> res = 
					new OperationResult<GetSECapabilityProfileIdResponseType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
		
	/**
	 * GetSEMobileSubscriptionIdentifier //TODO
	 * @param callback
	 * @param req
	 */
//	public void GetSEMobileSubscriptionIdentifier(IServiceEvents callback, GetSEMobileSubscriptionIdentifierRequestType req) {
//		this.callback = callback;
//		SEInfoBinding bind = new SEInfoBinding(this, getWSurl(url, SEInfoBinding.class.getSimpleName()));
//		try {
//			bind.GetSEMobileSubscriptionIdentifierAsync(req);
//		} catch (Exception e) {
//			OperationResult<GetSEMobileSubscriptionIdentifierRequestType> res = 
//					new OperationResult<GetSEMobileSubscriptionIdentifierRequestType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * HandleSERenewalNotification
	 * @param callback
	 * @param req
	 */
	public void HandleSERenewalNotification(IServiceEvents callback, HandleSERenewalNotificationRequestType req) {
		this.callback = callback;
		SELifeCycleNotificationBinding bind = new SELifeCycleNotificationBinding(this, 
				getWSurl(url, SELifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleSERenewalNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleSERenewalNotificationRequestType> res = 
					new OperationResult<HandleSERenewalNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
		
	/**
	 * HandleSEDeviceChangedNotification
	 * @param callback
	 * @param req
	 */
	public void HandleSEDeviceChangedNotification(IServiceEvents callback, HandleSEDeviceChangedNotificationRequestType req) {
		this.callback = callback;
		SELifeCycleNotificationBinding bind = new SELifeCycleNotificationBinding(this, 
				getWSurl(url, SELifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleSEDeviceChangedNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleSEDeviceChangedNotificationRequestType> res = 
					new OperationResult<HandleSEDeviceChangedNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}
		
	/**
	 * HandleSEDeviceStatusChangeNotification
	 * @param callback
	 * @param req
	 */
	public void HandleSEDeviceStatusChangeNotification(IServiceEvents callback, HandleSEDeviceStatusChangeNotificationRequestType req) {
		this.callback = callback;
		SELifeCycleNotificationBinding bind = new SELifeCycleNotificationBinding(this, 
				getWSurl(url, SELifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleSEDeviceStatusChangeNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleSEDeviceStatusChangeNotificationRequestType> res = 
					new OperationResult<HandleSEDeviceStatusChangeNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * HandleSEMobileSubscriptionChangedNotification //TODO
	 * @param callback
	 * @param req
	 */
//	public void HandleSEMobileSubscriptionChangedNotification(IServiceEvents callback, HandleSEMobileSubscriptionChangedNotificationRequestType req) {
//		this.callback = callback;
//		SELifeCycleNotificationBinding bind = new SELifeCycleNotificationBinding(this, getWSurl(url, SELifeCycleNotificationBinding.class.getSimpleName()));
//		try {
//			bind.HandleSEMobileSubscriptionChangedNotificationAsync(req);
//		} catch (Exception e) {
//			OperationResult<HandleSEMobileSubscriptionChangedNotificationRequestType> res = 
//					new OperationResult<HandleSEMobileSubscriptionChangedNotificationRequestType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}	

	/**
	 * HandleSEStatusChangeNotification //TODO
	 * @param callback
	 * @param req
	 */
//	public void HandleSEStatusChangeNotification(IServiceEvents callback, HandleSEStatusChangeNotificationRequestType req) {
//		this.callback = callback;
//		SELifeCycleNotificationBinding bind = new SELifeCycleNotificationBinding(this, getWSurl(url, SELifeCycleNotificationBinding.class.getSimpleName()));
//		try {
//			bind.HandleSEStatusChangeNotificationAsync(req);
//		} catch (Exception e) {
//			OperationResult<HandleSEStatusChangeNotificationRequestType> res = 
//					new OperationResult<HandleSEStatusChangeNotificationRequestType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}	
	
	/**
	 * HandleServiceEnvironmentChangeNotification
	 * @param callback
	 * @param req
	 */
	public void HandleServiceEnvironmentChangeNotification(IServiceEvents callback, HandleServiceEnvironmentChangeNotificationRequestType req) {
		this.callback = callback;
		ServiceEnvironmentChangeNotificationBinding bind = new ServiceEnvironmentChangeNotificationBinding(this, 
				getWSurl(url, ServiceEnvironmentChangeNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleServiceEnvironmentChangeNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleServiceEnvironmentChangeNotificationRequestType> res = 
					new OperationResult<HandleServiceEnvironmentChangeNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * HandleActionDoneOnServiceNotification //TODO
	 * @param callback
	 * @param req
	 */
//	public void HandleActionDoneOnServiceNotification(IServiceEvents callback, HandleActionDoneOnServiceNotificationRequestType req) {
//		this.callback = callback;
//		ServiceEnvironmentChangeNotificationBinding bind = new ServiceEnvironmentChangeNotificationBinding(this, getWSurl(url, ServiceEnvironmentChangeNotificationBinding.class.getSimpleName()));
//		try {
//			bind.HandleActionDoneOnServiceNotificationAsync(req);
//		} catch (Exception e) {
//			OperationResult<HandleActionDoneOnServiceNotificationRequestType> res = 
//					new OperationResult<HandleActionDoneOnServiceNotificationRequestType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}

	/**
	 * HandleStartServiceStateChangeNotification
	 * @param callback
	 * @param req
	 */
	public void HandleStartServiceStateChangeNotification(IServiceEvents callback, HandleStartServiceStateChangeNotificationRequestType req) {
		this.callback = callback;
		ServiceLifeCycleNotificationBinding bind = new ServiceLifeCycleNotificationBinding(this, 
				getWSurl(url, ServiceLifeCycleNotificationBinding.class.getSimpleName()));
		try {
			bind.HandleStartServiceStateChangeNotificationAsync(req);
		} catch (Exception e) {
			OperationResult<HandleStartServiceStateChangeNotificationRequestType> res = 
					new OperationResult<HandleStartServiceStateChangeNotificationRequestType>();
			res.Exception = e;
			res.Result = null;
			res.MethodName = req.FunctionCallIdentifier;
			e.printStackTrace();
		}
	}

	/**
	 * HandleEndServiceStateChangeNotification //TODO
	 * @param <T>
	 * @param callback
	 * @param req
	 */
//	public void HandleEndServiceStateChangeNotification(IServiceEvents callback, HandleEndServiceStateChangeNotificationRequestType req) {
//		this.callback = callback;
//		ServiceLifeCycleNotificationBinding bind = new ServiceLifeCycleNotificationBinding(this, getWSurl(url, ServiceLifeCycleNotificationBinding.class.getSimpleName()));
//		try {
//			bind.HandleEndServiceStateChangeNotificationAsync(req);
//		} catch (Exception e) {
//			OperationResult<HandleEndServiceStateChangeNotificationRequestType> res = 
//					new OperationResult<HandleEndServiceStateChangeNotificationRequestType>();
//			res.Exception = e;
//			res.Result = null;
//			res.MethodName = req.FunctionCallIdentifier;
//			e.printStackTrace();
//		}
//	}	
	
	
	/**
	 * Callback: starting
	 */
	@Override
	public void Starting() {
		callback.Starting();
	}

	/**
	 * Callback: completed
	 */
	@Override
	public void Completed(OperationResult result) {
		callback.Completed(result);
	}
}
