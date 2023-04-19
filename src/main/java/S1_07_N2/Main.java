package S1_07_N2;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Miquel", 10);
        Person person2 = new Person("Marta", 12);
        Person person3 = new Person("Jordi", 14);

        @SerializeToJson(directory = "src/S1_07_N2.JSON")
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        SerializeToJson annotation = people.getClass().getAnnotation(SerializeToJson.class);
        String directory = annotation.directory();


    	for (Person p : people) {
            String linea1 = "{\"" + p.getName() + "\" : \"" + p.getAge() + "\"}," + "\n";
            write(directory, linea1);
        }

}

    private static void write(String directory, String json) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(directory, true));
            bw.write(json);
            bw.close();
        } catch (IOException e) {
            System.out.println("Error has occur");
        }

    }



//    ------------------STACK OVERFLOW ---------------

//    public static void serializeToJson() throws IOException {
//
//        Main main = new Main();
//        ObjectMapper mapper = new ObjectMapper();
//
//        String filename = person.getClass().getSimpleName() + ".json";
//
//        SerializeToJson annotation = main.getClass().getAnnotation(SerializeToJson.class);
//        String directory = annotation.directory();
//
//        File directoryPath = new File(directory);
//
//        File file = new File(directoryPath, filename);
//        mapper.writeValue(file, this);
//    }



}

