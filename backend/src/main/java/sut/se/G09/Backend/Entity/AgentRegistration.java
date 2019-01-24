package sut.se.G09.Backend.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "AgentRegistration", uniqueConstraints = {
@UniqueConstraint(columnNames = "ID")})
public class AgentRegistration {
  @Id
  @SequenceGenerator(name = "Aregist_seq", sequenceName = "Aregist_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Aregist_seq")
  @Column(name = "ID", unique = true, nullable = false, length = 100)
  private Long iD;          //เลขที่ลงทะเบียน
 // private Long idCard;       //id_card คนที่ขอรับสิทธิ

  private String titleName;


}