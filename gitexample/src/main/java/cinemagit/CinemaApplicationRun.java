package cinemagit;

public class CinemaApplicationRun {

    public static void main(String[] args) {

        Viewer[] viewers = new Viewer[5];
        Viewer viewer1 = new Viewer(22);
        Viewer viewer2 = new Viewer(56);
        Viewer viewer3 = new Viewer(67);
        Viewer viewer4 = new Viewer(23);
        Viewer viewer5 = new Viewer(11);
        viewers[0] = viewer1;
        viewers[1] = viewer2;
        viewers[2] = viewer3;
        viewers[3] = viewer4;
        viewers[4] = viewer5;

        System.out.println(new ViewerStatistics().averageAge(viewers));
    }
}
