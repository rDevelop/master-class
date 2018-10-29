# Linked List

4 bytes for each int
Formula for address = index * 4 + base value

Index Address Value
0      100     250         // Base value = 100
1      104     45
2      108     34
3      112     93          index * 4 + base
(100 + 3 * 4 = 112)


8 byte address for doubles

String use 8 bit string address to another address with string

Index Address String Adress     String Address Value
0      100     1045                 1050      "Hello World"
1      108     1032                 1032      "Byte"
2      116     1050                 1045      "Taco"
3      124     4000                 4000      "Bravo"
(100 + 3 * 8 = 124)

Iterate through string linked list would print (by index):
Taco
Byte
Hello World
Bravo

