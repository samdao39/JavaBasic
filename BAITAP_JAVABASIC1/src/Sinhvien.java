// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    public class Sinhvien {
        // biến instance "ten" kiểu String, có giá trị mặc định là null
        public String ten;

        // biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
        private int tuoi;

        // sử dụng biến ten trong một constructor
        public Sinhvien(String ten) {
            this.ten = ten;
        }

        // sử dụng biến tuoi trong phương thức setTuoi
        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public void showStudent() {
            System.out.println("Ten  : " + ten);
            System.out.println("Tuoi : " + tuoi);
        }

        public static void main(String[] args) {
            Sinhvien sv = new Sinhvien("dao");
            sv.setTuoi(21);
            sv.showStudent();
        }
    }
