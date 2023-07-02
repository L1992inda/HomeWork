package io.codelex.streams.practice;

import com.sun.jdi.LongValue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream()
                .map(Math::sqrt)
                .map(Double::intValue)
                .toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream()
                .map(User::getAge)
                .toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .distinct()
                .toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream()
                .limit(2)
                .collect(toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
       return (int)users.stream()
               .filter(user -> user.getAge() > 25)
               .count();


    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream()
                .reduce(0,Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream()
                .skip(2)
                .toList();
    }

    public static List<String> getFirstNames(List<String> names) {
       return names.stream()
               .map(n -> n.split(" ")[0])
               .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                .flatMap(n -> Arrays.stream(n.split(""))).distinct()

                .collect(Collectors.toList());}


    public static String separateNamesByComma(List<User> users) {
        return users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream()
                .mapToDouble(u->u.getAge())
                .summaryStatistics()
                .getAverage();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream()
                .mapToInt(user -> user.getAge())
                .summaryStatistics()
                .getMax();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(user -> user.getAge())
                .summaryStatistics()
                .getMin();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream()
                .collect(partitioningBy(User::isMale));    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale,groupingBy(User::getAge)));
    }

   public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale,counting()));
   }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream()
                .anyMatch(user -> user.getAge().equals(age));
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream()
                .noneMatch(u->u.getAge() > age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream()
                .findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted((u,u2)->u.getAge().compareTo(u2.getAge()))
                .toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {

        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {

        return IntStream
                .rangeClosed(2,30)
                .filter(i-> isPrime(i))
                .boxed()
                .toList();
    }

    public static boolean isPrime(int number) {//nav!!!!
       return IntStream.rangeClosed(2, number / 2)
               .noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return Stream
                .generate(new Random()::nextInt)
                .limit(10)
                .toList();

    }
    public static User findOldest(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .get();

    }

    public static int sumAge(List<User> users) {
        return  users.stream()
                .map(User::getAge)
                .reduce(0,Integer::sum);
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .summaryStatistics();


    }
}
