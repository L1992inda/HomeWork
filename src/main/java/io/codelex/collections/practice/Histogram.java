package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        int rangeStart = 0;
        String[] stringToArray = scores.split(" ");
        System.out.println(Arrays.toString(stringToArray));

        int temp = 0;

        int[] stringArrayToIntArray = new int[stringToArray.length];

        for (int i = 0; i < stringToArray.length; i++) {
            stringArrayToIntArray[i] = Integer.parseInt(stringToArray[i]);
        }
        Arrays.sort(stringArrayToIntArray);

        System.out.println(Arrays.toString(stringArrayToIntArray));

        boolean[] visited = new boolean[stringArrayToIntArray.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < stringArrayToIntArray.length; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < stringArrayToIntArray.length; j++) {
                if (stringArrayToIntArray[i] == stringArrayToIntArray[j]) {
                    visited[j] = true;
                    count++;
                }

            }
            System.out.println(stringArrayToIntArray[i] + "=" + count);
        }
    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
