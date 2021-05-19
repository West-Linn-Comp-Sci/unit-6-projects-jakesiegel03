


import java.util.ArrayList;
public class Purse { 
private ArrayList coins; 
 
    public Purse() { 
        coins = new ArrayList(); 
    }
 
// adds aCoin to the purse 
public void add(Coin aCoin) { 
coins.add(aCoin); 
} 
 
// returns total value of all coins in purse 
public double getTotal() { 
    double total = 0;
    for(int i = 0;i<Purse.size();i++)
    total += Purse.get(i).getValue();
    return total;
} 
 
// returns the number of coins in the Purse that matches aCoin 
// (both myName & myValue) 
public int count(Coin aCoin) {
   int num = 0;
   for(int i = 0;i<Purse.size();i++){
       if(aCoin.getValue()==(Purse.get(i).getValue())&&(aCoin.getName().equals(Purse.get(i).getName()))){
           num ++;
        }
    }
  return num;
 } 
 
// returns the name of the Coin in the Purse that has the smallest value 
}

