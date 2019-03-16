package com.promineoFinal.socialMediaFInal.controllers;



@RestController
public class adminUser {
	 
	private int adminUserId;
	private String createNewAdminUser;
	private String deleteAdminUserId;
	
public adminUser(int adminUserId, String createNewAdminUser, String deleteAdminUserId) {
	this.setAdminUserId((adminUserId));
	this.setCreateNewAdminUser(createNewAdminUser);
	this.setDeleteAdminUserId(deleteAdminUserId);
	
}

public int adminUserId() {
	return adminUserId;
}





private void setCreateNewAdminUser(String createNewAdminUser2) {
	// TODO Auto-generated method stub
	
}

private void setDeleteAdminUserId(String deleteAdminUserId2) {
	// TODO Auto-generated method stub
	
}

public int getAdminUserId() {
	return adminUserId;
}

public void setAdminUserId(int adminUserId) {
	this.adminUserId = adminUserId;

}

public String setDeleteAdminUserId() {
	return deleteAdminUserId;
}
	
public void setDeleteAdminUserId1(String deleteAdminUserId) {
	this.deleteAdminUserId = deleteAdminUserId;
}
}
