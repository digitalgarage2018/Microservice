package it.iseed.coupon.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table (name="coupon")
@Entity
//@AllArgsConstructor @NoArgsConstructor
public class Coupon {

	@Id
    @Column(name="couponid")
    //@Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="couponcode")
   // @Getter @Setter
    private String code;

    @Column(name="account")
    //@Getter @Setter
    private String account;
    
    public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coupon(int id, String code, String account) {
		super();
		this.id = id;
		this.code = code;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}




}
