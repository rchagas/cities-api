package com.github.rchagas.citiesapi.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  @Column(name = "uf")
  private String abbreviation;

  private Integer ibge;

/*  @Column(name = "pais")
  private Integer CountryId;*/

  @ManyToOne
  @JoinColumn(name = "pais", referencedColumnName = "id")
  private Country country;

  @Type(type = "jsonb")
  @Basic(fetch = FetchType.LAZY)
  @Column(name = "ddd", columnDefinition = "jsonb")
  private List<Integer> ddd;

  public State() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public Integer getIbge() {
    return ibge;
  }

  public Country getCountry() {
    return country;
  }

/*  public Integer getCountryId() {
    return CountryId;
  }*/

  public List<Integer> getDdd() {
    return ddd;
  }
}
