package com.dpcbj.service.jitvctk;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'IJITVCTK'. Generated 2013-4-15 16:12:31
 * from 'C:\JITComVCTK.dll'<P>
 * Generated using com2java Version 2.11 (c) 2010 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>IJITVCTK Interface</B>'
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
public class IJITVCTKProxy extends com.linar.jintegra.Dispatch implements com.dpcbj.service.jitvctk.IJITVCTK, java.io.Serializable {

  protected String getJintegraVersion() { return "2.11"; }

  static { com.dpcbj.service.jitvctk.JIntegraInit.init(); }

  public static final Class targetClass = IJITVCTK.class;

  public IJITVCTKProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, IJITVCTK.IID, host, authInfo);
  }

  /** For internal use only */
  public IJITVCTKProxy() {}

  public IJITVCTKProxy(Object obj) throws java.io.IOException {
    super(obj, IJITVCTK.IID);
  }

  protected IJITVCTKProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected IJITVCTKProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
    super(CLSID, iid, host, authInfo);
  }

  public void addListener(String iidStr, Object theListener, Object theSource) throws java.io.IOException {
    super.addListener(iidStr, theListener, theSource);
  }

  public void removeListener(String iidStr, Object theListener) throws java.io.IOException {
    super.removeListener(iidStr, theListener);
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
    com.linar.jintegra.Variant parameters[] = {};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter value
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs Parameter used when getting the property.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {rhs == null ? new Variant("rhs", 10, 0x80020004L) : new Variant("rhs", 12, rhs)};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @param     parameters One element for each parameter.  Use primitive type wrappers
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant variantParameters[] = new com.linar.jintegra.Variant[parameters.length];
    for(int i = 0; i < parameters.length; i++) {
      variantParameters[i] = parameters[i] == null ? new Variant("p" + i, 10, 0x80020004L) :
	                                                   new Variant("p" + i, 12, parameters[i]);
    }
    try {
      return super.invoke(name, super.getDispatchIdOfName(name), 1, variantParameters).getVARIANT();
    } catch(NoSuchFieldException nsfe) {
      throw new NoSuchMethodException("There is no method called " + name);
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
      return invokeMethodByName(name, new Object[]{});
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
              String bstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrCertType, bstrDN, bstrSN, bstrEmail, bstrDNIssuer, bstrCertBase64, zz_retVal };
    vtblInvoke("setCert", 7, zz_parameters);
    return zz_retVal[0];
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
              int nType) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { new Integer(nType), zz_retVal };
    vtblInvoke("setCertChooseType", 8, zz_parameters);
    return zz_retVal[0];
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
              String bstrOID) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrCertType, new Integer(lInfoType), bstrOID, zz_retVal };
    vtblInvoke("getCertInfo", 9, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrEncAlg) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignAlg, bstrEncAlg, zz_retVal };
    vtblInvoke("setAlgorithm", 10, zz_parameters);
    return zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("attachSign", 11, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrFileName, bstrFileNameOut, zz_retVal };
    vtblInvoke("attachSignEx", 12, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignedData, zz_retVal };
    vtblInvoke("verifyAttachedSign", 13, zz_parameters);
    return zz_retVal[0];
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
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrFileNameAttached, zz_retVal };
    vtblInvoke("verifyAttachedSignEx", 14, zz_parameters);
    return zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("detachSign", 15, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrFileName, bstrFileNameOut, zz_retVal };
    vtblInvoke("detachSignEx", 16, zz_parameters);
    return (String)zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignedData, pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("verifyDetachedSign", 17, zz_parameters);
    return zz_retVal[0];
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
              String bstrFileName) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignedData, bstrFileNameDetached, bstrFileName, zz_retVal };
    vtblInvoke("verifyDetachedSignEx", 18, zz_parameters);
    return zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("encryptEnvelop", 19, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrFileName, bstrFileNameOut, zz_retVal };
    vtblInvoke("encryptEnvelopEx", 20, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEnvelop, zz_retVal };
    vtblInvoke("decryptEnvelop", 21, zz_parameters);
    return zz_retVal[0];
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
              String bstrFileNameDetached) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrFileNameDetached, zz_retVal };
    vtblInvoke("decryptEnvelopEx", 22, zz_parameters);
    return zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSignCertDN, bstrEncCertDN, pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("createSignedEnvelop", 23, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSignCertDN, bstrEncCertDN, bstrFileName, bstrFileNameOut, zz_retVal };
    vtblInvoke("createSignedEnvelopEx", 24, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEnvelop, zz_retVal };
    vtblInvoke("verifySignedEnvelop", 25, zz_parameters);
    return zz_retVal[0];
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
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEvpFile, zz_retVal };
    vtblInvoke("verifySignedEnvelopEx", 26, zz_parameters);
    return zz_retVal[0];
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
              int[] plSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszSrcData, plSrcDataLen, zz_retVal };
    vtblInvoke("getDataEx", 27, zz_parameters);
    return zz_retVal[0];
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
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrFileSavePath, zz_retVal };
    vtblInvoke("getFile", 28, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getErrorCode", 29, zz_parameters);
    return zz_retVal[0];
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
              int lErrorCode) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { new Integer(lErrorCode), zz_retVal };
    vtblInvoke("getErrorMessage", 30, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrProvider) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrProvider, zz_retVal };
    vtblInvoke("setCSP", 31, zz_parameters);
    return zz_retVal[0];
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
              String bstrPIN) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrPIN, zz_retVal };
    vtblInvoke("setPIN", 32, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * jITGetVersion. 获取版本
   *
   * @return    The pbstrVersion
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String jITGetVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("jITGetVersion", 33, zz_parameters);
    return (String)zz_retVal[0];
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
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszSrcData, new Integer(lSrcDataLen), zz_retVal };
    vtblInvoke("getBase64Encode", 34, zz_parameters);
    return (String)zz_retVal[0];
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
              int[] pSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrBase64Data, pszSrcData, pSrcDataLen, zz_retVal };
    vtblInvoke("getBase64Decode", 35, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrBase64Data
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getData", 36, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrSrc, zz_retVal };
    vtblInvoke("attachSignStr", 37, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrSrc, zz_retVal };
    vtblInvoke("detachSignStr", 38, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignedData, bstrSrc, zz_retVal };
    vtblInvoke("verifyDetachedSignStr", 39, zz_parameters);
    return zz_retVal[0];
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
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrDN, bstrSrc, zz_retVal };
    vtblInvoke("encryptEnvelopStr", 40, zz_parameters);
    return (String)zz_retVal[0];
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
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSignCertDN, bstrEncCertDN, bstrSrc, zz_retVal };
    vtblInvoke("createSignedEnvelopStr", 41, zz_parameters);
    return (String)zz_retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
    com.linar.jintegra.InterfaceDesc.add("9cda9b8e-04aa-4070-9375-b1f327c8aa34", com.dpcbj.service.jitvctk.IJITVCTKProxy.class, null, 7, new com.linar.jintegra.MemberDesc[] {
        new com.linar.jintegra.MemberDesc("setCert",
            new Class[] { String.class, String.class, String.class, String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrCertType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEmail", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrDNIssuer", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrCertBase64", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setCertChooseType",
            new Class[] { Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("nType", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getCertInfo",
            new Class[] { String.class, Integer.TYPE, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrCertType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lInfoType", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrOID", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetCerInfo", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setAlgorithm",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignAlg", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncAlg", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("attachSign",
            new Class[] { String.class, byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("attachSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyAttachedSign",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyAttachedSignEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrFileNameAttached", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("detachSign",
            new Class[] { String.class, byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("detachSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyDetachedSign",
            new Class[] { String.class, byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyDetachedSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameDetached", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("encryptEnvelop",
            new Class[] { String.class, byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("encryptEnvelopEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("decryptEnvelop",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEnvelop", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("decryptEnvelopEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrFileNameDetached", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("createSignedEnvelop",
            new Class[] { String.class, String.class, byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("createSignedEnvelopEx",
            new Class[] { String.class, String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifySignedEnvelop",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEnvelop", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifySignedEnvelopEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEvpFile", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getDataEx",
            new Class[] { byte[].class, int[].class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszSrcData", 16401, 4, 8, null, null), 
              new com.linar.jintegra.Param("plSrcDataLen", 16387, 6, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getFile",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrFileSavePath", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileName", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getErrorCode",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getErrorMessage",
            new Class[] { Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lErrorCode", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pErrorMessage", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setCSP",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrProvider", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setPIN",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrPIN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("jITGetVersion",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pbstrVersion", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getBase64Encode",
            new Class[] { byte[].class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszSrcData", 16401, 2, 8, null, null), 
              new com.linar.jintegra.Param("lSrcDataLen", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrBase64Data", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getBase64Decode",
            new Class[] { String.class, byte[].class, int[].class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrBase64Data", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 16401, 4, 8, null, null), 
              new com.linar.jintegra.Param("pSrcDataLen", 16387, 6, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getData",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrBase64Data", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("attachSignStr",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSrc", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("detachSignStr",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSrc", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrSignedData", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyDetachedSignStr",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSrc", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetVal", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("encryptEnvelopStr",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSrc", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("createSignedEnvelopStr",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrSrc", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pRetValue", 8, 20, 8, null, null) }),
});  }
}
