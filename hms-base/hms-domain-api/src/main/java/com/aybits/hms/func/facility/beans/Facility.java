package com.aybits.hms.func.facility.beans;

import com.aybits.hms.arch.util.HMSJSONParser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("facility")
public class Facility {

        @JsonProperty("hotel_id")
        private String hotelId;
        @JsonProperty("facility_id")
        private String  facilityId;
        @JsonProperty("facility_name")
        private String facilityName;
        @JsonProperty("facility_description")
        private String  facilityDescription;
        @JsonProperty("is_facility_available")
        private Boolean isFacilityAvailable;
        @JsonProperty("is_facility_chargeable")
        private Boolean isChargeable;
        @JsonProperty("facility_type")
        private FacilityType facilityType;
        @JsonProperty("facility_charges")
        private Double facilityCharges;

        public Facility() {
        }

        public Facility(String hotelId,String facilityId, String facilityName, String facilityDescription,
                        FacilityType facilityType,
                        Boolean isFacilityAvailable,
                        Boolean isChargeable,
                        Double facilityCharges) {
                this.hotelId = hotelId;
                this.facilityId = facilityId;
                this.facilityName = facilityName;
                this.facilityDescription = facilityDescription;
                this.isFacilityAvailable = isFacilityAvailable;
                this.isChargeable = isChargeable;
                this.facilityType = facilityType;
                this.facilityCharges = facilityCharges;
        }

        public String getFacilityId() {
                return facilityId;
        }

        public void setFacilityId(String facilityId) {
                this.facilityId = facilityId;
        }

        public String getFacilityName() {
                return facilityName;
        }

        public void setFacilityName(String facilityName) {
                this.facilityName = facilityName;
        }

        public String getFacilityDescription() {
                return facilityDescription;
        }

        public void setFacilityDescription(String facilityDescription) {
                this.facilityDescription = facilityDescription;
        }

        public Boolean getIsFacilityAvailable() {
                return isFacilityAvailable;
        }

        public void setIsFacilityAvailable(Boolean isFacilityAvailable) {
                this.isFacilityAvailable = isFacilityAvailable;
        }

        public FacilityType getFacilityType() {
                return facilityType;
        }

        public void setFacilityType(FacilityType facilityType) {
                this.facilityType = facilityType;
        }

        public Double getFacilityCharges() {
                return facilityCharges;
        }

        public void setFacilityCharges(Double facilityCharges) {
                this.facilityCharges = facilityCharges;
        }

        public Boolean getChargeable() {
                return isChargeable;
        }

        public void setChargeable(Boolean chargeable) {
                isChargeable = chargeable;
        }

        public String getHotelId() {
                return hotelId;
        }

        public void setHotelId(String hotelId) {
                this.hotelId = hotelId;
        }

        public Boolean getFacilityAvailable() {
                return isFacilityAvailable;
        }

        public void setFacilityAvailable(Boolean facilityAvailable) {
                isFacilityAvailable = facilityAvailable;
        }


        @Override
        public String toString(){
                return HMSJSONParser.convertObjectToJSON((Object)this);
        }
}
