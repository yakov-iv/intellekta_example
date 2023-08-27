package cinemagit;

public class ViewerStatistics {

    public double averageAge(Viewer[] viewers){
        int count = 0;
        int sum = 0;
        for (Viewer viewer : viewers){
            sum += viewer.getAge();
            count++;
        }
        return sum / count;
    }
}
