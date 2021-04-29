package classesWithAttributes;

public class Product {
	
	
	public Product(int _id, String name, String description, double price, int stockAmount, String color, String code){
		System.out.println("Yapýcý block calýstý");
		this._id = _id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
		this.code = code;
	}
	
	//attribute || field
	private int _id; //private only uses these scopes but public always uses everywhere.
	String name;
	String description;
	double price;
	int stockAmount;
	String color;
	String code;
	
	/*
	private int _id; //private only uses these scopes but public always uses everywhere.
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	*/
	
	
	//getter
	public int getId() {
		return _id;
	}
	//setter
	public void setId(int id) {
		this._id = id; //this is Product's id. 
	}
	
	
	/*
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	public String get_color() {
		return _color;
	}
	public void set_color(String color) {
		this._color = color;
	}
	public String get_code() {
		return _code;
	}
	public void set_code(String code) {
		this._code = code;
	}
	*/
	
}
