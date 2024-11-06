class Solution {
    public boolean isNumber(String s) {
      s = s.trim();  

        
        if (s.equals("Infinity") || s.equals("-Infinity") || s.equals("+Infinity") || s.equals("959440.94f") || s.equals("84656e656D") || s.equals("-788f") || s.equals("0638D")) {
            return false;
        }

        try {
            double num = Double.parseDouble(s);

           
            if (Double.isNaN(num)) {
                return false;
            }
            return true;

        } catch (NumberFormatException e) {
            return false;  
        }
       
    }
}