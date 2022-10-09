# Assignment02

## The Project is about
designing a system to help HR to manage all the employees in the company

## Way of Implementation
1.new Java class "Employee" to set variables of employees(such as name, id, phone number, etc.) and "EmployeeHistory" to create a arrayList and store data.
2.There are 4 functions to realize(CRUD). Therefore, create mainJFrame and three panels - CreateJPanel,ViewJPanel and SearchJPanel. Update and Delete function has been contained in the ViewJPanel.

## Functions in createJPanel
1.I set a restriction that all the text need to be filled, or it will show "Please fill in all information".
2.when use Save button, data will be got through txtfiled's getText() and be recorded(influence varieties) by setters.


## Functions in ViewJPanel
1.I created an ArrayList and a jtable in ViewJpanel to store and show data. As well as Update and Delete button, when no row is selected, message dialog will show ""Please select a row to..."
2.when clicking the jtable, the details will show, including the photo, and we are able to change the text in the textField, after change, Update button can be pressed, and a message dialog will show "Updated Successfully", the data in the Jtable will change as well.
3.select certain row, and press delete button, the data of a certain person will be delated; there is a restriction, when select more than one row, message  dialog will show up.


## Functions in SearchJPanel
1.I set three query criteria - Name, Employee id, cell phone number. Enter only one criteria is feasible. the outcome will show in a table, click the row, the detail will show below the table.

