package com.ecommerce.phonestore.service;

import com.ecommerce.phonestore.models.User;
import com.ecommerce.phonestore.models.security.PasswordResetToken;

public interface UserService
{
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);
}
