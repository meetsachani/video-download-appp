package o;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.f9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6226f9 implements InterfaceC6575gX0 {
    public final int c;
    public final InterfaceC6575gX0 d;

    public C6226f9(int i, InterfaceC6575gX0 interfaceC6575gX0) {
        this.c = i;
        this.d = interfaceC6575gX0;
    }

    public static InterfaceC6575gX0 c(Context context) {
        return new C6226f9(context.getResources().getConfiguration().uiMode & 48, C3420Kd.c(context));
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        this.d.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C6226f9) {
            C6226f9 c6226f9 = (C6226f9) obj;
            if (this.c == c6226f9.c && this.d.equals(c6226f9.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return SD2.r(this.d, this.c);
    }
}
