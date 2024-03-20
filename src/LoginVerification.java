/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ishan
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginVerification extends UnicastRemoteObject implements LoginInterface 
{
public LoginVerification()throws Exception{}

public boolean checkLogin(String id, String password) throws RemoteException 
{
if(id.equals("dev") && password.equals("bulbul"))
  return true;
else
  return false;
}
}
