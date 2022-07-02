/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatappp;

import java.io.Serializable;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class DataPacket implements Serializable {

    private byte[] rawBytes;

    public DataPacket(byte[] rawBytes) {
        this.rawBytes = rawBytes;
    }

    public byte[] getRawBytes() {
        return rawBytes;
    }
}
