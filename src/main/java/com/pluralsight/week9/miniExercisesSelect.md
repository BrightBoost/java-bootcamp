## Exercises car dealership database

1. Display all the cars that you have in the dealership

---

1. Prompt your user for which name of the dealership they want to see
2. Display the details of that dealership
3. Ask them if they want to see the cars that the dealership has to offer:
   4. If so, show the cars for that dealership
   5. If not, say BYE

---

1. Prompt your user for what property of a car they find important:
   - color
   - make
   - BONUS: location of the dealership
2. Based on the response, ask the user for input on what value they want for color/make/location
3. Show all the cars that match that condition



## Exercises for Northwind Database

- Write a query to fetch and display all products in the `Products` table.
- Show the `ProductName`, `QuantityPerUnit`, and `UnitPrice`.

---

1. Prompt the user for a category name (from the `Categories` table).
2. Display the details of the selected category.
3. Ask if they want to see the products in that category:
    - If so, display the `ProductName`, `QuantityPerUnit`, and `UnitPrice` for all products in the selected category.
    - If not, display BYE.

---

1. Prompt the user for what property of a product they find important:
    - `ProductName`
    - BONUS: `SupplierID` (Join with `Suppliers` to use the `CompanyName` for input)
    - BONUS: `CategoryID` (Join with `Categories` for user input based on `CategoryName`)
2. Based on the selected property, ask for the specific value to filter by:
    - For example, if they select `ProductName`, ask for a name substring to match.
3. Display all products that match the specified condition, showing `ProductName`, `QuantityPerUnit`, and `UnitPrice`.

---

1. Prompt the user to enter a supplier's company name.
2. Show the details of the supplier (from `Suppliers`).
3. Ask the user if they want to see the products supplied by this company:
    - If yes, display the `ProductName` and `UnitsInStock` for all products from that supplier.
    - If no, display BYE.

---

BONUS
1. Ask the user for a customer’s name or `CustomerID`.
2. Retrieve and display the customer details (from `Customers`).
3. Ask if they want to see the orders placed by this customer:
    - If yes, display the `OrderID`, `OrderDate`, and `Total` (calculate total from `OrderDetails`).
    - If no, display BYE.


