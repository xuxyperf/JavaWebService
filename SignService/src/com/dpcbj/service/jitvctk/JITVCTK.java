package com.dpcbj.service.jitvctk;

import com.linar.jintegra.*;

/**
 * COM Class 'JITVCTK'. Generated 2013-4-15 16:12:31
 * from 'C:\JITComVCTK.dll'<P>
 * Generated using com2java Version 2.11 (c) 2010 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>JITVCTK Class</B>'
 *
 * Generator Options:
 *   AwtForOcxs = False
 *   PromptForTypeLibraries = False
 *   RetryOnReject = False
 *   IDispatchOnly = False
 *   GenBeanInfo = False
 *   LowerCaseMemberNames = True
 *   TreatInStarAsIn = False
 *   ArraysAsObjects = False
 *   OmitRestrictedMethods = False
 *   ClashPrefix = zz_
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public class JITVCTK implements com.linar.jintegra.RemoteObjRef, com.dpcbj.service.jitvctk.IJITVCTK {

  private static final String CLSID = "707c7d52-85a8-4584-8954-573efce77488";

  protected String getJintegraVersion() { return "2.11"; }

  // Interface delegates
  private com.dpcbj.service.jitvctk.IJITVCTKProxy d_IJITVCTKProxy = null;

  /** Access this COM class's com.dpcbj.service.jitvctk.IJITVCTK interface */
  public com.dpcbj.service.jitvctk.IJITVCTK getAsIJITVCTK() { return d_IJITVCTKProxy; }

  /** Compare this object with another */
  public boolean equals(Object o) { 
	if(java.beans.Beans.isDesignTime()) return super.equals(o);
	else return getJintegraDispatch() == null ? false : getJintegraDispatch().equals(o);
  }


  /** the hashcode for this object */
  public int hashCode() { return getJintegraDispatch() == null ? 0 : getJintegraDispatch().hashCode(); }

   /**
   * getActiveObject. Get a reference to a running instance of this class on the current machine using native code.
   *                  <B>Uses native code (See GetActiveObject() in MS doc) and thus can only be used on MS Windows</B>
   *
   * @return    A reference to the running object.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static JITVCTK getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new JITVCTK(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static JITVCTK bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new JITVCTK(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_IJITVCTKProxy; }

  /**
   * Constructs a JITVCTK on the local host.
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public JITVCTK() throws java.io.IOException, java.net.UnknownHostException {
    this("localhost");
  }

  /**
   * Construct a JITVCTK on specified host.
   * @param     host  the host on which the object should be created
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public JITVCTK(String host) throws java.io.IOException, java.net.UnknownHostException {
    d_IJITVCTKProxy = new com.dpcbj.service.jitvctk.IJITVCTKProxy(CLSID, host, null);
  }

  /**
   * Construct a JITVCTK using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public JITVCTK(Object obj) throws java.io.IOException {
    d_IJITVCTKProxy = new com.dpcbj.service.jitvctk.IJITVCTKProxy(obj);
  }

  /**
   * Release a JITVCTK.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_IJITVCTKProxy);
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getPropertyByName(name);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs A parameter used when getting the proxy.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getPropertyByName(name, rhs);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    } catch(NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.fillInStackTrace();
      throw noSuchFieldException;
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @param     parameters One element for each parameter. Use primitive type wrappers.
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_IJITVCTKProxy.invokeMethodByName(name, parameters);
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked.
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    return d_IJITVCTKProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * setCert. 指定唯一证书
   *
   * @param     bstrCertType The bstrCertType (in)
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSN The bstrSN (in)
   * @param     bstrEmail The bstrEmail (in)
   * @param     bstrDNIssuer The bstrDNIssuer (in)
   * @param     bstrCertBase64 The bstrCertBase64 (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCert  (
              String bstrCertType,
              String bstrDN,
              String bstrSN,
              String bstrEmail,
              String bstrDNIssuer,
              String bstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.setCert(bstrCertType,bstrDN,bstrSN,bstrEmail,bstrDNIssuer,bstrCertBase64);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setCertChooseType. 设置证书弹出方式
   *
   * @param     nType The nType (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int nType) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.setCertChooseType(nType);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getCertInfo. 获取证书信息
   *
   * @param     bstrCertType The bstrCertType (in)
   * @param     lInfoType The lInfoType (in)
   * @param     bstrOID The bstrOID (in)
   * @return    The pRetCerInfo
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertInfo  (
              String bstrCertType,
              int lInfoType,
              String bstrOID) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getCertInfo(bstrCertType,lInfoType,bstrOID);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setAlgorithm. 设置算法
   *
   * @param     bstrSignAlg The bstrSignAlg (in)
   * @param     bstrEncAlg The bstrEncAlg (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setAlgorithm  (
              String bstrSignAlg,
              String bstrEncAlg) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.setAlgorithm(bstrSignAlg,bstrEncAlg);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * attachSign. Attach签名
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSign  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.attachSign(bstrDN,pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * attachSignEx. Attach签名(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.attachSignEx(bstrDN,bstrFileName,bstrFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyAttachedSign. 验证Attach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifyAttachedSign(bstrSignedData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyAttachedSignEx. 验证Attach签名(从文件)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifyAttachedSignEx(bstrFileNameAttached);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * detachSign. Detach签名
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSign  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.detachSign(bstrDN,pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * detachSignEx. Detach签名(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.detachSignEx(bstrDN,bstrFileName,bstrFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyDetachedSign. 验证Detach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSign  (
              String bstrSignedData,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifyDetachedSign(bstrSignedData,pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyDetachedSignEx. 验证Detach签名(从文件)
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     bstrFileNameDetached The bstrFileNameDetached (in)
   * @param     bstrFileName The bstrFileName (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignEx  (
              String bstrSignedData,
              String bstrFileNameDetached,
              String bstrFileName) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifyDetachedSignEx(bstrSignedData,bstrFileNameDetached,bstrFileName);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * encryptEnvelop. 制作数字信封
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelop  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.encryptEnvelop(bstrDN,pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * encryptEnvelopEx. 制作数字信封(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.encryptEnvelopEx(bstrDN,bstrFileName,bstrFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * decryptEnvelop. 解密数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.decryptEnvelop(bstrEnvelop);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * decryptEnvelopEx. 解密数字信封(从文件)
   *
   * @param     bstrFileNameDetached The bstrFileNameDetached (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrFileNameDetached) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.decryptEnvelopEx(bstrFileNameDetached);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * createSignedEnvelop. 制作带签名数字信封
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelop  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.createSignedEnvelop(bstrSignCertDN,bstrEncCertDN,pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * createSignedEnvelopEx. 制作带签名数字信封(从文件)
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopEx  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.createSignedEnvelopEx(bstrSignCertDN,bstrEncCertDN,bstrFileName,bstrFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifySignedEnvelop. 解密并验证带签名数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifySignedEnvelop(bstrEnvelop);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifySignedEnvelopEx. 解密并验证带签名数字信封(从文件)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifySignedEnvelopEx(bstrEvpFile);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getDataEx. 获取原文数据
   *
   * @param     pszSrcData An unsigned byte (out: use single element array)
   * @param     plSrcDataLen The plSrcDataLen (in/out: use single element array)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getDataEx  (
              byte[] pszSrcData,
              int[] plSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getDataEx(pszSrcData,plSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getFile. 保存原文到指定路径
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrFileName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getFile(bstrFileSavePath);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getErrorCode();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getErrorMessage. 获取错误描述
   *
   * @param     lErrorCode The lErrorCode (in)
   * @return    The pErrorMessage
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  (
              int lErrorCode) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getErrorMessage(lErrorCode);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setCSP. 设置CSP名称
   *
   * @param     bstrProvider The bstrProvider (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String bstrProvider) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.setCSP(bstrProvider);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setPIN. 设置PIN码
   *
   * @param     bstrPIN The bstrPIN (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String bstrPIN) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.setPIN(bstrPIN);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * jITGetVersion. 获取版本
   *
   * @return    The pbstrVersion
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String jITGetVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.jITGetVersion();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getBase64Encode. Base64编码函数
   *
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrBase64Data
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getBase64Encode(pszSrcData,lSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getBase64Decode. Base64解码函数
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @param     pszSrcData An unsigned byte (out: use single element array)
   * @param     pSrcDataLen The pSrcDataLen (in/out: use single element array)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getBase64Decode  (
              String bstrBase64Data,
              byte[] pszSrcData,
              int[] pSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getBase64Decode(bstrBase64Data,pszSrcData,pSrcDataLen);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrBase64Data
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.getData();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * attachSignStr. Attach签名(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.attachSignStr(bstrDN,bstrSrc);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * detachSignStr. Detach签名(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.detachSignStr(bstrDN,bstrSrc);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyDetachedSignStr. 验证Detach签名(从字符串)
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignStr  (
              String bstrSignedData,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.verifyDetachedSignStr(bstrSignedData,bstrSrc);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * encryptEnvelopStr. 制作数字信封(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.encryptEnvelopStr(bstrDN,bstrSrc);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * createSignedEnvelopStr. 制作带签名数字信封(从字符串)
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopStr  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITVCTKProxy.createSignedEnvelopStr(bstrSignCertDN,bstrEncCertDN,bstrSrc);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
