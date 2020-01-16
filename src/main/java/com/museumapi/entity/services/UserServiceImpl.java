package com.museumapi.entity.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.museumapi.entity.dao.IUserDao;
import com.museumapi.entity.models.Users;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Users>) userDao.findAll();
	}

	@Override
	public Users getOneUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).get();
	}

	@Override
	public void delete(int id) {
		userDao.deleteById(id);

	}

	@Override
	public void put(Users user, int id) {
		userDao.findById(id).ifPresent((x) -> {
			user.setIdUser(id);
			userDao.save(user);
		});

	}

	@Override
	public void addUser(Users user) {
		System.out.println("tibu servicio" + user.getEmail());
		userDao.save(user);

	}

	@Override
	public String showJReport(String formatReport) {
		File file = null;
		try {
			Connection con = null;

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_museum", "postgres", "RichyLINK31P");

			file = ResourceUtils.getFile("classpath:users.jrxml");

			JasperReport jasperReport = null;

			jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

			Map<String, Object> parameter = new HashMap<>();

			JasperPrint jasperPrint = null;

			jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, con);

			System.out.println("JReport Done");

			JasperExportManager.exportReportToHtmlFile(jasperPrint, file.getParent() + "/jreports/jreport.html");
			JasperExportManager.exportReportToPdfFile(jasperPrint, file.getParent() + "/jreports/jreport.pdf");

			System.out.println("File Available");
			System.out.println("Jreport has been saved here : "+file.getParent() + "/jreports/jreport.pdf");

			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JRException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return formatReport;

	}


}
