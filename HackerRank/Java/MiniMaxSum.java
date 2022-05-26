// https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one 

import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
    // sort array in place
		Collections.sort(arr);
		long minSum = arr.stream().limit(4).mapToLong(i -> i).sum();
		long maxSum = arr.stream().skip(1).limit(4).mapToLong(i -> i).sum();
		System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
