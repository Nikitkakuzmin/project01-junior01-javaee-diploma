package kz.kuzmin.javaee.db;

import kz.kuzmin.javaee.users.Users;
import kz.kuzmin.javaee.guns.*;

import java.sql.*;
import java.util.ArrayList;

public class DBManagerShop {
    private static Connection connection;
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop4","postgres","vopule37");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Users getUser(String email){
        Users user = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select  * from users where email = ?");
            stmt.setString(1,email);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                user = new Users();
                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }


    public static boolean addUser(Users users){
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into users(email,password,name) " +
                    "values(?,?,?)");
            stmt.setString(1, users.getEmail());
            stmt.setString(2, users.getPassword());
            stmt.setString(3, users.getName());

            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }





    public static ArrayList<Rifles> getAllRifles(){
        ArrayList<Rifles> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from rifles");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Rifles rifle = new Rifles();
                rifle.setId(resultSet.getLong("id"));
                rifle.setName(resultSet.getString("name"));
                rifle.setDescription(resultSet.getString("description"));
                rifle.setPrice(resultSet.getDouble("price"));
                rifle.setPhoto(resultSet.getString("photo"));
                list.add(rifle);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addRifles(Rifles rifle) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into rifles(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, rifle.getName());
            stmt.setString(2, rifle.getDescription());
            stmt.setDouble(3, rifle.getPrice());
            stmt.setString(4, rifle.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Rifles getRifles(Long id){
        Rifles rifle = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from rifles " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                rifle = new Rifles();
                rifle.setId(resultSet.getLong("id"));
                rifle.setName(resultSet.getString("name"));
                rifle.setDescription(resultSet.getString("description"));
                rifle.setPrice(resultSet.getDouble("price"));
                rifle.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rifle;

    }

    public static void updateRifles(Rifles rifle){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE rifles SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, rifle.getName());

            statement.setString(2, rifle.getDescription());

            statement.setDouble(3, rifle.getPrice());

            statement.setString(4, rifle.getPhoto());

            statement.setLong(5, rifle.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deleteRifles(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from rifles  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Pistols> getAllPistols(){
        ArrayList<Pistols> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from pistols");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Pistols pistol = new Pistols();
                pistol.setId(resultSet.getLong("id"));
                pistol.setName(resultSet.getString("name"));
                pistol.setDescription(resultSet.getString("description"));
                pistol.setPrice(resultSet.getDouble("price"));
                pistol.setPhoto(resultSet.getString("photo"));
                list.add(pistol);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addPistols(Pistols pistol) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into pistols(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, pistol.getName());
            stmt.setString(2, pistol.getDescription());
            stmt.setDouble(3, pistol.getPrice());
            stmt.setString(4, pistol.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Pistols getPistols(Long id){
        Pistols pistol = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from pistols " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                pistol = new Pistols();
                pistol.setId(resultSet.getLong("id"));
                pistol.setName(resultSet.getString("name"));
                pistol.setDescription(resultSet.getString("description"));
                pistol.setPrice(resultSet.getDouble("price"));
                pistol.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pistol;

    }

    public static void updatePistols(Pistols pistol){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE pistols SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, pistol.getName());

            statement.setString(2, pistol.getDescription());

            statement.setDouble(3, pistol.getPrice());

            statement.setString(4, pistol.getPhoto());

            statement.setLong(5, pistol.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deletePistols(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from pistols  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Machineguns> getAllMachineguns(){
        ArrayList<Machineguns> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from machineguns");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Machineguns machinegun = new Machineguns();
                machinegun.setId(resultSet.getLong("id"));
                machinegun.setName(resultSet.getString("name"));
                machinegun.setDescription(resultSet.getString("description"));
                machinegun.setPrice(resultSet.getDouble("price"));
                machinegun.setPhoto(resultSet.getString("photo"));
                list.add(machinegun);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addMachineguns(Machineguns machinegun) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into machineguns(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, machinegun.getName());
            stmt.setString(2, machinegun.getDescription());
            stmt.setDouble(3, machinegun.getPrice());
            stmt.setString(4, machinegun.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Machineguns getMachinguns(Long id){
        Machineguns machinegun = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from machineguns " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                machinegun = new Machineguns();
                machinegun.setId(resultSet.getLong("id"));
                machinegun.setName(resultSet.getString("name"));
                machinegun.setDescription(resultSet.getString("description"));
                machinegun.setPrice(resultSet.getDouble("price"));
                machinegun.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return machinegun;

    }

    public static void updateMachineguns(Machineguns machinegun){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE machineguns SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, machinegun.getName());

            statement.setString(2, machinegun.getDescription());

            statement.setDouble(3, machinegun.getPrice());

            statement.setString(4, machinegun.getPhoto());

            statement.setLong(5, machinegun.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deleteMachineguns(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from machineguns  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Shotguns> getAllShotguns(){
        ArrayList<Shotguns> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from shotguns");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Shotguns shotgun = new Shotguns();
                shotgun.setId(resultSet.getLong("id"));
                shotgun.setName(resultSet.getString("name"));
                shotgun.setDescription(resultSet.getString("description"));
                shotgun.setPrice(resultSet.getDouble("price"));
                shotgun.setPhoto(resultSet.getString("photo"));
                list.add(shotgun);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addShotguns(Shotguns shotgun) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into shotguns(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, shotgun.getName());
            stmt.setString(2, shotgun.getDescription());
            stmt.setDouble(3, shotgun.getPrice());
            stmt.setString(4, shotgun.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Shotguns getShotguns(Long id){
        Shotguns shotgun = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from shotguns " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                shotgun = new Shotguns();
                shotgun.setId(resultSet.getLong("id"));
                shotgun.setName(resultSet.getString("name"));
                shotgun.setDescription(resultSet.getString("description"));
                shotgun.setPrice(resultSet.getDouble("price"));
                shotgun.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return shotgun;

    }

    public static void updateShotguns(Shotguns shotgun){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE shotguns SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, shotgun.getName());

            statement.setString(2, shotgun.getDescription());

            statement.setDouble(3, shotgun.getPrice());

            statement.setString(4, shotgun.getPhoto());

            statement.setLong(5, shotgun.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deleteShotguns(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from shotguns  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Flamethrowers> getAllFlamethrowers(){
        ArrayList<Flamethrowers> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from flamethrowers");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Flamethrowers flamethrower = new Flamethrowers();
                flamethrower.setId(resultSet.getLong("id"));
                flamethrower.setName(resultSet.getString("name"));
                flamethrower.setDescription(resultSet.getString("description"));
                flamethrower.setPrice(resultSet.getDouble("price"));
                flamethrower.setPhoto(resultSet.getString("photo"));
                list.add(flamethrower);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addFlamethrowers(Flamethrowers flamethrower) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into flamethrowers(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, flamethrower.getName());
            stmt.setString(2, flamethrower.getDescription());
            stmt.setDouble(3, flamethrower.getPrice());
            stmt.setString(4, flamethrower.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Flamethrowers getFlamethrowers(Long id){
        Flamethrowers flamethrower = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from flamethrowers " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                flamethrower = new Flamethrowers();
                flamethrower.setId(resultSet.getLong("id"));
                flamethrower.setName(resultSet.getString("name"));
                flamethrower.setDescription(resultSet.getString("description"));
                flamethrower.setPrice(resultSet.getDouble("price"));
                flamethrower.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flamethrower;

    }

    public static void updateFlamethrowers(Flamethrowers flamethrower){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE flamethrowers SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, flamethrower.getName());

            statement.setString(2, flamethrower.getDescription());

            statement.setDouble(3, flamethrower.getPrice());

            statement.setString(4, flamethrower.getPhoto());

            statement.setLong(5, flamethrower.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deleteFlamethrowers(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from flamethrowers  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Sniperrifles> getAllSniperrfifles(){
        ArrayList<Sniperrifles> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from sniperrifles");
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Sniperrifles sniperrifle = new Sniperrifles();
                sniperrifle.setId(resultSet.getLong("id"));
                sniperrifle.setName(resultSet.getString("name"));
                sniperrifle.setDescription(resultSet.getString("description"));
                sniperrifle.setPrice(resultSet.getDouble("price"));
                sniperrifle.setPhoto(resultSet.getString("photo"));
                list.add(sniperrifle);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static boolean addSniperrifles(Sniperrifles sniperrifle) {
        int rows = 0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into sniperrifles(name, description, price,photo) " +
                    "values (?,?,?,?)");
            stmt.setString(1, sniperrifle.getName());
            stmt.setString(2, sniperrifle.getDescription());
            stmt.setDouble(3, sniperrifle.getPrice());
            stmt.setString(4, sniperrifle.getPhoto());
            rows = stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows > 0;
    }
    public static Sniperrifles getSniperrifles(Long id){
        Sniperrifles sniperrifle = null;
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from sniperrifles " +
                    "where id = ?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                sniperrifle = new Sniperrifles();
                sniperrifle.setId(resultSet.getLong("id"));
                sniperrifle.setName(resultSet.getString("name"));
                sniperrifle.setDescription(resultSet.getString("description"));
                sniperrifle.setPrice(resultSet.getDouble("price"));
                sniperrifle.setPhoto(resultSet.getString("photo"));
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sniperrifle;

    }

    public static void updateSniperrifles(Sniperrifles sniperrifle){

        try{

            PreparedStatement statement = connection.prepareStatement("" +

                    "UPDATE sniperrifles SET name = ?, description = ?, price= ?, photo = ? " +

                    "WHERE id = ?");

            statement.setString(1, sniperrifle.getName());

            statement.setString(2, sniperrifle.getDescription());

            statement.setDouble(3, sniperrifle.getPrice());

            statement.setString(4, sniperrifle.getPhoto());

            statement.setLong(5, sniperrifle.getId());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public static boolean deleteSniperrifles(Long id){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from sniperrifles  " +
                    "where id=?");
            stmt.setLong(1, id);
            rows=stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

}
