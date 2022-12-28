package br.edu.ifsul.tsi.dao;

import br.edu.ifsul.tsi.model.Genero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GeneroDAO extends BaseDAO{

    public static List<Genero> selectGeneros() {
        final String sql = "SELECT * FROM genero ORDER BY descricao";
        try //try-witch-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet rs = pstmt.executeQuery();
                )
        {
            List<Genero> generos = new ArrayList<>();
            while(rs.next()) {
                generos.add(resultsetToGenero(rs));
            }
            return generos;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Genero> selectGenerosByDesc(String codigo) {
        final String sql = "SELECT * FROM genero WHERE descricao LIKE ? ORDER BY descricao";
        try //try-witch-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                )
        {
            pstmt.setString(1, "%" + codigo.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Genero> generos = new ArrayList<>();
            while(rs.next()) {
                generos.add(resultsetToGenero(rs));
            }
            return generos;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Genero selectGeneroById(Integer id) {
        final String sql = "SELECT * FROM genero WHERE idgenero=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                )
        {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            Genero genero = null;
            if(rs.next()) {
                genero = resultsetToGenero(rs);
            }
            rs.close();
            return genero;

        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean insertGenero(Genero genero) {
        final String sql = "INSERT INTO genero (descricao) VALUES (?)";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                )
        {
            pstmt.setString(1, genero.getDescricaoGenero());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateGenero(Genero genero) {
        final String sql = "UPDATE genero SET descricao=? WHERE idgenero=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                )
        {
            pstmt.setString(1, genero.getDescricaoGenero());
            pstmt.setInt(2, genero.getIdGenero());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteGenero(Integer id) {
        final String sql = "DELETE FROM genero WHERE idgenero=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                )
        {
            pstmt.setInt(1, id);

            int count = pstmt.executeUpdate();
            return count > 0;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static Genero resultsetToGenero(ResultSet rs) throws SQLException {
        Genero p = new Genero();
        p.setIdGenero(rs.getInt("idgenero"));
        p.setDescricaoGenero(rs.getString("descricao"));
        return p;
    }


}//fim classe