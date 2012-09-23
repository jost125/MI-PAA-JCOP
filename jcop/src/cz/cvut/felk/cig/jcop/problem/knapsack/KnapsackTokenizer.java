package cz.cvut.felk.cig.jcop.problem.knapsack;

import cz.cvut.felk.cig.jcop.problem.ProblemFormatException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class KnapsackTokenizer {

	public KnapsackInstance getKnapsackInstance(String line) {
		StringTokenizer st = new StringTokenizer(line);
		KnapsackInstance knapsackInstance = new KnapsackInstance();

		try {
			knapsackInstance.setId(st.nextToken());
			knapsackInstance.setDimension(Integer.valueOf(st.nextToken()));
			knapsackInstance.setCapacity(Integer.valueOf(st.nextToken()));

			for (int i = 0; i < knapsackInstance.getDimension(); i++) {
				int weight = Integer.valueOf(st.nextToken());
				int price = Integer.valueOf(st.nextToken());
				knapsackInstance.addKnapsackItem(new KnapsackItem(i, weight, price));
			}

			if (st.hasMoreTokens()) {
				throw new ProblemFormatException("Too many elements in line");
			}
		} catch (NoSuchElementException e) {
			throw new ProblemFormatException("Insufficient number of elements in line");
		} catch (NumberFormatException e) {
			throw new ProblemFormatException("Non numeric elements found in line");
		}

		return knapsackInstance;
	}
}
