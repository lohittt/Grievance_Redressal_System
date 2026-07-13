package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "grievances")
public class Grievance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grievanceId;
    
    private String title;
    private String description;
    private String priority;
    private String status = "OPEN";
    
    @ManyToOne
    @JoinColumn(name = "complainant_id")
    private User complainant;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private GrievanceCategory grievanceCategory;
    
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    
    public Grievance() {}
    
    public Long getGrievanceId() { return grievanceId; }
    public void setGrievanceId(Long grievanceId) { this.grievanceId = grievanceId; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public User getComplainant() { return complainant; }
    public void setComplainant(User complainant) { this.complainant = complainant; }
    
    public GrievanceCategory getGrievanceCategory() { return grievanceCategory; }
    public void setGrievanceCategory(GrievanceCategory grievanceCategory) { this.grievanceCategory = grievanceCategory; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
