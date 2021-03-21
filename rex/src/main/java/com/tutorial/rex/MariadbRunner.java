package com.tutorial.rex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class MariadbRunner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection);
            String URL = connection.getMetaData().getURL();
            System.out.println(URL);
            String User = connection.getMetaData().getUserName();
            System.out.println(User);

            Statement statement = connection.createStatement();
            String sql_Mail = "CREATE TABLE IF NOT EXISTS Mail(" +
                "mailID int AUTO_INCREMENT NOT NULL PRIMARY KEY," +
                "name varchar(50) NULL," +
                "mailPath varchar(60) NOT NULL," +
                "mDate date NULL," +
                "category int NOT NULL," +
                "contents varchar(1000) NOT NULL)";

            String sql_Importance = "CREATE TABLE IF NOT EXISTS Importance(" +
                "mId int NOT NULL PRIMARY KEY,"+
                "importance int NOT NULL,"+
                "FOREIGN KEY(mId) REFERENCES Mail(mailId))";

            statement.executeUpdate(sql_Mail);
            statement.executeUpdate(sql_Importance);
        }
        //메일작성자, 메일주소, 메일작성일, 메일분류, 메일내용
        // jdbcTemplate.execute("INSERT INTO Mail(name, mailPath, mDate, category, contents) VALUES('tester', 'tester@test.com', '2021-3-19', '1', 'This Mail is test mail. Database status is good. spring boot and mariadb and rest api is so difficult! Wow!!')");
        //메일 id, 중요도
        // jdbcTemplate.execute("INSERT INTO Importance(mId, importance) VALUES(1, 1)");
    }
}
