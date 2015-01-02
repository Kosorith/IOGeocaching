package pl.lodz.p.ftims.geocaching.logic.user;

import pl.lodz.p.ftims.geocaching.model.Profile;

/**
 * Created by michal on 11/19/14.
 */
public interface ProfilesService {

    Profile getCurrentProfile();

    void setCurrentProfile(Profile profile);

    void loadProfile();

    //  DaoClient ponoć nie ma jak tego zrobić
//    boolean saveProfile();

    boolean preverifyProfile(Profile profile);

}
