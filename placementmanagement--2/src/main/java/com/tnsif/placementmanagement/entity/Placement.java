package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;

    @Temporal(TemporalType.DATE)
    private Date placementDate;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @ManyToMany
    @JoinTable(
        name = "placement_student",
        joinColumns = @JoinColumn(name = "placement_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> selectedStudents;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Student> getSelectedStudents() {
		return selectedStudents;
	}

	public void setSelectedStudents(List<Student> selectedStudents) {
		this.selectedStudents = selectedStudents;
	}

    // Getters and Setters
}