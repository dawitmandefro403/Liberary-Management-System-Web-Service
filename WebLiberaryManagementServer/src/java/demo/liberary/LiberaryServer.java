/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.liberary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev PC
 */
@WebService(serviceName = "LiberaryServer")
public class LiberaryServer {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "studentRegister")
    public int studentRegister(@WebParam(name = "studId") String studId, @WebParam(name = "studName") String studName, @WebParam(name = "studStream") String studStream, @WebParam(name = "studClass") String studClass, @WebParam(name = "studAddress") String studAddress) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava", "root", "");
            Statement st = con.createStatement();
            String sql = "INSERT INTO student VALUES ('"+studId+"','"+studName+"','"+studStream+"','"+studClass+"','"+studAddress+"');";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "studentReturn")
    public List studentReturn(@WebParam(name = "studId") String studId) {
                List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM issue WHERE StudentId='"+studId+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("StudentId"));
                list.add(rs.getString("StudentName"));
                list.add(rs.getString("BookId"));
                list.add(rs.getString("BookName"));
                list.add(rs.getString("Address"));
                list.add(rs.getString("IssueDate"));
                list.add(rs.getString("Stream"));
                list.add(rs.getString("Class"));
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertReturnDetail")
    public int insertReturnDetail(@WebParam(name = "studId") String studId, @WebParam(name = "studName") String studName, @WebParam(name = "bookId") String bookId, @WebParam(name = "bookName") String bookName, @WebParam(name = "issuedOn") String issuedOn, @WebParam(name = "returnDate") String returnDate) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "INSERT INTO returndetail VALUES ('"+studId+"','"+studName+"','"+bookId+"','"+bookName+"','"+issuedOn+"','"+returnDate+"');";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteIssue")
    public int deleteIssue(@WebParam(name = "studId") String studId) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "DELETE FROM issue WHERE StudentId='"+studId+"';";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateBook")
    public int updateBook(@WebParam(name = "available") String available, @WebParam(name = "bookId") String bookId) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "UPDATE books SET Available='"+available+"' WHERE BookId='"+bookId+"';";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addBook")
    public int addBook(@WebParam(name = "bookId") String bookId, @WebParam(name = "bookName") String bookName, @WebParam(name = "author") String author, @WebParam(name = "bookStream") String bookStream, @WebParam(name = "bookClass") String bookClass, @WebParam(name = "available") String available) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "INSERT INTO books VALUES ('"+bookId+"','"+bookName+"','"+author+"','"+bookStream+"','"+bookClass+"','"+available+"');";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookDetailByName")
    public List bookDetailByName(@WebParam(name = "bookName") String bookName) {
        List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM books WHERE BookName='"+bookName+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("BookId"));
                list.add(rs.getString("BookName"));
                list.add(rs.getString("Author"));
                list.add(rs.getString("Stream"));
                list.add(rs.getString("Class"));
                list.add(rs.getString("Available"));
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookDetailByStream")
    public List bookDetailByStream(@WebParam(name = "bookStream") String bookStream, @WebParam(name = "bookClass") String bookClass) {
        List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM books WHERE Stream='"+bookStream+"' and Class='"+bookClass+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("BookId"));
                list.add(rs.getString("BookName"));
                list.add(rs.getString("Author"));
                list.add(rs.getString("Stream"));
                list.add(rs.getString("Class"));
                list.add(rs.getString("Available"));
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "issueBookDetail")
    public List issueBookDetail(@WebParam(name = "bookStream") String bookStream, @WebParam(name = "bookClass") String bookClass) {
        List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM issue WHERE Stream='"+bookStream+"' and Class='"+bookClass+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("StudentId"));
                list.add(rs.getString("StudentName"));
                list.add(rs.getString("BookId"));
                list.add(rs.getString("BookName"));
                list.add(rs.getString("Address"));
                list.add(rs.getString("IssueDate"));
                list.add(rs.getString("Stream"));
                list.add(rs.getString("Class"));
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "issuedByStudentId")
    public List issuedByStudentId(@WebParam(name = "studId") String studId) {
        List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM student WHERE StudentId='"+studId+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("StudentId"));
                list.add(rs.getString("StudentName"));
                list.add(rs.getString("SStream"));
                list.add(rs.getString("SClass"));
                list.add(rs.getString("Address"));
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "issuedByBookId")
    public List issuedByBookId(@WebParam(name = "bookId") String bookId) {
                List list = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM books WHERE BookId='"+bookId+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                list.add(rs.getString("BookId"));
                list.add(rs.getString("BookName"));
                list.add(rs.getString("Author"));
                list.add(rs.getString("Stream"));
                list.add(rs.getString("Class"));
                list.add(rs.getString("Available"));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertIssueBook")
    public int insertIssueBook(@WebParam(name = "studId") String studId, @WebParam(name = "studName") String studName, @WebParam(name = "bookId") String bookId, @WebParam(name = "bookName") String bookName, @WebParam(name = "address") String address, @WebParam(name = "issueDate") String issueDate, @WebParam(name = "studStream") String studStream, @WebParam(name = "studClass") String studClass) {
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/liberaryjava",
                    "root", "");
            Statement st = con.createStatement();
            String sql = "INSERT INTO issue VALUES ('"+studId+"','"+studName+"','"+bookId+"','"+bookName+"','"+address+"','"+issueDate+"','"+studStream+"','"+studClass+"');";
            r = st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return r;
    }
}
