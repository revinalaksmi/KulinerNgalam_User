# KulinerNgalam_User

| Grup | 14 |
| :---------------:   | :---------------:|
| Alfinda Rahmadiarni | 03 |
| Revina Laksmi P H   | 25 |

## Deskripsi
Kuliner Ngalam adalah sebuah aplikasi berbasis android yang berisi data review makanan atau kuliner yang ada di Kota Malang. Dengan aplikasi ini, user dapat melihat menu-menu hits yang ada di Kota Malang beserta keterangan seperti alamat, harga, dan review makanannya. 

## Screenshots
![Tampilan Login] (https://github.com/revinalaksmi/KulinerNgalam_User/blob/master/WhatsApp%20Image%202018-12-14%20at%2009.39.22.jpeg)
![Tampilan Home] (https://github.com/revinalaksmi/KulinerNgalam_User/blob/master/WhatsApp%20Image%202018-12-14%20at%2009.38.25.jpeg)
![Tampilan List Makanan] (https://github.com/revinalaksmi/KulinerNgalam_User/blob/master/2.jpeg)
![Tampilan Detail Makanan] (https://github.com/revinalaksmi/KulinerNgalam_User/blob/master/1.jpeg)

## Android OS dan Level
min Sdk version yang digunakan adalah 22

## List class
+ Folder Adapter => terdiri dari MakananAdapter.java
- Berfungsi untuk menampilkan data dari database ke recyclerview
+ Folder Model => terdiri dari Makanan.java, GetMakanan.java, Login.java, Login.java, user.java
- Berfungsi untuk menampung data dari database
+ Folder Rest => terdiri dari ApiClient.java dan ApiInterface.java
- Kelas ApiClient.java berfungsi untuk mengkoneksikan android ke rest-server, sedangkan ApiInterface.java berisi metode-metode yang digunakan dalam komunikasi data dengan rest-server (CRUD) 
+ MainActivity.java berfungsi untuk autentikasi login admin
+ LayarInsertMakanan.java berfungsi untuk menambahkan data review makanan
+ LayarListMakanan.java untuk menampilkan seluruh data review makanan
+ LayarEditMakanan.java untuk mengedit atau menghapus data review makanan

## Referensi
* [Github](https://github.com/) - Untuk Kolaborasi proyek

## Lisensi
MIT License
