package project.view;

import project.controller.ProjectController;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

public class ProjectFrame extends JFrame
{
	private ProjectController appController;
	private ProjectPanel appPanel;
	private Color backgroundBlue;
	
	/**
	 * creates the ChatFrame, calls setupframe
	 * @param ChatbotController appController
	 */
	public ProjectFrame(ProjectController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ProjectPanel(appController);
		setupFrame();
	}
	
	/**
	 * Sets the settings for the chatframe
	 */
	private void setupFrame()
	{	
		Color backgroundBlue = new Color(51, 204, 255);
		this.setContentPane(appPanel);
		this.setSize(600,600);
		this.setTitle("Slider!");
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		appPanel.setBackground(backgroundBlue);
	}
	
	/**
	 * Getter for the appController
	 * @return
	 */
	public ProjectController getBaseController()
	{
		return(appController);
	}
	
}
