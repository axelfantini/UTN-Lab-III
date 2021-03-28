package lab3.tpobjects2.exercises.exercise3.models;

import java.util.ArrayList;
import java.util.List;

public class AccountLog {
    private Integer maxLength = 10;
    private List<String> logs;

    public AccountLog(Integer maxLength)
    {
        this.maxLength = maxLength;
        this.logs = new ArrayList<String>();
    }

    public AccountLog()
    {
        this.logs = new ArrayList<String>();
    }

    public List<String> getLogs() {
        return logs;
    }

    public void addLog(String log)
    {
        if(this.logs.size() < this.maxLength)
            this.logs.add(log);
        else
        {
            this.logs.add(log);
            this.logs.remove(0);
        }


    }

    public String toString()
    {
        String response = "Logs:\n";
        for(String log : this.logs)
        {
            response += log + "\n";
        }
        return response;
    }
    public void printLogs()
    {
        System.out.println(this.toString());
    }
}
