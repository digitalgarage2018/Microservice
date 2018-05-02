package it.iseed.account.entities;


//1) JPA
//2) JSR-303
//3) LOMBOK



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

//@AllArgsConstructor @NoArgsConstructor   //Lombok annotations
@Entity                                  //JPA defines an Entity
@Table(name = "users")                   //JPA (if table name in the DB differs from Class Name)
public class User {


    //String ID, String USERNAME, String PASSWORD, String PERMISSION

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String username, String password, String permission) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.permission = permission;
	}

	@Id                               //JPA id of the table
    @Column(name="ID")                //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    //@Getter @Setter                   //Lombok annotations
    private String id;

    @Column(name="USERNAME")          //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    //@Getter @Setter                   //Lombok annotations
    private String username;

    @Column(name="PASSWORD")          //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    //@Getter @Setter                   //Lombok annotations
    private String password;

    @Column(name="PERMISSION")        //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    //@Getter @Setter                   //Lombok annotations
    private String permission;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}



}
