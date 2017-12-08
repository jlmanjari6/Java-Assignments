/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alapatiassign10;

import java.sql.*;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class AlapatiAssign10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
        String username = "hr";
        String password = "hr";
        Statement dbStatement = null;
        ResultSet dbrs = null;
        Connection conn = null;

        try {
            conn
                    = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful.");
            System.out.println("*************************************");
        } catch (SQLException ex) {
            System.out.println("Problems with connection" + ex);
        }

        String query
                = "select sid,mathscore,readingscore,writingscore,totalscore from studentmarks";

        try {
            dbStatement
                    = conn.createStatement();

        } catch (SQLException ex) {
            System.out.println("Problems creating statement" + ex);
        }
        try {
            dbrs = dbStatement.executeQuery(query);

        } catch (SQLException ex) {
            System.out.println("Problems executing statement" + ex);
        }
        try {
            while (dbrs.next()) {
                int sId = dbrs.getInt("sid");
                int mathScore = dbrs.getInt("mathscore");
                int readingScore = dbrs.getInt("readingscore");
                int writingScore = dbrs.getInt("writingscore");
                int totalScore = dbrs.getInt("totalscore");

                int sumOfScores = mathScore + readingScore + writingScore;
                if (totalScore != sumOfScores) {
                    System.out.println("update CALL EXECUTED ON");
                    System.out.println("S_ID:- " + sId + " Sum of scores:- " + sumOfScores + " TotalScore:- " + totalScore);
                    try {
                        CallableStatement updateTotalScore
                                = conn.prepareCall("{call updateTotalMarks(?, ?)}");
                        updateTotalScore.setInt("stuId", sId);
                        updateTotalScore.setInt("total_score", totalScore);
                        updateTotalScore.executeUpdate();
                    } catch (SQLException ex) {
                        System.out.println("Problems with CallableStatement");
                    }

                }

            }
        } catch (SQLException ex) {
            System.out.println(
                    "SQLException occurred while displaying results.\n"
                    + ex);
        }

        try {
            System.out.println("*************************************");
            dbStatement.close();
        } catch (SQLException ex) {
            System.out.println("Problem closing statement.");
        }
        try {
            conn.close();
            System.out.println("closing connection");
        } catch (SQLException ex) {
            System.out.println("Problem closing connection.");
        }
    }
}
