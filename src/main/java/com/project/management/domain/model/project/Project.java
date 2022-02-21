package com.project.management.domain.model.project;

import com.project.management.domain.model.amount.Amount;
import com.project.management.domain.model.client.ClientName;
import com.project.management.domain.model.progress.Status;
import com.project.management.domain.model.schedule.Schedule;
import com.project.management.domain.type.text.NonValueLetter;

/**
 * 案件
 */
public class Project {
    ProjectName projectName;
    ClientName clientName;
    Status status;
    PicName picName;
    Amount amount;
    Schedule schedule;

    Project() {
    }

    public Project(ProjectName projectName, ClientName clientName, Status status, PicName picName, Amount amount, Schedule schedule) {
        this.projectName = projectName;
        this.clientName = clientName;
        this.status = status;
        this.picName = picName;
        this.amount = amount;
        this.schedule = schedule;
    }

    public String projectName() {
        return projectName.toString();
    }

    public String clientName() {
        return clientName.toString();
    }

    public String status() {
        return status.toString();
    }

    public String picName() {
        return picName.toString();
    }

    public String offerAmount() {
        return isAmountExists() ? amount.offerAsText() : NonValueLetter.HYPHEN;
    }

    public String contractAmount() {
        return isAmountExists() ? amount.contractAsText() : NonValueLetter.HYPHEN;
    }

    public String scheduleAsText() {
        return schedule.asText();
    }

    public boolean isAmountExists() {
        return amount != null;
    }


    @Override
    public String toString() {
        return "Project{" +
                "projectName=" + projectName +
                ", clientName=" + clientName +
                ", status=" + status +
                ", picName=" + picName +
                ", amount=" + amount +
                ", schedule=" + schedule +
                '}';
    }
}
