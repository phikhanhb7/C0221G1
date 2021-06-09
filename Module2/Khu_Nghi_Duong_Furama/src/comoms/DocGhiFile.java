package comoms;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {

    public static final String PATH = "D:\\Module2\\Khu_Nghi_Duong_Furama\\src\\data\\";

    public static List<Service> docFile(String fileName){
        File file = null ;
        FileReader fileReader = null ;
        BufferedReader bufferedReader = null ;
        String line = null ;
        String[] strings = null ;
        List<Service> serviceList = new ArrayList<>();

        try{
            file = new File(PATH+ fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine()) != null){
                strings = line.split(",");
                if (strings.length == 10 ){
                    Service villa = new Villa(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],strings[7],strings[8],strings[9]);
                    serviceList.add(villa);
                }else if (strings.length == 9 ){
                    Service house = new House(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],strings[7],strings[8]);
                    serviceList.add(house);
                }else {
                    Service room = new Room(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6]);
                    serviceList.add(room);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return serviceList;
    }

    public static void ghiFile(String fileName , List<Service> serviceList, boolean trangThai ){
        File file = null ;
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try{
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Service service : serviceList ){
                bufferedWriter.write(service.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    public static void ghiFileCustomer(String fileName , List<Customers> customersList, boolean trangThai ){
        File file = null ;
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try{
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customers customers : customersList ){
                bufferedWriter.write(customers.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<Customers> docFileCustomers(String fileName){
        File file = null ;
        FileReader fileReader = null ;
        BufferedReader bufferedReader = null ;
        String line = null ;
        String[] strings = null ;
        List<Customers> customersList = new ArrayList<>();

        try{
            file = new File(PATH+ fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine()) != null){
                strings = line.split(",");
               Customers customer = new Customers(strings[0],strings[1], strings[2],strings[3],strings[4],strings[5],strings[6],strings[7]);
               customersList.add(customer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return customersList;
    }

    public static void ghiFileString(String fileName , String string, boolean trangThai ){
        File file = null ;
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try{
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    public static void ghiFileCinema(String fileName , List<CinemaTicket> cinemaTickets, boolean trangThai ){
        File file = null ;
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try{
            file = new File(PATH + fileName);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CinemaTicket cinemaTicket : cinemaTickets ){
                bufferedWriter.write(cinemaTicket.styleWrite());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }



}
