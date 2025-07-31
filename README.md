# 🧼 SOAP & REST API Testing Project — Manual (SoapUI Tool) + Automation (Java)

## 📌 Overview

This project showcases **SOAP** and **REST API testing** performed both **manually using the SoapUI SmartBear tool** and **automated using Java in Eclipse**. The focus is on mastering WSDL-based APIs, CRUD operations, property transfers, scripting, and test organization — across multiple domains:

- 📍 **Place APIs (CRUD)**
- 📚 **Library Management System**
- 👩‍💼 **Employee Portal API**
- 🌍 **Country Info API**

Both **SOAP** and **REST** protocols were explored. The manual projects demonstrate **Property Transfers**, **Data-Driven Testing**, and **Groovy scripting**, while the automation side uses Java with Maven and TestNG for structured execution.

---

## 🧰 Tech Stack & Tools Used

![SoapUI](https://img.shields.io/badge/SoapUI-SmartBear-green?logo=soapui)
![Java](https://img.shields.io/badge/Java-11-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36?logo=apachemaven)
![TestNG](https://img.shields.io/badge/TestNG-7.9.0-FF6C37?logo=testng)
![Eclipse IDE](https://img.shields.io/badge/Eclipse-2024--06-purple?logo=eclipseide)
![Groovy](https://img.shields.io/badge/Groovy-Scripting-yellow)
![SOAP](https://img.shields.io/badge/SOAP-WSDL%20Testing-blue)
![REST](https://img.shields.io/badge/REST-CRUD%20Flows-orange)
![WSDL](https://img.shields.io/badge/WSDL-Contract%20First-lightblue)

---

## 🧪 Manual Testing in SoapUI Tool

### ✅ Key Functionalities Used

- 🧾 **SOAP and REST projects**
- 🔁 **CRUD operations** (Create, Read, Update, Delete)
- 🔐 **Authentication headers** (for secured APIs)
- 🔀 **Property Transfers** (between requests and test steps)
- ✍️ **Groovy Scripts** for:
  - Custom logic/assertions
  - Dynamic test flow
  - Randomized inputs
- 📄 **Assertions**:
  - XPath match
  - Contains / Not Contains
  - HTTP Status Codes

### 🧼 Sample WSDLs Used

- 📍 `http://www.dneonline.com/calculator.asmx?WSDL`
- 🧑‍💼 `http://216.10.245.166:8080/axis2/services/EmployeeManagementService?wsdl`
- 🌍 `http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL`

# 🧼 SOAP & REST API Testing Project — Manual (SoapUI Tool) + Automation (Java)

## 📌 Overview

This project showcases **SOAP** and **REST API testing** performed both **manually using the SoapUI SmartBear tool** and **automated using Java in Eclipse**. The focus is on mastering WSDL-based APIs, CRUD operations, property transfers, scripting, and test organization — across multiple domains:

- 📍 **Place APIs (CRUD)**
- 📚 **Library Management System**
- 👩‍💼 **Employee Portal API**
- 🌍 **Country Info API**

Both **SOAP** and **REST** protocols were explored. The manual projects demonstrate **Property Transfers**, **Data-Driven Testing**, and **Groovy scripting**, while the automation side uses Java with Maven and TestNG for structured execution.

---

## 🧰 Tech Stack & Tools Used

![SoapUI](https://img.shields.io/badge/SoapUI-SmartBear-green?logo=soapui)
![Java](https://img.shields.io/badge/Java-11-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36?logo=apachemaven)
![TestNG](https://img.shields.io/badge/TestNG-7.9.0-FF6C37?logo=testng)
![Eclipse IDE](https://img.shields.io/badge/Eclipse-2024--06-purple?logo=eclipseide)
![Groovy](https://img.shields.io/badge/Groovy-Scripting-yellow)
![SOAP](https://img.shields.io/badge/SOAP-WSDL%20Testing-blue)
![REST](https://img.shields.io/badge/REST-CRUD%20Flows-orange)
![WSDL](https://img.shields.io/badge/WSDL-Contract%20First-lightblue)

---

## 🧪 Manual Testing in SoapUI Tool

### ✅ Key Functionalities Used

- 🧾 **SOAP and REST projects**
- 🔁 **CRUD operations** (Create, Read, Update, Delete)
- 🔐 **Authentication headers** (for secured APIs)
- 🔀 **Property Transfers** (between requests and test steps)
- ✍️ **Groovy Scripts** for:
  - Custom logic/assertions
  - Dynamic test flow
  - Randomized inputs
- 📄 **Assertions**:
  - XPath match
  - Contains / Not Contains
  - HTTP Status Codes

### 🧼 Sample WSDLs Used

- 📍 `http://www.dneonline.com/calculator.asmx?WSDL`
- 🧑‍💼 `http://216.10.245.166:8080/axis2/services/EmployeeManagementService?wsdl`
- 🌍 `http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL`

---

## 🚀 How to Run Tests (Maven CLI)

### 🧪 Run All Tests

```bash
mvn clean test
