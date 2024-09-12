# cse2102

#LAB 1
#instructions to proceed with the lab.
# FIRST STEP. you NEED TO DOWNLOAD THE ZIP FILE INCLUDING THE J.. FOLDER
# SECOND STEP. YOU UPLOAD FOLDERS INTO CODESPACE
# THIRD STEP. IN CODESPACE YOU CHANGE THE DIRECTORY SO PATHS WORK.
# FOURTH STEP. NEXT IN BASH YOU INPUT COMMAND TO COMPILE JAVA FILES INTO OUT FOLDER TO GET CLASSES
USE THIS CODE: javac -d out src/c/*.java
# FIFTH STEP: compile WITH THIS: javac -d out -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar src/u/HybridTest.java

TO RUN:
﻿java -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore HybridTest
