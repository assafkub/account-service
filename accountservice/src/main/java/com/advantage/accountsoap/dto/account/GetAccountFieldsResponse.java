
package com.advantage.accountsoap.dto.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="countryIsoName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="defaultPaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="allowOffersPromotion" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="internalUnsuccessfulLoginAttempts" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="internalUserBlockedFromLoginUntil" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="internalLastSuccesssulLogin" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "lastName",
    "firstName",
    "loginName",
    "accountType",
    "countryId",
    "countryName",
    "countryIsoName",
    "stateProvince",
    "cityName",
    "address",
    "zipcode",
    "phoneNumber",
    "email",
    "defaultPaymentMethodId",
    "allowOffersPromotion",
    "internalUnsuccessfulLoginAttempts",
    "internalUserBlockedFromLoginUntil",
    "internalLastSuccesssulLogin"
})
@XmlRootElement(name = "GetAccountFieldsResponse", namespace = "com.advantage.online.store.accountservice")
public class GetAccountFieldsResponse {

    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected long id = 0;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String lastName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String firstName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String loginName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected int accountType;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected long countryId;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String countryName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String countryIsoName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String stateProvince = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String cityName = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String address = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String zipcode = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String phoneNumber = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected String email = "";
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected long defaultPaymentMethodId;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected boolean allowOffersPromotion;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected int internalUnsuccessfulLoginAttempts;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected long internalUserBlockedFromLoginUntil;
    @XmlElement(namespace = "com.advantage.online.store.accountservice")
    protected long internalLastSuccesssulLogin;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryIsoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIsoName() {
        return countryIsoName;
    }

    /**
     * Sets the value of the countryIsoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIsoName(String value) {
        this.countryIsoName = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvince(String value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the defaultPaymentMethodId property.
     * 
     */
    public long getDefaultPaymentMethodId() {
        return defaultPaymentMethodId;
    }

    /**
     * Sets the value of the defaultPaymentMethodId property.
     * 
     */
    public void setDefaultPaymentMethodId(long value) {
        this.defaultPaymentMethodId = value;
    }

    /**
     * Gets the value of the allowOffersPromotion property.
     * 
     */
    public boolean isAllowOffersPromotion() {
        return allowOffersPromotion;
    }

    /**
     * Sets the value of the allowOffersPromotion property.
     * 
     */
    public void setAllowOffersPromotion(boolean value) {
        this.allowOffersPromotion = value;
    }

    /**
     * Gets the value of the internalUnsuccessfulLoginAttempts property.
     * 
     */
    public int getInternalUnsuccessfulLoginAttempts() {
        return internalUnsuccessfulLoginAttempts;
    }

    /**
     * Sets the value of the internalUnsuccessfulLoginAttempts property.
     * 
     */
    public void setInternalUnsuccessfulLoginAttempts(int value) {
        this.internalUnsuccessfulLoginAttempts = value;
    }

    /**
     * Gets the value of the internalUserBlockedFromLoginUntil property.
     * 
     */
    public long getInternalUserBlockedFromLoginUntil() {
        return internalUserBlockedFromLoginUntil;
    }

    /**
     * Sets the value of the internalUserBlockedFromLoginUntil property.
     * 
     */
    public void setInternalUserBlockedFromLoginUntil(long value) {
        this.internalUserBlockedFromLoginUntil = value;
    }

    /**
     * Gets the value of the internalLastSuccesssulLogin property.
     * 
     */
    public long getInternalLastSuccesssulLogin() {
        return internalLastSuccesssulLogin;
    }

    /**
     * Sets the value of the internalLastSuccesssulLogin property.
     * 
     */
    public void setInternalLastSuccesssulLogin(long value) {
        this.internalLastSuccesssulLogin = value;
    }

}
