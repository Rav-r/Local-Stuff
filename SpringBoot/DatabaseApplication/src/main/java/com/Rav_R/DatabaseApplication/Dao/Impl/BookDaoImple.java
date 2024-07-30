package com.Rav_R.DatabaseApplication.Dao.Impl;

import com.Rav_R.DatabaseApplication.Dao.BookDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImple implements BookDao {

    private final JdbcTemplate jdbcTemplate;
    public BookDaoImple(final JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}

