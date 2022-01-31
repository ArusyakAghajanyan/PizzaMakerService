package com.example.pizzamakerservice.repository;

import com.example.pizzamakerservice.model.Product;
import com.example.pizzamakerservice.model.dto.ProductDto;
import com.example.pizzamakerservice.util.SQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository {

    private Object Product;

    public  List<ProductDto> read(int id) {
       List<ProductDto> data = new LinkedList<>();
   Connection connection = SQLConnector.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select product_type_id,\n" +
                    "       price,\n" +
                    "       image_path,\n" +
                    "       currency,\n" +
                    "       product.id      as product_id,\n" +
                    "       product.name    as product_name,\n" +
                    "       ingredient.id   as ingredient_id,\n" +
                    "       ingredient.name as ingredient_name\n" +
                    "from product\n" +
                    "         inner join product_to_ingredient\n" +
                    "                    on product.id = product_to_ingredient.product_id\n" +
                    "         inner join ingredient\n" +
                    "                    on product_to_ingredient.ingredient_id = ingredient.id\n" +
                    "where product_to_ingredient.product_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            data.addAll(listMapper(resultSet));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    
    public List<ProductDto> readAll() {
        List<ProductDto> data = new LinkedList<>();
        Connection connection = SQLConnector.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from `product`");
            ResultSet resultSet = preparedStatement.executeQuery();
            data.addAll(listMapper(resultSet));
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
//        objects.add(new Product());
//        objects.add(new Product());
//        objects.add(new Product());
//        objects.add(new Product());
//
//        return objects;
//    }

    public void create(Product product) {
        Connection connection = SQLConnector.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `product` values (0,?,?,?,?,?,?)");
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getProductTypeId());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setFloat(4, product.getPrice());
            preparedStatement.setString(5, product.getImagePath());
            preparedStatement.setString(6, product.getCurrency());

            int i = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();


        } catch (SQLException exception) {
            exception.printStackTrace();
        }


    }
    
    public Product update(int id, Product product) {
        Connection connection = SQLConnector.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `product` SET name = ? WHERE id = ?");
            preparedStatement.setInt(1,product.getId());
            preparedStatement.setInt(2,product.getProductTypeId());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setFloat(4, product.getPrice());
            preparedStatement.setString(5, product.getImagePath());
            preparedStatement.setString(6, product.getCurrency());
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return product;

    }

    public void delete(int id) {

    }
    public Product read(String name) {
        return new Product();
    }

    List<ProductDto> listMapper(ResultSet resultSet) throws SQLException {
        List<ProductDto> data = new LinkedList<>();
        while (resultSet.next()) {
            data.add(mapper(resultSet));
        }
        return data;
    }

    private ProductDto mapper(ResultSet resultSet) throws SQLException {
        ProductDto pDto = new ProductDto();
        pDto.setProductTypeId(resultSet.getInt("product_type_id"));
        pDto.setId(resultSet.getInt("product_id"));
        pDto.setName(resultSet.getString("product_name"));
        pDto.setIngredientId(resultSet.getInt("ingredient_id"));
        pDto.setIngredientName(resultSet.getString("ingredient_name"));
        pDto.setPrice(resultSet.getFloat("price"));
        pDto.setImagePath(resultSet.getString("image_path"));
        pDto.setCurrency(resultSet.getString("currency"));

        return pDto;
    }
}
