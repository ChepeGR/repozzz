package org.example;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.*;
import java.util.stream.Collectors;

public class EliminaEstaClase {



    public static void main(String[] args) {
        int[] projects =    {0, 1, 1, 0, 2, 2, 0, 1};
        int[] bids =        {8, 7, 9, 5, 6, 3, 7, 8};
        minCost(projects, bids);
    }

    public static void minCost(int[] projects, int[] bids) {

        int[] nameProjects;
        int nameProjectsI=0;
        int j=0;

        nameProjects[j]= projects[0];
        for (int i = 0; i < projects.length; i++) {
            boolean exists= false;

            while (exists==false){

            }
        }

    }

}