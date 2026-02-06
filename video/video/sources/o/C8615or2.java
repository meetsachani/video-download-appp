package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.or2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8615or2 {
    public static final int l = 0;
    public static final int m = 1;
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final C10833xx0 f;
    public final int g;
    @InterfaceC11300zs1
    public final long[] h;
    @InterfaceC11300zs1
    public final long[] i;
    public final int j;
    @InterfaceC11300zs1
    public final C8858pr2[] k;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.or2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C8615or2(int i, int i2, long j, long j2, long j3, C10833xx0 c10833xx0, int i3, @InterfaceC11300zs1 C8858pr2[] c8858pr2Arr, int i4, @InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = c10833xx0;
        this.g = i3;
        this.k = c8858pr2Arr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public C8615or2 a(C10833xx0 c10833xx0) {
        return new C8615or2(this.a, this.b, this.c, this.d, this.e, c10833xx0, this.g, this.k, this.j, this.h, this.i);
    }

    @InterfaceC11300zs1
    public C8858pr2 b(int i) {
        C8858pr2[] c8858pr2Arr = this.k;
        if (c8858pr2Arr == null) {
            return null;
        }
        return c8858pr2Arr[i];
    }
}
