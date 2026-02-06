package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.Py1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3989Py1 extends IOException {
    public final boolean X;
    public final int Y;

    public C3989Py1(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, boolean z, int i) {
        super(str, th);
        this.X = z;
        this.Y = i;
    }

    public static C3989Py1 a(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new C3989Py1(str, th, true, 1);
    }

    public static C3989Py1 b(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new C3989Py1(str, th, true, 0);
    }

    public static C3989Py1 c(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new C3989Py1(str, th, true, 4);
    }

    public static C3989Py1 d(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new C3989Py1(str, th, false, 4);
    }

    public static C3989Py1 e(@InterfaceC11300zs1 String str) {
        return new C3989Py1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @InterfaceC11300zs1
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.X + ", dataType=" + this.Y + "}";
    }
}
