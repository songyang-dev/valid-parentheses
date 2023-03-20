# Pseudocode
The pseudocode of the solution algorithm is the following.
1. Create an empty stack.
2. Iterate through the string `s`, character by character.
3. For each character representing an opening bracket of any shape, push it to the stack. Items on the stack will only contain opening brackets.
4. For each character representing a closing bracket of any shape, pop the latest item from the stack.
5. If the popped item doesn't have the same shape as the closing bracket, then return `false`.
6. When the iteration is done, check if the stack is empty. If so, return `true`. Otherwise, return `false`.