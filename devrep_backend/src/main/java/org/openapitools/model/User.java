package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Conference;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T19:11:10.487+01:00[Europe/Paris]")

public class User   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("isAdmin")
  private Boolean isAdmin = false;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("address")
  private String address;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("conferences")
  @Valid
  private List<Conference> conferences = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
  */
  @ApiModelProperty(value = "")


  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  */
  @ApiModelProperty(value = "")


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @ApiModelProperty(value = "")


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public User conferences(List<Conference> conferences) {
    this.conferences = conferences;
    return this;
  }

  public User addConferencesItem(Conference conferencesItem) {
    if (this.conferences == null) {
      this.conferences = new ArrayList<>();
    }
    this.conferences.add(conferencesItem);
    return this;
  }

  /**
   * Get conferences
   * @return conferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Conference> getConferences() {
    return conferences;
  }

  public void setConferences(List<Conference> conferences) {
    this.conferences = conferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.photo, user.photo) &&
        Objects.equals(this.conferences, user.conferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isAdmin, name, email, lastname, phone, address, photo, conferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    conferences: ").append(toIndentedString(conferences)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

