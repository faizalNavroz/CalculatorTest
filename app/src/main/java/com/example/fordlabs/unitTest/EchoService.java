package com.example.fordlabs.unitTest;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class EchoService {

    public String ping(String ... messageArgs) {

        String pingMessage = "";
        boolean isInvalidInput = false;

        List<String>warningsList = new ArrayList<String>();
        List<String>echoList = new ArrayList<String>();

        for(String message : messageArgs ){
            if (message != null && message.length() > 0 && message.equals(message.toUpperCase())) {
                warningsList.add(message);
            } else if (message != null && message.length() > 0 &&  !message.equals(message.toUpperCase())) {
                echoList.add(message);

            } else {
                pingMessage = "There is nothing to echo";
                isInvalidInput= true;
                break;
            }
        }



        if(!isInvalidInput){

            if(echoList.size() ==1){
                pingMessage = "Echo:"+" "+echoList.get(0);
            }
            else if(!echoList.isEmpty() && echoList.size() >1){

                StringBuilder sb = new StringBuilder();
                for(int i=0;i<echoList.size()-1;i++){
                  sb =   sb.length() > 0  ? sb.append(","+echoList.get(i)) : sb.append(echoList.get(i));

                }
                sb.append(" "+"and"+" ");
                sb.append(echoList.get(echoList.size()-1)+".");
                pingMessage = "Echo:"+sb.toString();

            }
            if(warningsList.size() == 1){
                pingMessage = "WARNING:"+" "+warningsList.get(0);
            }

            else if(!warningsList.isEmpty() && warningsList.size() >1){

                StringBuilder sb2 = new StringBuilder();

                for(int i=0;i<warningsList.size()-1;i++){
                    sb2  = sb2.length() > 0 ? sb2.append(","+warningsList.get(i)) : sb2.append(warningsList.get(i));
                }
                sb2.append(" "+"AND"+" ");
                sb2.append(warningsList.get(warningsList.size()-1)+".");
                pingMessage = pingMessage+"WARNING:"+sb2.toString();
            }
        }

        return pingMessage;
    }

    public void logMessage(){
        Log.i("EchoService_LOG", "logMessage: Logging Message from echoService");
        Log.i("TAG",this.getClass().toString());
    }
    
}
