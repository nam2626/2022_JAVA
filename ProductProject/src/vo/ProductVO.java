package vo;

import java.util.Objects;

public class ProductVO {
	private String productNo;
	private String productName;
	private String makerName;
	private int ea;
	private int price;

	public ProductVO(String productNo, String productName, String makerName, int ea, int price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.makerName = makerName;
		this.ea = ea;
		this.price = price;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [productNo=" + productNo + ", productName=" + productName + ", makerName=" + makerName
				+ ", ea=" + ea + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProductVO))
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(productNo, other.productNo);
	}

}
