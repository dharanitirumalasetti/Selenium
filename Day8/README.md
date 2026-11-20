# Day 08 - CSS Selector Syntax and XPath (Absolute and Relative)

## CSS Selector Recap
There are two ways to write a CSS selector:
1. Using only the attribute (id or class)
2. Using attribute and attribute value

### Using ID
Add `#` before the id value.
```
tagname#idvalue
```

### Using Class
Add `.` before the class value.
```
tagname.classvalue
```

### Using Attribute and Attribute Value
Use square brackets, and inside them the attribute and its value.
```
tagname[attribute='value']
```

### Starts with / Ends with
- Starts with: `^=`
- Ends with: `$=`
```
tagname[attribute^='value']
tagname[attribute$='value']
```

## XPath
- XPath means **XML Path**.
- It is used to identify a web element through the HTML tags of the page.
- XPath is the **last option**. Use it when the element cannot be identified using the other locators, or when the value is not unique.
- It is a very important and common interview question in companies.

### Why XPath?
- Example: searching an element on Google gave 62 matches, so it is **not unique**.
- If the element is not unique, it is difficult to use in the Selenium code.
- In such cases we use XPath.

### Types of XPath
1. Absolute XPath
2. Relative XPath

## Absolute XPath
- Starts from the root `html` tag and follows the full path of tags to the element.
- Path goes like: `html` > `body` > `div` > `form` > `input` ... with index numbers.
- Starts with a single slash `/`.
```
/html/body/div[1]/form/input[2]
```
- Why it is not used nowadays:
  - Very difficult to write.
  - Time taking process.
  - Uses indexes, so it is not stable (breaks easily when the page changes).
- Companies used it 8 to 10 years back. We should still know the syntax.

## Relative XPath
- Can start from anywhere in the page (any element).
- Starts with double slash `//`.
- Very useful and user friendly, so companies follow this one now.
```
//tagname[@attribute='value']
```
Example: an `input` tag with attributes id, class, name. We can use any one of them.
```
//input[@id='idvalue']
//input[@class='classvalue']
//input[@name='namevalue']
```

## Key Points
- Locators are very important in automation. Go through each locator one by one and understand it.
- There are 8 locators in Selenium: id, name, className, tagName, linkText, partialLinkText, cssSelector, xpath.
- Understand how to identify a locator and how to call the web element using Selenium.
