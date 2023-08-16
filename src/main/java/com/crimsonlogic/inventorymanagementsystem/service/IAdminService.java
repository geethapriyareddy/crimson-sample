package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;

public interface IAdminService {
	public List<Admin> viewAllAdmins();
	public Admin viewByAdminId(int adminId);
	public Admin insertAdmin(Admin admin);

 

}