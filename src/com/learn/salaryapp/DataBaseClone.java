package com.learn.salaryapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBaseClone {
    public List<Worker> getList() throws CloneNotSupportedException {
        List<Worker> list = new ArrayList<>();
        WorkerOfDepartment workerOfDepartment = new WorkerOfDepartment("Vova", "Kuba",
                35, 5, 23, new Department("WorkerOfDepartment"));
        Manager manager = new Manager("Lilia", "Aluba", 24, 2,
                3, new Department("Manager"));
        WorkerOfDepartment newWorkerOfDepartment = new WorkerOfDepartment(workerOfDepartment);
        Manager cloneManager = new Manager(manager);
        cloneManager.setFnameOfWorker("Lilia");
        cloneManager.setLnameOfWorker("Aluba");
        cloneManager.setAgeOfWorker(24);
        cloneManager.setStageOfWorker(2);
        cloneManager.setCountOfDays(3);
        cloneManager.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager);
        Manager cloneManager2 = new Manager(manager);
        cloneManager2.setFnameOfWorker("Vova");
        cloneManager2.setLnameOfWorker("Salo");
        cloneManager2.setAgeOfWorker(23);
        cloneManager2.setStageOfWorker(2);
        cloneManager2.setCountOfDays(15);
        cloneManager2.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager2);
        newWorkerOfDepartment.setFnameOfWorker("Olia");
        newWorkerOfDepartment.setLnameOfWorker("Kras");
        newWorkerOfDepartment.setAgeOfWorker(22);
        newWorkerOfDepartment.setStageOfWorker(1);
        newWorkerOfDepartment.setCountOfDays(20);
        newWorkerOfDepartment.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment);
        Manager cloneManager3 = new Manager(manager);
        cloneManager3.setFnameOfWorker("Jura");
        cloneManager3.setLnameOfWorker("Krivets");
        cloneManager3.setAgeOfWorker(43);
        cloneManager3.setStageOfWorker(4);
        cloneManager3.setCountOfDays(23);
        cloneManager3.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager3);
        WorkerOfDepartment newWorkerOfDepartment2 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment.setFnameOfWorker("Oleg");
        newWorkerOfDepartment.setLnameOfWorker("Podoljak");
        newWorkerOfDepartment.setAgeOfWorker(45);
        newWorkerOfDepartment.setStageOfWorker(7);
        newWorkerOfDepartment.setCountOfDays(23);
        newWorkerOfDepartment.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment);
        Manager cloneManager4 = new Manager(manager);
        cloneManager4.setFnameOfWorker("Igor");
        cloneManager4.setLnameOfWorker("Kanarejchyk");
        cloneManager4.setAgeOfWorker(27);
        cloneManager4.setStageOfWorker(4);
        cloneManager4.setCountOfDays(20);
        cloneManager4.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager4);
        WorkerOfDepartment newWorkerOfDepartment3 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment3.setFnameOfWorker("Vova");
        newWorkerOfDepartment3.setLnameOfWorker("Kubanok");
        newWorkerOfDepartment3.setAgeOfWorker(28);
        newWorkerOfDepartment3.setStageOfWorker(2);
        newWorkerOfDepartment3.setCountOfDays(23);
        newWorkerOfDepartment3.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment3);
        WorkerOfDepartment newWorkerOfDepartment4 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment4.setFnameOfWorker("Olia");
        newWorkerOfDepartment4.setLnameOfWorker("Kubanok");
        newWorkerOfDepartment4.setAgeOfWorker(29);
        newWorkerOfDepartment4.setStageOfWorker(2);
        newWorkerOfDepartment4.setCountOfDays(23);
        newWorkerOfDepartment4.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment4);
        Manager cloneManager5 = new Manager(manager);
        cloneManager5.setFnameOfWorker("Vova");
        cloneManager5.setLnameOfWorker("Koba");
        cloneManager5.setAgeOfWorker(22);
        cloneManager5.setStageOfWorker(1);
        cloneManager5.setCountOfDays(20);
        cloneManager5.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager5);
        WorkerOfDepartment newWorkerOfDepartment5 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment5.setFnameOfWorker("Igor");
        newWorkerOfDepartment5.setLnameOfWorker("Kluba");
        newWorkerOfDepartment5.setAgeOfWorker(35);
        newWorkerOfDepartment5.setStageOfWorker(4);
        newWorkerOfDepartment5.setCountOfDays(23);
        newWorkerOfDepartment5.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment5);
        WorkerOfDepartment newWorkerOfDepartment6 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment6.setFnameOfWorker("Lilia");
        newWorkerOfDepartment6.setLnameOfWorker("Kliuba");
        newWorkerOfDepartment6.setAgeOfWorker(35);
        newWorkerOfDepartment6.setStageOfWorker(4);
        newWorkerOfDepartment6.setCountOfDays(23);
        newWorkerOfDepartment6.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment6);
        Manager cloneManager6 = new Manager(manager);
        cloneManager6.setFnameOfWorker("Olia");
        cloneManager6.setLnameOfWorker("Kubatol");
        cloneManager6.setAgeOfWorker(22);
        cloneManager6.setStageOfWorker(1);
        cloneManager6.setCountOfDays(20);
        cloneManager6.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager6);
        WorkerOfDepartment newWorkerOfDepartment7 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment7.setFnameOfWorker("Vova");
        newWorkerOfDepartment7.setLnameOfWorker("Petryk");
        newWorkerOfDepartment7.setAgeOfWorker(35);
        newWorkerOfDepartment7.setStageOfWorker(7);
        newWorkerOfDepartment7.setCountOfDays(23);
        newWorkerOfDepartment7.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment7);
        Manager cloneManager7 = new Manager(manager);
        cloneManager7.setFnameOfWorker("Lilia");
        cloneManager7.setLnameOfWorker("Kuba");
        cloneManager7.setAgeOfWorker(22);
        cloneManager7.setStageOfWorker(1);
        cloneManager7.setCountOfDays(20);
        cloneManager7.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager7);
        WorkerOfDepartment newWorkerOfDepartment8 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment8.setFnameOfWorker("Vova");
        newWorkerOfDepartment8.setLnameOfWorker("Kanarejchyk");
        newWorkerOfDepartment8.setAgeOfWorker(35);
        newWorkerOfDepartment8.setStageOfWorker(3);
        newWorkerOfDepartment8.setCountOfDays(23);
        newWorkerOfDepartment8.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment8);
        Manager cloneManager8 = new Manager(manager);
        cloneManager8.setFnameOfWorker("Olia");
        cloneManager8.setLnameOfWorker("VKuba");
        cloneManager8.setAgeOfWorker(35);
        cloneManager8.setStageOfWorker(9);
        cloneManager8.setCountOfDays(23);
        cloneManager8.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager8);
        Manager cloneManager9 = new Manager(manager);
        cloneManager9.setFnameOfWorker("Oleg");
        cloneManager9.setLnameOfWorker("SKuba");
        cloneManager9.setAgeOfWorker(43);
        cloneManager9.setStageOfWorker(15);
        cloneManager9.setCountOfDays(23);
        cloneManager9.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager9);
        WorkerOfDepartment newWorkerOfDepartment9 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment9.setFnameOfWorker("Lilia");
        newWorkerOfDepartment9.setLnameOfWorker("Petryk");
        newWorkerOfDepartment9.setAgeOfWorker(45);
        newWorkerOfDepartment9.setStageOfWorker(15);
        newWorkerOfDepartment9.setCountOfDays(23);
        newWorkerOfDepartment9.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment9);
        Manager cloneManager10 = new Manager(manager);
        cloneManager10.setFnameOfWorker("Olia");
        cloneManager10.setLnameOfWorker("Kuba");
        cloneManager10.setAgeOfWorker(45);
        cloneManager10.setStageOfWorker(15);
        cloneManager10.setCountOfDays(23);
        cloneManager10.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager10);
        WorkerOfDepartment newWorkerOfDepartment10 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment10.setFnameOfWorker("Igor");
        newWorkerOfDepartment10.setLnameOfWorker("Kuba");
        newWorkerOfDepartment10.setAgeOfWorker(45);
        newWorkerOfDepartment10.setStageOfWorker(15);
        newWorkerOfDepartment10.setCountOfDays(23);
        newWorkerOfDepartment10.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment10);
        Manager cloneManager11= new Manager(manager);
        cloneManager11.setFnameOfWorker("Olia");
        cloneManager11.setLnameOfWorker("Kuba");
        cloneManager11.setAgeOfWorker(35);
        cloneManager11.setStageOfWorker(7);
        cloneManager11.setCountOfDays(19);
        cloneManager11.getDepartment().setNameOfdepartment("Manager");
        list.add(cloneManager11);
        WorkerOfDepartment newWorkerOfDepartment11 = new WorkerOfDepartment(workerOfDepartment);
        newWorkerOfDepartment11.setFnameOfWorker("Olia");
        newWorkerOfDepartment11.setLnameOfWorker("Kuba");
        newWorkerOfDepartment11.setAgeOfWorker(45);
        newWorkerOfDepartment11.setStageOfWorker(15);
        newWorkerOfDepartment11.setCountOfDays(19);
        newWorkerOfDepartment11.getDepartment().setNameOfdepartment("WorkerOfDepartment");
        list.add(newWorkerOfDepartment11);
        return list;
    }

    public void getSalaryFilter() throws CloneNotSupportedException {
        List<Worker> list = getList();
        Iterator<Worker> iter = list.iterator();
        while (iter.hasNext()) {
            Worker worker = iter.next();
            if (worker.computationSalary() < 500) {
                System.out.println(worker);
            }
        }
    }

    public void getDayFilter() throws CloneNotSupportedException {
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
