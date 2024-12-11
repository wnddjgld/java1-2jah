package _gui.repository;

import _gui.JDBCConnector;
import _gui.entitiy.OrderEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderRepository {
    ArrayList<OrderEntity> ordersList = new ArrayList<OrderEntity>();
    public ArrayList<OrderEntity> getOrdersList(String searchWord) {
        Connection con = JDBCConnector.getConnection();
        String sql = "select 주문번호, 고객이름, 제품명, 수량, 배송지, 주문일자 from 주문 o, 고객 c, 제품 p\n" +
                "    where o.주문고객 = c.고객아이디 and o.주문제품 = p.제품번호 and c.고객이름 like ?";
        OrderEntity orderEntity = null;
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"%" + searchWord + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                orderEntity = new OrderEntity();
                orderEntity.setOrderNum(rs.getString("주문번호"));
                orderEntity.setCustomerName(rs.getString("고객이름"));
                orderEntity.setProductName(rs.getString("제품명"));
                orderEntity.setAmount(rs.getInt("수량"));
                orderEntity.setDestination(rs.getString("배송지"));
                orderEntity.setOrderDate(rs.getTimestamp("주문일자"));

                ordersList.add(orderEntity);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return  ordersList;
    }
}
