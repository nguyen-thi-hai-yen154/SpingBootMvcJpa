package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;


//Thay the ca Getter va Setter
//@Data
//Dung de thay the cac method get
//@lombok.Getter
//Dung de thay the cac method set
//@lombok.Setter
//Dung de thay the method contructor (ham khoi tao khong can tham so)
//@NoArgsConstructor
//Dung trong truong hop minh co 1 cau query thoi
//@NamedQuery(name = "getAllProducts", query = "SELECT p FROM product p")
//Dung trong truong hop minh co nhieu cau query
//@NamedQueries({
//
//})
@Entity
@Table(name = "product", schema = "sales")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "brand")
	private String brand;

	@Column(name = "madein")
	private String madein;

	@Column(name = "price")
	private float price;

	protected Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeIn() {
		return madein;
	}

	public void setMadeIn(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
