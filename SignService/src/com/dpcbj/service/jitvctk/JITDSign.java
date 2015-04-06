package com.dpcbj.service.jitvctk;

import com.linar.jintegra.*;

/**
 * COM Class 'JITDSign'. Generated 2013-4-15 16:12:31
 * from 'C:\JITComVCTK.dll'<P>
 * Generated using com2java Version 2.11 (c) 2010 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description '<B>JITDSign Class</B>'
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
public class JITDSign implements com.linar.jintegra.RemoteObjRef, com.dpcbj.service.jitvctk.IJITDSign {

  private static final String CLSID = "06ca9432-d9bd-4867-8475-770b131e1759";

  protected String getJintegraVersion() { return "2.11"; }

  // Interface delegates
  private com.dpcbj.service.jitvctk.IJITDSignProxy d_IJITDSignProxy = null;

  /** Access this COM class's com.dpcbj.service.jitvctk.IJITDSign interface */
  public com.dpcbj.service.jitvctk.IJITDSign getAsIJITDSign() { return d_IJITDSignProxy; }

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
  public static JITDSign getActiveObject() throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new JITDSign(com.linar.jintegra.Dispatch.getActiveObject(CLSID));
  }

  /**
   * bindUsingMoniker. Bind to a running instance of this class using the supplied ObjRef moniker
   *
   * @return    A reference to the running object.
   * @param     moniker The ObjRef Moniker (Created using Windows CreateObjrefMoniker() and IMoniker->GetDisplayName).
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If there was an error attaching to the instance.
   */
  public static JITDSign bindUsingMoniker(String moniker) throws com.linar.jintegra.AutomationException, java.io.IOException {
    return new JITDSign(com.linar.jintegra.Dispatch.bindUsingMoniker(moniker));
  }

  /** J-Integra for COM internal method */
  public com.linar.jintegra.Dispatch getJintegraDispatch() {  return d_IJITDSignProxy; }

  /**
   * Constructs a JITDSign on the local host.
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public JITDSign() throws java.io.IOException, java.net.UnknownHostException {
    this("localhost");
  }

  /**
   * Construct a JITDSign on specified host.
   * @param     host  the host on which the object should be created
   * @exception java.io.IOException if there are problems communicating via DCOM 
   * @exception java.net.UnknownHostException if the host can not be found 
   */
  public JITDSign(String host) throws java.io.IOException, java.net.UnknownHostException {
    d_IJITDSignProxy = new com.dpcbj.service.jitvctk.IJITDSignProxy(CLSID, host, null);
  }

  /**
   * Construct a JITDSign using a reference to such an object returned from a COM server
   * @param     obj an object returned from a COM server
   * @exception java.io.IOException if there are problems communicating via DCOM 
   */
  public JITDSign(Object obj) throws java.io.IOException {
    d_IJITDSignProxy = new com.dpcbj.service.jitvctk.IJITDSignProxy(obj);
  }

  /**
   * Release a JITDSign.
   */
  public void release() {
    com.linar.jintegra.Cleaner.release(d_IJITDSignProxy);
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
      return d_IJITDSignProxy.getPropertyByName(name);
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
      return d_IJITDSignProxy.getPropertyByName(name, rhs);
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
    return d_IJITDSignProxy.invokeMethodByName(name, parameters);
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
    return d_IJITDSignProxy.invokeMethodByName(name, new Object[]{});
  }

  /**
   * getVersion. method GetVersion
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getVersion();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setCert. 指定唯一证书
   *
   * @param     lpstrCertType The lpstrCertType (in)
   * @param     lpstrDN The lpstrDN (in)
   * @param     lpstrSN The lpstrSN (in)
   * @param     lpstrEmail The lpstrEmail (in)
   * @param     lpstrDNIssuer The lpstrDNIssuer (in)
   * @param     lpstrCertBase64 The lpstrCertBase64 (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCert  (
              String lpstrCertType,
              String lpstrDN,
              String lpstrSN,
              String lpstrEmail,
              String lpstrDNIssuer,
              String lpstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setCert(lpstrCertType,lpstrDN,lpstrSN,lpstrEmail,lpstrDNIssuer,lpstrCertBase64);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setCertChooseType. 设置证书弹出方式
   *
   * @param     lType The lType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int lType) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setCertChooseType(lType);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getCertInfo. 获取证书信息
   *
   * @param     pszCertType The pszCertType (in)
   * @param     lInfoType The lInfoType (in)
   * @param     pszOID The pszOID (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertInfo  (
              String pszCertType,
              int lInfoType,
              String pszOID) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getCertInfo(pszCertType,lInfoType,pszOID);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setAlgorithm. 设置算法
   *
   * @param     lpstrSignAlgo The lpstrSignAlgo (in)
   * @param     lpstrEncAlgo The lpstrEncAlgo (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setAlgorithm  (
              String lpstrSignAlgo,
              String lpstrEncAlgo) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setAlgorithm(lpstrSignAlgo,lpstrEncAlgo);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * attachSign. Attach签名
   *
   * @param     lpstrDN The lpstrDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSign  (
              String lpstrDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.attachSign(lpstrDN,pszSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * attachSignEx. Attach签名(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.attachSignEx(pszDN,pszFileName,pszFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyAttachedSign. 验证Attach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifyAttachedSign(bstrSignedData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyAttachedSignEx. 验证Attach签名(从文件)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifyAttachedSignEx(bstrFileNameAttached);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * detachSign. Detach签名
   *
   * @param     lpstrDN The lpstrDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSign  (
              String lpstrDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.detachSign(lpstrDN,pszSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * detachSignEx. Detach签名(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.detachSignEx(pszDN,pszFileName,pszFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyDetachedSign. 验证Detach签名
   *
   * @param     pszSignedData The pszSignedData (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSign  (
              String pszSignedData,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifyDetachedSign(pszSignedData,pszSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifyDetachedSignEx. 验证Detach签名(从文件)
   *
   * @param     pszSignedData The pszSignedData (in)
   * @param     pszFileNameDetached The pszFileNameDetached (in)
   * @param     pszFileName The pszFileName (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignEx  (
              String pszSignedData,
              String pszFileNameDetached,
              String pszFileName) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifyDetachedSignEx(pszSignedData,pszFileNameDetached,pszFileName);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * encryptEnvelop. 制作数字信封
   *
   * @param     pszDN The pszDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelop  (
              String pszDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.encryptEnvelop(pszDN,pszSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * encryptEnvelopEx. 制作数字信封(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.encryptEnvelopEx(pszDN,pszFileName,pszFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * decryptEnvelop. 解密数字信封
   *
   * @param     pszEvpContent The pszEvpContent (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String pszEvpContent) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.decryptEnvelop(pszEvpContent);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * decryptEnvelopEx. 解密数字信封(从文件
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.decryptEnvelopEx(bstrEvpFile);
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
   * @param     pVarSrcData The pVarSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelop  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String pVarSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.createSignedEnvelop(bstrSignCertDN,bstrEncCertDN,pVarSrcData);
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
   * @param     pbstrFileName The pbstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopEx  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String pbstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.createSignedEnvelopEx(bstrSignCertDN,bstrEncCertDN,pbstrFileName,bstrFileNameOut);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifySignedEnvelop. 解密并验证带签名数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifySignedEnvelop(bstrEnvelop);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * verifySignedEnvelopEx. 解密并验证带签名数字信封(从文件)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.verifySignedEnvelopEx(bstrEvpFile);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getBase64Encode. Base64编码函数
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getBase64Encode(bstrSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getBase64Decode. Base64解码函数
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Decode  (
              String bstrBase64Data) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getBase64Decode(bstrBase64Data);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getErrorCode();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getBase64HashEnCode. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64HashEnCode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getBase64HashEnCode(bstrSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getErrorMessage. 获取错误描述
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getErrorMessage();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getData();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getFile. 保存原文到指定路径
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getFile(bstrFileSavePath);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * addData. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addData  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.addData(bstrSrcData);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * addFile. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcFile The bstrSrcFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addFile  (
              String bstrSrcFile) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.addFile(bstrSrcFile);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setCSP. 设置CSP名称
   *
   * @param     pszProvider The pszProvider (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String pszProvider) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setCSP(pszProvider);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setPIN. 设置PIN码
   *
   * @param     pszPIN The pszPIN (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String pszPIN) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setPIN(pszPIN);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * getCertList. ***** 保留接口, 未实现 *****
   *
   * @param     lpszType The lpszType (in)
   * @param     lpszDN The lpszDN (in)
   * @param     lpszSN The lpszSN (in)
   * @param     lpszEmail The lpszEmail (in)
   * @param     lpszIssuer The lpszIssuer (in)
   * @param     lInfoType The lInfoType (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertList  (
              String lpszType,
              String lpszDN,
              String lpszSN,
              String lpszEmail,
              String lpszIssuer,
              int lInfoType) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.getCertList(lpszType,lpszDN,lpszSN,lpszEmail,lpszIssuer,lInfoType);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * setErrMsgLanguage. ***** 保留接口, 未实现 *****
   *
   * @param     lpzLangType The lpzLangType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setErrMsgLanguage  (
              String lpzLangType) throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.setErrMsgLanguage(lpzLangType);
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

  /**
   * clearPIN. ***** 保留接口, 未实现 *****
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int clearPIN  () throws java.io.IOException, com.linar.jintegra.AutomationException {
    try {
      return d_IJITDSignProxy.clearPIN();
    } catch(com.linar.jintegra.AutomationException automationException) {
      automationException.fillInStackTrace();
      throw automationException;
    }
  }

}
