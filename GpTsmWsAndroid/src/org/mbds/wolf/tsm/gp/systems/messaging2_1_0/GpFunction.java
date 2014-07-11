package org.mbds.wolf.tsm.gp.systems.messaging2_1_0;

public enum GpFunction {
	///////////////CONTROL FUNCTIONS
	/////Eligibility check //
	CheckGlobalEligibility("CheckGlobalEligibility"),
	GetDeviceCapabilityProfileId("GetDeviceCapabilityProfileId"),
	GetSECapabilityProfileId("GetSECapabilityProfileId"),
	CheckMobileSubscriptionEligibility("CheckMobileSubscriptionEligibility"),
	//////Service management life cycle notifications //
	HandleStartServiceStateChangeNotification("HandleStartServiceStateChangeNotification"),
	HandleEndServiceStateChangeNotification("HandleEndServiceStateChangeNotification"),
	//////Mobile subscription life cycle //
	GetMobileSubscriptionAlternateIdentifier("GetMobileSubscriptionAlternateIdentifier"),
	GetSEMobileSubscriptionIdentifier("GetSEMobileSubscriptionIdentifier"),
	GetMobileSubscriptionSEIdentifiers("GetMobileSubscriptionSEIdentifiers"),
	HandleMobileSubscriptionIdentifierChangedNotification("HandleMobileSubscriptionIdentifierChangedNotification"),
	HandleMobileSubscriptionStatusChangeNotification("HandleMobileSubscriptionStatusChangeNotification"),
	HandleSERenewalNotification("HandleSERenewalNotification"),
	//////SE subscription life cycle //
	HandleSEDeviceChangedNotification("HandleSEDeviceChangedNotification"),
	HandleSEDeviceStatusChangeNotification("HandleSEDeviceStatusChangeNotification"),
	HandleSEMobileSubscriptionChangedNotification("HandleSEMobileSubscriptionChangedNotification"),
	HandleSEStatusChangeNotification("HandleSEStatusChangeNotification"),
	////////////////Functions for Global Mobile-NFC Service Management
	/////Service Deployment Function
	LookupServiceInstanceReference("LookupServiceInstanceReference"),
	DeclareServiceInstanceReference("DeclareServiceInstanceReference"),
	GetServiceInstanceReferenceDescriptor("GetServiceInstanceReferenceDescriptor"),
	GetServiceState("GetServiceState"),
	DeployService("DeployService"),
	UpgradeService("UpgradeService"),
	ExchangeServiceData("ExchangeServiceData"),
	SuspendOrResumeService("SuspendOrResumeService"),
	TerminateService("TerminateService"),
	/////////////Service Environment Change
	HandleServiceEnvironmentChangeNotification("HandleServiceEnvironmentChangeNotification"),
	HandleActionDoneOnServiceNotification("HandleActionDoneOnServiceNotification"),
	///////////////Functions for CCCM Certificate Management
	EnrollSSDOwnerCertificate("EnrollSSDOwnerCertificate"),
	GetCAInformation("GetCAInformation"), //AuditCAInformation
	/////////////////////Functions for the Secure Element Content Management
	////////SE Card Content Management Functions for Simple Mode
	////SE Commands
	SECommandsGenerationAndRemoteExecution("SECommandsGenerationAndRemoteExecution"),
	////////Delegated Management Functions
	GenerateDMToken("GenerateDMToken"),
	VerifyDMReceipt("VerifyDMReceipt"),
	/////Scripts Sending Functions
	BeginConversation("BeginConversation"),
	SendScript("SendScript"),
	EndConversation("EndConversation"),
	/////SE Commands Results
	GetApplicationOrELFStatus("GetApplicationOrELFStatus"),
	////////SE Audit Functions
	GetSDFreeMemory("GetSDFreeMemory"),
	////SCWS Service Portal Functions
	LoadSCWSServicePortal("LoadSCWSServicePortal"),
	DeleteSCWSServicePortal("DeleteSCWSServicePortal"),
	///////Functions for the Device Applications Management
	LoadDeviceApplication("LoadDeviceApplication"),
	//////////WSDL BINDING
	BindDeviceApplicationToSEApplication("BindDeviceApplicationToSEApplication"),
	UnbindDeviceApplicationToSEApplication("UnbindDeviceApplicationToSEApplication"),
	HandleActionDoneOnDeviceApplicationNotification("HandleActionDoneOnDeviceApplicationNotification")
	;

	String function; 
	public String getFunction(){
		return function;
	}
	private GpFunction(String function) {
		this.function = function;
	}

}
