package com.online.exam.onlineexam.mappers;

import com.online.exam.onlineexam.model.entities.UserDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserDetails> {
    @Override
    public UserDetails mapRow(ResultSet resultSet, int i) throws SQLException {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(resultSet.getInt("id"));
        userDetails.setFirstName(resultSet.getString("first_name"));
        userDetails.setLastName(resultSet.getString("last_name"));
        userDetails.setGender(resultSet.getString("gender"));
        userDetails.setPhoneNo(resultSet.getString("mobile_no"));
        userDetails.setDob(resultSet.getDate("dob"));
        userDetails.setRegisteredDate(resultSet.getDate("registered_date"));
        userDetails.setEmail(resultSet.getString("email_id"));
        userDetails.setAlternateMobileNo(resultSet.getString("alternate_mobile_no"));
        userDetails.setQualification(resultSet.getString("qualification"));
        userDetails.setSpecialization(resultSet.getString("specialization"));
        return userDetails;
    }
}
