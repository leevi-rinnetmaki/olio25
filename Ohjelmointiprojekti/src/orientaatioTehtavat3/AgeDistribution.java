package orientaatioTehtavat3;

public class AgeDistribution {
    public static void main(String[] args) {
        int ageSum = 0;
        int studentAges[][]={
                {20, 1, 0},
                {21, 1, 0},
                {22, 1, 0},
                {23, 1, 0},
                {24, 2, 0}
        };

        for(int i=0;i<1000;i++){
            int student = (int) (Math.random() * (studentAges.length));
            studentAges[student][2]+=studentAges[student][1];
            ageSum+=studentAges[student][1];
        }
        for(int[] student : studentAges){
            //System.out.println(student[2]);
            //System.out.println((double)student[2]/(double)ageSum);
            System.out.println(student[2]*1000/ageSum);
        }
        //System.out.println(ageSum);
    }
}