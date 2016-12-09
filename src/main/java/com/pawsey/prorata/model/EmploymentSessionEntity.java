/*
 * Created on 13 Mar 2016 ( Time 11:28:45 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.pawsey.prorata.model;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

/**
 * Persistent class for entity stored in table "employment_session"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="employment_session", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="EmploymentSessionEntity.countAll", query="SELECT COUNT(x) FROM EmploymentSessionEntity x" )
} )
@JsonIgnoreProperties(ignoreUnknown = true) 
public class EmploymentSessionEntity implements Serializable {

    protected static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="employment_session_id", nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employment_session_employment_session_id_pk_seq")
    @SequenceGenerator(name = "employment_session_employment_session_id_pk_seq", sequenceName = "employment_session_employment_session_id_pk_seq")
    protected Integer    employmentSessionId ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time")
    protected Date       startTime    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    protected Date       endTime      ;

	// "employmentId" (column "employment_id") is not defined by itself because used as FK in a link 
	// "locationId" (column "location_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    @JsonBackReference("LocationEntity_EmploymentSessionEntity")
    @ManyToOne
    @JoinColumn(name="location_id", referencedColumnName="location_id")
    protected LocationEntity location    ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public EmploymentSessionEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setEmploymentSessionId( Integer employmentSessionId ) {
        this.employmentSessionId = employmentSessionId ;
    }
    public Integer getEmploymentSessionId() {
        return this.employmentSessionId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : start_time ( timestamptz ) 
    public void setStartTime( Date startTime ) {
        this.startTime = startTime;
    }
    public Date getStartTime() {
        return this.startTime;
    }

    //--- DATABASE MAPPING : end_time ( timestamptz ) 
    public void setEndTime( Date endTime ) {
        this.endTime = endTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setLocation( LocationEntity location ) {
        this.location = location;
    }
    public LocationEntity getLocation() {
        return this.location;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(employmentSessionId);
        sb.append("]:"); 
        sb.append(startTime);
        sb.append("|");
        sb.append(endTime);
        return sb.toString(); 
    } 

}
