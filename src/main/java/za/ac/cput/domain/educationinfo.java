package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

    @Entity
    public class educationinfo  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String institutionName;
        private String qualificationName;
        private LocalDate startDate;
        private LocalDate graduationDate;

        public educationinfo() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getInstitutionName() {
            return institutionName;
        }

        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

        public String getQualificationName() {
            return qualificationName;
        }

        public void setQualificationName(String qualificationName) {
            this.qualificationName = qualificationName;
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public LocalDate getGraduationDate() {
            return graduationDate;
        }

        public void setGraduationDate(LocalDate graduationDate) {
            this.graduationDate = graduationDate;
        }


        public void setStartDateAsString(String startDate) {

            this.startDate = LocalDate.parse(startDate);
        }

        public void setGraduationDateAsString(String graduationDate) {

            this.graduationDate = LocalDate.parse(graduationDate);
        }
    }


