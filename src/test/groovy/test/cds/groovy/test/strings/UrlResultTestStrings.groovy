package test.cds.groovy.test.strings

class UrlResultTestStrings {

	public static Map<String, String> testStrings = 
		[
		 "https://qa-service.mycdsglobal.com/ws/service/globalCustomer/GFT/920219565":eHubCustomerWithServItems,
		 "https://qa-service.mycdsglobal.com/ws/service/globalCustomer/WNE/001":eHubCustomerWithServItems,
		 "https://recreg.mycdsglobal.com/api/user?filter_type=AccountCode&system_code=SERV&product_code=WNE&account_code=68285352": recRegXML,
		 "https://recreg.mycdsglobal.com/api/user?filter_type=AccountCode&system_code=SERV&product_code=WNE&account_code=001": recRegXML,
		 "https://qa-service.mycdsglobal.com/ws/service/globalCustomer/GFT?appId=engage&pwd=cds1001&systemCode=SERV&filterType=AccountCodeAndPostalCode&accountCode=920219565&postalCode=90210": anotherGC
		]
	
	final static String eHubCustomerWithServItems = """
	<transaction success="true">
    <!--Here is the transaction information from CDS Global-->
    <isSuccess>true</isSuccess>
    <transactionId>22322398</transactionId>
    <transactionDesc>Global Customer</transactionDesc>
    <systemName>WSG</systemName>
    <prodId>007</prodId>
    <message/>
    <globalcustomer>
        <recReg>
            <result>success</result>
            <actualCount>1</actualCount>
            <totalCount>1</totalCount>
            <users>
                <id>214490</id>
                <products>
                    <systemCode>SERV</systemCode>
                    <productCode>GFT</productCode>
                    <accountCode>920244977</accountCode>
                    <prodIdAlias>GFT</prodIdAlias>
                    <productName>Green Flying Things</productName>
                </products>
                <products>
                    <systemCode>EHUB</systemCode>
                    <productCode>007</productCode>
                    <accountCode>14900</accountCode>
                    <prodIdAlias>007</prodIdAlias>
                    <productName>Dingo Testing Instance</productName>
                </products>
                <addresses>
                    <prefix>MRS</prefix>
                    <firstName>LAURA</firstName>
                    <middleName>GRACE</middleName>
                    <lastName>STOCKTON</lastName>
                    <suffix/>
                    <honoraryName/>
                    <gender/>
                    <companyName/>
                    <addressLine1>8766 FOREST</addressLine1>
                    <addressLine2/>
                    <addressLine3/>
                    <city>DES MOINES</city>
                    <region>IA</region>
                    <zipPlus4/>
                    <countryCode>US</countryCode>
                    <countryName>UNITED STATES</countryName>
                    <postalCode>50312</postalCode>
                    <deliveryPoint/>
                    <carrierRoute/>
                    <matchcode>50312&amp;&amp;&amp;&amp;&amp;&amp;&amp;STOCKTLAU&amp;&amp;&amp;&amp;</matchcode>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920244977</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2016-06-01</fromDate>
                            <throughDate>2059-12-31</throughDate>
                            <originalAddress>
                                <fullName>LAURA STOCKTON</fullName>
                                <prefix/>
                                <firstName/>
                                <middleName/>
                                <lastName/>
                                <suffix/>
                                <companyName/>
                                <addressLine1>8766 FOREST</addressLine1>
                                <addressLine2/>
                                <addressLine3/>
                                <city>DES MOINES</city>
                                <region>IA</region>
                                <zipPlus4/>
                                <countryCode>US</countryCode>
                                <countryName>UNITED STATES</countryName>
                                <postalCode>50312</postalCode>
                                <deliveryPoint/>
                                <carrierRoute/>
                                <matchcode>LAU50312&amp;&amp;&amp;&amp;&amp;8766&amp;</matchcode>
                            </originalAddress>
                        </dates>
                    </assignments>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>EHUB</systemCode>
                        <productCode>007</productCode>
                        <accountCode>14900</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2016-06-02</fromDate>
                            <throughDate>2059-12-31</throughDate>
                            <originalAddress>
                                <fullName/>
                                <prefix/>
                                <firstName>LAURA</firstName>
                                <middleName/>
                                <lastName>STOCKTON</lastName>
                                <suffix/>
                                <companyName/>
                                <addressLine1>8766 FOREST</addressLine1>
                                <addressLine2/>
                                <addressLine3/>
                                <city>DES MOINES</city>
                                <region>IOWA</region>
                                <zipPlus4/>
                                <countryCode>US</countryCode>
                                <countryName>UNITED STATES</countryName>
                                <postalCode>50312</postalCode>
                                <deliveryPoint/>
                                <carrierRoute/>
                                <matchcode>&amp;&amp;&amp;50312&amp;&amp;&amp;&amp;&amp;8766&amp;</matchcode>
                            </originalAddress>
                        </dates>
                    </assignments>
                </addresses>
                <emails>
                    <emailAddress>mallspach@gmail.com</emailAddress>
                    <username/>
                    <password/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920244977</accountCode>
                        <isActive>Y</isActive>
                    </assignments>
                </emails>
                <emails>
                    <emailAddress>mallspach@gmail.com</emailAddress>
                    <username/>
                    <password/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>EHUB</systemCode>
                        <productCode>007</productCode>
                        <accountCode>14900</accountCode>
                        <isActive>Y</isActive>
                    </assignments>
                </emails>
                <phones>
                    <phoneNumber>5157623897</phoneNumber>
                    <phoneNumberType/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920244977</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2016-06-01</fromDate>
                            <throughDate>2059-12-31</throughDate>
                        </dates>
                    </assignments>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>EHUB</systemCode>
                        <productCode>007</productCode>
                        <accountCode>14900</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2016-06-02</fromDate>
                            <throughDate>2059-12-31</throughDate>
                        </dates>
                    </assignments>
                </phones>
            </users>
            <icare>N</icare>
        </recReg>
        <wallet>
            <recRegId>214490</recRegId>
            <clientTransactionId>c0940a44-c7ef-488e-9875-0113967ad849</clientTransactionId>
            <responseCode>100</responseCode>
            <actionCode>GETPM_ALL</actionCode>
            <addWalletToResponse>false</addWalletToResponse>
            <walletAccount>
                <token>7261452671381111</token>
                <accountType>VI</accountType>
                <creditCardExpire>012017</creditCardExpire>
                <creditCardExpireMonth>01</creditCardExpireMonth>
                <creditCardExpireYear>2017</creditCardExpireYear>
                <name>Laura Stockton</name>
                <addressLine1>1901 Bell Ave</addressLine1>
                <city>DES MOINES</city>
                <state>IA</state>
                <postalCode>50315</postalCode>
                <country>US</country>
                <preferenceCode>1</preferenceCode>
                <creditCardLastFour>1111</creditCardLastFour>
            </walletAccount>
        </wallet>
        <customer>
            <accountNumber>14900</accountNumber>
            <firstName>LAURA</firstName>
            <lastName>STOCKTON</lastName>
            <middleName/>
            <prefix/>
            <suffix/>
            <address1>8766 FOREST</address1>
            <city>DES MOINES</city>
            <state>Iowa</state>
            <zipCode>50312</zipCode>
            <country>US</country>
            <email>mallspach@gmail.com</email>
            <companyName/>
            <jobTitle/>
            <storeCreditBalance>0.00</storeCreditBalance>
            <customerSince>2016-06-02 15:00:43</customerSince>
            <prodIdAlias>007</prodIdAlias>
            <prodId>007</prodId>
            <permissions>
                <emailAuthorization>Y</emailAuthorization>
            </permissions>
            <order>
                <orderNumber/>
                <createdDate/>
                <reasonCode/>
                <packageName>2 Time + 1 Serv</packageName>
                <component>
                    <prodId>007</prodId>
                    <prodIdAlias>007</prodIdAlias>
                    <productName>Engage Testing</productName>
                    <orderNumber>19014</orderNumber>
                    <status>10</status>
                    <statusDescription>Stop Charge-Cancelled</statusDescription>
                    <trackingCode>1234</trackingCode>
                    <lastPaymentAmount>3.00</lastPaymentAmount>
                    <lastPaymentDate>2016-06-02 15:00:44</lastPaymentDate>
                    <nextPaymentAmount>None</nextPaymentAmount>
                    <nextPaymentDate>None</nextPaymentDate>
                    <createdDate>2016-06-02 15:00:41</createdDate>
                    <remainingValue>0.00</remainingValue>
                    <orderValue>3.00</orderValue>
                    <originalStartDate>2016-06-02 15:00:41</originalStartDate>
                    <subscriptionStart>2016-06-02 15:00:41</subscriptionStart>
                    <subscriptionExpire>2016-07-02 15:00:41</subscriptionExpire>
                    <subscriptionEnd>2016-07-02 15:00:41</subscriptionEnd>
                    <inTrial>N</inTrial>
                    <autoRenew>N</autoRenew>
                    <periodUnit>month</periodUnit>
                    <productNumber>1</productNumber>
                    <storeCreditUsed>0.00</storeCreditUsed>
                    <settlementDate/>
                    <managedBy>Managed by Ehub</managedBy>
                </component>
                <component>
                    <prodId>007</prodId>
                    <prodIdAlias>007</prodIdAlias>
                    <productName>test2</productName>
                    <orderNumber>19015</orderNumber>
                    <status>10</status>
                    <statusDescription>Stop Charge-Cancelled</statusDescription>
                    <trackingCode>1234</trackingCode>
                    <lastPaymentAmount>4.00</lastPaymentAmount>
                    <lastPaymentDate>2016-06-02 15:00:44</lastPaymentDate>
                    <nextPaymentAmount>None</nextPaymentAmount>
                    <nextPaymentDate>None</nextPaymentDate>
                    <createdDate>2016-06-02 15:00:41</createdDate>
                    <remainingValue>0.00</remainingValue>
                    <orderValue>4.00</orderValue>
                    <originalStartDate>2016-06-02 15:00:41</originalStartDate>
                    <subscriptionStart>2016-06-02 15:00:41</subscriptionStart>
                    <subscriptionExpire>2016-07-02 15:00:41</subscriptionExpire>
                    <subscriptionEnd>2016-07-02 15:00:41</subscriptionEnd>
                    <inTrial>N</inTrial>
                    <autoRenew>N</autoRenew>
                    <periodUnit>month</periodUnit>
                    <productNumber>15</productNumber>
                    <storeCreditUsed>0.00</storeCreditUsed>
                    <settlementDate/>
                    <managedBy>Managed by Ehub</managedBy>
                </component>
                <component>
                    <prodId>007</prodId>
                    <prodIdAlias>007</prodIdAlias>
                    <productName>Green Flying Things</productName>
                    <orderNumber>19016</orderNumber>
                    <status>10</status>
                    <statusDescription>Stop Charge-Cancelled</statusDescription>
                    <promotionKey>ABCGFT</promotionKey>
                    <trackingCode>1234</trackingCode>
                    <lastPaymentAmount>3.00</lastPaymentAmount>
                    <lastPaymentDate>2016-06-02 15:00:44</lastPaymentDate>
                    <nextPaymentAmount>None</nextPaymentAmount>
                    <nextPaymentDate>None</nextPaymentDate>
                    <createdDate>2016-06-02 15:00:41</createdDate>
                    <remainingValue>1.50</remainingValue>
                    <orderValue>3.00</orderValue>
                    <originalStartDate>2016-06-02 15:00:41</originalStartDate>
                    <subscriptionStart>2016-06-02 15:00:41</subscriptionStart>
                    <subscriptionExpire>2016-07-02 15:00:41</subscriptionExpire>
                    <subscriptionEnd>2016-07-02 15:00:41</subscriptionEnd>
                    <inTrial>N</inTrial>
                    <autoRenew>N</autoRenew>
                    <periodUnit>month</periodUnit>
                    <productNumber>463</productNumber>
                    <storeCreditUsed>0.00</storeCreditUsed>
                    <settlementDate/>
                    <servSubscriptionTerm>2</servSubscriptionTerm>
                    <servMagAbbr>GFT</servMagAbbr>
                    <servReconciliationKey>30001000170878</servReconciliationKey>
                    <servAccountNumber>0920244977</servAccountNumber>
                    <servOrderNumber>1615400095513</servOrderNumber>
                    <managedBy>Managed by Ehub</managedBy>
                </component>
                <cardProfile>
                    <cardProfileId>12666</cardProfileId>
                    <defaultCardProfile>Y</defaultCardProfile>
                    <creditCardType>VI</creditCardType>
                    <creditCardNumber>1111</creditCardNumber>
                    <creditCardExpireMonth>08</creditCardExpireMonth>
                    <creditCardExpireYear>2029</creditCardExpireYear>
                    <name>Laura Stockton</name>
                    <accountNumber>14900</accountNumber>
                    <token>94bda421f5a3ebb0e0ac808783c71a006b6791aa</token>
                    <ccEmail/>
                </cardProfile>
                <amendment/>
                <packageOfferCode>AUTON9867391675</packageOfferCode>
                <packageOfferId>570</packageOfferId>
                <packageSetId>561</packageSetId>
                <packagePrice>10.00</packagePrice>
                <packageRenewalNotificationSent/>
                <packageFrequency>month</packageFrequency>
                <packageSettlementDate/>
                <digital>Y</digital>
                <customer/>
                <payment>
                    <billingInformation/>
                </payment>
            </order>
        </customer>
        <customer>
            <accountNumber>0920244977</accountNumber>
            <name>LAURA STOCKTON</name>
            <address1>8766 FOREST</address1>
            <address2/>
            <city>DES MOINES</city>
            <state>IA</state>
            <zipCode>50312</zipCode>
            <country>UNITED STATES</country>
            <email>mallspach@gmail.com</email>
            <username/>
            <password/>
            <phoneNumber>5157623897</phoneNumber>
            <faxNumber/>
            <companyName/>
            <jobTitle/>
            <department/>
            <serviceStatus>A</serviceStatus>
            <serviceStatusDescription>Active</serviceStatusDescription>
            <baseCreditStatus>G</baseCreditStatus>
            <baseCreditStatusDescription>Not a credit order</baseCreditStatusDescription>
            <numberOfCopies>001</numberOfCopies>
            <startIssue>00518</startIssue>
            <startIssueDescription>FEB13</startIssueDescription>
            <startIssueCoverDate>2013-02-01</startIssueCoverDate>
            <expireIssue>00519</expireIssue>
            <expireIssueDescription>MAR13</expireIssueDescription>
            <expireIssueCoverDate>2013-03-01</expireIssueCoverDate>
            <lastIssue>00518</lastIssue>
            <lastIssueDescription>FEB13</lastIssueDescription>
            <lastIssueCoverDate>2013-02-01</lastIssueCoverDate>
            <resumeIssueCoverDate/>
            <remainingIssues>1</remainingIssues>
            <specialProductCode/>
            <promotionKey>*</promotionKey>
            <giftPromotionKey/>
            <historyOrders>N</historyOrders>
            <historyEmails>N</historyEmails>
            <historyNames>N</historyNames>
            <customerStatus>A</customerStatus>
            <customerStatusDescription>Deliverable</customerStatusDescription>
            <productIndicator1>Y</productIndicator1>
            <productIndicator2/>
            <listRentalSwitch>Y</listRentalSwitch>
            <timesRenewed/>
            <numberExtensionIssues/>
            <addressFromDate>2016-06-01</addressFromDate>
            <emailLocation/>
            <demographicsAvailable>N</demographicsAvailable>
            <prodIdAlias>GFT</prodIdAlias>
            <prodId>GFT</prodId>
            <resumeIssue/>
            <permissions>
                <allowGiftAutoRenewal>Y</allowGiftAutoRenewal>
                <emailUseAnywherePerm>Y</emailUseAnywherePerm>
                <allowPromoteAsRecipient>Y</allowPromoteAsRecipient>
                <allowSweepsPromotions>Y</allowSweepsPromotions>
                <emailPermission1/>
                <emailPermission2/>
                <emailAuthorization/>
                <allowRegularPromotions>N</allowRegularPromotions>
                <allowPhone>Y</allowPhone>
                <emailPermission0/>
                <emailPermission5/>
                <emailActivePerm>Y</emailActivePerm>
                <allowContestPromotions>Y</allowContestPromotions>
                <emailPermission6/>
                <emailPermission3/>
                <emailPermission4/>
                <emailPermission9/>
                <emailUseForCompanyPerm>Y</emailUseForCompanyPerm>
                <emailPermission7/>
                <emailPermission8/>
                <allowSingleAutoRenewal>Y</allowSingleAutoRenewal>
                <allowGiftPromotions>Y</allowGiftPromotions>
            </permissions>
            <order>
                <orderNumber>1615400095513</orderNumber>
                <createdDate>2016-06-02 09:55:13</createdDate>
                <promotionKey>ABCGFT</promotionKey>
                <sourceCode>AA</sourceCode>
                <sourceCodeDescription>direct</sourceCodeDescription>
                <mediumCode>K</mediumCode>
                <mediumCodeDescription>PromoFUSION/MMP/eHub Combo</mediumCodeDescription>
                <taxExemptCode>B</taxExemptCode>
                <specialInfo>88888980467427947</specialInfo>
                <amountDue>0.00</amountDue>
                <subscriptionStart>00518</subscriptionStart>
                <subscriptionStartDescription>FEB13</subscriptionStartDescription>
                <subscriptionStartCoverDate>2013-02-01</subscriptionStartCoverDate>
                <subscriptionExpireCoverDate>2013-03-01</subscriptionExpireCoverDate>
                <subscriptionExpireDescription>MAR13</subscriptionExpireDescription>
                <vendorTransactionId>Ehub-dingotesting1-100140019-19016</vendorTransactionId>
                <vendorCode>EHB</vendorCode>
                <oldBillKey/>
                <productName>Green Flying Things</productName>
                <cancel>N</cancel>
                <prodId>GFT</prodId>
                <prodIdAlias>GFT</prodIdAlias>
                <orderValue>3.00</orderValue>
                <status>B</status>
                <statusDescription>Base order</statusDescription>
                <lastPaymentDate>2016-06-02</lastPaymentDate>
                <lastPaymentAmount>3.00</lastPaymentAmount>
                <subscriptionExpire>00519</subscriptionExpire>
                <creditStatus>G</creditStatus>
                <creditStatusDescription>Not a credit order</creditStatusDescription>
                <orderEntry>D</orderEntry>
                <orderEntryDescription>Credit card</orderEntryDescription>
                <setCode>A</setCode>
                <setCodeDescription>Non gift</setCodeDescription>
                <agencyCode/>
                <agencyGross>3.00</agencyGross>
                <currencyCode/>
                <currencyValue>0.00</currencyValue>
                <magazineCategory>40</magazineCategory>
                <newRenewCode>A</newRenewCode>
                <newRenewCodeDesc>New</newRenewCodeDesc>
                <taxValue>0.00</taxValue>
                <orderInd1/>
                <orderInd2>A</orderInd2>
                <employeeId>74356</employeeId>
                <subscriptionOrder>Y</subscriptionOrder>
                <customer/>
                <payment>
                    <creditCardType>C</creditCardType>
                    <creditCardNumber>1111</creditCardNumber>
                    <creditCardExpireMonth>08</creditCardExpireMonth>
                    <creditCardExpireYear>29</creditCardExpireYear>
                    <lastCreditCardChargeStatus>S</lastCreditCardChargeStatus>
                    <billingInformation/>
                </payment>
                <orderItem>
                    <orderNumber/>
                    <orderTypeCode>A</orderTypeCode>
                    <orderTypeCodeDescription>Non gift</orderTypeCodeDescription>
                    <subscriptionTerm>2</subscriptionTerm>
                    <recipient/>
                </orderItem>
                <premiumSwitch>N</premiumSwitch>
                <orderOrigin>EH001</orderOrigin>
            </order>
            <multiMag>
                <magAbbreviation>GFT</magAbbreviation>
                <nonGiftAmountDue>N</nonGiftAmountDue>
                <giftAmountDue>N</giftAmountDue>
                <autoRenewal>N</autoRenewal>
                <serviceStatus>A</serviceStatus>
                <serviceStatusDescription>Active</serviceStatusDescription>
                <expireIssue>519</expireIssue>
                <expireIssueDescription>MAR13</expireIssueDescription>
                <expireIssueCoverDate>2013-03-01</expireIssueCoverDate>
                <expireIssueCover>2013-03-01</expireIssueCover>
            </multiMag>
        </customer>
    </globalcustomer>
</transaction>

""";
	
	final static String servRecipient = """
    <!--Here is the transaction information from CDS Global-->
    <isSuccess>true</isSuccess>
    <transactionId>22322440</transactionId>
    <transactionDesc>Global Customer</transactionDesc>
    <systemName>WSG</systemName>
    <prodId>GFT</prodId>
    <message/>
    <globalcustomer>
        <recReg>
            <result>success</result>
            <actualCount>1</actualCount>
            <totalCount>1</totalCount>
            <users>
                <id>212202</id>
                <products>
                    <systemCode>SERV</systemCode>
                    <productCode>GFT</productCode>
                    <accountCode>920219565</accountCode>
                    <prodIdAlias>GFT</prodIdAlias>
                    <productName>Green Flying Things</productName>
                </products>
                <addresses>
                    <prefix/>
                    <firstName>MARIAH</firstName>
                    <middleName/>
                    <lastName>WILLIAMS</lastName>
                    <suffix/>
                    <honoraryName/>
                    <gender/>
                    <companyName>ARISTA RECORDS</companyName>
                    <addressLine1>32815 RODEO DR SUITE 13C</addressLine1>
                    <addressLine2>address 2 here</addressLine2>
                    <addressLine3/>
                    <city>BEVERLY HILLS</city>
                    <region>CA</region>
                    <zipPlus4>3333</zipPlus4
                    <countryCode>US</countryCode>
                    <countryName>UNITED STATES</countryName>
                    <postalCode>90210</postalCode>
                    <deliveryPoint/>
                    <carrierRoute/>
                    <matchcode>90210&amp;&amp;&amp;&amp;&amp;&amp;&amp;WILLIAMAR&amp;&amp;&amp;&amp;</matchcode>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920219565</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2015-04-06</fromDate>
                            <throughDate>2059-12-31</throughDate>
                            <originalAddress>
                                <fullName>MARIAH WILLIAMS</fullName>
                                <prefix/>
                                <firstName/>
                                <middleName/>
                                <lastName/>
                                <suffix/>
                                <companyName>ARISTA RECORDS</companyName>
                                <addressLine1>SUITE 13C</addressLine1>
                                <addressLine2>32815 RODEO DRIVE</addressLine2>
                                <addressLine3/>
                                <city>BEVERLY HILLS</city>
                                <region>CA</region>
                                <zipPlus4/>
                                <countryCode>US</countryCode>
                                <countryName>UNITED STATES</countryName>
                                <postalCode>90210</postalCode>
                                <deliveryPoint/>
                                <carrierRoute/>
                                <matchcode>MAR90210&amp;&amp;&amp;&amp;&amp;SUITE</matchcode>
                            </originalAddress>
                        </dates>
                    </assignments>
                </addresses>
                <emails>
                    <emailAddress>mariahw@cds.com</emailAddress>
                    <username/>
                    <password/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920219565</accountCode>
                        <isActive>N</isActive>
                    </assignments>
                </emails>
                <emails>
                    <emailAddress>mariahw@cds.com</emailAddress>
                    <username>62351359098010053</username>
                    <password/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920219565</accountCode>
                        <isActive>Y</isActive>
                    </assignments>
                </emails>
                <phones>
                    <phoneNumber>5152888418</phoneNumber>
                    <phoneNumberType/>
                    <assignments>
                        <globalCode>eCare Test</globalCode>
                        <systemCode>SERV</systemCode>
                        <productCode>GFT</productCode>
                        <accountCode>920219565</accountCode>
                        <virtualDelete>N</virtualDelete>
                        <dates>
                            <fromDate>2015-04-06</fromDate>
                            <throughDate>2059-12-31</throughDate>
                        </dates>
                    </assignments>
                </phones>
            </users>
            <icare>N</icare>
        </recReg>
        <wallet>
            <recRegId>212202</recRegId>
            <clientTransactionId>ef9e9aae-6b53-491e-9ddf-e60a9d5fd122</clientTransactionId>
            <responseCode>065</responseCode>
            <errorDescription>Payment Method not found in Wallet</errorDescription>
            <actionCode>GETPM_ALL</actionCode>
            <addWalletToResponse>false</addWalletToResponse>
        </wallet>
        <customer>
            <accountNumber>0920219565</accountNumber>
            <name>MARIAH WILLIAMS</name>
            <address1>SUITE 13C</address1>
            <address2>32815 RODEO DRIVE</address2>
            <city>BEVERLY HILLS</city>
            <state>CA</state>
            <zipCode>90210</zipCode>
            <country>UNITED STATES</country>
            <email>mariahw@cds.com</email>
            <username>62351359098010053</username>
            <password>password on file</password>
            <phoneNumber>5152888418</phoneNumber>
            <faxNumber>5152872436</faxNumber>
            <companyName>ARISTA RECORDS</companyName>
            <jobTitle>SONGSTRESS</jobTitle>
            <department>DIVAS</department>
            <serviceStatus>A</serviceStatus>
            <serviceStatusDescription>Active</serviceStatusDescription>
            <baseCreditStatus>G</baseCreditStatus>
            <baseCreditStatusDescription>Not a credit order</baseCreditStatusDescription>
            <numberOfCopies>001</numberOfCopies>
            <startIssue>00517</startIssue>
            <startIssueDescription>JAN13</startIssueDescription>
            <startIssueCoverDate>2013-01-01</startIssueCoverDate>
            <expireIssue>00528</expireIssue>
            <expireIssueDescription>DEC13</expireIssueDescription>
            <expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
            <lastIssue>00518</lastIssue>
            <lastIssueDescription>FEB13</lastIssueDescription>
            <lastIssueCoverDate>2013-02-01</lastIssueCoverDate>
            <resumeIssueCoverDate/>
            <remainingIssues>10</remainingIssues>
            <specialProductCode/>
            <promotionKey>R1312G00</promotionKey>
            <giftPromotionKey/>
            <historyOrders>N</historyOrders>
            <historyEmails>Y</historyEmails>
            <historyNames>N</historyNames>
            <customerStatus>A</customerStatus>
            <customerStatusDescription>Deliverable</customerStatusDescription>
            <productIndicator1>Y</productIndicator1>
            <productIndicator2/>
            <listRentalSwitch>Y</listRentalSwitch>
            <timesRenewed/>
            <numberExtensionIssues/>
            <addressFromDate>2015-04-06</addressFromDate>
            <emailLocation/>
            <demographicsAvailable>N</demographicsAvailable>
            <prodIdAlias>GFT</prodIdAlias>
            <prodId>GFT</prodId>
            <resumeIssue/>
            <permissions>
                <allowGiftAutoRenewal>Y</allowGiftAutoRenewal>
                <emailUseAnywherePerm>Y</emailUseAnywherePerm>
                <allowPromoteAsRecipient>Y</allowPromoteAsRecipient>
                <allowSweepsPromotions>Y</allowSweepsPromotions>
                <emailPermission1/>
                <emailPermission2/>
                <emailAuthorization/>
                <allowRegularPromotions>Y</allowRegularPromotions>
                <allowPhone>Y</allowPhone>
                <emailPermission0/>
                <emailPermission5/>
                <emailActivePerm>Y</emailActivePerm>
                <allowContestPromotions>Y</allowContestPromotions>
                <emailPermission6/>
                <emailPermission3/>
                <emailPermission4/>
                <emailPermission9/>
                <emailUseForCompanyPerm>Y</emailUseForCompanyPerm>
                <emailPermission7/>
                <emailPermission8/>
                <allowSingleAutoRenewal>Y</allowSingleAutoRenewal>
                <allowGiftPromotions>Y</allowGiftPromotions>
            </permissions>
            <order>
                <orderNumber>1509700075009</orderNumber>
                <createdDate>2015-04-07 07:50:09</createdDate>
                <promotionKey>DDOUT</promotionKey>
                <sourceCode>AE</sourceCode>
                <sourceCodeDescription>white mail</sourceCodeDescription>
                <mediumCode>J</mediumCode>
                <mediumCodeDescription>Internet-realtime</mediumCodeDescription>
                <specialInfo>88888509707531291</specialInfo>
                <amountDue>0.00</amountDue>
                <subscriptionStart>00517</subscriptionStart>
                <subscriptionStartDescription>JAN13</subscriptionStartDescription>
                <subscriptionStartCoverDate>2013-01-01</subscriptionStartCoverDate>
                <subscriptionExpireCoverDate>2013-12-01</subscriptionExpireCoverDate>
                <subscriptionExpireDescription>DEC13</subscriptionExpireDescription>
                <vendorTransactionId/>
                <oldBillKey/>
                <productName>Green Flying Things</productName>
                <cancel>N</cancel>
                <prodId>GFT</prodId>
                <prodIdAlias>GFT</prodIdAlias>
                <orderValue>10.00</orderValue>
                <status>B</status>
                <statusDescription>Base order</statusDescription>
                <subscriptionExpire>00528</subscriptionExpire>
                <creditStatus>G</creditStatus>
                <creditStatusDescription>Not a credit order</creditStatusDescription>
                <orderEntry>D</orderEntry>
                <orderEntryDescription>Credit card</orderEntryDescription>
                <setCode>C</setCode>
                <setCodeDescription>Personal gift recipient</setCodeDescription>
                <agencyCode/>
                <agencyGross>10.00</agencyGross>
                <currencyCode/>
                <currencyValue>0.00</currencyValue>
                <magazineCategory>99</magazineCategory>
                <newRenewCode>A</newRenewCode>
                <newRenewCodeDesc>New</newRenewCodeDesc>
                <taxValue>0.00</taxValue>
                <orderInd1>Y</orderInd1>
                <orderInd2>A</orderInd2>
                <employeeId>71618</employeeId>
                <subscriptionOrder>Y</subscriptionOrder>
                <customer/>
                <payment>
                    <creditCardType>P</creditCardType>
                    <creditCardNumber>5492</creditCardNumber>
                    <lastCreditCardChargeStatus>P</lastCreditCardChargeStatus>
                    <billingInformation/>
                </payment>
                <orderItem>
                    <orderNumber/>
                    <orderTypeCode>C</orderTypeCode>
                    <orderTypeCodeDescription>Personal gift recipient</orderTypeCodeDescription>
                    <subscriptionTerm>12</subscriptionTerm>
                    <recipient/>
                </orderItem>
                <donor>
                    <accountNumber>0920219540</accountNumber>
                    <name>BRENDA WILSON</name>
                    <address2>2304 CHERRY ST</address2>
                    <city>DES MOINES</city>
                    <state>IA</state>
                    <zipCode>50315</zipCode>
                    <country>UNITED STATES</country>
                    <email>ljohnson@cds-global.com</email>
                    <username/>
                    <password/>
                    <phoneNumber>5152477500</phoneNumber>
                    <faxNumber>5152461234</faxNumber>
                    <companyName>MID AMERICAN ENERGY</companyName>
                    <jobTitle>ACCOUNTANT</jobTitle>
                    <department>BILLING</department>
                    <serviceStatus>A</serviceStatus>
                    <serviceStatusDescription>Active</serviceStatusDescription>
                    <numberOfCopies>003</numberOfCopies>
                    <startIssue>00517</startIssue>
                    <startIssueDescription>JAN13</startIssueDescription>
                    <startIssueCoverDate>2013-01-01</startIssueCoverDate>
                    <expireIssue>00528</expireIssue>
                    <expireIssueDescription>DEC13</expireIssueDescription>
                    <expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
                    <lastIssue>00518</lastIssue>
                    <lastIssueDescription>FEB13</lastIssueDescription>
                    <lastIssueCoverDate>2013-02-01</lastIssueCoverDate>
                    <resumeIssueCoverDate/>
                    <remainingIssues>10</remainingIssues>
                    <specialProductCode/>
                    <promotionKey>R1312G00</promotionKey>
                    <giftPromotionKey/>
                    <historyEmails>N</historyEmails>
                    <historyNames>N</historyNames>
                    <customerStatus>A</customerStatus>
                    <customerStatusDescription>Deliverable</customerStatusDescription>
                    <productIndicator1>Y</productIndicator1>
                    <productIndicator2/>
                    <listRentalSwitch>Y</listRentalSwitch>
                    <timesRenewed/>
                    <numberExtensionIssues/>
                    <addressFromDate>2015-04-06</addressFromDate>
                    <emailLocation>W</emailLocation>
                    <resumeIssue/>
                    <permissions>
                        <emailPermission1>N</emailPermission1>
                        <emailAuthorization>Y</emailAuthorization>
                        <emailPermission2>Y</emailPermission2>
                        <emailPermission0>Y</emailPermission0>
                        <emailActivePerm>Y</emailActivePerm>
                        <emailPermission5>N</emailPermission5>
                        <emailPermission6>Y</emailPermission6>
                        <emailPermission3>N</emailPermission3>
                        <emailPermission4>Y</emailPermission4>
                        <emailPermission9>N</emailPermission9>
                        <emailPermission7>N</emailPermission7>
                        <emailPermission8>Y</emailPermission8>
                    </permissions>
                    <order>
                        <orderNumber>1509700075009</orderNumber>
                        <createdDate>2015-04-07 07:50:09</createdDate>
                        <promotionKey>DDOUT</promotionKey>
                        <sourceCode>AE</sourceCode>
                        <sourceCodeDescription>white mail</sourceCodeDescription>
                        <mediumCode>J</mediumCode>
                        <mediumCodeDescription>Internet-realtime</mediumCodeDescription>
                        <specialInfo>88888509707531291</specialInfo>
                        <amountDue>0.00</amountDue>
                        <subscriptionStart>00517</subscriptionStart>
                        <subscriptionStartDescription>JAN13</subscriptionStartDescription>
                        <subscriptionStartCoverDate>2013-01-01</subscriptionStartCoverDate>
                        <subscriptionExpireCoverDate>2013-12-01</subscriptionExpireCoverDate>
                        <subscriptionExpireDescription>DEC13</subscriptionExpireDescription>
                        <vendorTransactionId/>
                        <oldBillKey/>
                        <productName>Green Flying Things</productName>
                        <cancel>N</cancel>
                        <prodId>GFT</prodId>
                        <prodIdAlias>GFT</prodIdAlias>
                        <orderValue>12.00</orderValue>
                        <status>B</status>
                        <statusDescription>Base order</statusDescription>
                        <lastPaymentDate>2015-04-07</lastPaymentDate>
                        <lastPaymentAmount>48.16</lastPaymentAmount>
                        <subscriptionExpire>00528</subscriptionExpire>
                        <creditStatus>G</creditStatus>
                        <creditStatusDescription>Not a credit order</creditStatusDescription>
                        <orderEntry>D</orderEntry>
                        <orderEntryDescription>Credit card</orderEntryDescription>
                        <setCode>B</setCode>
                        <setCodeDescription>Personal gift donor</setCodeDescription>
                        <agencyCode/>
                        <agencyGross>12.00</agencyGross>
                        <currencyCode/>
                        <currencyValue>0.00</currencyValue>
                        <magazineCategory>99</magazineCategory>
                        <newRenewCode>A</newRenewCode>
                        <newRenewCodeDesc>New</newRenewCodeDesc>
                        <taxValue>0.72</taxValue>
                        <orderInd1/>
                        <orderInd2>A</orderInd2>
                        <employeeId>71618</employeeId>
                        <subscriptionOrder>Y</subscriptionOrder>
                        <customer/>
                        <payment>
                            <billingInformation/>
                        </payment>
                        <orderItem>
                            <orderNumber/>
                            <orderTypeCode>B</orderTypeCode>
                            <orderTypeCodeDescription>Personal gift donor</orderTypeCodeDescription>
                            <subscriptionTerm>12</subscriptionTerm>
                            <recipient/>
                        </orderItem>
                        <premiumSwitch>N</premiumSwitch>
                        <orderOrigin/>
                    </order>
                </donor>
                <premiumSwitch>N</premiumSwitch>
                <orderOrigin/>
            </order>
            <multiMag>
                <magAbbreviation>GFT</magAbbreviation>
                <nonGiftAmountDue>N</nonGiftAmountDue>
                <giftAmountDue>N</giftAmountDue>
                <autoRenewal>N</autoRenewal>
                <serviceStatus>A</serviceStatus>
                <serviceStatusDescription>Active</serviceStatusDescription>
                <expireIssue>528</expireIssue>
                <expireIssueDescription>DEC13</expireIssueDescription>
                <expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
                <expireIssueCover>2013-12-01</expireIssueCover>
            </multiMag>
        </customer>
    </globalcustomer>
</transaction>
"""
	
	public static String recRegXML = """
	<response>
		<result>success</result>
		<returnCounts>
			<actualCount>1</actualCount>
			<totalCount>1</totalCount>
		</returnCounts>
		<data>
			<user>
				<id>3897245</id>
				<products>
					<product>
						<systemCode>SERV</systemCode>
						<productCode>WNE</productCode>
						<accountCode>68285352</accountCode>
					</product>
				</products>
				<addresses>
					<address>
						<matchcode>M8Z3E4&amp;&amp;&amp;&amp;&amp;&amp;ROMAN&amp;WIL&amp;&amp;&amp;&amp;</matchcode>
						<prefix/>
						<firstName>WILLIAM</firstName>
						<middleName/>
						<lastName>ROMAN</lastName>
						<suffix/>
						<honoraryName></honoraryName>
						<gender/>
						<companyName></companyName>
						<addressLine1>1 VAN DUSEN BLVD SUITE 270</addressLine1>
						<addressLine2/>
						<addressLine3/>
						<city>TORONTO</city>
						<region>ON</region>
						<zipPlus4/>
						<postalCode>M8Z3E4</postalCode>
						<deliveryPoint/>
						<carrierRoute/>
						<countryCode>CA</countryCode>
						<assignments>
							<assignment>
								<globalCode>M Shanken</globalCode>
								<systemCode>SERV</systemCode>
								<productCode>WNE</productCode>
								<accountCode>68285352</accountCode>
								<virtualDelete>N</virtualDelete>
								<dates>
									<fromDate>2015-09-24</fromDate>
									<throughDate>2015-12-20</throughDate>
								</dates>
							</assignment>
						</assignments>
					</address>
					<address>
						<matchcode>M8Z3J1xxxxxxROMANxWILxxxx</matchcode>
						<prefix/>
						<firstName>WILLIAM</firstName>
						<middleName/>
						<lastName>ROMAN</lastName>
						<suffix/>
						<honoraryName></honoraryName>
						<gender/>
						<companyName></companyName>
						<addressLine1>270 VAN DUSEN BLVD SUITE 1</addressLine1>
						<addressLine2/>
						<addressLine3/>
						<city>TORONTO</city>
						<region>ON</region>
						<zipPlus4/>
						<postalCode>M8Z3J1</postalCode>
						<deliveryPoint/>
						<carrierRoute/>
						<countryCode>CA</countryCode>
						<assignments>
							<assignment>
								<globalCode>M Shanken</globalCode>
								<systemCode>SERV</systemCode>
								<productCode>WNE</productCode>
								<accountCode>68285352</accountCode>
								<virtualDelete>N</virtualDelete>
								<dates>
									<fromDate>2015-12-21</fromDate>
									<throughDate>2059-12-31</throughDate>
									<originalAddress>
									<originalMatchcode>WILM8Z3J2&amp;&amp;&amp;&amp;1-270</originalMatchcode>
									<originalFullName>WILLIAM ROMAN</originalFullName>
									<originalPrefix/>
									<originalFirstName/>
									<originalMiddleName/>
									<originalLastName/>
									<originalSuffix/>
									<originalCompanyName/>
									<originalAddressLine1>1-270 VAN DUSEN BLVD</originalAddressLine1>
									<originalAddressLine2/>
									<originalAddressLine3/>
									<originalCity>TORONTO</originalCity>
									<originalRegion>ON</originalRegion>
									<originalZipPlus4/>
									<originalPostalCode>M8Z3J2</originalPostalCode>
									<originalDeliveryPoint/>
									<originalCarrierRoute/>
									<originalCountryCode>CA</originalCountryCode>
									</originalAddress>
								</dates>
							</assignment>
						</assignments>
					</address>
				</addresses>
				<emails>
					<email>
						<emailAddress>will.roman@rosewoodwine.com</emailAddress>
						<username/>
						<password></password>
						<assignments>
							<assignment>
								<globalCode>M Shanken</globalCode>
								<systemCode>SERV</systemCode>
								<productCode>WNE</productCode>
								<accountCode>68285352</accountCode>
								<isActive>Y</isActive>
							</assignment>
						</assignments>
					</email>
				</emails>
				<phoneNumbers/>
			</user>
		</data>
	</response>"""

	final static String anotherGC = """<transaction success="true"><!--Here is the transaction information from CDS Global-->
<isSuccess>true</isSuccess>
<transactionId>24846394</transactionId>
<transactionDesc>Global Customer</transactionDesc>
<systemName>WSG</systemName>
<prodId>GFT</prodId>
<message/>
<globalcustomer>
<recReg>
<result>success</result>
<actualCount>1</actualCount>
<totalCount>1</totalCount>
<users>
<id>212202</id>
<products>
<systemCode>SERV</systemCode>
<productCode>GFT</productCode>
<accountCode>920219565</accountCode>
<prodIdAlias>GFT</prodIdAlias>
<productName>Green Flying Things</productName>
</products>
<addresses>
<prefix/>
<firstName>MARIAH</firstName>
<middleName/>
<lastName>WILLIAMS</lastName>
<suffix/>
<honoraryName/>
<gender/>
<companyName>ARISTA RECORDS</companyName>
<addressLine1>32815 RODEO DR SUITE 13C</addressLine1>
<addressLine2/>
<addressLine3/>
<city>BEVERLY HILLS</city>
<region>CA</region>
<zipPlus4/>
<countryCode>US</countryCode>
<countryName>UNITED STATES</countryName>
<postalCode>90210</postalCode>
<deliveryPoint/>
<carrierRoute/>
<matchcode>90210&amp;&amp;&amp;&amp;&amp;&amp;&amp;WILLIAMAR&amp;&amp;&amp;&amp;</matchcode>
<assignments>
<globalCode>eCare Test</globalCode>
<systemCode>SERV</systemCode>
<productCode>GFT</productCode>
<accountCode>920219565</accountCode>
<virtualDelete>N</virtualDelete>
<dates>
<fromDate>2015-04-06</fromDate>
<throughDate>2059-12-31</throughDate>
<originalAddress>
<fullName>MARIAH WILLIAMS</fullName>
<prefix/>
<firstName/>
<middleName/>
<lastName/>
<suffix/>
<companyName>ARISTA RECORDS</companyName>
<addressLine1>SUITE 13C</addressLine1>
<addressLine2>32815 RODEO DRIVE</addressLine2>
<addressLine3/>
<city>BEVERLY HILLS</city>
<region>CA</region>
<zipPlus4/>
<countryCode>US</countryCode>
<countryName>UNITED STATES</countryName>
<postalCode>90210</postalCode>
<deliveryPoint/>
<carrierRoute/>
<matchcode>MAR90210&amp;&amp;&amp;&amp;&amp;SUITE</matchcode>
</originalAddress>
</dates>
</assignments>
</addresses>
<emails>
<emailAddress>mariahw@cds.com</emailAddress>
<username/>
<password/>
<assignments>
<globalCode>eCare Test</globalCode>
<systemCode>SERV</systemCode>
<productCode>GFT</productCode>
<accountCode>920219565</accountCode>
<isActive>N</isActive>
</assignments>
</emails>
<emails>
<emailAddress>mariahw@cds.com</emailAddress>
<username>62351359098010053</username>
<password/>
<assignments>
<globalCode>eCare Test</globalCode>
<systemCode>SERV</systemCode>
<productCode>GFT</productCode>
<accountCode>920219565</accountCode>
<isActive>Y</isActive>
</assignments>
</emails>
<phones>
<phoneNumber>5152888418</phoneNumber>
<phoneNumberType/>
<assignments>
<globalCode>eCare Test</globalCode>
<systemCode>SERV</systemCode>
<productCode>GFT</productCode>
<accountCode>920219565</accountCode>
<virtualDelete>N</virtualDelete>
<dates>
<fromDate>2015-04-06</fromDate>
<throughDate>2059-12-31</throughDate>
</dates>
</assignments>
</phones>
</users>
<icare>N</icare>
</recReg>
<customer>
<accountNumber>0920219565</accountNumber>
<name>MARIAH WILLIAMS</name>
<address1>SUITE 13C</address1>
<address2>32815 RODEO DRIVE</address2>
<city>BEVERLY HILLS</city>
<state>CA</state>
<zipCode>90210</zipCode>
<postalCode>90210</postalCode>
<country>UNITED STATES</country>
<email>mariahw@cds.com</email>
<username>62351359098010053</username>
<password>password on file</password>
<phoneNumber>5152888418</phoneNumber>
<faxNumber>5152872436</faxNumber>
<companyName>ARISTA RECORDS</companyName>
<jobTitle>SONGSTRESS</jobTitle>
<department>DIVAS</department>
<serviceStatus>A</serviceStatus>
<serviceStatusDescription>Active</serviceStatusDescription>
<baseCreditStatus>G</baseCreditStatus>
<baseCreditStatusDescription>Not a credit order</baseCreditStatusDescription>
<numberOfCopies>001</numberOfCopies>
<startIssue>00517</startIssue>
<startIssueDescription>JAN13</startIssueDescription>
<startIssueCoverDate>2013-01-01</startIssueCoverDate>
<expireIssue>00528</expireIssue>
<expireIssueDescription>DEC13</expireIssueDescription>
<expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
<lastIssue>00518</lastIssue>
<lastIssueDescription>FEB13</lastIssueDescription>
<lastIssueCoverDate>2013-02-01</lastIssueCoverDate>
<resumeIssueCoverDate/>
<remainingIssues>10</remainingIssues>
<specialProductCode/>
<promotionKey>R1312G00</promotionKey>
<giftPromotionKey/>
<historyOrders>N</historyOrders>
<historyEmails>Y</historyEmails>
<historyNames>N</historyNames>
<customerStatus>A</customerStatus>
<customerStatusDescription>Deliverable</customerStatusDescription>
<productIndicator1>Y</productIndicator1>
<productIndicator2/>
<listRentalSwitch>Y</listRentalSwitch>
<timesRenewed/>
<numberExtensionIssues/>
<addressFromDate>2015-04-06</addressFromDate>
<emailLocation/>
<demographicsAvailable>N</demographicsAvailable>
<prodIdAlias>GFT</prodIdAlias>
<prodId>GFT</prodId>
<resumeIssue/>
<permissions>
<allowGiftAutoRenewal>Y</allowGiftAutoRenewal>
<emailUseAnywherePerm>Y</emailUseAnywherePerm>
<allowPromoteAsRecipient>Y</allowPromoteAsRecipient>
<allowSweepsPromotions>Y</allowSweepsPromotions>
<emailPermission1/>
<emailPermission2/>
<emailAuthorization/>
<allowRegularPromotions>Y</allowRegularPromotions>
<allowPhone>Y</allowPhone>
<emailPermission0/>
<emailPermission5/>
<emailActivePerm>Y</emailActivePerm>
<allowContestPromotions>Y</allowContestPromotions>
<emailPermission6/>
<emailPermission3/>
<emailPermission4/>
<emailPermission9/>
<emailUseForCompanyPerm>Y</emailUseForCompanyPerm>
<emailPermission7/>
<emailPermission8/>
<allowSingleAutoRenewal>Y</allowSingleAutoRenewal>
<allowGiftPromotions>Y</allowGiftPromotions>
</permissions>
<order>
<orderNumber>1509700075009</orderNumber>
<createdDate>2015-04-07 07:50:09</createdDate>
<promotionKey>DDOUT</promotionKey>
<sourceCode>AE</sourceCode>
<sourceCodeDescription>white mail</sourceCodeDescription>
<mediumCode>J</mediumCode>
<mediumCodeDescription>Internet-realtime</mediumCodeDescription>
<specialInfo>88888509707531291</specialInfo>
<amountDue>0.00</amountDue>
<subscriptionStart>00517</subscriptionStart>
<subscriptionStartDescription>JAN13</subscriptionStartDescription>
<subscriptionStartCoverDate>2013-01-01</subscriptionStartCoverDate>
<subscriptionExpireCoverDate>2013-12-01</subscriptionExpireCoverDate>
<subscriptionExpireDescription>DEC13</subscriptionExpireDescription>
<vendorTransactionId/>
<oldBillKey/>
<productName>Green Flying Things</productName>
<cancel>N</cancel>
<prodId>GFT</prodId>
<prodIdAlias>GFT</prodIdAlias>
<orderValue>10.00</orderValue>
<status>B</status>
<statusDescription>Base order</statusDescription>
<subscriptionExpire>00528</subscriptionExpire>
<creditStatus>G</creditStatus>
<creditStatusDescription>Not a credit order</creditStatusDescription>
<orderEntry>D</orderEntry>
<orderEntryDescription>Credit card</orderEntryDescription>
<setCode>C</setCode>
<setCodeDescription>Personal gift recipient</setCodeDescription>
<agencyCode/>
<agencyGross>10.00</agencyGross>
<currencyCode/>
<currencyValue>0.00</currencyValue>
<magazineCategory>99</magazineCategory>
<newRenewCode>A</newRenewCode>
<newRenewCodeDesc>New</newRenewCodeDesc>
<taxValue>0.00</taxValue>
<orderInd1>Y</orderInd1>
<orderInd2>A</orderInd2>
<employeeId>71618</employeeId>
<subscriptionOrder>Y</subscriptionOrder>
<customer/>
<payment>
<creditCardType>P</creditCardType>
<creditCardNumber>5492</creditCardNumber>
<lastCreditCardChargeStatus>P</lastCreditCardChargeStatus>
<creditCardType4Position>ALTP</creditCardType4Position>
<billingInformation/>
</payment>
<orderItem>
<orderNumber/>
<orderTypeCode>C</orderTypeCode>
<orderTypeCodeDescription>Personal gift recipient</orderTypeCodeDescription>
<subscriptionTerm>12</subscriptionTerm>
<recipient/>
</orderItem>
<donor>
<accountNumber>0920219540</accountNumber>
<name>BRENDA WILSON</name>
<address1>SUITE 5A</address1>
<address2>2304 CHERRY ST</address2>
<city>DES MOINES</city>
<state>IA</state>
<zipCode>50315</zipCode>
<postalCode>50315</postalCode>
<country>UNITED STATES</country>
<email>ljohnson@cds-global.com</email>
<username/>
<password/>
<phoneNumber>5152477500</phoneNumber>
<faxNumber>5152461234</faxNumber>
<companyName>MID AMERICAN ENERGY</companyName>
<jobTitle>ACCOUNTANT</jobTitle>
<department>BILLING</department>
<serviceStatus>A</serviceStatus>
<serviceStatusDescription>Active</serviceStatusDescription>
<numberOfCopies>003</numberOfCopies>
<startIssue>00517</startIssue>
<startIssueDescription>JAN13</startIssueDescription>
<startIssueCoverDate>2013-01-01</startIssueCoverDate>
<expireIssue>00528</expireIssue>
<expireIssueDescription>DEC13</expireIssueDescription>
<expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
<lastIssue>00518</lastIssue>
<lastIssueDescription>FEB13</lastIssueDescription>
<lastIssueCoverDate>2013-02-01</lastIssueCoverDate>
<resumeIssueCoverDate/>
<remainingIssues>10</remainingIssues>
<specialProductCode/>
<promotionKey>R1312G00</promotionKey>
<giftPromotionKey>U20172</giftPromotionKey>
<historyEmails>N</historyEmails>
<historyNames>N</historyNames>
<customerStatus>A</customerStatus>
<customerStatusDescription>Deliverable</customerStatusDescription>
<productIndicator1>Y</productIndicator1>
<productIndicator2/>
<listRentalSwitch>Y</listRentalSwitch>
<timesRenewed/>
<numberExtensionIssues/>
<addressFromDate>2015-04-06</addressFromDate>
<emailLocation>W</emailLocation>
<resumeIssue/>
<permissions>
<emailPermission1>N</emailPermission1>
<emailAuthorization>Y</emailAuthorization>
<emailPermission2>Y</emailPermission2>
<emailPermission0>Y</emailPermission0>
<emailActivePerm>Y</emailActivePerm>
<emailPermission5>N</emailPermission5>
<emailPermission6>Y</emailPermission6>
<emailPermission3>N</emailPermission3>
<emailPermission4>Y</emailPermission4>
<emailPermission9>N</emailPermission9>
<emailPermission7>N</emailPermission7>
<emailPermission8>Y</emailPermission8>
</permissions>
<order>
<orderNumber>1509700075009</orderNumber>
<createdDate>2015-04-07 07:50:09</createdDate>
<promotionKey>DDOUT</promotionKey>
<sourceCode>AE</sourceCode>
<sourceCodeDescription>white mail</sourceCodeDescription>
<mediumCode>J</mediumCode>
<mediumCodeDescription>Internet-realtime</mediumCodeDescription>
<specialInfo>88888509707531291</specialInfo>
<amountDue>0.00</amountDue>
<subscriptionStart>00517</subscriptionStart>
<subscriptionStartDescription>JAN13</subscriptionStartDescription>
<subscriptionStartCoverDate>2013-01-01</subscriptionStartCoverDate>
<subscriptionExpireCoverDate>2013-12-01</subscriptionExpireCoverDate>
<subscriptionExpireDescription>DEC13</subscriptionExpireDescription>
<vendorTransactionId/>
<oldBillKey/>
<productName>Green Flying Things</productName>
<cancel>N</cancel>
<prodId>GFT</prodId>
<prodIdAlias>GFT</prodIdAlias>
<orderValue>12.00</orderValue>
<status>B</status>
<statusDescription>Base order</statusDescription>
<lastPaymentDate>2015-04-07</lastPaymentDate>
<lastPaymentAmount>48.16</lastPaymentAmount>
<subscriptionExpire>00528</subscriptionExpire>
<creditStatus>G</creditStatus>
<creditStatusDescription>Not a credit order</creditStatusDescription>
<orderEntry>D</orderEntry>
<orderEntryDescription>Credit card</orderEntryDescription>
<setCode>B</setCode>
<setCodeDescription>Personal gift donor</setCodeDescription>
<agencyCode/>
<agencyGross>12.00</agencyGross>
<currencyCode/>
<currencyValue>0.00</currencyValue>
<magazineCategory>99</magazineCategory>
<newRenewCode>A</newRenewCode>
<newRenewCodeDesc>New</newRenewCodeDesc>
<taxValue>0.72</taxValue>
<orderInd1/>
<orderInd2>A</orderInd2>
<employeeId>71618</employeeId>
<subscriptionOrder>Y</subscriptionOrder>
<customer/>
<payment>
<billingInformation/>
</payment>
<orderItem>
<orderNumber/>
<orderTypeCode>B</orderTypeCode>
<orderTypeCodeDescription>Personal gift donor</orderTypeCodeDescription>
<subscriptionTerm>12</subscriptionTerm>
<recipient/>
</orderItem>
<premiumSwitch>N</premiumSwitch>
<orderOrigin/>
</order>
</donor>
<premiumSwitch>N</premiumSwitch>
<orderOrigin/>
</order>
<multiMag>
<magAbbreviation>GFT</magAbbreviation>
<nonGiftAmountDue>N</nonGiftAmountDue>
<giftAmountDue>N</giftAmountDue>
<autoRenewal>N</autoRenewal>
<serviceStatus>A</serviceStatus>
<serviceStatusDescription>Active</serviceStatusDescription>
<expireIssue>528</expireIssue>
<expireIssueDescription>DEC13</expireIssueDescription>
<expireIssueCoverDate>2013-12-01</expireIssueCoverDate>
<expireIssueCover>2013-12-01</expireIssueCover>
</multiMag>
</customer>
</globalcustomer>
</transaction>
"""
}
	