# Day 05 - Opening Multiple Browsers

## Exception when an element is not found
- If Selenium cannot find a particular web element, it throws an exception.
- The remaining code after that line will not execute.
- So we modify the code so the element is identified properly, and then the rest of the code runs.

## Requirement
Open multiple browsers (Chrome, Firefox, Edge) and close them after the code execution is completed.

## Approach
1. Write a separate method for each browser.
2. Store all the `WebDriver` objects in a list.
3. Use a for-each loop to close all the browsers.

## Why the driver is declared at class level
- The driver (list) is declared at class level, outside the methods.
- Because of this, we can access it directly inside any method of the class.
- If it is declared inside one method, other methods cannot use it.

## Why use a List?
- We have multiple browsers, so multiple `WebDriver` objects.
- Java provides collections like `ArrayList` to store multiple objects.
- Here `List<WebDriver>` stores all the WebDriver instances, and we can call them one by one.

## How the code works
1. Create `List<WebDriver> allDrivers` at class level.
2. Method for each browser: create the driver (`new ChromeDriver()`, `new FirefoxDriver()`, `new EdgeDriver()`), add it to the list, open the URL and maximize the window.
3. Call all the methods from the `main` method.
4. Use a for-each loop over `allDrivers` and call `close()` on each driver, so all the browsers close.

## For-each loop
Used to go through every element of a list one by one. Here each driver is taken as `d` and we call `d.close()`.

## Key Points
- Different browsers can be opened with different URLs.
- Each browser opens, then it is closed at the end.
- Understand the behaviour of each line of the code.
