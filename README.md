# EmployeeWorkers

⦁	Create an abstract class Employee with the following instance variables (protected):
⦁	Employee name (string)
⦁	Employee number (string)
⦁	Hire date (string – you do not have to use the Date class)
Then create a concrete subclass: ProductionWorker that inherits from Employee, and in addition contains the following instance variables (protected):
⦁	Hourly pay rate (double)
⦁	Shift (in: 1 = Day, 2 = Night)
Next create a concrete subclass: ShiftSupervisor that inherits from Employee, and in addition contains the following instance variables (private):
⦁	Annual salary (double)
⦁	Annual bonus (double)
Lastly create a concrete subclass: TeamLeader, which inherits from ProductionWorker, and in addition contains the following instance variables (private):
⦁	Monthly bonus (double)
⦁	Required training hours (int)
⦁	Number of training hours attended (int)
For each class above write one or more constructors (do not forget to call the superclass’s constructor!); the get and set routines for each instance variable are optional. 
Create 4 production workers, one team leader, and one shift supervisor (in the main routine; do NOT prompt the user for the data). Do NOT instantiate any objects of the Employee class directly. Each class must be defined in a separate .java file; every class except the driver must have a toString() method. The main routine should be in a separate driver class, and must use each object’s toString() method to display the values of the object’s fields.
