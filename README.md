# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

Task C:

Added CSS styling for main page in mainscreen.html Line: 114-140

Changed Title name to Josh's Treats in mainscreen.html Line: 142

Changed Shop name to Josh's Treats in mainscreen.html Line: 147

Changed  Parts to Sweets in mainscreen.html Line: 149

Changed Products to Cakes in mainscreen.html Line: 181

Task D:

Added about me page button link in mainscreen.html Line: 148

To enable access to the About me page I added get mapping in mainScreenControllerr.java Line: 55-57

Created a new file for about page to about.hmtl page in the templates directory

Task E:

Added the inhousePartRepository field to BootStrapData.java Line: 20

Added this.inhousePartRepository = inhousePartRepository; to BootStrapData.java Line 26

Added and saved five parts to sample inventory in BootstrapData.java Line: 33-85

Added and saved five products to sample inventory in BootStrapData.java Line: 93-103

Added int minInv: This field stores the minimum inventory level for the in-house part and out-sourced part InhousePart.java and OutsourcedPart.java Line: 10

Added int maxInv: This field stores the maximum inventory level for the in-house part and out-sourced part InhousePart.java and OutsourcedPart.java  Line: 11

Added Getter methods (getMinInv and getMaxInv): to retrieve the current values of the minInv and maxInv fields and Setter methods (setMinInv and setMaxInv): Updated the values of the minInv and maxInv fields with new values provided as arguments in InhousePart.java and OutsourcedPart.java
Line: 23-38

Task F:

Added a buyNow button in mainscreen.html Line: 214

Created a BuyProductController.java in the controller directory that creates a buyProduct method to verify if the selected product is in stock 

Created purchaseSuccess.html in the templates directory that shows success page with message 

Created purchaseError.html in the templates directory that shows failure page with message 

Task G:

Previous updated BootStrapData.java to include sample inventory with min and max values 

Updated InhousePartForm.html and OutsourcedPartForm.html to include inputs for min and max inventory Line: 20-23

Renamed the database file and updated application.properties Line: 6

Created a method in Part.java to validate inventory and updated controllers to use this validation Line: 84-98

Task H:

Created ValidMinimum.java, MinimumValidator.java files that shows when changing parts used in products, a custom error message for minimum inventory is now displayed in the validator directory 

Created ValidMaximum.java, MaximumValidator.java files that shows display error messages when adding and updating parts if the inventory is greater than the maximum in the validator directory

Added to the domain model class files to apply minimum validator in Part.java in Line: 5 & 16

Added to the domain model class files to apply maximum validator in Part.java in Line: 4 & 17

Adjusted InhouseParForm.html and OutsourcedPartForm.html to display error messages Line: 25-30

Incorporated a new validation to ensure the remaining parts meet the minimum inventory requirement when reducing product inventory during a purchase. Implemented custom error messages within the isValid method using ConstraintValidatorContext, displaying "Insufficient inventory for part: [part name]" when the inventory is insufficient in EnufPartsValidator,java Line: 37-38

Task I:

Added two unit tests for the maximum and minimum fields in PartTest.java Line: 160-176

Task J:

I deleted unused validator DeletePartValidator.java