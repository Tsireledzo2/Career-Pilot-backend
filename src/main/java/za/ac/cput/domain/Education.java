package za.ac.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

    @Entity
    public class Education {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String institutionName;
        private String qualificationName;
        private String startDate;
        private String graduationDate;
        @ManyToOne
        @JoinColumn(name = "job_seeker_profile_id")
        private JobSeekerAccount jobSeekerProfile;
        public Education() {
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

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getGraduationDate() {
            return graduationDate;
        }

        public void setGraduationDate(String graduationDate) {
            this.graduationDate = graduationDate;
        }



    }


