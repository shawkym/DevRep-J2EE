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
 * Conference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T19:11:10.487+01:00[Europe/Paris]")

public class Conference   {
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

  public Conference id(Long id) {
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

  public Conference category(List<ConferenceCategory> category) {
    this.category = category;
    return this;
  }

  public Conference addCategoryItem(ConferenceCategory categoryItem) {
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

  public Conference name(String name) {
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

  public Conference photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Conference addPhotoUrlsItem(String photoUrlsItem) {
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

  public Conference status(StatusEnum status) {
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

  public Conference url(String url) {
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

  public Conference date(String date) {
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

  public Conference photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  public Conference addPhotosItem(String photosItem) {
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

  public Conference admins(List<User> admins) {
    this.admins = admins;
    return this;
  }

  public Conference addAdminsItem(User adminsItem) {
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
    Conference conference = (Conference) o;
    return Objects.equals(this.id, conference.id) &&
        Objects.equals(this.category, conference.category) &&
        Objects.equals(this.name, conference.name) &&
        Objects.equals(this.photoUrls, conference.photoUrls) &&
        Objects.equals(this.status, conference.status) &&
        Objects.equals(this.url, conference.url) &&
        Objects.equals(this.date, conference.date) &&
        Objects.equals(this.photos, conference.photos) &&
        Objects.equals(this.admins, conference.admins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, status, url, date, photos, admins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conference {\n");
    
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

