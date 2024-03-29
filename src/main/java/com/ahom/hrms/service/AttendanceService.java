package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.dto.AttendanceDto;
import com.ahom.hrms.entities.Attendance;
import org.springframework.web.multipart.MultipartFile;

public interface AttendanceService {

	public void saveEmplAttendance(AttendanceDto attendancedto);
	
	public List<AttendanceDto> getAllEmplAttendance();
	
	public void deleteAttendance(int empId);
	public void updateEmployeeAttendance(AttendanceDto attendancedto);
	public void saveExcel(MultipartFile file);
	public List<Attendance>getAll();
	
}
