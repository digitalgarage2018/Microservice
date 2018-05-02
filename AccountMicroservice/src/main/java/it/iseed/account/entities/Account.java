package it.iseed.account.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="accounts")
//@AllArgsConstructor @NoArgsConstructor
public class Account {

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFkUser() {
		return fkUser;
	}

	public void setFkUser(String fkUser) {
		this.fkUser = fkUser;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String id, String fkUser, Double total) {
		super();
		this.id = id;
		this.fkUser = fkUser;
		this.total = total;
	}

	//String ID, String FK_USER, Double TOTAL
    @Id
    @Column(name="ID")
    @NotNull @NotBlank @NotEmpty
    //@Getter @Setter
    private String id;

    @Column(name="FK_USER")
    //@Getter @Setter
    @NotEmpty @NotBlank @NotNull
    private  String fkUser;

    @Column(name="TOTAL")
    //@Getter @Setter
    private Double total;
}
