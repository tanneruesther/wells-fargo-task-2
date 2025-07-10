package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Portfolio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    private LocalDate creationDate;

    protected Portfolio() {}

	public Portfolio(Long portfolioId, Client client, LocalDate creationDate) {
		super();
		this.portfolioId = portfolioId;
		this.client = client;
		this.creationDate = creationDate;
	}

	public Long getPortfolioId() {
		return portfolioId;
	}

	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
    

}
