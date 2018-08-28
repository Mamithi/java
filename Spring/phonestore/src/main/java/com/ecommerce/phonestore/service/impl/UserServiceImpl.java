package com.ecommerce.phonestore.service.impl;

import com.ecommerce.phonestore.models.User;
import com.ecommerce.phonestore.models.security.PasswordResetToken;
import com.ecommerce.phonestore.repository.PasswordResetTokenRepository;
import com.ecommerce.phonestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(final String token){
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override

    public void createPasswordResetTokenForUser(final User user, final String token){
        final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(myToken);
    }
}
