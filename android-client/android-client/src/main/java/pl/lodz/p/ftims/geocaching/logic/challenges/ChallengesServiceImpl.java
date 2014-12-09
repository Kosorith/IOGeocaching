package pl.lodz.p.ftims.geocaching.logic.challenges;

import pl.lodz.p.ftims.geocaching.logic.gps.LocationService;
import pl.lodz.p.ftims.geocaching.logic.inject.InjectPlz;
import pl.lodz.p.ftims.geocaching.model.Challenge;
import pl.lodz.p.ftims.geocaching.model.GeoCoords;
import pl.lodz.p.ftims.geocaching.model.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 12/8/14.
 */
public class ChallengesServiceImpl implements ChallengesService {

    private LocationService locationService;

    public ChallengesServiceImpl(LocationService locationService) {
        this.locationService = locationService;
    }

    @Override
    public List<Challenge> getChallengeList() {
        GeoCoords currentCoords = locationService.getCurrentLocation();
        if (currentCoords == null) {
            return new ArrayList<Challenge>();
        }

        // TODO: Wyślij prośbę o listę
        return null;
    }

    @Override
    public boolean finishChallenge(Solution solution) {
        // TODO: Wyślij Solution
        return false;
    }

}