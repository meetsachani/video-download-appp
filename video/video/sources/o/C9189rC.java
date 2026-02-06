package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: o.rC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9189rC extends AbstractC6639go {
    public static final int c = 1;
    public static final String d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    public static final byte[] e = d.getBytes(InterfaceC6575gX0.b);

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(e);
    }

    @Override // o.AbstractC6639go
    public Bitmap c(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap, int i, int i2) {
        return C6658gs2.d(interfaceC4931Zn, bitmap, i, i2);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        return obj instanceof C9189rC;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return 1101716364;
    }
}
