package com.practicaldime.common.entity.users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class Location implements Comparable<Location> {

    private String id;

    @NotNull(message = "city is a required field")
    @Size(max = 32, message = "max length of city allowed is 32")
    private String city;

    @Size(max = 32, message = "max length of county allowed is 32")
    private String county;

    @NotNull(message = "state abbreviation is a required field")
    @Size(max = 2, min = 2, message = "state abbreviation should have length of 2")
    private String state;

    @Size(max = 10, message = "max length of zip code allowed is 10")
    private String zip;
    @Size(max = 2, message = "max length of country code allowed is 2")
    private String country;

    private Date createdTs;

    public Location() {
        super();
    }

    public Location(String id, String city, String county, String state, String zip, String country, Date date) {
        this.id = id;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.createdTs = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.city);
        hash = 29 * hash + Objects.hashCode(this.state);
        hash = 29 * hash + Objects.hashCode(this.zip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return Objects.equals(this.state, other.state);
    }

    @Override
    public int compareTo(Location o) {
        if (this == o) {
            return 0;
        }
        if(this.getZip() != null) {
            int compare = this.getZip().compareTo(o.getZip());
            if (compare != 0) {
                return compare;
            }
        }
        if(this.getCity() != null) {
            int compare = this.getCity().compareTo(o.getCity());
            if (compare != 0) {
                return compare;
            }
        }
        if(this.getState() != null) {
            return this.getState().compareTo(o.getState());
        }
        else{
            return -1;
        }
    }
}
