package com.github.rchagas.citiesapi.entities;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
@TypeDefs({
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

  @Id
  private Long id;

  @Column (name = "nome")
  private String name;

  @Column (name = "uf")
  private String state;

  @Column (name = "ibge")
  private Integer ibge;

  @Column (name = "lat_lon")
  private String geolocation;

  @Type(type = "point")
  @Column(name = "lat_lon", updatable = false, insertable = false)
  private Point location;

/*  @Column (name = "latitude")
  private Double latitude;

  @Column (name = "longitude")
  private Double longitude;*/

  public City() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  public Integer getIbge() {
    return ibge;
  }

  public String getGeolocation() {
    return geolocation;
  }

  public Point getLocation() {
    return location;
  }

/*  public Double getLatitude() {
    return latitude;
  }

  public Double getLongitude() {
    return longitude;
  }*/
}
