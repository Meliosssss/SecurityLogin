package fit.hutech.phamhongquan;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;




@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = " ten ko the trong")
    private String name;


    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Product> books;


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


	public List<Product> getBooks() {
		return books;
	}


	public void setBooks(List<Product> books) {
		this.books = books;
	}
    
}
