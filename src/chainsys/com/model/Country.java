package chainsys.com.model;

public class Country {



	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}
	private String name;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

