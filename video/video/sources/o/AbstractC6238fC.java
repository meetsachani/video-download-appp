package o;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import o.R11;

@Deprecated
/* renamed from: o.fC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6238fC implements R11.e {
    public final long a = N11.a();
    public final OU b;
    public final int c;
    public final C10833xx0 d;
    public final int e;
    @InterfaceC11300zs1
    public final Object f;
    public final long g;
    public final long h;
    public final C4004Qc2 i;

    public AbstractC6238fC(FU fu, OU ou, int i, C10833xx0 c10833xx0, int i2, @InterfaceC11300zs1 Object obj, long j, long j2) {
        this.i = new C4004Qc2(fu);
        this.b = (OU) C9542sf.g(ou);
        this.c = i;
        this.d = c10833xx0;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }

    public final long b() {
        return this.i.m();
    }

    public final long d() {
        return this.h - this.g;
    }

    public final Map<String, List<String>> e() {
        return this.i.z();
    }

    public final Uri f() {
        return this.i.y();
    }
}
