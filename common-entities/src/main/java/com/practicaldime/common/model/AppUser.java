package com.practicaldime.common.model;

import java.io.Serializable;
import java.util.Objects;

public class AppUser implements Serializable, Comparable<AppUser>{

	private static final long serialVersionUID = 1L;
	
	public char[] username;
    public String userId;
    public String userRole;
    public char[] userToken;
    public Boolean ghosting;
    public char[] ghostToken;
    public Long expiryTime;
    public char[] fullName;

    public AppUser(String username, String userId) {
        if (username != null && userId != null) {
            this.username = username.toCharArray();
            this.ghosting = Boolean.FALSE;
            this.userId = userId;
        } else {
            throw new RuntimeException("'username' and 'user-id' parameters cannot be null");
        }
    }

    public AppUser(String username, String userId, String fullName) {
        this(username, userId);
        this.fullName = fullName.toCharArray();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.userId);
        hash = 71 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AppUser other = (AppUser) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return Objects.equals(this.userId, other.userId);
    }

    @Override
    public int compareTo(AppUser that) {
        if (this == that) {
            return 0;
        }
        int comparison = this.userId.compareTo(that.userId);
        if (comparison != 0) {
            return comparison;
        }
        return new String(this.username).compareTo(new String(that.username));
    }

    @Override
    public String toString() {
        return "AppUser{" + "username=" + String.copyValueOf(username) + ", userId=" + userId + '}';
    }
}
