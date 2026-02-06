package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import o.InterfaceC10186vI0;
import o.M11;
import o.R11;

@Deprecated
/* renamed from: o.zZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11223zZ implements M11 {
    public static final int d = 3;
    public static final int e = 6;
    public static final long f = 60000;
    @Deprecated
    public static final long g = 60000;
    public static final long h = 300000;
    public static final int i = -1;
    public final int c;

    public C11223zZ() {
        this(-1);
    }

    @Override // o.M11
    public int a(int i2) {
        int i3 = this.c;
        if (i3 == -1) {
            if (i2 == 7) {
                return 6;
            }
            return 3;
        }
        return i3;
    }

    @Override // o.M11
    @InterfaceC11300zs1
    public M11.b b(M11.a aVar, M11.d dVar) {
        if (!e(dVar.c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new M11.b(1, 300000L);
        }
        if (!aVar.a(2)) {
            return null;
        }
        return new M11.b(2, 60000L);
    }

    @Override // o.M11
    public long d(M11.d dVar) {
        IOException iOException = dVar.c;
        if (!(iOException instanceof C3989Py1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof InterfaceC10186vI0.b) && !(iOException instanceof R11.h) && !LU.a(iOException)) {
            return Math.min((dVar.d - 1) * 1000, 5000);
        }
        return C10323vs.b;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof InterfaceC10186vI0.f)) {
            return false;
        }
        int i2 = ((InterfaceC10186vI0.f) iOException).c1;
        if (i2 != 403 && i2 != 404 && i2 != 410 && i2 != 416 && i2 != 500 && i2 != 503) {
            return false;
        }
        return true;
    }

    public C11223zZ(int i2) {
        this.c = i2;
    }
}
