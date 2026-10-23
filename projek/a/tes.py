
print("=== PROGRAM PENGOLAHAN NILAI SISWA ===")

# Input data siswa
nama = input("Nama siswa    : ")
nilai_tugas = float(input("Nilai tugas   : "))
nilai_ujian = float(input("Nilai ujian   : "))

# Menghitung nilai akhir
nilai_akhir = (nilai_tugas * 0.40) + (nilai_ujian * 0.60)

# Menentukan kategori nilai
if nilai_akhir >= 85:
    kategori = "A"
elif nilai_akhir >= 75:
    kategori = "B"
elif nilai_akhir >= 65:
    kategori = "C"      
else:
    kategori = "D"

# Menentukan status kelulusan
if nilai_akhir > 100 or nilai_ujian > 100 or nilai_akhir < 0 or nilai_ujian < 0:
    status = "nilai tidak valid"
elif nilai_akhir >= 75 and nilai_ujian >= 70:
    status = "Lulus"
else:
    status = "Remedial"

if status == "nilai tidak valid":
    kategori = "nilai tidak valid"

# Menampilkan hasil pengolahan nilai
print("\n=== HASIL PENGOLAHAN NILAI SISWA ===")
print(f"Nama          : {nama}")
print(f"Nilai Tugas   : {nilai_tugas:g}")
print(f"Nilai Ujian   : {nilai_ujian:g}")
print(f"Nilai Akhir   : {nilai_akhir:.1f}")
print(f"Kategori      : {kategori}")
print(f"Status        : {status}")
