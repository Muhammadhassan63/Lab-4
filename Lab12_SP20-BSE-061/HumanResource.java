/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12_runner;

import java.util.ArrayList;

public class HumanResource
{
    private Association[] resources;

    public void add(Association resource)
    {
        if (resources == null)
            resources = new Association[1];
        else
            extend();

        resources[resources.length-1] = resource;
    }

    private void extend()
    {
        Association[] temp = new Association[resources.length + 1];

        for (int i = 0; i < resources.length; i++)
        {
            temp[i] = resources[i];
        }

        resources = temp;
    }

    public void delete(int index)
    {
        resources[index-1] = null;
        Association[] temp = new Association[resources.length - 1];

        int i = 0;

        while (resources[i] != null) {
            temp[i] = resources[i];
            i++;
        }

        for (int j = i; j < temp.length; j++)
        {
            temp[j] = resources[j+1];
        }
        resources = temp;

    }

    public String toString()
    {
        String s = "";

        for (int i = 0; i < resources.length; i++)
        {
            s += resources[i].toString();
            s += "\n";
        }

        return s;
    }


}