package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003Form
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T19:11:10.487+01:00[Europe/Paris]")

public class InlineResponse2003Form   {
  /**
   * Gets or Sets title
   */
  public enum TitleEnum {
    MR("Mr"),
    
    MRS("Mrs"),
    
    P_("P."),
    
    DR_("Dr.");

    private String value;

    TitleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TitleEnum fromValue(String value) {
      for (TitleEnum b : TitleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("title")
  private TitleEnum title;

  @JsonProperty("first name")
  private String firstName;

  @JsonProperty("last name")
  private String lastName;

  @JsonProperty("Institution")
  private String institution;

  @JsonProperty("Address")
  private String address;

  @JsonProperty("Zip")
  private String zip;

  @JsonProperty("City")
  private String city;

  @JsonProperty("Country")
  private String country;

  @JsonProperty("Email")
  private String email;

  @JsonProperty("Phone")
  private String phone;

  @JsonProperty("category")
  private String category;

  @JsonProperty("price")
  private String price;

  public InlineResponse2003Form title(TitleEnum title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TitleEnum getTitle() {
    return title;
  }

  public void setTitle(TitleEnum title) {
    this.title = title;
  }

  public InlineResponse2003Form firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse2003Form lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineResponse2003Form institution(String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * Get institution
   * @return institution
  */
  @ApiModelProperty(value = "")


  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public InlineResponse2003Form address(String address) {
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

  public InlineResponse2003Form zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
  */
  @ApiModelProperty(value = "")


  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public InlineResponse2003Form city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public InlineResponse2003Form country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InlineResponse2003Form email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse2003Form phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public InlineResponse2003Form category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public InlineResponse2003Form price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Form inlineResponse2003Form = (InlineResponse2003Form) o;
    return Objects.equals(this.title, inlineResponse2003Form.title) &&
        Objects.equals(this.firstName, inlineResponse2003Form.firstName) &&
        Objects.equals(this.lastName, inlineResponse2003Form.lastName) &&
        Objects.equals(this.institution, inlineResponse2003Form.institution) &&
        Objects.equals(this.address, inlineResponse2003Form.address) &&
        Objects.equals(this.zip, inlineResponse2003Form.zip) &&
        Objects.equals(this.city, inlineResponse2003Form.city) &&
        Objects.equals(this.country, inlineResponse2003Form.country) &&
        Objects.equals(this.email, inlineResponse2003Form.email) &&
        Objects.equals(this.phone, inlineResponse2003Form.phone) &&
        Objects.equals(this.category, inlineResponse2003Form.category) &&
        Objects.equals(this.price, inlineResponse2003Form.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, lastName, institution, address, zip, city, country, email, phone, category, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Form {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

