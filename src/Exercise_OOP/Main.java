package Exercise_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Accountant accountant1 = new Accountant("AC1","Hoa", 12,1);
        Accountant accountant2 = new Accountant("AC2","Mai", 12,2);
        CleaningStaff cleaningStaff1 = new CleaningStaff("CS1","Lien",12,10);
        Engineer engineer1 = new Engineer("EN1","Cong",12,0, Engineer.EngineerType.SOFTWARE);
        Receptionist receptionist1 = new Receptionist("RE1","Nhung", 12,3);
        Receptionist receptionist2 = new Receptionist("RE2","Nhi", 12,1);

        List<Staff> staffList = new ArrayList<>();
        staffList.add(accountant1);
        staffList.add(accountant2);
        staffList.add(engineer1);
        staffList.add(cleaningStaff1);
        staffList.add(receptionist1);

        // In lương của tất cả các nhân viên

        // Xem lương của tất cả các nhân viên từ phía giám đốc
        Manager manager = (Manager) staffList.get(staffList.size() - 1);
        manager.printAllSalaries(staffList);

        // Xem nhân viên có mức lương cao nhất
        manager.printHighestPaidStaff(staffList);
    }

}

