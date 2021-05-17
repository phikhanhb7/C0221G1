package com.company;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(1, 1);

        Hinh h1 = new HinhTron(point, 4);

        Hinh h2 = new HinhCN(point, 3, 4);

        Hinh h3 = new HinhTron(point, 4);

        Hinh h4 = new HinhCN(point, 3, 4);

        CanhAble h5 = new HinhCN(point, 3, 4);

        CanhAble h6 = new HinhVuong(point, 3);

        HinhTron ht = new HinhTron(point, 4);
        System.out.println(ht.getName(1,5));
        List<CanhAble> hinhs2 = new ArrayList<>();
        hinhs2.add(h5);
        hinhs2.add(h6);

        hinhs2.forEach(ele ->{
            System.out.println(ele.tinhCanh());
        });

        //Hinh[] hinhss= new Hinh[10];
        // Cách 2 Tĩnh ;

        List<Hinh> hinhs = new ArrayList<>();
        hinhs.add(h1);
        hinhs.add(h2);
        hinhs.add(h3);
        hinhs.add(h4);
        //// cách 2 tĩnh
//        for (int i = 0;i < hinhs.size(); i++) {
//            Hinh ele = hinhs.get(i);//hinhs[i]
//            ele.getName();
//            System.out.println(ele.calC());
//            System.out.println(ele.calS());
//        }
        hinhs.forEach(ele ->{
            ele.getName();
            System.out.println(ele.calC());
            System.out.println(ele.calS());
        });
    }


}
