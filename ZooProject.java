import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Objects; // import necessary utilities

class MyZoo { // open class called MyZoo

	int n = 12;

	class Data { // data constructor

        String animal;
		String animalType;
		String diet;
		String environemnt;

		Data(String animal, String animalType, String diet, String environemnt)
		{
			this.animal = animal;
			this.animalType = animalType;
			this.diet = diet;
			this.environemnt = environemnt;
		}
	}
	public static void main(String args[])
	{
        String animal[] = { "Koala", "Lion", "Garenuk", "Tuatara", "Tortoise", "Sand Lizard", "Risso's Dolphin", "Galapagos Killer Whale", "Vendace Fish", "Cardinal", "Song Thrush", "Blue and Yellow Macaw" }; // create a string of each animal, animalType etc. Each String will be in the same index as the lists 
		String animalType[] = { "Mammal", "Mammal", "Mammal", "Reptile", "Reptile", "Reptile", "Fish", "Fish", "Fish", "Bird", "Bird", "Bird"};
        String diet[] = { "Herbivore", "Carnivore", "Herbivore", "Omnivore","Herbivore", "Omnivore", "Omnivore", "Carnivore" ,"Herbivore", "Herbivore", "Omnivore", "Herbivore"};
        String environemnt[] = { "Forest", "Grasslands", "Grasslands", "Desert","Grasslands", "Desert", "Sea", "Sea" ,"River", "Forest","Grasslands", "Forest"  };

		MyZoo custom = new MyZoo();
		custom.addValues(animal, animalType, diet, environemnt); // create a list of strings of all the necessary information, this is the data we will extract for the print function
	}
	public void addValues(String animal[], String animalType[],
    String diet[], String environemnt[])
	{
		ArrayList<Data> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {	
			list.add(new Data(animal[i], animalType[i], diet[i],
            environemnt[i])); // store all the information in an array list called data
		}
		printValues(list); // change the lists into strings, using a data variable
	}
	public void printValues(ArrayList<Data> list)
	{
        List<String> animalList = new ArrayList<>(); // Create an array list of each necessary data. These list will be where we gather our index information
                                                     
        animalList.add(0, "Koala");    // Both the data list and seperated list will have the same index as we will nedd this to capture information
        animalList.add(1, "Lion");
        animalList.add(2, "Garenuk");
        animalList.add(3, "Tuatara");
        animalList.add(4, "Tortoise");
        animalList.add(5, "Sand Lizard");
        animalList.add(6, "Risso's Dolphin");
        animalList.add(7, "Galapagos Killer Whale");
        animalList.add(8, "Vendace Fish");
        animalList.add(9, "Cardinal");
        animalList.add(10, "Song Thrush");
        animalList.add(11, "Blue and Yellow Macaw");

        List<String> animalTypeList = new ArrayList<>();

        animalTypeList.add(0, "Mammal");
        animalTypeList.add(1, "Mammal");
        animalTypeList.add(2, "Mammal");
        animalTypeList.add(3, "Reptile");
        animalTypeList.add(4, "Reptile");
        animalTypeList.add(5, "Reptile");
        animalTypeList.add(6, "Fish");
        animalTypeList.add(7, "Fish");
        animalTypeList.add(8, "Fish");
        animalTypeList.add(9, "Bird");
        animalTypeList.add(10, "Bird");
        animalTypeList.add(11, "Bird");

        List<String> dietList = new ArrayList<>();

        dietList.add(0, "Herbivore");
        dietList.add(1, "Carnivore");
        dietList.add(2, "Herbivore");
        dietList.add(3, "Omnivore");
        dietList.add(4, "Herbivore");
        dietList.add(5, "Omnivore");
        dietList.add(6, "Omnivore");
        dietList.add(7, "Carnivore");
        dietList.add(8, "Herbivore");
        dietList.add(9, "Herbivore");
        dietList.add(10, "Omnivore");
        dietList.add(11, "Herbivore");

        List<String> enviroList = new ArrayList<>();

        enviroList.add(0, "Forest");
        enviroList.add(1, "Grasslands");
        enviroList.add(2, "Grasslands");
        enviroList.add(3, "Desert");
        enviroList.add(4, "Grasslands");
        enviroList.add(5, "Desert");
        enviroList.add(6, "Sea");
        enviroList.add(7, "Sea");
        enviroList.add(8, "River");
        enviroList.add(9, "Forest");
        enviroList.add(10, "Grasslands");
        enviroList.add(11, "Forest");

        System.out.println("\nWe currently have "+n+" animals in our care. These are:\n"); 

		for (int counter = 0; counter < animalList.size(); counter++) { 		      
            System.out.println(animalList.get(counter)); // loop thorugh animal list printing off each animal name so the user can choose which animal they want to learn about
        }
        try (Scanner Qu1 = new Scanner(System.in)) {
            System.out.println("\nWould you like to learn about a specific animal? (Y/N)\n"); // create a loop of if else statements to find what the information the user desires
            String output1 = Qu1.nextLine();  
            if (output1.equals("Y")){
                try (Scanner Qu2 = new Scanner(System.in)) {
                    System.out.println("Which animal would you like to learn about?\n");
                    String output2 = Qu2.nextLine();  
                    int idx = animalList.indexOf(output2); // find the first string that matches the inpit
                    for (int i = 0; i < 1; i++) { // only returing information of 1 animal, there only needs 1 print loop
                        Data data = list.get(idx); // import the arraylist of all strings
                        System.out.println("\nAnimal Name: "+data.animal+"\nAnimal Type: "+data.animalType+"\nDietry Requirements: "+data.diet+"\nEnvironment: "+data.environemnt);
                    }// return information in a tabled format
                }
            }
            else{
                try (Scanner Qu3 = new Scanner(System.in)) {
                    System.out.println("Would you like to learn about a list of animals? Y/N)\n");
                    String output3 = Qu3.nextLine();  
                    if (output3.equals("Y")){  //will loop through each list and print each list in regards to its index
                        for (int i = 0; i < n; i++) {
                            Data data = list.get(i);
                            System.out.println("\nAnimal Name: "+data.animal+"\nAnimal Type: "+data.animalType+"\nDietry Requirements: "+data.diet+"\nEnvironment: "+data.environemnt);
                        }
                    }
                    else{
                        try (Scanner Qu4 = new Scanner(System.in)) {
                            System.out.println("Would you like to learn about a specific type of animal? Y/N)\n");
                            String output4 = Qu4.nextLine(); 
                            if (output4.equals("Y")){
                                try (Scanner Qu5 = new Scanner(System.in)) {
                                    System.out.println("Which animal type would you like to learn about?\n");
                                    String output5 = Qu5.nextLine();  
                                    for (int i = 0; i < animalTypeList.size(); i++) { // begin looping through the animlaType list
                                      if (Objects.equals(animalTypeList.get(i), output5)) { // if a string from the animalType list is the same as the user input the index will be stored
                                        Data data = list.get(i);
                                        System.out.println("\nAnimal Name: "+data.animal+"\nAnimal Type: "+data.animalType); // return strings of all stored indexes
                                      }
                                    }  
                                }
                            } 
                            else{
                                try (Scanner Qu6 = new Scanner(System.in)) {
                                    System.out.println("Would you like to learn about a specific food required for animals? Y/N)\n"); // Same concept as Qu4, however searching dietList instead of animalType
                                    String output6 = Qu6.nextLine(); 
                                    if (output6.equals("Y")){
                                        try (Scanner Qu7 = new Scanner(System.in)) {
                                            System.out.println("Which diet would you like to learn about?\n");
                                            String output7 = Qu7.nextLine();  
                                            for (int i = 0; i < dietList.size(); i++) {
                                              if (Objects.equals(dietList.get(i), output7)) {
                                                Data data = list.get(i);
                                                System.out.println("\nAnimal Name: "+data.animal+"\nDietry Requirements: "+data.diet);
                                              }
                                            }  
                                        }
                                    }
                                    else{
                                        try (Scanner Qu8 = new Scanner(System.in)) {
                                            System.out.println("Would you like to learn about a specific environment of animal? Y/N)\n");
                                            String output8 = Qu8.nextLine(); 
                                            if (output8.equals("Y")){
                                                try (Scanner Qu9 = new Scanner(System.in)) {
                                                    System.out.println("Which environment type would you like to learn about?\n");
                                                    String output9 = Qu9.nextLine();  
                                                    for (int i = 0; i < enviroList.size(); i++) {
                                                      if (Objects.equals(enviroList.get(i), output9)) {
                                                        Data data = list.get(i);
                                                        System.out.println("\nAnimal Name: "+data.animal+"\nEnvironment: "+data.environemnt);
                                                      }
                                                    }  
                                                }
                                            }  
                                        }
                                    }  
                                }
                            } 
                        }
                    }
                }
            }
        }
	}
}
