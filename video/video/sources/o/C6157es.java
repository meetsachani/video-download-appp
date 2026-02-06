package o;

import java.nio.ByteOrder;

/* renamed from: o.es  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6157es {
    public static ByteOrder a(String str) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (byteOrder.toString().equals(str)) {
            return byteOrder;
        }
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (byteOrder2.toString().equals(str)) {
            return byteOrder2;
        }
        throw new IllegalArgumentException("Unsupported byte order setting: " + str + ", expected one of " + byteOrder2 + C6566gU0.h + byteOrder);
    }
}
