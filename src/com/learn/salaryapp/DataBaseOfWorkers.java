package com.learn.salaryapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBaseOfWorkers {

    public List<Worker> getList() {
        List<Worker> list = new ArrayList<>();
        list.add(new WorkerOfDepartment("Vova", "Kuba", 35, 5,
                23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Lilia", "Aluba", 24, 2, 3,
                new Department("Manager")));
        list.add(new Manager("Vova", "Salo", 23, 2, 15,
                new Department("Manager")));
        list.add(new WorkerOfDepartment("Olia", "Kras", 22, 1,
                20, new Department("WorkerOfDepartment")));
        list.add(new Manager("Jura", "Krivets", 43, 4, 23,
                new Department("Manager")));
        list.add(new WorkerOfDepartment("Oleg", "Podoljak", 45, 7,
                23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Igor", "Kanarejchyk", 27, 3,
                20, new Department("Manager")));
        list.add(new WorkerOfDepartment("Vova", "Kubanok", 28, 2,
                23, new Department("WorkerOfDepartment")));
        list.add(new WorkerOfDepartment("Olia", "Rubanok", 29, 2,
                23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Vova", "Koba", 22, 1, 20,
                new Department("Manager")));
        list.add(new WorkerOfDepartment("Igor", "Kluba", 35, 4,
                23, new Department("WorkerOfDepartment")));
        list.add(new WorkerOfDepartment("Lilia", "Kliuba", 35, 5,
                23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Olia", "Kubatol", 22, 1,
                20, new Department("Manager")));
        list.add(new WorkerOfDepartment("Vova", "Petryk", 35,
                5, 23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Lilia", "Kuba", 22, 1,
                20, new Department("Manager")));
        list.add(new WorkerOfDepartment("Vova", "Kanarejchyk", 35,
                5, 23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Olia", "VKuba", 35, 9,
                23, new Department("Manager")));
        list.add(new Manager("Oleg", "SKuba", 43, 15,
                20, new Department("Manager")));
        list.add(new WorkerOfDepartment("Lilia", "Petryk", 45,
                15, 23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Olia", "Kuba", 45, 5,
                20, new Department("Manager")));
        list.add(new WorkerOfDepartment("Igor", "Kuba", 23,
                2, 23, new Department("WorkerOfDepartment")));
        list.add(new Manager("Oleg", "Petryk", 35, 5,
                19, new Department("Manager")));
        list.add(new WorkerOfDepartment("Olia", "Kuba", 35,
                5, 19, new Department("WorkerOfDepartment")));
        return list;
    }

    public void getSalaryFilter() {
        List<Worker> list = getList();
        Iterator<Worker> iter = list.iterator();
        while (iter.hasNext()) {
            Worker worker = iter.next();
            if (worker.computationSalary() < 500) {
                System.out.println(worker);
            }
        }
    }

    public void getDayFilter() {
        List<Worker> list = getList();
        Iterator<Worker> iter = list.iterator();
        while (iter.hasNext()) {
            Worker worker = iter.next();
            if (worker.getCountOfDays() > 10 && worker.getCountOfDays() < 20) {
                System.out.println(worker);
            }
        }
    }
}
