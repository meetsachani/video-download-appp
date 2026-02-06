package o;

import java.io.IOException;
import o.C3916Pf;
import o.C5886dk2;
import o.InterfaceC2827Ee1;

@Deprecated
/* loaded from: classes2.dex */
public final class HZ implements InterfaceC2827Ee1.b {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final String g = "DMCodecAdapterFactory";
    public int b = 0;
    public boolean c;

    @Override // o.InterfaceC2827Ee1.b
    public InterfaceC2827Ee1 a(InterfaceC2827Ee1.a aVar) throws IOException {
        int i;
        int i2 = TD2.a;
        if (i2 >= 23 && ((i = this.b) == 1 || (i == 0 && i2 >= 31))) {
            int l = C4128Rj1.l(aVar.c.g1);
            I31.h(g, "Creating an asynchronous MediaCodec adapter for track type " + TD2.E0(l));
            return new C3916Pf.b(l, this.c).a(aVar);
        }
        return new C5886dk2.b().a(aVar);
    }

    public void b(boolean z) {
        this.c = z;
    }

    @InterfaceC6181ey
    public HZ c() {
        this.b = 2;
        return this;
    }

    @InterfaceC6181ey
    public HZ d() {
        this.b = 1;
        return this;
    }
}
