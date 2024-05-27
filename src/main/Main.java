/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import eddls.ListaLinearSimples;
import eddls.Node;
import eddls.NodeValue;
import eddls.Nothing;
import java.util.Scanner;

/**
 *
 * @author labfatec
 */
public class Main {

    public static void main(String[] args) {

        ListaLinearSimples list = new ListaLinearSimples();
        Scanner in = new Scanner(System.in);
        int id = 0;
        String name = "";
        String email = "";

        for (; id >= 0;) {
            System.out.print("Informations: ");
            id = in.nextInt();
            name = in.next();
            email = in.next();
            if (id < 0) {
                break;
            }
            list.add(new Node(id, new Nothing(id, name, email)));
        }
        list.show();

        /*System.out.println("Pesquisar n-esimo. Informe a posicao: ");
        int position = in.nextInt();

        Node searchedNodeClone = list.searchWithClone(position);
        NodeValue searchedNodeInterface = list.searchWithInterface(position);

        System.out.println("\nNode: " + searchedNodeClone.getValue());
        System.out.println("\nNode: " + searchedNodeInterface.getValue());
        
        Node nodeRet = list.remove();
        if (nodeRet != null) {
            System.out.println("\nNó removido: " + nodeRet.getValue());
            list.show();

            nodeRet = list.pop();
            System.out.println("\nNó removido: " + nodeRet.getValue());
            list.show();
        }

        list.clear();
        list.show();
        System.out.println("\nLISTA LIMPA!!!");
         */
    }
}
