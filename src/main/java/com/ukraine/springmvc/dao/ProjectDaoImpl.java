package com.ukraine.springmvc.dao;

import com.ukraine.springmvc.model.Employee;
import com.ukraine.springmvc.model.Project;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    public ProjectDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void update(Project project) {
        String sql = "Update projects set project_id=?,projectsName=?,project_discuss=? specification=?,consept_sollution=?," +
                "tehnical_impl=?,start_project=?  where project_id =?";
        jdbcTemplate.update(sql, project.getProjectId(), project.getProjectName(), project.getProjectDiscuss(),
                project.getProjectSpecification(), project.getProjectSullution(),
                project.getProjectTechImpl(), project.getProjectStart(), project.getProjectId());
    }

    @Override
    public void delete(int projectId) {
        String sql = "delete from projects where project_id =?";
        jdbcTemplate.update(sql, projectId);
    }

    @Override
    public Project getProject(int projectId) {
        String sql = "select project_id, projectsName, project_discuss, specification, consept_sollution,tehnical_impl, start_project\n" +
                "from projects where project_id=" + projectId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Project>() {

            @Override
            public Project extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Project project = new Project();
                    project.setProjectId(rs.getInt("project_id"));
                    project.setProjectName(rs.getString("projectsName"));
                    project.setProjectDiscuss(rs.getString("project_discuss"));
                    project.setProjectSpecification(rs.getString("specification"));
                    project.setProjectSullution(rs.getString("consept_sollution"));
                    project.setProjectTechImpl(rs.getString("tehnical_impl"));
                    project.setProjectStart(rs.getString("start_project"));
                    return project;
                }
                return null;
            }

        });
    }

    @Override
    public List<Project> projectList() {
        String sql = "select project_id, projectsName, project_discuss, specification, consept_sollution,tehnical_impl, start_project\n" +
                "from projects";
        List<Project> listProjects = jdbcTemplate.query(sql, new RowMapper<Project>() {

            @Override
            public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
                Project project = new Project();
                project.setProjectId(rs.getInt("project_id"));
                project.setProjectName(rs.getString("projectsName"));
                project.setProjectDiscuss(rs.getString("project_discuss"));
                project.setProjectSpecification(rs.getString("specification"));
                project.setProjectSullution(rs.getString("consept_sollution"));
                project.setProjectTechImpl(rs.getString("tehnical_impl"));
                project.setProjectStart(rs.getString("start_project"));
                return project;
            }

        });

        return listProjects;
    }

    @Override
    public void insertProject(Project project) {
        String sql = "INSERT INTO `netcracker`.`projects` (`projectsName`, `project_discuss`, `specification`, `consept_sollution`, `tehnical_impl`, `start_project`)\n" +
                " VALUES (?, ?, ?, ?, ?,?)";
        jdbcTemplate.update(sql, project.getProjectName(), project.getProjectDiscuss(), project.getProjectSpecification(),
                project.getProjectSullution(), project.getProjectTechImpl(), project.getProjectStart());
    }

    @Override
    public void insertUser(Employee employee) {
        String sql = "insert into user_projects(obj_id,project_id) values(?,?) ";
        jdbcTemplate.update(sql, employee.getObjectId(), employee.getProjectId());
    }


    @Override
    public List<Employee> findAllObject() {

        String sql = "select object_id,object from objects";
        List<Employee> listEmployee = jdbcTemplate.query(sql, new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setObjectId(rs.getInt("object_id"));
                employee.setObject(rs.getString("object"));
                return employee;
            }

        });

        return listEmployee;
    }
}

