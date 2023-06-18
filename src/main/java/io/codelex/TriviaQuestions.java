package io.codelex;

import java.util.*;

public class TriviaQuestions {
    public static void questions(List<Object> list) {
        try {
            int score = 0;

            int count = 0;
            Random random = new Random();
            System.out.println();
            System.out.println("=+=Interesting facts about numbers=+=");
            System.out.println("Read fact and guess the number!");
            System.out.println();

            list.remove("}");
            List<Object> newList;

            for (int i = 1; i < list.size(); i++) {
                newList = List.of(list.get(i).toString().split(":"));
                String questionText = newList.get(1)
                        .toString()
                        .substring(7)
                        .replaceAll(",$", "").replace("\"", "");

                int questionNumber = Integer.parseInt(newList.get(0)
                        .toString()
                        .replaceAll("\"", "")
                        .trim());


                ArrayList<Integer> answersShuffle = new ArrayList<>();
                answersShuffle.add(random.nextInt(1, 9));
                answersShuffle.add(random.nextInt(31, 40));
                answersShuffle.add(random.nextInt(41, 50));
                answersShuffle.add(questionNumber);
                Collections.shuffle(answersShuffle, new Random());

                System.out.println("*" + questionText);
                Scanner in = new Scanner(System.in);
                System.out.printf("choose one answer of given :\n-> %d\n-> %d\n-> %d\n-> %d\n", answersShuffle.get(0), answersShuffle.get(1), answersShuffle.get(2), answersShuffle.get(3));
                int answer = in.nextInt();
                count++;
                if (answer == questionNumber) {
                    score++;
                    System.out.println("Yess!You are right!");
                    System.out.println();
                } else {
                    System.out.println("Wrong number!The answer is:" + newList.get(1) + "\nYou answered on " + score + " questions!");
                    break;
                }
                if (count == 21) {
                    System.out.println("Congratulations you answered on ALL questions!!!");
                }


            }
        } catch (InputMismatchException e) {
            System.out.println("Only numbers!");
        }
    }
}
