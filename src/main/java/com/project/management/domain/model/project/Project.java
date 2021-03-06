package com.project.management.domain.model.project;

import com.project.management.domain.model.amount.Amount;
import com.project.management.domain.model.amount.ContractAmount;
import com.project.management.domain.model.amount.OfferAmount;
import com.project.management.domain.model.client.ClientName;
import com.project.management.domain.model.progress.Status;
import com.project.management.domain.model.schedule.Schedule;
import com.project.management.domain.type.date.CurrentDate;
import com.project.management.domain.type.text.NonValueLetter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;

/**
 * 案件
 */
public class Project {
    @Valid
    ProjectName projectName;
    @Valid
    ClientName clientName;
    Status status;
    @Valid
    PicName picName;
    Amount amount;
    @Valid
    Schedule schedule;

    public Project() {
    }

    public Project(ProjectName projectName, ClientName clientName, Status status, PicName picName, Amount amount, Schedule schedule) {
        this.projectName = projectName;
        this.clientName = clientName;
        this.status = status;
        this.picName = picName;
        this.amount = amount;
        this.schedule = schedule;
    }

    public static Project newProject() {
        return new Project(
                new ProjectName(),
                new ClientName(),
                Status.init(),
                new PicName(),
                new Amount(),
                new Schedule(LocalDate.now(), LocalDate.now().plusMonths(3))
        );
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
