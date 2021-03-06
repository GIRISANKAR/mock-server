package com.nypl.mockServer.model;



import com.nypl.mockServer.Description;

import javax.persistence.*;

/**
 * Created by giris on 31/3/20.
 */
@Entity
@Table
public class HoldData {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private Object updatedDate;

    @Column(columnDefinition = "CREATEDDATE")
    private String createdDate;

    @Column(columnDefinition = "TRACKINGID")
    private String trackingId;

    @Column(columnDefinition = "INSTITUTIONID")
    private String owningInstitutionId;

    @Column(name = "item_barcode",columnDefinition = "ITEMBARCODE")
    private String itemBarcode;

    @Column(name = "patron_barcode",columnDefinition = "PATRONBARCODE")
    private String patronBarcode;

    @Transient
    private Description description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Object updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getOwningInstitutionId() {
        return owningInstitutionId;
    }

    public void setOwningInstitutionId(String owningInstitutionId) {
        this.owningInstitutionId = owningInstitutionId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public String getPatronBarcode() {
        return patronBarcode;
    }

    public void setPatronBarcode(String patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
