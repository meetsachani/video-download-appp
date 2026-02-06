package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public abstract class zzazv {
    @InterfaceC11300zs1
    public static MessageDigest b;
    public final Object a = new Object();

    @InterfaceC11300zs1
    public final MessageDigest a() {
        synchronized (this.a) {
            MessageDigest messageDigest = b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return b;
        }
    }

    public abstract byte[] b(String str);
}
