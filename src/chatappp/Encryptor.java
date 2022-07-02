/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatappp;

/**
 *
 * @author wendi
 */
public class Encryptor {

    public byte[] enc(byte[] input) {
        byte[] output = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = (byte) (input[i] + 1);
        }

        return output;
    }

    public byte[] dec(byte[] input) {
        byte[] output = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = (byte) (input[i] - 1);
        }

        return output;
    }
}
