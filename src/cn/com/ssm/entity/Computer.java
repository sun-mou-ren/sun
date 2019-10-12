package cn.com.ssm.entity;
/**
 * 
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
public class Computer {
	private int id;//ID
	private String name;//名称
	private int price;//价格
	private String type;//类型
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
