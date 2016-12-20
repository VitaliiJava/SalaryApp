package com.learn.salaryapp;


public abstract class Worker implements Salaryable {
    private String fnameOfWorker;
    private String lnameOfWorker;
    private int ageOfWorker;
    private double stageOfWorker;
    private int countOfDays;
    private Department department;

    public Worker(String fnameOfWorker, String lnameOfWorker, int ageOfWorker, double stageOfWorker, int countOfDays, Department department) {
        this.fnameOfWorker = fnameOfWorker;
        this.lnameOfWorker = lnameOfWorker;
        this.ageOfWorker = ageOfWorker;
        this.stageOfWorker = stageOfWorker;
        this.countOfDays = countOfDays;
        this.department = department;
        if (stageOfWorker > ageOfWorker || stageOfWorker > (ageOfWorker - 20)) {
            System.out.println("Error Input correct data!!!");
        }
    }


    public String getFnameOfWorker() {
        return fnameOfWorker;
    }

    public void setFnameOfWorker(String fnameOfWorker) {
        this.fnameOfWorker = fnameOfWorker;
    }

    public String getLnameOfWorker() {
        return lnameOfWorker;
    }

    public void setLnameOfWorker(String lnameOfWorker) {
        this.lnameOfWorker = lnameOfWorker;
    }

    public int getAgeOfWorker() {

        return ageOfWorker;
    }

    public void setAgeOfWorker(int ageOfWorker) {
        if (ageOfWorker > 65 || ageOfWorker < 20) {
            System.out.println("Age of worker can not be more than 65 and less 20");
        }
        this.ageOfWorker = ageOfWorker;
    }

    public double getStageOfWorker() {
        return stageOfWorker;
    }

    public void setStageOfWorker(double stageOfWorker) {
        if (stageOfWorker < 0 || stageOfWorker > 45) {
            System.out.println("Stage of worker can not be more than 45 or less 0");
        }
        this.stageOfWorker = stageOfWorker;
    }


    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        if (countOfDays > 24) {
            System.out.println("count of days per month can not be more than 24 because you must have some vacation");
        }
        this.countOfDays = countOfDays;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fnameOfWorker='" + fnameOfWorker + '\'' +
                ", lnameOfWorker='" + lnameOfWorker + '\'' +
                ", ageOfWorker=" + ageOfWorker +
                ", stageOfWorker=" + stageOfWorker +
                ", countOfDays=" + countOfDays +
                ", department=" + department +
                "}\n";
    }

    @Override
    protected Worker clone() throws CloneNotSupportedException {//redudant
        Worker worker = (Worker) super.clone();
        Department department = worker.getDepartment().clone();
        worker.setDepartment(department);
        return worker;
    }
}

