package com.ifernandez.dev.test.products.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-18T11:13:34.004356+02:00[Europe/Madrid]")

public class Product   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("brandId")
  private Long brandId;

  @JsonProperty("rateId")
  private Long rateId;

  @JsonProperty("prize")
  private Double prize;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  public Product id(Long id) {
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

  public Product brandId(Long brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public Product rateId(Long rateId) {
    this.rateId = rateId;
    return this;
  }

  /**
   * Get rateId
   * @return rateId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getRateId() {
    return rateId;
  }

  public void setRateId(Long rateId) {
    this.rateId = rateId;
  }

  public Product prize(Double prize) {
    this.prize = prize;
    return this;
  }

  /**
   * Get prize
   * @return prize
  */
  @ApiModelProperty(example = "25.2", required = true, value = "")
  @NotNull


  public Double getPrize() {
    return prize;
  }

  public void setPrize(Double prize) {
    this.prize = prize;
  }

  public Product currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(example = "EUR", required = true, value = "")
  @NotNull


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Product startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(example = "2020-12-31-23.59.59", required = true, value = "")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Product endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(example = "2020-12-31-23.59.59", required = true, value = "")
  @NotNull


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.brandId, product.brandId) &&
        Objects.equals(this.rateId, product.rateId) &&
        Objects.equals(this.prize, product.prize) &&
        Objects.equals(this.currency, product.currency) &&
        Objects.equals(this.startDate, product.startDate) &&
        Objects.equals(this.endDate, product.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brandId, rateId, prize, currency, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    prize: ").append(toIndentedString(prize)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

