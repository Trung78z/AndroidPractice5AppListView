# 🍔 Android App: Ứng dụng ListView món ăn/trái cây

Ứng dụng này là một ví dụ về cách hiển thị danh sách món ăn hoặc trái cây bằng `ListView` trong Android.
Mỗi mục hiển thị hình ảnh, tên, và lượng calo.

---
## 🎬 Chương trình ứng dụng và kiểm thử
[5.1]
<img src="images/output5.1.gif" width="200" alt="Demo GIF">

---
[5.2]
<img src="images/output5.2.gif" width="200" alt="Demo GIF">

---
##  🎬 Xem bài 5.1 tại Youtube
[![Watch the video](https://img.youtube.com/vi/dcgo6NvE0l4/maxresdefault.jpg)](https://youtube.com/shorts/dcgo6NvE0l4)

---
##  🎬 Xem bài 5.2 tại Youtube
[![Watch the video](https://img.youtube.com/vi/Z_t--WyPowc/maxresdefault.jpg)](https://youtube.com/shorts/Z_t--WyPowc)

---

## 🚀 1. Tạo Project mới trong Android Studio
Tạo một dự án mới trong **Android Studio**:
![Create new project](images/1.png)

---

## 🏗️ 2. Chọn loại Activity
Chọn **Basic View Activity** để có giao diện cơ bản:
![Choose basic view](images/2.png)

---

## ✏️ 3. Đặt tên project và chọn cấu hình Android
Nhập tên ứng dụng, package name, và chọn ngôn ngữ **Java/Kotlin**:
![Project name](images/3.png)

---

## 🖥️ 4. Màn hình chính trong Android Studio
Khi mở dự án, bạn sẽ thấy giao diện chính gồm **XML Layouts** và **MainActivity**:
![Android Studio Coding](images/4.png)

---

## 🎨 5. Thiết kế giao diện (Layout)
## 🧱 Cấu trúc giao diện

- `activity_main.xml`: chứa ListView
- `list_item_fruit.xml`: layout từng item với ImageView và 2 TextView

## 🔧 Code chính

- `FoodItem.java`: class mô tả món ăn
- `FoodItemAdapter.java`: Adapter hiển thị list
- `MainActivity.java`: khởi tạo và hiển thị danh sách
### 🔹 Main Activity
Màn hình chính hiển thị danh sách các món ăn hoặc trái cây bằng `ListView`. Mỗi mục gồm hình ảnh, tên và lượng calo.  
![Main Activity UI](images/5.png)

---

### 🔹 list_item_fruit.xml
Giao diện của từng mục trong danh sách. Hiển thị một hình ảnh bên trái, tên món/trái cây ở giữa và lượng calo ở bên phải.  
![Item Layout UI](images/6.png)

---

### 🔹 Custom Adapter
Lớp `FoodItemAdapter` dùng để gán dữ liệu từ danh sách `FoodItem` vào các thành phần giao diện trong `list_item_fruit.xml`.  
![Adapter UI](images/7.png)

### 🔹 Custom Adapter
Giao diện thực tế (5.1) 
![Adapter UI](images/7.1.png)
---
## 🛠️ 7. Cách chạy ứng dụng

1. Clone repo này về máy:
   ```sh
   git clone https://github.com/Trung78z/AndroidPractice5AppListView.git
   ```
2. Mở **Android Studio** và import project.
3. Chạy ứng dụng trên **Emulator** hoặc **thiết bị thật**.


---

## 📩 8. Liên hệ
Nếu có thắc mắc hoặc góp ý, vui lòng liên hệ qua email: `trungpspy@gmail.com`.