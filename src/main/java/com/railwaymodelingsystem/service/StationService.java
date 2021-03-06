package com.railwaymodelingsystem.service;

import com.railwaymodelingsystem.model.User;
import com.railwaymodelingsystem.model.rms.Station;

public interface StationService {
    Station addStation(Station station);
    Boolean isExists(String station, User user);
    Station getStationByNameAndUser(String name, User user);
    void deleteByNameAndUser(String name, User user);
}
