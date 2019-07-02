package com.practicaldime.common.model;

import com.practicaldime.common.entity.users.Location;

import java.util.Date;

public class LocationModel implements RequestModel<Location>{
    
    public String id;
    public String zip;
    public String city;
    public String county;
    public String state;
    public String country;
    public Date created;
    
    public LocationModel() {
        super();
    }
    
    public LocationModel(Location entity) {
        this();
        city = entity.getCity();
        created = entity.getCreatedTs();
        id = entity.getId();
        state = entity.getState();
        county = entity.getCounty();
        zip = entity.getZip();
        country = entity.getCountry();
    }

    @Override
    public ModelFields validate() {
        ModelFields errors = new ModelFields();
        if(city == null || city.trim().length() == 0){
            errors.put("city", city, "city is a required field");
        }
        
        if(state == null || state.trim().length() == 0){
            errors.put("state", state, "state is a required field");
        }
        
        if(zip == null || zip.trim().length() == 0){
            errors.put("zip", zip, "zip is a required field");
        }
        return errors;
    }

    @Override
    public Location entity() {
        Location location = new Location();
        location.setId(id);
        location.setCreatedTs(created);
        location.setCountry(country);
        location.setCounty(county);
        location.setCity(city);
        location.setState(state);
        location.setZip(zip);
        location.setCity(city);
        return location;
    }


}
