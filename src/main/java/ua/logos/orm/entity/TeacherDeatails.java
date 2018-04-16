package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher_details")
@NoArgsConstructor
@Getter @Setter
public class TeacherDeatails extends BaseEntity{
	@Column(name = "hobby")
	private String hobby;
	@Column(name = "email")
	private String email;
}
