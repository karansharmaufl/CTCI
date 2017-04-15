static int countPairs(int k, int[] a) {
         int count=0;
         int b=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(k<1 )
            {
            b=0;
        }
        
        else if(a.length==1 || a.length==0)
            b=0;
            
        else{
            for (int i = 0; i < a.length; i++) {
            if (map.containsKey(k - a[i])) 
                {
                    count++;
                }
            map.put(a[i], i + 1);
            }
                b=count;
            }
            return b;


    }

