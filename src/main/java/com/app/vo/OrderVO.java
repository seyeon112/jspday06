package com.app.vo;

import java.util.Objects;

public class OrderVO {
	private Long id;
	private Long memberid;
	private Long productid;
	private int productCount;
	
	public OrderVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	
	
	@Override
	public String toString() {
		return "OrderVO [id=" + id + ", memberid=" + memberid + ", productid=" + productid + ", productCount="
				+ productCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderVO other = (OrderVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
