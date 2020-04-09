
import explorationsoflambdasandgenerics.Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Utils.testInvolutence();
        System.out.println(Utils.indexedOutput(Utils.repeat(Utils.modifyIntegerXTimes(x -> x+1, 5, 0), 5)));
        Utils.modifyIntegerXTimesTester(x -> x+3, 6, 0);
    }

}
