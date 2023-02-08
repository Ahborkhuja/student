package view.tm;

import javafx.scene.control.Button;

public class ProgramTM {
    private String programID;
    private String program;
    private String duration;
    private String fee;
    private Button update;
    private Button delete;

    public ProgramTM() {
    }

    public ProgramTM(String programID, String program, String duration, String fee) {
        this.programID = programID;
        this.program = program;
        this.duration = duration;
        this.fee = fee;
    }

    public ProgramTM(String programID, String program, String duration, String fee, Button update, Button delete) {
        this.programID = programID;
        this.program = program;
        this.duration = duration;
        this.fee = fee;
        this.update = update;
        this.delete = delete;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }
}
