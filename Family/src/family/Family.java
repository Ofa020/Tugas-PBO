/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package family;

/**
 *
 * @author Lenovo
 */
public class Family {
    public static void main(String[] args) {
        Person bapakNarwan = new Parent("Narwan", "Banyumas", "16 Mei 1966", "Karyawan Swasta", "Magelang, Jawa Tengah", "085727881615", "Laki-laki");
        Person ibuJuwar = new Parent("Juwariyah", "Magelang", "22 Maret 1978", "IRT", "Magelang, Jawa Tengah", "089630721020", "Perempuan");
        Person ima = new Child("Ima Fitriana", "Magelang", "05 Januari 1999", "Karyawan Swasta", "Magelang", "085741462695", "Perempuan");
        Person adib = new Child("Adib Mushthofa", "Magelang", "02 Februari 2004", "Pelajar/Mahasiswa", "Magelang", "089676356056", "Laki-laki");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakNarwan.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuJuwar.getDetails());

        Person[] anak = new Person[]{ima, adib};

        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                String jenisKelamin = (i == 0) ? "perempuan" : "laki-laki";
                int anakKe = i + 1;
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                if (i == 0) {
                    System.out.println();
                }
            }
        }
    }
}

