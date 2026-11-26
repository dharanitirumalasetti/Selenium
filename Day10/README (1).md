# Day 10 – Dropdown Handling and Synchronization in Selenium

## 📌 Overview

Practiced dropdown handling and synchronization techniques using Selenium WebDriver with Java. Learned how to select dropdown options and handle dynamically loaded web elements using different waiting mechanisms.

## 📚 Topics Covered

### 1. Dropdown Handling

- Select class
- selectByVisibleText()
- selectByValue()
- selectByIndex()
- getFirstSelectedOption()

### 2. Synchronization and Waits

- Thread.sleep()
- Implicit Wait
- Explicit Wait
- Fluent Wait

### 3. Explicit Wait Methods

- WebDriverWait
- ExpectedConditions
- visibilityOfElementLocated()
- elementToBeClickable()
- until()

### 4. Fluent Wait Methods

- withTimeout()
- pollingEvery()
- ignoring()
- Custom conditions using lambda expressions

## 📂 Programs Implemented

| File | Description |
|---|---|
| DropdownDemo.java | Handling dropdowns using the Select class |
| ThreadSleepDemo.java | Implementing fixed waiting time |
| ImplicitWaitDemo.java | Handling global element-location waits |
| ExplicitWaitDemo.java | Waiting for specific element conditions |
| FluentWaitDemo.java | Implementing customized waiting mechanisms |

## 🔍 Key Learnings

- Handling HTML dropdowns using Selenium WebDriver.
- Selecting options using text, value and index.
- Understanding synchronization in automation testing.
- Handling dynamically loaded web elements.
- Understanding the differences between implicit, explicit and fluent waits.
- Configuring polling intervals and ignored exceptions.
- Reducing unnecessary waiting time in automation scripts.

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- ChromeDriver
- Eclipse / IntelliJ IDEA
- Git and GitHub

## 🌐 Practice Website

https://the-internet.herokuapp.com/

## 🎯 Outcome

Gained practical knowledge of dropdown handling and synchronization techniques to develop more reliable and efficient Selenium automation scripts.