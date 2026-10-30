package com.mycompany.jauza;

import java.sql.Connection;

public class Jauza {
    public static void main(String[] args) {
        // Panggil koneksi untuk uji coba
        Connection conn = koneksi.getConnection();

        if (conn != null) {
            System.out.println("Status: Aplikasi sudah siap berkomunikasi dengan Laragon.");
            try {
                conn.close(); // Tutup koneksi setelah tes selesai
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}