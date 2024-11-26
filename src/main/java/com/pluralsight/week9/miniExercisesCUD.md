### **1. Insert a New Category**
- Add a new category to the `Categories` table with a hardcoded name and description.
- Example: `Name = "Seasonal Products", Description = "Limited time offers"`

---

### **2. Update a Product’s Price**
- Write a method to update the price of a specific product in the `Products` table using its `ProductID`.
- Hardcode the `ProductID` and the new price.

---

### **3. Delete a Category**
- Write a method to delete a category from the `Categories` table using its `CategoryID`.
- Ensure the `CategoryID` is hardcoded.

---

### **4. Insert a New Supplier**
- Prompt the user for the details of a new supplier (e.g., `CompanyName`, `ContactName`, `Address`, `City`, etc.).
- Insert the new supplier into the `Suppliers` table.

---

### **5. Update a Product’s Quantity Per Unit**
- Prompt the user for:
    - The `ProductID` of the product they want to update.
    - The new `QuantityPerUnit` value.
- Update the `Products` table accordingly.

---

### **6. Delete a Product Based on User Input**
- Prompt the user for the `ProductID` of the product they want to delete.
- Delete the corresponding product from the `Products` table.
- Add a confirmation message after successful deletion.

---

### **CHALLENGE: 7. Batch Insert Multiple Products**
- Prompt the user to input multiple new products (e.g., `ProductName`, `CategoryID`, `SupplierID`, `UnitPrice`, etc.).
- Use a transaction to insert all the products into the `Products` table in one go.

---

### **8. Update Supplier Information**
- Prompt the user for the `SupplierID` and allow them to update:
    - `CompanyName`
    - `ContactName`
    - `City`
- Update the `Suppliers` table based on the input.

---

### **9. Delete a Category and Its Products**
- Prompt the user for a `CategoryID`.
- Delete all products associated with the category first (from `Products`), then delete the category itself (from `Categories`).

---

### **10. Customer Order Management**
1. Prompt the user to:
    - Add a new customer to the `Customers` table.
    - Place an order for the newly added customer (insert into `Orders` and `OrderDetails`).

---