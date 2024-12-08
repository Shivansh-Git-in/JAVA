import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        try {

            //Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Demo","postgres","password");
            System.out.println("Connection Done");
            Statement st=con.createStatement();

            //Read
            String query="Select * from student";
            ResultSet rs=st.executeQuery(query);
            System.out.println("Result set");
//            while(rs.next()){
//                System.out.print(rs.getString(1) + "-");
//                System.out.print(rs.getString(2) + "-");
//                System.out.print(rs.getString(3));
//                System.out.println();
//            }

            //insert
//            String insertQuery="insert into student values(5,'Rohit',15)";
//            boolean status=st.execute(insertQuery);
//            System.out.println(status);

            //update
//            String updateQuery="update student set sname='Smith' where sid=5";
//            st.execute(updateQuery);

            //delete
//            String updateQuery="delete from student where sid=5";
//            st.execute(updateQuery);

            //PreparedStatement
            String insertQuery="insert into student values(?,?,?)";
            PreparedStatement pst=con.prepareStatement(insertQuery);
            pst.setInt(1,4);
            pst.setString(2,"Max");
            pst.setInt(3,32);

            pst.execute();
            con.close();
            System.out.println("Connection Closed");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
