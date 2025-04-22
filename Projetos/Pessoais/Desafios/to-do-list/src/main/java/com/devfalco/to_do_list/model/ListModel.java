package com.devfalco.to_do_list.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ListModel {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String desc;
  @CreationTimestamp
  private LocalDate iniDate;
  private LocalDate finDate;
  private String status;

  public void Livro(Long id,String title, String desc, LocalDate iniDate,LocalDate finDate, String status){
    this.id = id ;
    this.title = title ;
    this.desc   = desc ;
    this.finDate = finDate ;
    this.status = status ;
  }

  public Long getId(){
    return id;
  }
  public String getTitle(){
    return title;
  }
  public String getDesc(){
    return desc;
  }
  public LocalDate getIniDate(){
    return iniDate;
  }
  public LocalDate getFinDate(){
    return finDate;
  }
  public String getStatus(){
    return status;
  }
  

  public void setTitle(String title){
    this.title = title;
  }
  public void setDesc(String desc){
  this.desc = desc;
  }
  public void setIniDate(LocalDate iniDate){
    this.iniDate = iniDate; 
  }
  public void setFinDate(LocalDate finDate){
    this.finDate =  finDate;
  }
  public void setStatus(String status){
    this.status = status; 
  }
}
