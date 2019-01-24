package sut.se.G09.Backend.Entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity  //บอกว่าเป็น class com.okta.developer.demo.Entity class ที่เก็บขอมูล
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="Category") //ชื่อตาราง
public class Category {
    @Id
    @SequenceGenerator(name = "Category_seq", sequenceName = "Category_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Category_seq")
    @Column(name = "CategoryId", unique = true, nullable = false, length = 100)
    private Long iD;
    private String typeName;



public Category(){}

}