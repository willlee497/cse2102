step1:ran command: mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
in terminal.

step2:The command will generate a file structure. Modify it so it has the proper structure removing the company subfolders. leaving only src, main, and test.


step3:Copy all the files from the c folder in Lab 1 and paste them into the src/main/java folder. Ensure that the App.java file is in the correct location inside this folder.


step4:Take the HybridTest.java file from the u folder in Lab 1 and place it inside the src/test/java folder. Make sure the AppTest.java file is already in that folder as well.


step5: Find the pom.xml file outside the src folder. Replace its contents with the provided code snippet to set up project dependencies and build settings.change junit dependencay and use solarfare to properly run maventests


step6:I added a resource folder under main and added junit and hamtest.


step7: mvn compile, mvn clean test commands in terminal in order to see if it successfully ran
