/*
 * Created on 5 Mar 2016 ( Time 20:49:58 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.pawsey.prorata.model;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

/**
 * Persistent class for entity stored in table "account"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="account", schema="public" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="AccountEntity.countAll", query="SELECT COUNT(x) FROM AccountEntity x" )
} )
@JsonIgnoreProperties(ignoreUnknown = true) 
public class AccountEntity implements Serializable {

    protected static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="account_id", nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_account_id_pk_seq")
    @SequenceGenerator(name = "account_account_id_pk_seq", sequenceName = "account_account_id_pk_seq")
    protected Integer    accountId    ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="account_number", nullable=false, length=16)
    protected String     accountNumber ;

    @Column(name="sort_code", length=8)
    protected String     sortCode     ;

	// "prorataUserId" (column "prorata_user_id") is not defined by itself because used as FK in a link 
	// "bankId" (column "bank_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @JsonBackReference("ProrataUserEntity_AccountEntity")
    @ManyToOne
    @JoinColumn(name="prorata_user_id", referencedColumnName="prorata_user_id")
    protected ProrataUserEntity prorataUser ;

    @JsonBackReference("BankEntity_AccountEntity")
    @ManyToOne
    @JoinColumn(name="bank_id", referencedColumnName="bank_id")
    protected BankEntity bank        ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AccountEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setAccountId( Integer accountId ) {
        this.accountId = accountId ;
    }
    public Integer getAccountId() {
        return this.accountId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : account_number ( varchar ) 
    public void setAccountNumber( String accountNumber ) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //--- DATABASE MAPPING : sort_code ( varchar ) 
    public void setSortCode( String sortCode ) {
        this.sortCode = sortCode;
    }
    public String getSortCode() {
        return this.sortCode;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setProrataUser( ProrataUserEntity prorataUser ) {
        this.prorataUser = prorataUser;
    }
    public ProrataUserEntity getProrataUser() {
        return this.prorataUser;
    }

    public void setBank( BankEntity bank ) {
        this.bank = bank;
    }
    public BankEntity getBank() {
        return this.bank;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(accountId);
        sb.append("]:"); 
        sb.append(accountNumber);
        sb.append("|");
        sb.append(sortCode);
        return sb.toString(); 
    } 

}
