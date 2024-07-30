package com.Rav_R.DatabaseApplication.Dao.Impl;

import com.Rav_R.DatabaseApplication.Dao.AuthorDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImple implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImple(final JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;

    }
}
