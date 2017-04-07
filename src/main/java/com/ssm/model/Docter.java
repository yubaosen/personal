package com.ssm.model;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by yubaosen on 2017/4/6.
 */
@JsonAutoDetect
public class Docter {
        private String ID;
        private String docname;
        private String professor;
        private String graduate;
        private String workplace;
        private String skill;
        private String aptitude;
        private int deadline;

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public String getDocname() {
                return docname;
        }

        public void setDocname(String docname) {
                this.docname = docname;
        }

        public String getProfessor() {
                return professor;
        }

        public void setProfessor(String professor) {
                this.professor = professor;
        }

        public String getGraduate() {
                return graduate;
        }

        public void setGraduate(String graduate) {
                this.graduate = graduate;
        }

        public String getWorkplace() {
                return workplace;
        }

        public void setWorkplace(String workplace) {
                this.workplace = workplace;
        }

        public String getSkill() {
                return skill;
        }

        public void setSkill(String skill) {
                this.skill = skill;
        }

        public String getAptitude() {
                return aptitude;
        }

        public void setAptitude(String aptitude) {
                this.aptitude = aptitude;
        }

        public int getDeadline() {
                return deadline;
        }

        public void setDeadline(int deadline) {
                this.deadline = deadline;
        }
}
