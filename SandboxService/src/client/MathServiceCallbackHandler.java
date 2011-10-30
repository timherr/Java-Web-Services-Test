
/**
 * MathServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package client;

    /**
     *  MathServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MathServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MathServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MathServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for add2Ints method
            * override this method for handling normal response from add2Ints operation
            */
           public void receiveResultadd2Ints(
                    client.MathServiceStub.Add2IntsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add2Ints operation
           */
            public void receiveErroradd2Ints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiply2Ints method
            * override this method for handling normal response from multiply2Ints operation
            */
           public void receiveResultmultiply2Ints(
                    client.MathServiceStub.Multiply2IntsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiply2Ints operation
           */
            public void receiveErrormultiply2Ints(java.lang.Exception e) {
            }
                


    }
    