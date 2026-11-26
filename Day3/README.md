# Day 03 - First Selenium Code

## Goal
Run the first Selenium automation code in our system.

## Steps to Create the Project
1. Create a Maven project in Eclipse or IntelliJ.
2. Under `src/main/java`, right click and create a **package**.
3. Under the package, create a **class**.
4. Write the Selenium code in the class and run it.

## Dependencies
Since we work with Selenium, we must change `pom.xml` and add the required dependencies. Without changing `pom.xml` the Selenium code will not work.

Two dependencies are added inside the `<dependencies>` tag:
1. **Selenium Java**
2. **WebDriver Manager**

### How to add a dependency
1. Open the Maven Repository website (mvnrepository.com).
2. Search for **Selenium Java** and open the latest version.
3. Copy the dependency and paste it inside `<dependencies>` in `pom.xml`.
4. Do the same for **WebDriver Manager**.
5. Click **Reload** (Maven reload button on the right side) so the jar files are downloaded.

If a version does not work, go back to the repository, copy an older version (for example a lower version) and modify the dependency.

## What is WebDriver?
WebDriver is an interface in Selenium used to control the browser. We write code, and WebDriver opens the browser and performs the actions for us.

## Why Chrome Browser?
The code uses `ChromeDriver`, so the Chrome browser must be installed in the system to run the code.

## Why do we add the dependency?
The dependency downloads the Selenium jar files. These jar files give us the classes like `WebDriver` and `ChromeDriver`.

## Basic Code Flow
1. Create a `WebDriver` object using `new ChromeDriver()`.
2. Open a website using `driver.get(url)`.
3. Run the class. The Chrome browser opens and loads the page.

## Key Points
- Add dependencies in `pom.xml` and reload the project.
- If you get any error while running, check the dependency version.
- Make sure Chrome is installed. 
