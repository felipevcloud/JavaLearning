import java.util.Map;
import java.util.HashMap; 

public class DialingCodes {

    Map<Integer, String> dialCodes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dialCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialCodes.containsKey(code) && !dialCodes.containsValue(country)){
            dialCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry : dialCodes.entrySet()){
            if (entry.getValue().equals(country)) {
            return entry.getKey();
        }
    }
    return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        dialCodes.remove(findDialingCode(country));
        dialCodes.put(code, country);
    }
}
