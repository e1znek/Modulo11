# Modulo11
Checks control number of a account number to see if it was entered correctly.
An account number with control number may look like this: 
12345678903
Here we have the last digit, 3, being the control number. A set list of weight numbers: [2, 3, 4, 5 ,6 ,7] will be multiplied to each digit of the account number. Starting from the right most account number the products are added together. The weight list numbers will cycle through, so 2,3,4,5,6,7,2,3,4, etc.
The example will be applied as followed 0*2 + 9*3 + 8*4 + 7*5 + 6*6 + 5*7 + 4*2 + 3*3 + 2*4 + 1*5.
This sum will be divided by 11 and the remainder can equal 0->10. 11 minus the remainder will get the control number.
if the control number does not corospond to the result then it the number was entered incorectly. Also the control number cannot be 10 as it uses two digits and will not be a valid solution.
