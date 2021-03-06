package store.model;

public class ProductItems {
	
	
	@Override
	public String toString() {
		return "ProductItems [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	private int id;
	private String name;
	private int cost;
	public ProductItems(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public ProductItems() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
