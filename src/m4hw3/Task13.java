package m4hw3;

public class Task13 {

    public void run() {

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        // Trim-den evvel ve sonra uzunluq ferqi
        System.out.println("Trim-den evvel uzunluq: " + metn.length());           // 41
        System.out.println("Trim-den sonra uzunluq: " + metn.trim().length());    // 39

        // Ferq: 2 — evvelde 1 sonda 1 bosluq var idi
        System.out.println("Uzunluq ferqi: " + (metn.length() - metn.trim().length())); // 2

        // "Java" sozu varmi
        System.out.println("Java var:       " + metn.contains("Java"));           // true
        System.out.println("JAVA var:       " + metn.toUpperCase().contains("JAVA")); // true

        // "proqramlasdirma" sozunu "programming" ile evez et
        System.out.println("Evez edilmis:   " + metn.replace("proqramlaşdırma", "programming"));

        // Ilk 4 herf (trim etdikden sonra, cunki evvelde bosluq var)
        System.out.println("Ilk 4 herf:     " + metn.trim().substring(0, 4));     // Java

        // "!" isaresi varmi
        System.out.println("! var:          " + metn.contains("!"));              // true

        // Butun metn kicik herfe, trim edilmis sekilde
        System.out.println("Kicik+trim:     " + metn.trim().toLowerCase());

    }

}