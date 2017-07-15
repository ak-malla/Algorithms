package com.ideserve;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by AK on 12/07/17.
 */
public class Anagram{

        private static boolean checkIfAnagram(String pattern, String inputString){

            Map<Character, Integer> mPattern = generateMap(pattern);
            System.out.println("Pattern Matching Map : "+ mPattern.toString());

            //Base Condition
            Map<Character, Integer> mInput = generateMap(inputString.substring(0, 4));
            if(compareMaps(mPattern , mInput))
                return true;

            for(int i = 0, j = 4; j < inputString.length() ; i++ ,j++){

                mInput = generateSubMap( mInput, inputString.toCharArray()[i] , inputString.toCharArray()[j]);

                if(compareMaps(mPattern , mInput))
                    return true;

            }
            return false;
        }

        private static Map generateSubMap( Map<Character, Integer> m, Character f, Character l){

            // First Character
            if(m.get(f)!=null)
                if(m.get(f) > 1)
                    m.put(f, m.get(f) - 1);
                else
                    m.remove(f);

            //Last Character
            if(m.get(l)!=null)
                m.put(l, m.get(l) + 1);
            else
                m.put(l, 1);

            System.out.println(" Character :"+f+" Last:"+l+" Each Generated Map :"+m.toString());

            return m;
        }

        private static Map generateMap(String parse){

            Map<Character, Integer> gMap = new HashMap<Character, Integer>();

            for(char c : parse.toCharArray()){
                if(gMap.get(c)!=null)
                    gMap.put(c, gMap.get(c)+1);
                else
                    gMap.put(c, 1);
            }

            return gMap;
        }

        private static boolean compareMaps(Map m, Map n){
            for(Object c: m.keySet()){

                if(n.containsKey((Character)c))
                    if(m.get((Character)c) == n.get((Character)c))
                        continue;
                    else
                        return false;

            }
            return true;
        }

        public static void main(String a[]) {
            if(checkIfAnagram("allam", "mallaanilkumar"))
                System.out.println("veer & ideserve are both anagrams");
            else
                System.out.println("Fucked !");
        }
}
