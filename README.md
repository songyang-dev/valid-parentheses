# Valid Parentheses with Java
Valid parentheses is a problem testing the knowledge of data structures and programming. It is a popular problem to solve on [Leetcode](https://leetcode.com/problems/valid-parentheses/).

This repo provides a command line app that checks whether a given string contains valid parentheses.

## Getting started
### Installation
You need the following to compile and run this code.
- Java JDK, preferably version 17
- Gradle, preferably version 7.6

If you do not have Gradle, you can also use the Gradle Wrapper available in this repo to download a quick use Gradle.

On Bash
```
./gradlew
```

On Windows
```
.\gradlew.bat
```

### Compiling
On any terminal with the required software installed, you can run from the repo root folder
```
gradle build
```

To generate the Javadoc,
```
gradle javadoc
```

Gradle will put the Javadoc in `app/build/docs`. Double click the `index.html` to view it.

### Running
To run, use gradle
```
gradle run --args="your_string_to_validate"
```

## Pseudocode
The pseudocode of the solution algorithm is the following.
1. Create an empty stack.
2. Iterate through the string `s`, character by character.
3. For each character representing an opening bracket of any shape, push it to the stack. Items on the stack will only contain opening brackets.
4. For each character representing a closing bracket of any shape, pop the latest item from the stack.
5. If the popped item doesn't have the same shape as the closing bracket, then return `false`.
6. When the iteration is done, check if the stack is empty. If so, return `true`. Otherwise, return `false`.