package fr.devnr.jarialtekinapi.dao.interfaces;

import java.util.List;

import fr.devnr.jarialtekinapi.model.Project;
import fr.devnr.jarialtekinapi.model.Task;

public interface ProjectDAO {
	
	/**
	 * Get all projects in database (i.e. the whole content of the Projects table).
	 * 
	 * @return the list of all projects
	 */
	List<Project> getAllProjects();
	
	/**
	 * Get the project identified by <code>idProject</code>.
	 * 
	 * @param idProject id of the project to retrieve
	 * @return the project identified by <code>idProject</code>
	 */
	Project getProjectById(Long idProject);

	/**
	 * Get the project to which the specified task is associated to.
	 *
	 * @param idTask id of a task
	 * @return the project the task is associated to
	 */
	Project getProjectByTask(Long idTask);
	
	/**
	 * Create a new project in database.
	 * Note : the given project should not have its id setted yet 
	 * since it will be generated by the database.
	 * 
	 * @param project the project to create (with no id)
	 * @return the created project (with a newly generated id)
	 */
	Project createProject(Project project);
	
	/**
	 * Update the specified project.
	 * 
	 * @param project the project to update
	 * @return <code>true</code> if the project has been successfuly updated, <codde>false</code> otherwise
	 */
	Boolean updateProject(Project project);
	
	/**
	 * Delete the specified project (identified by <code>idProject</code>).
	 * 
	 * @param idProject id of the project to delete
	 * @return <code>true</code> if the project has been successfuly deleted, <codde>false</code> otherwise
	 */
	Boolean deleteProject(Long idProject);
	
	/**
	 * Get all the tasks associated to the project identified by <code>idProject</code>.
	 * 
	 * @param idProject id of the project for which to get the tasks
	 * @return the list of tasks associated to this project (possibly an empty list there is none)
	 */
	List<Task> getProjectTasks(Long idProject);

}
