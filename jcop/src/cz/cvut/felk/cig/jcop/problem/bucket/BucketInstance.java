package cz.cvut.felk.cig.jcop.problem.bucket;

public class BucketInstance {
	private int[] capacities;
	private int[] startingContents;
	private int[] destinationContents;
	private String id;
	private int dimension;

	public BucketInstance() {
	}

	public int[] getCapacities() {
		return capacities;
	}

	public void setCapacities(int[] capacities) {
		this.capacities = capacities;
	}

	public int[] getStartingContents() {
		return startingContents;
	}

	public void setStartingContents(int[] startingContents) {
		this.startingContents = startingContents;
	}

	public int[] getDestinationContents() {
		return destinationContents;
	}

	public void setDestinationContents(int[] destinationContents) {
		this.destinationContents = destinationContents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
}
