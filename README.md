# Palindrome-and-Armstrong-Number-Generator

This is a simple Java program that generates palindrome numbers or Armstrong numbers up to a user-specified limit. Users can interact with the program via the command line to choose the desired functionality.

Features
Palindrome Numbers:

Numbers that read the same backward as forward (e.g., 121, 131).
Armstrong Numbers:

Numbers that are equal to the sum of their digits raised to the power of the total number of digits (e.g., 153, 370).
Input Validation:

Ensures users enter valid choices (1 or 2).
Handles non-negative limits for number generation.
How It Works
The program prompts the user to choose one of the following options:

Generate palindrome numbers (1).
Generate Armstrong numbers (2).
The user specifies an upper limit for the numbers to be generated.

Based on the input:

Palindrome numbers are determined by reversing each number and checking if it matches the original.
Armstrong numbers are calculated by summing each digit raised to the power of the total number of digits.
The results are displayed in the console.

Examples
Example 1: Palindrome Numbers
Input:

Choice: 1
Limit: 150

Output:
Palindrome Numbers: 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101 111 121 131 141

Example 2: Armstrong Numbers
Input:

Choice: 2
Limit: 500

Output:
Armstrong Numbers: 1 2 3 4 5 6 7 8 9 153 370 371 407
