package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse2003Form;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T19:11:10.487+01:00[Europe/Paris]")

public class Order   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("Conference")
  private InlineResponse2001 conference;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("shipDate")
  private OffsetDateTime shipDate;

  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("complete")
  private Boolean complete = false;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("category")
  private String category;

  @JsonProperty("form")
  private InlineResponse2003Form form;

  @JsonProperty("admin")
  @Valid
  private List<InlineResponse200> admin = null;

  public Order id(Long id) {
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

  public Order conference(InlineResponse2001 conference) {
    this.conference = conference;
    return this;
  }

  /**
   * Get conference
   * @return conference
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2001 getConference() {
    return conference;
  }

  public void setConference(InlineResponse2001 conference) {
    this.conference = conference;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
  */
  @ApiModelProperty(value = "Order Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  */
  @ApiModelProperty(value = "")


  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Order price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Order category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Order form(InlineResponse2003Form form) {
    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2003Form getForm() {
    return form;
  }

  public void setForm(InlineResponse2003Form form) {
    this.form = form;
  }

  public Order admin(List<InlineResponse200> admin) {
    this.admin = admin;
    return this;
  }

  public Order addAdminItem(InlineResponse200 adminItem) {
    if (this.admin == null) {
      this.admin = new ArrayList<>();
    }
    this.admin.add(adminItem);
    return this;
  }

  /**
   * Get admin
   * @return admin
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InlineResponse200> getAdmin() {
    return admin;
  }

  public void setAdmin(List<InlineResponse200> admin) {
    this.admin = admin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.conference, order.conference) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.category, order.category) &&
        Objects.equals(this.form, order.form) &&
        Objects.equals(this.admin, order.admin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conference, quantity, shipDate, status, complete, price, category, form, admin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
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

