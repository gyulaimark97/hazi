
public class Person {
	
	private String name;
	private int weight;
	private double height;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double tti() {
		return (double)this.weight/(this.height*this.height);
	}
	
	
	public String characteristic() {
		
		if(this.tti()<18.5)
			return "sovány";
		else if(this.tti()>25)
			return "kövér";
		else 
			return "normál";
	}
	
	public String allData() {
		return "Név: "+this.name+" Súly: "+this.weight+" Magasság: "+this.height+" TTI: "+this.tti()+':'+this.characteristic();
	}

}



