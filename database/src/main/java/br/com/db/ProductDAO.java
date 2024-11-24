package br.com.db;

import br.com.core.inventory.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void create(Product product){
        String sql = "INSERT INTO PRODUTOS (nome, preco, estoque) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getUnitPrice());
            stmt.setInt(3, product.getQuantity());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> read(){
        String sql = "SELECT * FROM PRODUTOS";
        List<Product> products = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"), rs.getString("nome"), rs.getInt("estoque"), rs.getFloat("preco"));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void update(Product product){
        String sql = "UPDATE PRODUTOS SET NOME = (?) WHERE ID = (?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(Product product){
        String sql = "DELETE FROM PRODUTOS WHERE ID = (?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, product.getId());
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}