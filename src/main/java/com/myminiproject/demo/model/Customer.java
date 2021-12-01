package com.myminiproject.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * The customer class which represents the user who uses the application.
 */
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String surname;

  private Long balance;

  private Long transactionAccounts;

  /**
   * Default constructor of the class.
   */
  public Customer() {
  }

  /**
   * Constructor with parameters of the class.
   *
   * @param name                customer's name
   * @param surname             customer's surname
   * @param balance             customer's balance
   * @param transactionAccounts customer's transaction of the accounts
   */
  public Customer(String name, String surname, Long balance, Long transactionAccounts) {
    this.name = name;
    this.surname = surname;
    this.balance = balance;
    this.transactionAccounts = transactionAccounts;
  }

  /**
   * Get the customer's id
   *
   * @return the customer's id
   */
  public Long getId() {
    return id;
  }

  /**
   * Setter of customer's id
   *
   * @param id the customer's id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Get the customer's name
   *
   * @return the customer's name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter of customer's name
   *
   * @param name the customer's name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the customer's surname
   *
   * @return the customer's surname
   */
  public String getSurname() {
    return surname;
  }

  /**
   * Setter of customer's surname
   *
   * @param surname the customer's surname
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * Get the customer's balance
   *
   * @return the customer's balance
   */
  public Long getBalance() {
    return balance;
  }

  /**
   * Setter of customer's balance
   *
   * @param balance the customer's balance
   */
  public void setBalance(Long balance) {
    this.balance = balance;
  }

  /**
   * Get the customer's transactions of the accounts
   *
   * @return the customer's transactions of the accounts
   */
  public Long getTransactionAccounts() {
    return transactionAccounts;
  }

  /**
   * Setter of customer's transactionAccounts
   *
   * @param transactionAccounts the customer's transactionAccounts
   */
  public void setTransactionAccounts(Long transactionAccounts) {
    this.transactionAccounts = transactionAccounts;
  }
}
