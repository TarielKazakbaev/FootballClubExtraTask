import java.sql.*;

public class Connection1 {
    private final String url ="jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "19041988";

    public Connection connect(){
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insertFootball_Club(Football_Club football_club){
        String SQL ="INSERT INTO \"extra_project\".football_club"+
        "(name,rate)"+ "VALUES(?,?);";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, football_club.getName());
            stmt.setInt(2, football_club.getRate());


            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void insertStaff(Staff staff){
        String SQL ="INSERT INTO \"extra_project\".staff"+
                "(fio,position,club_name,salary )"+ "VALUES(?,?,?,?,?);";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(2, staff.getFio());
            stmt.setString(4, staff.getClub_name());
            stmt.setInt(5,staff.getSalary());

            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
