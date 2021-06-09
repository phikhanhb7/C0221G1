package manage;

import comoms.DocGhiFile;
import models.House;
import models.Room;
import models.Service;
import models.Villa;

import java.util.*;

public class ManageServices {
    static List<Service> serviceList = new ArrayList<>();

    public static void addRoom() {
        String id = AddServices.nhapIdRoom();
        String tenDichVu = AddServices.nhapTendichVu();
        String dienTichUse = AddServices.nhapDienTichSuDung();
        String chiPhiThue = AddServices.nhapChiPhiThue();
        String soNguoiToiDa = AddServices.nhapSoNguoiToiDa();
        String kieuThue = AddServices.nhapKieuThue();
       String dichVuDiKem = AddServices.nhapDichvuDiKem();

        Service room = new Room(id,tenDichVu,dienTichUse,chiPhiThue,soNguoiToiDa,kieuThue,dichVuDiKem);
        serviceList.add(room);
        DocGhiFile.ghiFile("Services.csv",serviceList,true);
    }

    public static void addHouse() {
        String id = AddServices.nhapIdHouse();
        String tenDichVu = AddServices.nhapTendichVu();
        String dienTichUse = AddServices.nhapDienTichSuDung();
        String chiPhiThue = AddServices.nhapChiPhiThue();
        String soNguoiToiDa = AddServices.nhapSoNguoiToiDa();
        String kieuThue = AddServices.nhapKieuThue();
        String tieuChuanPhong = AddServices.nhapTieuChuanPhong();
        String tienNghiKhac = AddServices.nhapTienNghiKhac();
        String soTang = AddServices.nhapSoTang();

        Service house = new House(id,tenDichVu,dienTichUse,chiPhiThue,soNguoiToiDa,kieuThue,tieuChuanPhong,tienNghiKhac,soTang);
        serviceList.add(house);
        DocGhiFile.ghiFile("Services.csv",serviceList,true);
    }

    public static void addVilla() {
        String id = AddServices.idVilla();
        String tenDichVu = AddServices.nhapTendichVu();
        String dienTichUse = AddServices.nhapDienTichSuDung();
        String chiPhiThue = AddServices.nhapChiPhiThue();
        String soNguoiToiDa = AddServices.nhapSoNguoiToiDa();
        String kieuThue = AddServices.nhapKieuThue();
        String tieuChuanPhong = AddServices.nhapTieuChuanPhong();
        String tienNghiKhac = AddServices.nhapTienNghiKhac();
        String dienTichHoBoi = AddServices.nhapDienTichHoBoi();
        String soTang = AddServices.nhapSoTang();

        Service villa = new Villa(id,tenDichVu,dienTichUse,chiPhiThue,soNguoiToiDa,kieuThue,tieuChuanPhong,tienNghiKhac,dienTichHoBoi,soTang);
        serviceList.add(villa);
        DocGhiFile.ghiFile("Services.csv",serviceList,true);
    }


    public static void showNameRoomDuplicate() {
        Set<Room> roomSet = new TreeSet<>(Comparator.comparing(Room::getId));
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList) {
            if (service instanceof Villa) {
                roomSet.add((Room) service);
            }
        }
        for (Room room : roomSet){
            System.out.println(room.showInfor());
        }
    }

    public static void showNameHouseDuplicate() {
        Set<House> houseSet = new TreeSet<>(Comparator.comparing(House::getId));
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList) {
            if (service instanceof Villa) {
                houseSet.add((House) service);
            }
        }
        for (House house : houseSet){
            System.out.println(house.showInfor());
        }
    }

    public static void showNameVillaDuplicate() {
      Set<Villa> villaSet = new TreeSet<>(Comparator.comparing(Villa::getId));
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList) {
            if (service instanceof Villa) {
                villaSet.add((Villa) service);
            }
        }
        for (Villa villa : villaSet){
            System.out.println(villa.showInfor());
        }
    }

    public static void showRoom() {
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList){
            if (service instanceof Room){
                System.out.println(service.showInfor());
            }
        }
    }

    public static void showHouse() {
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList){
            if (service instanceof House){
                System.out.println(service.showInfor());
            }
        }
    }

    public static void showVilla() {
        serviceList = DocGhiFile.docFile("Services.csv");
        for (Service service : serviceList){
            if (service instanceof Villa){
                System.out.println(service.showInfor());
            }
        }
    }

}
