package io.codelex.TESTS.Exercise4;

import java.io.*;

public class FileReadMethod {
    public static void reverseFile(String filePathAndName, String newFilePathAndName) throws IOException {

        FileReader reader = new FileReader(filePathAndName);
        FileWriter writer = new FileWriter(newFilePathAndName);

        BufferedReader bufferedReader = new BufferedReader(reader);
        File file = new File(newFilePathAndName);

        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
            System.out.println(line);
        }
        reader.close();

        writer.write(stringBuilder.reverse().toString());
        writer.close();

        String reversedTitle = new StringBuilder(file.getName()).reverse().toString();
        file.renameTo(new File(reversedTitle));

        System.out.println(stringBuilder);
        System.out.println(reversedTitle);
    }
}
