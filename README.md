# 🚀 Units Converter API (Spring Boot)

## 📌 Project Overview

This project is a **Spring Boot-based REST API** that provides unit conversion functionalities for different domains such as:

* 📏 Length Conversion
* ⚖️ Weight Conversion
* 🧴 Volume Conversion
* 💾 Data Conversion (MB, GB, TB)
* ⏱️ Time Conversion
* 🌍 Time Zone Conversion

The application is designed using **clean architecture, REST APIs, and Java 8+ Date-Time API**.

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Web MVC
* Maven
* REST API
* Java Time API (`ZonedDateTime`, `ZoneId`)

---

## 📂 Project Structure

```
com.example.UnitsConverter
│
├── controller
│     ├── ConvertingController.java
│     ├── DataConvertController.java
│     └── TimeController.java
│
├── service
│     ├── ConversionService.java
│     ├── DataConvertingService.java
│     └── TimeService.java
│
├── model
│     └── ConverterModel.java
│
└── UnitsConverterApplication.java
```

---

## 🔥 Features

✅ Multiple unit conversions
✅ RESTful API design
✅ Modular structure (Controller → Service → Model)
✅ Cross-Origin support (`@CrossOrigin`)
✅ Clean and scalable code
✅ Supports real-time time zone conversion

---

## 🌐 API Endpoints

### 📏 General Conversion

**POST** `/convert`

```json
{
  "value": 2,
  "fromUnit": "km",
  "toUnit": "m"
}
```

---

### 💾 Data Conversion

**GET** `/data/{value}/{from}/{to}`

Example:

```
/data/2048/MB/GB
```

👉 Output: `2`

---

### ⏱️ Time Conversion

**POST** `/time`

```json
{
  "value": 2,
  "fromUnit": "h",
  "toUnit": "min"
}
```

---

### 🌍 Time Zone Conversion

**POST** `/timezone`

Parameters:

```
from=IST
to=PST
```

👉 Converts current time between zones

---

## ▶️ How to Run

### 1️⃣ Clone Project

```
git clone <https://github.com/Ram0718/ConvertersHub>
```

### 2️⃣ Open in IDE

* Eclipse / IntelliJ

### 3️⃣ Run Application

Run:

```
UnitsConverterApplication.java
```

### 4️⃣ Access API

```
http://localhost:8080
```

---

## 🧪 Testing Tools

* Postman
* Browser (for GET APIs)

---

## 💡 Key Concepts Used

* REST Controllers (`@RestController`)
* Dependency Injection (`@Autowired`)
* Service Layer Architecture
* Java Time API (`ZonedDateTime`)
* Map-based conversions
* Cross-Origin support

---

## 🚀 Future Enhancements

* ✅ Add Global Exception Handling
* ✅ Add Validation (`@Valid`)
* ✅ Swagger API Documentation
* ✅ React Frontend UI
* ✅ Database support for history

---

## 💼 Resume Description

> Developed a **Spring Boot-based Units Converter REST API** supporting multiple conversion types including data, time, and timezone, using clean architecture and Java 8 Date-Time API.

---

## 🙌 Author

**Rambabu Darnasi**
Java Developer

---
