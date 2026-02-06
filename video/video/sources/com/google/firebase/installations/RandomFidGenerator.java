package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class RandomFidGenerator {
    public static final byte a = Byte.parseByte("01110000", 2);
    public static final byte b = Byte.parseByte("00001111", 2);
    public static final int c = 22;

    public static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @InterfaceC5670cr1
    public String a() {
        byte[] c2 = c(UUID.randomUUID(), new byte[17]);
        byte b2 = c2[0];
        c2[16] = b2;
        c2[0] = (byte) ((b2 & b) | a);
        return b(c2);
    }
}
