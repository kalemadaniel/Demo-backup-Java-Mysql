/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Ulb-Kalema
 */
public class clsBackup {
    
    public void backup(JLabel lbldebut, JLabel lblfin,JLabel lblduree,JLabel lblIcon,JLabel lblMessage,JLabel lblEmplacement){
        //  NOTE: Date format
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    	
	//  NOTE: Creating Database Constraints
	String dbHost = "localhost"; //host server IP
	String dbPort = "3306"; // port server
        String dbName = "hopital"; // name of your data base
        String dbUser = "root"; // username 
        String dbPass = "MQ4k4z22MhB6vD8GvsrY87du75KiNW"; // Password server
        String dumpExe = "C:\\xampp\\mysql\\bin\\mysqldump";
        String dumpSavePath="D:\\hospitalBackupFolder\\";
   //   NOTE: Here the backup is saved in a folder called backup with the name backup.sql
        String fileName = "backUpFile_"+sdf.format(new Date().getTime())+".sql";
       
        
   //   NOTE : call for backup process
        Backupdbtosql(dbHost, dbPort, dbUser, dbPass,
                dbName, dumpExe, dumpSavePath, fileName, lbldebut,
                lblfin, lblduree, lblIcon, lblMessage, lblEmplacement);
	}
	
	public static void Backupdbtosql(String host,String port,String user,String password,
                String dbName,String dumpExe,String dumpSavePath,String fileName,
                JLabel lbldebut, JLabel lblfin,JLabel lblduree,JLabel lblIcon,JLabel lblMessage,JLabel lblEmplacement) {
	    try {
	    //  NOTE: Date format
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	        String batchCommand;
	        if (password != "") {
		         //only backup the data not included create database
		         batchCommand = dumpExe + 
		        		 " -h " + host + 
		        		 " --port " + port + 
		        		 " -u " + user + 
		        		 " --password=" + password + 
		        		 " --add-drop-database -B " + dbName + 
		        		 " -r \"" + dumpSavePath + "" + "backup"+new Date().getTime()+".sql";
	        } else {
	        	 batchCommand = dumpExe + 
	        			 " -h " + host + 
	        			 " --port " + "3306" + 
	        			 " -u " + user + 
	        			 " --add-drop-database -B " + dbName + 
	        			 " -r \"" + dumpSavePath + "" + "backup"+new Date().getTime()+".sql";
	        }
	         
	 //     NOTE: Executing the command here
	        System.out.println("Execute Commond - " +batchCommand);
                lbldebut.setText("Le presessus a commencé à "+sdf.format(new Date()));
	        System.out.println("Processing.. "+ "STARTED " +sdf.format(new Date()));
	        Date sDate = new Date();
	        Process runtimeProcess = Runtime.getRuntime().exec(batchCommand);
	        int processComplete = runtimeProcess.waitFor();
	        
	        System.out.println("Processing.. "+ "END " +sdf.format(new Date()));
                lblfin.setText("Le presessus s'est terminer à "+sdf.format(new Date()));
	        Date eDate = new Date();
	        long duration =  eDate.getTime() - sDate.getTime();
	        int seconds=(int) ((duration/1000)%60);
	        long minutes=((duration-seconds)/1000)/60;
                lblduree.setText("Le processus a durée "+ minutes +" minutes :: "+seconds +" seconds :: "+duration +" milliseconds");
	        System.err.println("TOTAL TIME : " + minutes +" minutes :: ");
	        System.err.print(seconds +" seconds :: ");
	        System.err.print(duration +" milliseconds");
                
	//      NOTE: processComplete=0 if correctly executed, will contain other values if not
	        if (processComplete == 0) {
                    lblMessage.setForeground(new java.awt.Color(0, 212, 89));
                    lblMessage.setText("LE BACKUP A REUSSI AVEC SUCCES");
                    lblIcon.setVisible(true);
	            System.out.println("Backup Complete"); 
                    lblEmplacement.setText(dumpSavePath+fileName);
	        } else {
                     lblMessage.setForeground(new java.awt.Color(255, 0, 0));
                    lblMessage.setText("LE BACKUP A ECHOUE");
                    lblIcon.setVisible(true);
	            System.out.println("Backup Failure");
	        }
	    } catch (Exception ex) {
	    	System.err.println(ex.getMessage());
	    }
    }
    
    
}
