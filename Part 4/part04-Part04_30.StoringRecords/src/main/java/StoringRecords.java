import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
public static void main(String[] args) {
//Creats a new scanner
Scanner scan = new Scanner(System.in);
//Gets the name of the file
System.out.print("Filename: ");
String file = scan.nextLine();
//Creats the array list to store the desired values in string format
ArrayList<Person> records = readRecordsFromFile(file);
//Display no of persons
System.out.println("Persons: " + records.size());
//Displays name of each person
System.out.println("Persons:");
for (Person person : records) {
System.out.println(person);
}
}
// Creating the method for finding,reading line by line and splitting the lines wrt ","
public static ArrayList<Person> readRecordsFromFile(String file) {
//Creating a new array list
ArrayList<Person> persons = new ArrayList<>();
//Fetching the file 
try(Scanner reader = new Scanner(Paths.get(file))){
//While there is a next line, do the following 
while(reader.hasNextLine()){
String record = reader.nextLine();
//Splits the CSV line wrt ","
String[] split = record.split(",");
String name = split[0];
int age = Integer.valueOf(split[1]);
//Adds the name and age to the array list
persons.add(new Person(name, age));
}
}
//Error message if file not found
catch(Exception e){
System.out.println("File not found");
}
//Returns the processed data
return persons;
}
}