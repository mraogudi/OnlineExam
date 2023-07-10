package com.online.exam.onlineexam.repository;

import com.online.exam.onlineexam.exceptions.UserDataException;
import com.online.exam.onlineexam.mappers.UserRowMapper;
import com.online.exam.onlineexam.model.entities.UserDetails;
import com.online.exam.onlineexam.model.requests.UserDetailsReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class OnlineExamRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Boolean registerUserDetails(UserDetails userDetails) throws UserDataException {
        boolean inserted = false;
                String insertSql = "insert into tbl_user_details (first_name, last_name, dob, gender, email_id, mobile_no, registered_date," +
                " qualification, specialization, alternate_mobile_no)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            inserted = Boolean.TRUE.equals(jdbcTemplate.execute(insertSql, (PreparedStatementCallback<Boolean>) ps -> {
                ps.setString(1, userDetails.getFirstName());
                ps.setString(2, userDetails.getLastName());
                ps.setDate(3, new Date(userDetails.getDob().getTime()));
                ps.setString(4, userDetails.getGender());
                ps.setString(5, userDetails.getEmail());
                ps.setString(6, userDetails.getPhoneNo());
                ps.setDate(7, new Date(new java.util.Date().getTime()));
                ps.setString(8, userDetails.getQualification());
                ps.setString(9, userDetails.getSpecialization());
                ps.setString(10, userDetails.getAlternateMobileNo());
                return ps.execute();
            }));
        } catch (Exception e) {
            throw new UserDataException();
        }
        return inserted;
    }

    public UserDetails findByPhoneNo(UserDetailsReq userDetailsReq) {
        String selectQuery = "select *" +
                " from tbl_user_details where mobile_no = '"+userDetailsReq.getMobileNo()+"'" +
                " and email_id = '"+userDetailsReq.getEmail()+"' and dob = '"+userDetailsReq.getDob()+"'" +
                " or (first_name = '"+userDetailsReq.getFirstName()+"' or last_name = '"+userDetailsReq.getLastName()+"'" +
                " or first_name = '"+userDetailsReq.getLastName()+"' or last_name = '"+userDetailsReq.getFirstName()+"')";

        List<UserDetails> userDetailsList = jdbcTemplate.query(selectQuery, new UserRowMapper());
        if(!userDetailsList.isEmpty()) {
            return userDetailsList.get(0);
        } else {
            return null;
        }
    }

    public List<UserDetails> getAllUsers() {
        String selectAll = "select * from tbl_user_details";
        return jdbcTemplate.queryForList(selectAll, UserDetails.class);
    }

    public UserDetails getById(Integer id) {
        String selectQuery = "select * from tbl_user_details where id = ?";
        return jdbcTemplate.queryForObject(selectQuery, new Object[]{id}, new UserRowMapper());
    }
}
