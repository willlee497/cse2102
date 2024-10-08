lab 3:

Step1:
Run the command to generate the project structure:
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


Step2:
Remove unnecessary subfolders, keeping only src, main, and test.

Step 3:
Copy all files from the c folder in Lab 1 to src/main/java. Make sure App.java is in the correct folder.

Step 4:
Move HybridTest.java from the u folder in Lab 1 to src/test/java. Ensure AppTest.java is present.

Step 5:
Replace the pom.xml contents with the provided code. Update the JUnit dependency and add Solarflare.

Step 6:
Add a resources folder under src/main. Include JUnit and Hamcrest.

Step 7:
Run the commands:

mvn compile  
mvn clean test
