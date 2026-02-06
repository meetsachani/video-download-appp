package o;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class CE0 extends AbstractC6639go {
    public static final String g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";
    public static final byte[] h = g.getBytes(InterfaceC6575gX0.b);
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CE0(float f, float f2, float f3, float f4) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.c).putFloat(this.d).putFloat(this.e).putFloat(this.f).array());
    }

    @Override // o.AbstractC6639go
    public Bitmap c(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap, int i, int i2) {
        return C6658gs2.p(interfaceC4931Zn, bitmap, this.c, this.d, this.e, this.f);
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof CE0) {
            CE0 ce0 = (CE0) obj;
            if (this.c == ce0.c && this.d == ce0.d && this.e == ce0.e && this.f == ce0.f) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return SD2.o(this.f, SD2.o(this.e, SD2.o(this.d, SD2.q(-2013597734, SD2.n(this.c)))));
    }
}
