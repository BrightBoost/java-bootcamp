### Interfaces mini exercises

### 1. Animal Hierarchy

- **Class: `Animal`**  
  Base class for all animals.

- **Class: `Mammal`**  
  Represents mammals.

- **Class: `Bird`**  
  Represents birds. You can assume all birds can fly.

- **Class: `Dog`**  
  A specific type of `Mammal`.

- **Class: `Eagle`**  
  A specific type of `Bird`.

- **Interface: `Flyable`**  
  Defines methods related to flying.

### Diagram Description

```
Animal
   |
   +-- Mammal
   |      |
   |      +-- Dog
   |
   +-- Bird
          |
          +-- Eagle
```

### Interface Methods

1. `void fly();`

### Interface Methods

1. `double area();`


### 2. Employee Hierarchy

- **Class: `Employee`**  
  Base class for employees.

- **Class: `FullTimeEmployee`**  
  Represents full-time employees. 

- **Class: `PartTimeEmployee`**  
  Represents part-time employees.

- **Class: `Manager`**  
  A specific type of `FullTimeEmployee`. They can be promoted.

- **Class: `Intern`**  
  A specific type of `PartTimeEmployee`. They cannot be promoted.

- **Class: `Assistant`**  
  A specific type of `PartTimeEmployee`. They can be promoted.

- **Interface: `Promotable`**  
  Defines methods for promoting employees.

### Diagram Description

```
Employee
   |
   +-- FullTimeEmployee
   |      |
   |      +-- Manager
   |
   +-- PartTimeEmployee
          |
          +-- Intern
          |
          +-- Assistant
```

### Interface Methods

1. `void promote();`
2. `double getSalary();`


### 3. Electronic Device Hierarchy

- **Class: `Device`**  
  Base class for electronic devices.

- **Class: `PortableDevice`**  
  Represents portable devices. They can all be charged. This class is abstract.

- **Class: `StationaryDevice`**  
  Represents stationary devices.

- **Class: `Laptop`**  
  A specific type of `PortableDevice`.

- **Class: `Television`**  
  A specific type of `StationaryDevice`.

- **Interface: `Chargeable`**  
  Defines methods for charging devices.

### Diagram Description

```
Device
   |
   +-- PortableDevice
   |      |
   |      +-- Laptop
   |
   +-- StationaryDevice
          |
          +-- Television
```

### Interface Methods

1. `void charge();`


---


### 4. Appliance Hierarchy

- **Class: `Appliance`**  
  Base class for household appliances.

- **Class: `KitchenAppliance`**  
  Represents appliances used in the kitchen. They are all operable. This is an abstract class.

- **Class: `CleaningAppliance`**  
  Represents appliances used for cleaning. They are all operable. This is an abstract class.

- **Class: `Refrigerator`**  
  A specific type of `KitchenAppliance`.

- **Class: `VacuumCleaner`**  
  A specific type of `CleaningAppliance`.

- **Interface: `Operable`**  
  Defines methods for operating appliances.

### Diagram Description

```
Appliance
   |
   +-- KitchenAppliance
   |      |
   |      +-- Refrigerator
   |
   +-- CleaningAppliance
          |
          +-- VacuumCleaner
```

### Interface Methods

1. `void operate();`
2. `void stop();`

---
