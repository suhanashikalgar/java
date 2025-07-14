package com.dkte.mainmenu;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.dkte.entity.Artist;
import com.dkte.entity.Album;

import com.dkte.util.DbUtil;

public class Program {
	
	public static void addArtist(Scanner sc) {
		Artist artist = new Artist();
		artist.accept(sc);
		String sql ="INSERT INTO artist(artist_id,name) VALUES(?,?)";
		try (Connection connection = DbUtil.getConnection()) {
			try (PreparedStatement insertStatement = connection.prepareStatement(sql)) {
				insertStatement.setInt(1, artist.getArtist_id());
				insertStatement.setString(2,artist.getName());
				
				insertStatement.executeUpdate();
				System.out.println("Artist Add successsfully...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void addAlbum(Scanner sc) {
		Album album=new Album();
		album.accept(sc);
		String sql ="INSERT INTO album(album_id,title) VALUES(?,?)";
		try (Connection connection = DbUtil.getConnection()) {
			try (PreparedStatement insertStatement = connection.prepareStatement(sql)) {
				insertStatement.setInt(1, album.getAlbum_id());
				insertStatement.setString(2,album.getTitle());
				
				insertStatement.executeUpdate();
				System.out.println("Album Add successsfully...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void addTrack(Scanner sc) {
	    System.out.print("Enter Track ID: ");
	    int track_id = sc.nextInt();
	    System.out.print("Enter Track Title: ");
	    String title = sc.next();
	    System.out.print("Enter Album ID: ");
	    int album_id = sc.nextInt();
	    System.out.print("Enter Artist ID: ");
	    int artist_id = sc.nextInt();

	    String sql = "INSERT INTO track(track_id, title, album_id, artist_id) VALUES(?, ?, ?, ?) WHERE ";
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement insertStatement = connection.prepareStatement(sql)) {

	        insertStatement.setInt(1, track_id);
	        insertStatement.setString(2, title);
	        insertStatement.setInt(3, album_id);
	        insertStatement.setInt(4, artist_id);
	        insertStatement.executeUpdate();
	        System.out.println("Track added successfully.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	private static void displayAllArtist() {
	    String sql = "SELECT * FROM artist";
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement selectStatement = connection.prepareStatement(sql);
	         ResultSet rs = selectStatement.executeQuery()) {

	        System.out.println("List of Artists:");
	        while (rs.next()) {
	            System.out.println("Artist ID: " + rs.getInt(1) + ", Name: " + rs.getString(2));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	private static void displayAllAlbum() {
	    String sql = "SELECT * FROM album"; // Corrected table name from 'artist' to 'album'
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement selectStatement = connection.prepareStatement(sql);
	         ResultSet rs = selectStatement.executeQuery()) {

	        System.out.println("List of Albums:");
	        while (rs.next()) {
	            System.out.println("Album ID: " + rs.getInt(1) + ", Title: " + rs.getString(2));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	public static void trackGivenArtist(Scanner sc) {
	    System.out.print("Enter Artist ID: ");
	    int artist_id = sc.nextInt();

	    String sql = "SELECT track_id, title FROM track WHERE artist_id = ?";
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement selectStatement = connection.prepareStatement(sql)) {

	        selectStatement.setInt(1, artist_id);
	        ResultSet rs = selectStatement.executeQuery();

	        System.out.println("Tracks by Artist ID " + artist_id + ":");
	        while (rs.next()) {
	            int track_id = rs.getInt("track_id");
	            String title = rs.getString("title");
	            System.out.println("Track ID: " + track_id + ", Title: " + title);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	private static void displayAllTracks() {
	    String sql = "SELECT * FROM track";
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement selectStatement = connection.prepareStatement(sql);
	         ResultSet rs = selectStatement.executeQuery()) {

	        System.out.println("List of Tracks:");
	        while (rs.next()) {
	            System.out.println("Track ID: " + rs.getInt(1) + ", Title: " + rs.getString(2)
	                + ", Album ID: " + rs.getInt(3) + ", Artist ID: " + rs.getInt(4));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	private static void trackGivenAlbum(Scanner sc) {
	    System.out.print("Enter Album ID: ");
	    int album_id = sc.nextInt();
	    String sql = "SELECT * FROM track WHERE album_id=?";
	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement selectStatement = connection.prepareStatement(sql)) {

	        selectStatement.setInt(1, album_id);
	        ResultSet rs = selectStatement.executeQuery();
	        while (rs.next()) {
	            System.out.println("Track ID: " + rs.getInt(1) + ", Title: " + rs.getString(2));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	public static int menu(Scanner sc) {
		System.out.println("****************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add a new artist");
		System.out.println("2. Add a new album");
		System.out.println("3. Artist adds a track for the album");
		System.out.println("4. Display all artists");
		System.out.println("5.Display all albums");
		System.out.println("6. View all tracks for a given artist");
		System.out.println("7. Display all trackst");
		System.out.println("8. View all tracks for a given album");
		System.out.print("Enter the choice - ");
		int choice = sc.nextInt();
		System.out.println("****************************");
		return choice;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Artist artist = null;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				addArtist(sc);
				break;
			case 2:	
				addAlbum(sc);
				break;
			case 3:
				addTrack(sc);
				break;
			case 4:
				displayAllArtist();
				break;
			case 5:
				displayAllAlbum();
				break;
			case 6:
				trackGivenArtist(sc);
				break;
			case 7:
				displayAllTracks();
				break;
			case 8:
				trackGivenAlbum(sc);
				break;
			default:
				System.out.println("Invalid choice... ");
  }
 }
}
}