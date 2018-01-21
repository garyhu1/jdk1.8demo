package io;

import java.io.*;
import java.net.Socket;

/**
 * Created by garyhu
 * on 2017/9/5.
 * method: �ͻ���
 */
public class GreetingClient {
    public static void main(String[] args){
        String serverName = "192.168.1.101";
        int port = 6066;
        try
        {
            System.out.println("���ӵ�������" + serverName + " �˿ںţ�" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Զ��������ַ��" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("��������Ӧ��  " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
