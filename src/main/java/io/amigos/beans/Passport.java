package io.amigos.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ConfigurationProperties(prefix = "passport")
public class Passport {

    private int passportId;
    private String name;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date issuedDate;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date expiryDate;
    private String issuedAuthority;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getIssuedAuthority() {
        return issuedAuthority;
    }

    public void setIssuedAuthority(String issuedAuthority) {
        this.issuedAuthority = issuedAuthority;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportId=" + passportId +
                ", name='" + name + '\'' +
                ", issuedDate=" + issuedDate +
                ", expiryDate=" + expiryDate +
                ", issuedAuthority='" + issuedAuthority + '\'' +
                '}';
    }
}
