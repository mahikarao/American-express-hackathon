# American-express-hackathon
This was a question from hackerearth platform. The difficulty level was low and was for beginners. While coding the solution, I found many interesting edge-cases of inbuilt functions in Java. Please give a read! : )

#Main Logic:
From an array of input prices of stocks, the idea is to check if a value given at a position is the maximum value with respect to all the other values positioned right side of it.

Method1-
input_array(String input):- Method to extract integer values of stock price from a sequence of integers separated with " " but given as string. First we separate the integers using 'split()' function and then convert them to integers since originally it was given as string type using 'Integer.parseInt()' function.
This method returns an array of integers to the caller. For this problem it represents the stock prices for a given test case.

Method2-
lucky_days(int [] int_tokens):- We are lucky if the price of today is highest as compared to the price of future days. Method2 is used to perform this comparison. In other words, we have to check if the price of today(value of current position in array) is MAXIMUM with all the price in future(values present on RIGHT SIDE TO CURRENT POSITION in the array).
This method returns an integer value representing total number of lucky days for a test case.
