package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ConferenceCategory;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T19:11:10.487+01:00[Europe/Paris]")

public class InlineObject2   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("category")
  @Valid
  private List<ConferenceCategory> category = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("photoUrls")
  @Valid
  private List<String> photoUrls = null;

  /**
   * Conference status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

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

  @JsonProperty("url")
  private String url;

  @JsonProperty("date")
  private String date;

  @JsonProperty("photos")
  @Valid
  private List<String> photos = null;

  @JsonProperty("admins")
  @Valid
  private List<User> admins = null;

  public InlineObject2 id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineObject2 category(List<ConferenceCategory> category) {
    this.category = category;
    return this;
  }

  public InlineObject2 addCategoryItem(ConferenceCategory categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConferenceCategory> getCategory() {
    return category;
  }

  public void setCategory(List<ConferenceCategory> category) {
    this.category = category;
  }

  public InlineObject2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineObject2 photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public InlineObject2 addPhotoUrlsItem(String photoUrlsItem) {
    if (this.photoUrls == null) {
      this.photoUrls = new ArrayList<>();
    }
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
  */
  @ApiModelProperty(value = "")


  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public InlineObject2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Conference status in the store
   * @return status
  */
  @ApiModelProperty(value = "Conference status in the store")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineObject2 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InlineObject2 date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InlineObject2 photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  public InlineObject2 addPhotosItem(String photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
  */
  @ApiModelProperty(value = "")


  public List<String> getPhotos() {
    return photos;
  }

  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public InlineObject2 admins(List<User> admins) {
    this.admins = admins;
    return this;
  }

  public InlineObject2 addAdminsItem(User adminsItem) {
    if (this.admins == null) {
      this.admins = new ArrayList<>();
    }
    this.admins.add(adminsItem);
    return this;
  }

  /**
   * Get admins
   * @return admins
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<User> getAdmins() {
    return admins;
  }

  public void setAdmins(List<User> admins) {
    this.admins = admins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.id, inlineObject2.id) &&
        Objects.equals(this.category, inlineObject2.category) &&
        Objects.equals(this.name, inlineObject2.name) &&
        Objects.equals(this.photoUrls, inlineObject2.photoUrls) &&
        Objects.equals(this.status, inlineObject2.status) &&
        Objects.equals(this.url, inlineObject2.url) &&
        Objects.equals(this.date, inlineObject2.date) &&
        Objects.equals(this.photos, inlineObject2.photos) &&
        Objects.equals(this.admins, inlineObject2.admins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, status, url, date, photos, admins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    admins: ").append(toIndentedString(admins)).append("\n");
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

