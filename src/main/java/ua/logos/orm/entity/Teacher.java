package ua.logos.orm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter @Setter
public class Teacher extends BaseEntity {
	
	@Column(name = "first_name", length = 50)
	private String firstName;
	
	@Column(name = "last_name", length = 50)
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@OneToMany(mappedBy = "teacher")
	private List<Course> courses = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name = "teacher_details_id")
	private TeacherDeatails teacherDetails;
	
	 
	
}
