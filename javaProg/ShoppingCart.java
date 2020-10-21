package javaProg;

public class ShoppingCart {
	
	private int productId;
	private String productName;
	private String desc;
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	ShoppingCart()
	{
		this.productId=0;
		this.productName="null";
		this.desc="null";
		this.price=0;
		
		
	}
	
	
	ShoppingCart(int productId,String productName,String desc,double price)
	{
		this.productId=productId;
		this.productName=productName;
		this.desc=desc;
		this.price=price;
	}
	
	

}
