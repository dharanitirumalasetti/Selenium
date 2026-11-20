# Day 07 - CSS Selector Recap and XPath Basics

## CSS Selector
- CSS selector is one of the ways to locate a web element. It identifies the element using the attribute and attribute value in the HTML.
- In real time, CSS selector is used only in some cases, not daily.
- It is the **last option**. If an element cannot be identified using the other locators (id, name, className, linkText etc.), then use the CSS selector.
- Simple selector and attribute selector are the most important and the daily used ones.
- Interview question: *What is a CSS selector?* How to identify it in a simple way: use the tag name, attribute and attribute value.
- Two variations: using only one attribute, or using both attribute and attribute value.

## XPath
XPath is used to locate an element on the web page. It follows the same pattern: tag name, attribute, attribute value.

### Syntax (using attribute)
```
//tagname[@attribute='attributevalue']
```
- `//` - search anywhere in the page
- `tagname` - tag of the element
- `@` - used before the attribute name
- `attribute='value'` - attribute and its value
- Everything goes inside the square brackets `[ ]`.

### XPath using text (for links)
- Link means the **anchor tag** (`a`).
- For a text based link, use the visible text of the link.
```
//a[text()='link text']
//a[.='link text']
```
- `.` (dot) means the full text of the element.
- Close every bracket properly.

### Multiple matches
- Sometimes the XPath matches more than one element (for example "1 of 2" matches).
- In that case we need to make it unique, for example by using an **index**.
```
(//a[text()='link text'])[1]
```

## Key Points
- First understand the syntax: tag name, attribute, attribute value.
- XPath should identify only one element (unique).
- Practice each type with real examples.
