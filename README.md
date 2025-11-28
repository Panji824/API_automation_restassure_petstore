# Petstore API Automation Testing (Rest Assured + TestNG)

This project is a learning portfolio demonstrating how to perform **API automation testing** using **Rest Assured**, **TestNG**, and **JSON Schema Validation**.  
It uses the **Swagger Petstore API** as the testing target and includes multiple test suites to validate different API endpoints such as **User**, **Pet**, and **Store (Order)**.

---

## 🚀 Project Overview

The purpose of this project is to practice and showcase:

- REST API automation using **Rest Assured**
- Test structuring with **TestNG**
- Request body handling using JSON files
- JSON Schema Validation
- Organizing test suites by module (Pet, Store, User)
- Creating a single test runner using **testng.xml**
- Clean and maintainable API test automation code

This project is part of my personal learning journey to strengthen backend QA automation skills.

---

## 📁 Project Structure

```
src
└── test
    ├── java
    │   └── petstoreApi
    │       ├── config
    │       │   └── baseUrl.java
    │       ├── runner
    │       │   └── runnerAPI.java
    │       ├── schema
    │       │   ├── orderSchema.json
    │       │   ├── petSchema.json
    │       │   └── userSchema.json
    │       └── test
    │           ├── petSuiteTest.java
    │           ├── storeSuiteTest.java
    │           └── userSuiteTest.java
    └── resources
        └── dataRequestBody
            ├── createOrder.json
            ├── createPet.json
            └── createUser.json
```


---

## 🧪 Test Suites Included

### **1. Pet Suite (`petSuiteTest`)**
Covers:
- Creating a pet  
- Getting pet details  
- Updating pet data  
- Deleting pet  

### **2. Store Suite (`storeSuiteTest`)**
Covers:
- Creating an order  
- Fetching order details  
- Inventory retrieval  
- JSON schema validation  

### **3. User Suite (`userSuiteTest`)**
Covers:
- User registration  
- User login  
- Searching user by username  
- Updating user information  
- JSON schema validation  

---

## ▶️ How to Run Tests

### **Option 1 — Using testng.xml (Recommended)**
Run the full test suite:

### **Option 2 — Using runnerAPI.java**
Runs tests through Java main class:

---

## 🔧 Technologies Used

| Technology | Purpose |
|-----------|---------|
| **Rest Assured** | API automation |
| **TestNG** | Test runner & grouping |
| **JSON Schema Validator** | Response validation |
| **Maven** | Dependency management |
| **Swagger Petstore API** | Target API |

---

## 📚 Learning Objectives

This project was created to:

- Improve understanding of API automation fundamentals  
- Practice writing structured and maintainable Java test code  
- Implement JSON schema validation  
- Gain experience with TestNG suite execution  
- Build a portfolio piece for QA Automation job applications  

---

## 📝 Future Enhancements

- Add Allure Reporting  
- Add Faker for dynamic randomized test data  
- Add negative test cases  
- Integrate CI/CD (GitHub Actions or Jenkins)  
- Add parallel execution support  

---

## 👤 Author
Panji Wirya Pastika
This project is part of my personal learning portfolio in **API Test Automation using Rest Assured**.

