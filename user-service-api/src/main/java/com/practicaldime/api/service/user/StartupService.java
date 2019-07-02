package com.practicaldime.api.service.user;

import com.practicaldime.common.entity.users.Account;

public interface StartupService {
    
    void initialize();

    Account getUserAccount(String username);

    void onInitialized();
}
