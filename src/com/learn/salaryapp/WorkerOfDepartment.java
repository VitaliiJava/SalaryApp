package com.learn.salaryapp;

public class WorkerOfDepartment extends Worker implements Cloneable{


    public WorkerOfDepartment(String fnameOfWorker, String lnameOfWorker, int ageOfWorker, double stageOfWorker,
                              int countOfDays, Department department) {
        super(fnameOfWorker, lnameOfWorker, ageOfWorker, stageOfWorker, countOfDays, department);
    }

    public WorkerOfDepartment(WorkerOfDepartment aWorkerOfDepartment) {
        this(aWorkerOfDepartment.getFnameOfWorker(), aWorkerOfDepartment.getLnameOfWorker(),
                aWorkerOfDepartment.getAgeOfWorker(), aWorkerOfDepartment.getStageOfWorker(),
                aWorkerOfDepartment.getCountOfDays(), aWorkerOfDepartment.getDepartment());
    }
    @Override
    public double computationSalary() {
        return getCountOfDays()*1000;
    }

    @Override
    public String toString() {
        return "WorkerOfDepartment{" +
                "fnameOfWorker='" + getFnameOfWorker() + '\'' +
                ", lnameOfWorker='" + getLnameOfWorker() + '\'' +
                ", ageOfWorker=" + getAgeOfWorker() +
                ", stageOfWorker=" + getStageOfWorker() +
                ", countOfDays=" + getCountOfDays() +
                ", department=" + getDepartment() +
                "}\n";
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
    protected WorkerOfDepartment clone() throws CloneNotSupportedException {
        WorkerOfDepartment workerOfDepartment = (WorkerOfDepartment) super.clone();
        Department department = workerOfDepartment.getDepartment().clone();
        workerOfDepartment.setDepartment(department);
        return workerOfDepartment;
    }
}
