package am.iunetworks.jigme;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


    class Qn4 {
        static class Pair {
            int count;
            char c;
            Pair(int count, char c) {
                this.count = count;
                this.c = c;
            }
        }
        Map<Character, Integer> map = new HashMap<>();
        public String reorganizeString(String S) {
            for(char c : S.toCharArray()) {
                map.putIfAbsent(c, 0);
                map.put(c, map.get(c) + 1);
            }
            PriorityQueue<Pair> pairs = new PriorityQueue<>((a, b) -> (b.count - a.count));
            for(Map.Entry<Character, Integer> e : map.entrySet()) {
                pairs.add(new Pair(e.getValue(), e.getKey()));
            }
            StringBuilder sb = new StringBuilder();
            while(!pairs.isEmpty()) {
                Pair p = pairs.poll();
                if(sb.length() >= 1 && sb.charAt(sb.length() - 1) == p.c) {
                    Pair pp = pairs.poll();
                    if(pp == null) {
                        return "";
                    }
                    pp.count --;
                    sb.append(pp.c);
                    if(pp.count != 0)
                        pairs.add(pp);
                }
                p.count--;
                sb.append(p.c);
                if(p.count != 0)
                    pairs.add(p);
            }
            return sb.toString();
        }

    public static void  main   (String [] args){
        Pair a =new Pair();


    }
}
