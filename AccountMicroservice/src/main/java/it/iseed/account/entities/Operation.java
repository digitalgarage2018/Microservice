package it.iseed.account.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="operations")
//@AllArgsConstructor @NoArgsConstructor
public class Operation {

    //String ID, Date DATE, Double VALUE, String DESCRIPTION, String FK_ACCOUNT1, String FK_ACCOUNT2

    public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(String id, Date date, String description, Double value, String fkAccount1, String fkAccount2) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.value = value;
		this.fkAccount1 = fkAccount1;
		this.fkAccount2 = fkAccount2;
	}

	@Id
    @Column(name="ID")
    //@Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String id;

    @Column(name="DATE")
    //@Getter @Setter
    private Date date;

    @Column(name="DESCRIPTION")
    //@Getter @Setter
    private String description;

    @Column(name="VALUE")
    //@Getter @Setter
    @NotNull
    private Double value;

    @Column(name="FK_ACCOUNT1")
    //@Getter @Setter
    @NotNull @NotBlank @NotEmpty
    private String fkAccount1;

    @Column(name="FK_ACCOUNT2")
    //@Getter @Setter
    private String fkAccount2;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getFkAccount1() {
		return fkAccount1;
	}

	public void setFkAccount1(String fkAccount1) {
		this.fkAccount1 = fkAccount1;
	}

	public String getFkAccount2() {
		return fkAccount2;
	}

	public void setFkAccount2(String fkAccount2) {
		this.fkAccount2 = fkAccount2;
	}

	@PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }

}
