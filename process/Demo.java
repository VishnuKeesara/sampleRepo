/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erwin.cfx.connectors.amazongluepythonparser;

import static com.amazonaws.auth.SdkClock.Instance.set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author LakshmiKakarla
 */
public class Demo {

    public void simplestorage() {
        Map<String, String> sampleMap = new HashMap();
        sampleMap.put("Siri", "chiri");
        /// for getting value already key u have need to follow 
        String value = sampleMap.get("Siri");
      Set<Entry<String,String>> mapinter =  sampleMap.entrySet();
      
        
        for (Map.Entry<String, String> mapiter : sampleMap.entrySet()) {
            String key = mapiter.getKey();
            String value1 = mapiter.getValue();

        }

    }

}
