1. Create a class Book
2. Give it a title, author, price and isbn
3. Make a method that displays the book details (don't use a toString)
4. Make a method to apply a discount percentage 

1. Create a class Dog
2. Give it a name, breed, and a sound
3. Make a method bark, use the name and the sound to print for example:
   - Bobby says WOOF
   - Max says wafwafwafwafwaf
4. Give it a method walk, that accepts a string name which represents the person who takes the dog for a walk

1. Create a class Product
2. Give it a id (303a for example), stock quantity, name, description and a product code that looks like this format: 65-BLA-909f
3. The first element of the code represents the supplier, the second the first three letters of the name and the last part the unique internal id
4. Create a method that returns the suppliercode
5. Create a method order that accepts an amount, if it's in stock, return true and print that the order (use the name) has been placed
    - If not in stock, print that


Additional overloading:
- Add another applyDiscount for book, that takes the percentage and a startdate and an enddate, and only applies the discount if the current date is between the start and enddate
- Walk in dog: allow for a list of people walking the dog
- Walk in dog: allow for a name and a number of minutes that the dog will be walked
- order: allow for a list of amounts (so multiple orders in one)