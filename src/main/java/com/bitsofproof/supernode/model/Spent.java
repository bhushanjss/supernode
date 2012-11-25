package com.bitsofproof.supernode.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "spent")
public class Spent implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column (length = 40, nullable = false)
	private String address;

	@OneToMany (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private List<TxIn> inputs;

	public Long getId ()
	{
		return id;
	}

	public void setId (Long id)
	{
		this.id = id;
	}

	public String getAddress ()
	{
		return address;
	}

	public void setAddress (String address)
	{
		this.address = address;
	}

	public List<TxIn> getInputs ()
	{
		return inputs;
	}

	public void setInputs (List<TxIn> inputs)
	{
		this.inputs = inputs;
	}

}
