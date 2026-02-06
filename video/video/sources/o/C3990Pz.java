package o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: o.Pz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3990Pz extends AbstractC6639go {
    public static final String c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";
    public static final byte[] d = c.getBytes(InterfaceC6575gX0.b);

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d);
    }

    @Override // o.AbstractC6639go
    public Bitmap c(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap, int i, int i2) {
        return C6658gs2.b(interfaceC4931Zn, bitmap, i, i2);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        return obj instanceof C3990Pz;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return -599754482;
    }
}
