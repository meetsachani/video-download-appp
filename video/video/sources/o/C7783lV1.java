package o;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.lV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7783lV1 extends AbstractC6639go {
    public static final String d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
    public static final byte[] e = d.getBytes(InterfaceC6575gX0.b);
    public final int c;

    public C7783lV1(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10175vF1.b(z, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // o.AbstractC6639go
    public Bitmap c(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap, int i, int i2) {
        return C6658gs2.q(interfaceC4931Zn, bitmap, this.c);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (!(obj instanceof C7783lV1) || this.c != ((C7783lV1) obj).c) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return SD2.q(-569625254, SD2.p(this.c));
    }
}
