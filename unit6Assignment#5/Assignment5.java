import java.util.ArrayList;
public class Assignment5
{
    public static void removeZeros(ArrayList<Integer> list) {
        for(int i = 0; i < list.size();i++){
            if(list.get(i)==0)
            list.remove(i);
        }
    }
    public int countLetters(ArrayList<String>list) {
        int count = 0;
        for(String s : list)
        count+= s.length();
        return count;
    }
    public int findPostion(ArrayList<Integer> list, int keyValue){
        int count = 0;
       for(int i = 0; i < list.size();i++){
            if(list.get(i)==keyValue)
            count ++;
        }
        if(count == 0)
        count = -1;
        return count;
    }
    public void parseIntoArrayList(ArrayList<String>list){
        ArrayList<String>list2 = new ArrayList<String>();
        for(int i = 0; i < list.size();i++){
            list2.add(list.get(i));
        }
    }
    public static String findMin(ArrayList<Person> list) {
        Person youngest = list.get(0);
        for(Person person : list) {
            if(person.getAge() < youngest.getAge()) youngest = person;
        }
        return youngest.getName();
    }
    
}
