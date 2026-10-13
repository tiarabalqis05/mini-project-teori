# Mini Project Teori — Program Data Mahasiswa

Mini project Praktikum Pemrograman Berorientasi Objek (PBO).
Program ini dibuat dengan Java dan menggabungkan materi Minggu 3 & 4:
variable, data type, Scanner, if/else, loop, class, object, dan method.

**Tiara Balqis** · 250810701100074

---

## Ketentuan Soal

- Class `Mahasiswa` dengan attribute `nama`, `NIM`, dan `nilai`
- Method `tampilkanData()` dan `cekKelulusan()`
- Membuat minimal 3 object mahasiswa
- Menggunakan variable, data type, Scanner, if/else, loop, class, object, method

---

## Struktur File

```
.
├── Mahasiswa.java        # class Mahasiswa
├── DataMahasiswa.java    # program utama
└── README.md
```

| File | Isi |
|---|---|
| `Mahasiswa.java` | Atribut `nama`, `nim`, `nilai`, constructor, method `tampilkanData()` dan `cekKelulusan()` |
| `DataMahasiswa.java` | Input data lewat Scanner, menyimpan object ke array, menampilkan hasil |

---

## Cara Menjalankan

**Prasyarat:** JDK sudah terpasang. Cek dengan `java -version` dan `javac -version`.

```bash
# 1. Masuk ke folder proyek
cd "mini project teori"

# 2. Kompilasi
javac DataMahasiswa.java Mahasiswa.java

# 3. Jalankan
java DataMahasiswa
```

---

## Cara Pakai

1. Masukkan **jumlah mahasiswa** (minimal 3).
2. Untuk setiap mahasiswa, masukkan **nama**, **NIM**, dan **nilai**.
3. Program akan menampilkan data tiap mahasiswa beserta status kelulusannya.

> Nilai desimal diketik pakai titik, contoh `85.5` (bukan `85,5`).

---

## Penjelasan Program

### Class `Mahasiswa`

| Bagian | Keterangan |
|---|---|
| `nama`, `nim`, `nilai` | Atribut mahasiswa (String, String, double) |
| Constructor | Mengisi ketiga atribut saat object dibuat |
| `tampilkanData()` | Mencetak nama, NIM, dan nilai ke layar |
| `cekKelulusan()` | Mengembalikan `true` jika nilai >= 70, `false` jika kurang |

### Class `DataMahasiswa`

1. Membaca jumlah mahasiswa dengan `Scanner`.
2. Membuat array `Mahasiswa[]` sebesar jumlah tersebut.
3. Melakukan perulangan `for` untuk menginput data tiap mahasiswa, lalu setiap data dibuat menjadi object baru dan disimpan ke array.
4. Melakukan perulangan `for` lagi untuk memanggil `tampilkanData()` dan `cekKelulusan()` pada setiap object, kemudian menampilkan statusnya.

---

## Aturan Kelulusan

Mahasiswa dinyatakan **LULUS** jika nilai **>= 70**, dan **TIDAK LULUS** jika kurang dari 70.
Batas nilai ini bisa diubah pada bagian `nilai >= 70` di dalam `Mahasiswa.java`.

---

## Contoh Output

```
Jumlah mahasiswa: 3
Data mahasiswa ke-1
Nama  : Andi
NIM   : 250810701100074
Nilai : 85.0
Data mahasiswa ke-2
Nama  : Budi
NIM   : 250810701100075
Nilai : 60.0
Data mahasiswa ke-3
Nama  : Citra
NIM   : 250810701100076
Nilai : 90.0

--- Data Mahasiswa ---
Nama  : Andi
NIM   : 250810701100074
Nilai : 85.0
Status : LULUS

Nama  : Budi
NIM   : 250810701100075
Nilai : 60.0
Status : TIDAK LULUS

Nama  : Citra
NIM   : 250810701100076
Nilai : 90.0
Status : LULUS
```
