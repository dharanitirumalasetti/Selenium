# Day 06 - Locator Syntax and CSS Selectors

## Syntax of a Locator
Before writing any locator, first understand the syntax. Every element on a web page follows this order:

1. **Tag name**
2. **Attribute**
3. **Attribute value**

- A tag can have one or many attributes, and each attribute has a value.
- Attribute name examples: `id`, `name`, `class`, link text, partial link text.
- Attribute value is the value the web developer gives to that attribute.
- Example: for the Google logo, the tag has one attribute `id`, and the value of it is `logo`. Sometimes the developer gives one or two or more attributes.

## 8 Locators in Selenium
1. **id** - uses the `id` attribute value of the element.
2. **name** - uses the `name` attribute value.
3. **className** - uses the `class` attribute value.
4. **tagName** - uses the HTML tag name (for example `input`, `a`).
5. **linkText** - uses the full visible text of a link.
6. **partialLinkText** - uses part of the visible text of a link.
7. **cssSelector** - uses tag name, attribute and attribute value.
8. **xpath** - uses the path of the element in the HTML (XML path).

Locators 1 to 6 are simple and used first. CSS selector and XPath are used when the element cannot be identified with the others.

## CSS Selector
CSS selectors are of four types:
1. Simple selector
2. Attribute selector
3. Pseudo-class selector
4. Combinator selector

Only two are mostly used in real projects nowadays: **simple selector** and **attribute selector**. So we focus on these two first.

### Simple Selector
Uses the tag name and the id or class value.

### Attribute Selector
Uses the tag name, the attribute and the attribute value.

### How to write
- Follow the same order: tag name, then attribute, then attribute value.
- With ID: `tagname#idvalue`
- With class: `tagname.classvalue`
- With any attribute: `tagname[attribute='value']`

## Coming Next
- XPath.
- More CSS selector practice.
