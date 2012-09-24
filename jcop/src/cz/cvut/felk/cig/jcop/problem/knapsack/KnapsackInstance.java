package cz.cvut.felk.cig.jcop.problem.knapsack;

import java.util.ArrayList;
import java.util.List;

public class KnapsackInstance {

	/**
	 * Id of problem instance if supplied in {@link #Knapsack(java.io.File, String)}.
	 */

	private String id;
	/**
	 * Capacity of knapsack. Only configurations with weight lower or equal to capacity are considered solutions.
	 */
	private int capacity;

	/**
	 * List of all items for this knapsack.
	 */
	private List<KnapsackItem> knapsackItems = null;

	private int dimension;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<KnapsackItem> getKnapsackItems() {
		return knapsackItems;
	}

	public void addKnapsackItem(KnapsackItem knapsackItem) {
		if (this.knapsackItems == null) {
			if (this.dimension != 0) {
				this.knapsackItems = new ArrayList<KnapsackItem>(this.dimension);
			} else {
				this.knapsackItems = new ArrayList<KnapsackItem>();
			}
		}

		this.knapsackItems.add(knapsackItem);
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "id:" + id + ", dimension: " + dimension + ", capacity:" + capacity + ", items:" + knapsackItems;
	}
}
