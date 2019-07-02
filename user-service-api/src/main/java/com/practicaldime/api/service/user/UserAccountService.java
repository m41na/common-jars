package com.practicaldime.api.service.user;

import com.practicaldime.common.model.*;
import com.practicaldime.common.util.AResult;

public interface UserAccountService {

    AResult<Registration> register(Registration profile);
    
    AResult<Credentials> login(Credentials cred);

    AResult<PassReset> resetPassword(PassReset reset);

    AResult<PassUpdate> updatePassword(PassUpdate update);
    
    AResult<ProfileModel> retrieveById(String id);
    
    AResult<ProfileModel> retrieveByEmail(String email);

    AResult<ProfileModel> update(ProfileModel profile);

    AResult<Integer> delete(String id);

    AResult<Boolean> verifyEmail(String username, String email);

    AResult<Boolean> verifyPhone(String username, String phone);
}
