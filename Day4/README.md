# Day 04 - Running Selenium Code and Finding Elements

## Running the Code
- Run the code in the IDE (Eclipse or IntelliJ).
- If the code has an error, check the line number shown in the error (for example a wrong or missing import).
- When the page loads properly the code runs successfully.

## Working with a Login Page
- Open the application login page using `driver.get(url)`.
- Find the text field and pass a value into it using `sendKeys()`.
- Then find the button and click it.

## Why an Element is Not Found
- Selenium can only identify what is present on the web page.
- If the element is not loaded or not visible yet, Selenium cannot identify it and throws an exception (error).
- A common reason is the page is still loading (slow internet or the page not fully opened).
- Selenium must see the web page first, and only then can it identify the required element.
- Fix: give the page some time to load, then find the element.

## Maximize the Browser
- If the page is not fully visible, maximize the browser window.
- Use `driver.manage().window().maximize()`.

## Remember
- Code that only opens the browser is enough to start (`new ChromeDriver()` and `driver.get()`).
- Try to understand the code, run it in the IDE and push it to GitHub.

## Coming Next
- How to find elements.
- XPath and CSS selectors.
- JavaScript Executor.
- Why we use click.
- How to pass values. 
