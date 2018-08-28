package com.ecommerce.phonestore.models.security;

import com.ecommerce.phonestore.models.User;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class PasswordResetToken
{

    private static final int EXPIRY_TIME = 60*24;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String token;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name="user_id")
    private User user;

    private Date expiryDate;

    public PasswordResetToken(final String token, User user)
    {
        super();

        this.token = token;
        this.user = user;
        this.expiryDate = calculateExpiryDate(EXPIRY_TIME);
    }

    private Date calculateExpiryDate(final int expiryTimeInMinutes){
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);

        return new Date(cal.getTime().getTime());
    }

    public static int getExpiryTime()
    {
        return EXPIRY_TIME;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Date getExpiryDate()
    {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate)
    {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString()
    {
        return "PasswordResetToken{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", user=" + user +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
