package LW_09;

import java.sql.*;

public class DBConnector {

    private String url ="jdbc:mysql://localhost:3306/singup";
    private String username ="root";
    private String password = "";
    Connection connection;
    PreparedStatement preparedStatement;

    DBConnector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException exception){
            exception.printStackTrace();
        }

        try{
            connection = DriverManager.getConnection(url,username,password);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }


    public void addData(String nameq, String emailq, String genderq, String dobq, String passwordq) throws SQLException {

        preparedStatement = connection.prepareStatement("INSERT INTO `user` (`name`, `email`, `gender`, `birthday`, `password`) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1,nameq);
        preparedStatement.setString(2,emailq);
        preparedStatement.setString(3,genderq);
        preparedStatement.setString(4,dobq);
        preparedStatement.setString(5,passwordq);
        preparedStatement.execute();
        connection.close();
    }

    boolean getData(String emailq,String passwordq)throws SQLException{
        preparedStatement = connection.prepareStatement("Select email,password from user where email=? and password=?");
        preparedStatement.setString(1,emailq);
        preparedStatement.setString(2,passwordq);
        ResultSet rs = preparedStatement.executeQuery();
        return rs.next();

    }
}
