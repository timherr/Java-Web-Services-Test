/**
 * MathServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package client;

import util.Util;

/*
 *  MathServiceStub java implementation
 */

public class MathServiceStub extends org.apache.axis2.client.Stub
{
	protected org.apache.axis2.description.AxisOperation[]	_operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap								faultExceptionNameMap		= new java.util.HashMap();
	private java.util.HashMap								faultExceptionClassNameMap	= new java.util.HashMap();
	private java.util.HashMap								faultMessageMap				= new java.util.HashMap();

	private static int										counter						= 0;

	private static synchronized java.lang.String getUniqueSuffix()
	{
		// reset the counter if it is greater than 99999
		if (counter > 99999)
		{
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault
	{

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("MathService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[2];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service", "add2Ints"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service", "multiply2Ints"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

	}

	// populates the faults
	private void populateFaults()
	{

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public MathServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault
	{
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public MathServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault
	{
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public MathServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault
	{
		this(configurationContext, "http://" + Util.getHostAndPort() + "/SandboxService/services/MathService.MathServiceHttpSoap11Endpoint/");
		//this(configurationContext, "http://localhost:8080/SandboxService/services/MathService.MathServiceHttpSoap11Endpoint/");
	}

	/**
	 * Default Constructor
	 */
	public MathServiceStub() throws org.apache.axis2.AxisFault
	{
		this("http://" + Util.getHostAndPort() + "/SandboxService/services/MathService.MathServiceHttpSoap11Endpoint/");
		//this("http://localhost:8080/SandboxService/services/MathService.MathServiceHttpSoap11Endpoint/");
	}

	/**
	 * Constructor taking the target endpoint
	 */
	public MathServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault
	{
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see client.MathService#add2Ints
	 * @param add2Ints0
	 */

	public client.MathServiceStub.Add2IntsResponse add2Ints(

	client.MathServiceStub.Add2Ints add2Ints0)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try
		{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:add2Ints");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), add2Ints0, optimizeContent(new javax.xml.namespace.QName("http://service", "add2Ints")), new javax.xml.namespace.QName("http://service", "add2Ints"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), client.MathServiceStub.Add2IntsResponse.class, getEnvelopeNamespaces(_returnEnv));

			return (client.MathServiceStub.Add2IntsResponse) object;

		}
		catch (org.apache.axis2.AxisFault f)
		{

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null)
			{
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints")))
				{
					// make the fault by reflection
					try
					{
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}
					catch (java.lang.ClassCastException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.ClassNotFoundException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.NoSuchMethodException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.reflect.InvocationTargetException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.IllegalAccessException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.InstantiationException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				}
				else
				{
					throw f;
				}
			}
			else
			{
				throw f;
			}
		}
		finally
		{
			if (_messageContext.getTransportOut() != null)
			{
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see client.MathService#startadd2Ints
	 * @param add2Ints0
	 */
	public void startadd2Ints(

	client.MathServiceStub.Add2Ints add2Ints0,

	final client.MathServiceCallbackHandler callback)

	throws java.rmi.RemoteException
	{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:add2Ints");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), add2Ints0, optimizeContent(new javax.xml.namespace.QName("http://service", "add2Ints")), new javax.xml.namespace.QName("http://service", "add2Ints"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext)
			{
				try
				{
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), client.MathServiceStub.Add2IntsResponse.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultadd2Ints((client.MathServiceStub.Add2IntsResponse) object);

				}
				catch (org.apache.axis2.AxisFault e)
				{
					callback.receiveErroradd2Ints(e);
				}
			}

			public void onError(java.lang.Exception error)
			{
				if (error instanceof org.apache.axis2.AxisFault)
				{
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null)
					{
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints")))
						{
							// make the fault by reflection
							try
							{
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "add2Ints"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroradd2Ints(new java.rmi.RemoteException(ex.getMessage(), ex));
							}
							catch (java.lang.ClassCastException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (java.lang.ClassNotFoundException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (java.lang.NoSuchMethodException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (java.lang.reflect.InvocationTargetException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (java.lang.IllegalAccessException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (java.lang.InstantiationException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
							catch (org.apache.axis2.AxisFault e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroradd2Ints(f);
							}
						}
						else
						{
							callback.receiveErroradd2Ints(f);
						}
					}
					else
					{
						callback.receiveErroradd2Ints(f);
					}
				}
				else
				{
					callback.receiveErroradd2Ints(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext)
			{
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete()
			{
				try
				{
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				}
				catch (org.apache.axis2.AxisFault axisFault)
				{
					callback.receiveErroradd2Ints(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener())
		{
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see client.MathService#multiply2Ints
	 * @param multiply2Ints2
	 */

	public client.MathServiceStub.Multiply2IntsResponse multiply2Ints(

	client.MathServiceStub.Multiply2Ints multiply2Ints2)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try
		{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("urn:multiply2Ints");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), multiply2Ints2, optimizeContent(new javax.xml.namespace.QName("http://service", "multiply2Ints")), new javax.xml.namespace.QName("http://service", "multiply2Ints"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), client.MathServiceStub.Multiply2IntsResponse.class, getEnvelopeNamespaces(_returnEnv));

			return (client.MathServiceStub.Multiply2IntsResponse) object;

		}
		catch (org.apache.axis2.AxisFault f)
		{

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null)
			{
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints")))
				{
					// make the fault by reflection
					try
					{
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}
					catch (java.lang.ClassCastException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.ClassNotFoundException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.NoSuchMethodException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.reflect.InvocationTargetException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.IllegalAccessException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
					catch (java.lang.InstantiationException e)
					{
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				}
				else
				{
					throw f;
				}
			}
			else
			{
				throw f;
			}
		}
		finally
		{
			if (_messageContext.getTransportOut() != null)
			{
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see client.MathService#startmultiply2Ints
	 * @param multiply2Ints2
	 */
	public void startmultiply2Ints(

	client.MathServiceStub.Multiply2Ints multiply2Ints2,

	final client.MathServiceCallbackHandler callback)

	throws java.rmi.RemoteException
	{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:multiply2Ints");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), multiply2Ints2, optimizeContent(new javax.xml.namespace.QName("http://service", "multiply2Ints")), new javax.xml.namespace.QName("http://service", "multiply2Ints"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext)
			{
				try
				{
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), client.MathServiceStub.Multiply2IntsResponse.class, getEnvelopeNamespaces(resultEnv));
					callback.receiveResultmultiply2Ints((client.MathServiceStub.Multiply2IntsResponse) object);

				}
				catch (org.apache.axis2.AxisFault e)
				{
					callback.receiveErrormultiply2Ints(e);
				}
			}

			public void onError(java.lang.Exception error)
			{
				if (error instanceof org.apache.axis2.AxisFault)
				{
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null)
					{
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints")))
						{
							// make the fault by reflection
							try
							{
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "multiply2Ints"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrormultiply2Ints(new java.rmi.RemoteException(ex.getMessage(), ex));
							}
							catch (java.lang.ClassCastException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (java.lang.ClassNotFoundException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (java.lang.NoSuchMethodException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (java.lang.reflect.InvocationTargetException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (java.lang.IllegalAccessException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (java.lang.InstantiationException e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
							catch (org.apache.axis2.AxisFault e)
							{
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrormultiply2Ints(f);
							}
						}
						else
						{
							callback.receiveErrormultiply2Ints(f);
						}
					}
					else
					{
						callback.receiveErrormultiply2Ints(f);
					}
				}
				else
				{
					callback.receiveErrormultiply2Ints(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext)
			{
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete()
			{
				try
				{
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				}
				catch (org.apache.axis2.AxisFault axisFault)
				{
					callback.receiveErrormultiply2Ints(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener())
		{
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env)
	{
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext())
		{
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[]	opNameArray	= null;

	private boolean optimizeContent(javax.xml.namespace.QName opName)
	{

		if (opNameArray == null)
		{
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++)
		{
			if (opName.equals(opNameArray[i]))
			{
				return true;
			}
		}
		return false;
	}

	// http://localhost:8081/SandboxService/services/MathService.MathServiceHttpSoap11Endpoint/
	public static class ExtensionMapper
	{

		public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName, javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
		{

			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class Multiply2Ints implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName	MY_QNAME			= new javax.xml.namespace.QName("http://service", "multiply2Ints", "ns2");

		/**
		 * field for Val1
		 */

		protected int									localVal1;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean								localVal1Tracker	= false;

		public boolean isVal1Specified()
		{
			return localVal1Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getVal1()
		{
			return localVal1;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Val1
		 */
		public void setVal1(int param)
		{

			// setting primitive attribute tracker to true
			localVal1Tracker = param != java.lang.Integer.MIN_VALUE;

			this.localVal1 = param;

		}

		/**
		 * field for Val2
		 */

		protected int		localVal2;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean	localVal2Tracker	= false;

		public boolean isVal2Specified()
		{
			return localVal2Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getVal2()
		{
			return localVal2;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Val2
		 */
		public void setVal2(int param)
		{

			// setting primitive attribute tracker to true
			localVal2Tracker = param != java.lang.Integer.MIN_VALUE;

			this.localVal2 = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType)
			{

				java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://service");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0))
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":multiply2Ints", xmlWriter);
				}
				else
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "multiply2Ints", xmlWriter);
				}

			}
			if (localVal1Tracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "val1", xmlWriter);

				if (localVal1 == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("val1 cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal1));
				}

				xmlWriter.writeEndElement();
			}
			if (localVal2Tracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "val2", xmlWriter);

				if (localVal2 == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("val2 cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal2));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace)
		{
			if (namespace.equals("http://service"))
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null)
			{
				xmlWriter.writeStartElement(namespace, localPart);
			}
			else
			{
				if (namespace.length() == 0)
				{
					prefix = "";
				}
				else if (prefix == null)
				{
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (xmlWriter.getPrefix(namespace) == null)
			{
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null)
			{
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0)
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attributeValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null)
			{
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null)
				{
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0)
				{
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			}
			else
			{
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			if (qnames != null)
			{
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++)
				{
					if (i > 0)
					{
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null)
					{
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0))
						{
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0)
						{
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
						else
						{
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					else
					{
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null)
			{
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true)
				{
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0)
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localVal1Tracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "val1"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal1));
			}
			if (localVal2Tracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "val2"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal2));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Multiply2Ints parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
			{
				Multiply2Ints object = new Multiply2Ints();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null)
					{
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null)
						{
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1)
							{
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"multiply2Ints".equals(type))
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Multiply2Ints) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "val1").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.setVal1(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.setVal1(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "val2").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.setVal2(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.setVal2(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

				}
				catch (javax.xml.stream.XMLStreamException e)
				{
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Add2IntsResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName	MY_QNAME			= new javax.xml.namespace.QName("http://service", "add2IntsResponse", "ns2");

		/**
		 * field for _return
		 */

		protected int									local_return;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean								local_returnTracker	= false;

		public boolean is_returnSpecified()
		{
			return local_returnTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int get_return()
		{
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            _return
		 */
		public void set_return(int param)
		{

			// setting primitive attribute tracker to true
			local_returnTracker = param != java.lang.Integer.MIN_VALUE;

			this.local_return = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType)
			{

				java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://service");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0))
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":add2IntsResponse", xmlWriter);
				}
				else
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "add2IntsResponse", xmlWriter);
				}

			}
			if (local_returnTracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "return", xmlWriter);

				if (local_return == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace)
		{
			if (namespace.equals("http://service"))
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null)
			{
				xmlWriter.writeStartElement(namespace, localPart);
			}
			else
			{
				if (namespace.length() == 0)
				{
					prefix = "";
				}
				else if (prefix == null)
				{
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (xmlWriter.getPrefix(namespace) == null)
			{
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null)
			{
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0)
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attributeValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null)
			{
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null)
				{
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0)
				{
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			}
			else
			{
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			if (qnames != null)
			{
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++)
				{
					if (i > 0)
					{
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null)
					{
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0))
						{
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0)
						{
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
						else
						{
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					else
					{
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null)
			{
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true)
				{
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0)
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "return"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Add2IntsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
			{
				Add2IntsResponse object = new Add2IntsResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null)
					{
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null)
						{
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1)
							{
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"add2IntsResponse".equals(type))
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Add2IntsResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "return").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.set_return(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

				}
				catch (javax.xml.stream.XMLStreamException e)
				{
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Multiply2IntsResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName	MY_QNAME			= new javax.xml.namespace.QName("http://service", "multiply2IntsResponse", "ns2");

		/**
		 * field for _return
		 */

		protected int									local_return;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean								local_returnTracker	= false;

		public boolean is_returnSpecified()
		{
			return local_returnTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int get_return()
		{
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            _return
		 */
		public void set_return(int param)
		{

			// setting primitive attribute tracker to true
			local_returnTracker = param != java.lang.Integer.MIN_VALUE;

			this.local_return = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType)
			{

				java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://service");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0))
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":multiply2IntsResponse", xmlWriter);
				}
				else
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "multiply2IntsResponse", xmlWriter);
				}

			}
			if (local_returnTracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "return", xmlWriter);

				if (local_return == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace)
		{
			if (namespace.equals("http://service"))
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null)
			{
				xmlWriter.writeStartElement(namespace, localPart);
			}
			else
			{
				if (namespace.length() == 0)
				{
					prefix = "";
				}
				else if (prefix == null)
				{
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (xmlWriter.getPrefix(namespace) == null)
			{
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null)
			{
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0)
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attributeValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null)
			{
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null)
				{
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0)
				{
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			}
			else
			{
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			if (qnames != null)
			{
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++)
				{
					if (i > 0)
					{
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null)
					{
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0))
						{
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0)
						{
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
						else
						{
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					else
					{
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null)
			{
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true)
				{
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0)
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "return"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Multiply2IntsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
			{
				Multiply2IntsResponse object = new Multiply2IntsResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null)
					{
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null)
						{
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1)
							{
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"multiply2IntsResponse".equals(type))
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Multiply2IntsResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "return").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.set_return(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

				}
				catch (javax.xml.stream.XMLStreamException e)
				{
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Add2Ints implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName	MY_QNAME			= new javax.xml.namespace.QName("http://service", "add2Ints", "ns2");

		/**
		 * field for Val1
		 */

		protected int									localVal1;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean								localVal1Tracker	= false;

		public boolean isVal1Specified()
		{
			return localVal1Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getVal1()
		{
			return localVal1;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Val1
		 */
		public void setVal1(int param)
		{

			// setting primitive attribute tracker to true
			localVal1Tracker = param != java.lang.Integer.MIN_VALUE;

			this.localVal1 = param;

		}

		/**
		 * field for Val2
		 */

		protected int		localVal2;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean	localVal2Tracker	= false;

		public boolean isVal2Specified()
		{
			return localVal2Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getVal2()
		{
			return localVal2;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Val2
		 */
		public void setVal2(int param)
		{

			// setting primitive attribute tracker to true
			localVal2Tracker = param != java.lang.Integer.MIN_VALUE;

			this.localVal2 = param;

		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType)
			{

				java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://service");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0))
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":add2Ints", xmlWriter);
				}
				else
				{
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "add2Ints", xmlWriter);
				}

			}
			if (localVal1Tracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "val1", xmlWriter);

				if (localVal1 == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("val1 cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal1));
				}

				xmlWriter.writeEndElement();
			}
			if (localVal2Tracker)
			{
				namespace = "http://service";
				writeStartElement(null, namespace, "val2", xmlWriter);

				if (localVal2 == java.lang.Integer.MIN_VALUE)
				{

					throw new org.apache.axis2.databinding.ADBException("val2 cannot be null!!");

				}
				else
				{
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal2));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix(java.lang.String namespace)
		{
			if (namespace.equals("http://service"))
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null)
			{
				xmlWriter.writeStartElement(namespace, localPart);
			}
			else
			{
				if (namespace.length() == 0)
				{
					prefix = "";
				}
				else if (prefix == null)
				{
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (xmlWriter.getPrefix(namespace) == null)
			{
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null)
			{
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0)
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals(""))
			{
				xmlWriter.writeAttribute(attName, attributeValue);
			}
			else
			{
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null)
			{
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null)
				{
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0)
				{
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			}
			else
			{
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException
		{

			if (qnames != null)
			{
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++)
				{
					if (i > 0)
					{
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null)
					{
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0))
						{
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0)
						{
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
						else
						{
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					else
					{
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null)
			{
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true)
				{
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0)
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localVal1Tracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "val1"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal1));
			}
			if (localVal2Tracker)
			{
				elementList.add(new javax.xml.namespace.QName("http://service", "val2"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVal2));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Add2Ints parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception
			{
				Add2Ints object = new Add2Ints();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null)
					{
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null)
						{
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1)
							{
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"add2Ints".equals(type))
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Add2Ints) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "val1").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.setVal1(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.setVal1(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://service", "val2").equals(reader.getName()))
					{

						java.lang.String content = reader.getElementText();

						object.setVal2(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else
					{

						object.setVal2(java.lang.Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

				}
				catch (javax.xml.stream.XMLStreamException e)
				{
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	private org.apache.axiom.om.OMElement toOM(client.MathServiceStub.Add2Ints param, boolean optimizeContent) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement(client.MathServiceStub.Add2Ints.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(client.MathServiceStub.Add2IntsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement(client.MathServiceStub.Add2IntsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(client.MathServiceStub.Multiply2Ints param, boolean optimizeContent) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement(client.MathServiceStub.Multiply2Ints.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(client.MathServiceStub.Multiply2IntsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement(client.MathServiceStub.Multiply2IntsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, client.MathServiceStub.Add2Ints param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault
	{

		try
		{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(client.MathServiceStub.Add2Ints.MY_QNAME, factory));
			return emptyEnvelope;
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, client.MathServiceStub.Multiply2Ints param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault
	{

		try
		{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(client.MathServiceStub.Multiply2Ints.MY_QNAME, factory));
			return emptyEnvelope;
		}
		catch (org.apache.axis2.databinding.ADBException e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory)
	{
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault
	{

		try
		{

			if (client.MathServiceStub.Add2Ints.class.equals(type))
			{

				return client.MathServiceStub.Add2Ints.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.MathServiceStub.Add2IntsResponse.class.equals(type))
			{

				return client.MathServiceStub.Add2IntsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.MathServiceStub.Multiply2Ints.class.equals(type))
			{

				return client.MathServiceStub.Multiply2Ints.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.MathServiceStub.Multiply2IntsResponse.class.equals(type))
			{

				return client.MathServiceStub.Multiply2IntsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		}
		catch (java.lang.Exception e)
		{
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
