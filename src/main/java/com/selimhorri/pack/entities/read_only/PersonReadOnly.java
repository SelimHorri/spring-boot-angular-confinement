package com.selimhorri.pack.entities.read_only;

import org.springframework.data.annotation.Immutable;

@Immutable
public interface PersonReadOnly {
	
	public abstract int getId();
	public abstract String getFname();
	public abstract String getLname();
	public abstract String getEmail();
	public abstract String getPassword();
	public abstract String toString();
	
}







