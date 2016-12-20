package com.learn.salaryapp;

/**
 * Created by Vitalik on 09.09.2016.
 */
public class Manager extends Worker implements Cloneable {

    public Manager(String fnameOfWorker, String lnameOfWorker, int ageOfWorker, double stageOfWorker, int countOfDays, Department department) {
        super(fnameOfWorker, lnameOfWorker, ageOfWorker, stageOfWorker, countOfDays, department);
    }

    @Override
    public double computationSalary() {
        return getCountOfDays() * 100;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "fnameOfWorker='" + getFnameOfWorker() + '\'' +
                ", lnameOfWorker='" + getLnameOfWorker() + '\'' +
                ", ageOfWorker=" + getAgeOfWorker() +
                ", stageOfWorker=" + getStageOfWorker() +
                ", countOfDays=" + getCountOfDays() +
                ", department=" + getDepartment() +
                "}\n";
    }
    public Manager(Manager aManager) {
        this(aManager.getFnameOfWorker(), aManager.getLnameOfWorker(), aManager.getAgeOfWorker(), aManager.getStageOfWorker(), aManager.getCountOfDays(), aManager.getDepartment());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (getAgeOfWorker() != worker.getAgeOfWorker()) return false;
        if (Double.compare(worker.getStageOfWorker(), getStageOfWorker()) != 0) return false;
        if (getCountOfDays() != worker.getCountOfDays()) return false;
        if (!getFnameOfWorker().equals(worker.getFnameOfWorker())) return false;
        if (!getLnameOfWorker().equals(worker.getLnameOfWorker())) return false;
        return getDepartment().equals(worker.getDepartment());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getFnameOfWorker().hashCode();
        result = 31 * result + getLnameOfWorker().hashCode();
        result = 31 * result + getAgeOfWorker();
        temp = Double.doubleToLongBits(getStageOfWorker());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getCountOfDays();
        result = 31 * result + getDepartment().hashCode();
        return result;
    }

    @Override
    protected Manager clone() throws CloneNotSupportedException {
        Manager manager = (Manager) super.clone();
        Department department = manager.getDepartment().clone();
        manager.setDepartment(department);
        return manager;
    }
}
