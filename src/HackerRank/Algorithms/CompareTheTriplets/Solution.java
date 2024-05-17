package HackerRank.Algorithms.CompareTheTriplets;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'compareTriplets' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY a
	 *  2. INTEGER_ARRAY b
	 */

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int alicePoints = 0;
		int bobPoints = 0;
		for (int i=0; i<a.size(); i++){
			if(a.get(i) > b.get(i)){
				alicePoints++;
			} else if (a.get(i) < b.get(i)){
				bobPoints++;
			}
		}
		return new ArrayList<Integer>(Arrays.asList(alicePoints, bobPoints));
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt)
								.collect(toList());

		List<Integer> result = Result.compareTriplets(a, b);

		bufferedWriter.write(
				result.stream()
					  .map(Object::toString)
					  .collect(joining(" "))
						+ "\n"
		);

		bufferedReader.close();
		bufferedWriter.close();
	}
}

