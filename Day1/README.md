# Day 01 - Automation Testing Basics

## Manual Testing
Testing an application manually, step by step, without using any tool. We check whether the actual result matches the expected result.

## Manual vs Automation Testing
- Manual testing is done by a person. Automation testing is done using scripts and tools.
- Manual is slower. Automation is faster.
- Manual is not good for repeating the same tests again and again. Automation is good for that.
- Automation needs programming knowledge (Java).

## Test Case
A set of steps with input data and expected result to check a feature.
- **High level test case:** short, general description.
- **Low level test case:** detailed steps with data and expected result.

## Test Scenario
A one line statement of what to test. Example: Verify login functionality. One scenario can have many test cases.

## How to Reduce Test Steps
- Keep one objective in each test case.
- Remove repeated steps.
- Combine related steps.
- Keep steps short and clear.

## Automation Testing
Running test cases automatically using tools and scripts instead of doing them manually. We will use Java for automation.

## Requirements for Automation
- Java (JDK)
- IDE: Eclipse and IntelliJ

---

## Installation Steps

### 1. Install Java (JDK)
1. Go to the Oracle JDK or Adoptium (Temurin) download page.
2. Download the JDK installer for your operating system (use a LTS version such as 17 or 21).
3. Run the installer and click Next until it finishes.
4. Set the environment variable (Windows):
   - Search "Edit the system environment variables" and open it.
   - Click **Environment Variables**.
   - Under System variables, click **New**: name `JAVA_HOME`, value = JDK install path (example: `C:\Program Files\Java\jdk-21`).
   - Edit **Path** and add `%JAVA_HOME%\bin`.
5. Verify in Command Prompt:
   ```
   java -version
   javac -version
   ```

### 2. Install Eclipse IDE
1. Go to the Eclipse download page: https://www.eclipse.org/downloads/
2. Click **Download** and get the Eclipse Installer.
3. Run the installer and choose **Eclipse IDE for Java Developers**.
4. Select the installation folder and click **Install**.
5. Click **Launch** after installation.
6. Choose a workspace folder when asked and click **Launch**.

### 3. Install IntelliJ IDEA
1. Go to the IntelliJ download page: https://www.jetbrains.com/idea/download/
2. Download **IntelliJ IDEA Community Edition** (free) for your operating system.
3. Run the installer and click Next. Tick the options "Add launchers dir to PATH" and "Create Desktop Shortcut" if you want.
4. Click **Install** and then **Finish**.
5. Open IntelliJ IDEA and accept the terms.
6. Check the setup: create a new project, select the JDK installed earlier, and run a simple project to confirm it works.
