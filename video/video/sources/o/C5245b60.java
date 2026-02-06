package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import java.util.List;
import o.C3771Nr1;
import o.YM1;

@Deprecated
/* renamed from: o.b60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5245b60 {
    @InterfaceC3329Je2
    public static final int b = 0;
    public final C3771Nr1.n a;

    @ES1(31)
    /* renamed from: o.b60$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        @SuppressLint({"WrongConstant"})
        public static void a(C3771Nr1.n nVar) {
            nVar.W(1);
        }
    }

    public C5245b60(Context context, String str) {
        this.a = new C3771Nr1.n(context.getApplicationContext(), str);
    }

    public Notification a(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str) {
        return c(context, i, pendingIntent, str, YM1.h.a);
    }

    public Notification b(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str) {
        return c(context, i, pendingIntent, str, YM1.h.d);
    }

    public final Notification c(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str, @InterfaceC3329Je2 int i2) {
        return d(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    public final Notification d(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str, @InterfaceC3329Je2 int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        String string;
        this.a.t0(i);
        C3771Nr1.n nVar = this.a;
        C3771Nr1.l lVar = null;
        if (i2 == 0) {
            string = null;
        } else {
            string = context.getResources().getString(i2);
        }
        nVar.O(string);
        this.a.M(pendingIntent);
        C3771Nr1.n nVar2 = this.a;
        if (str != null) {
            lVar = new C3771Nr1.l().A(str);
        }
        nVar2.z0(lVar);
        this.a.l0(i3, i4, z);
        this.a.i0(z2);
        this.a.r0(z3);
        if (TD2.a >= 31) {
            a.a(this.a);
        }
        return this.a.h();
    }

    @Deprecated
    public Notification e(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str, List<G50> list) {
        return f(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification f(Context context, @K60 int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str, List<G50> list, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        boolean z9 = true;
        for (int i9 = 0; i9 < list.size(); i9++) {
            G50 g50 = list.get(i9);
            int i10 = g50.b;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                        }
                    } else {
                        z8 = true;
                    }
                }
                float b2 = g50.b();
                if (b2 != -1.0f) {
                    f += b2;
                    z9 = false;
                }
                if (g50.a() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i8++;
                z5 = true;
            } else {
                z6 = true;
            }
        }
        if (z5) {
            i4 = YM1.h.c;
        } else if (z6 && i2 != 0) {
            if ((i2 & 2) != 0) {
                i5 = YM1.h.h;
            } else if ((i2 & 1) != 0) {
                i5 = YM1.h.g;
            } else {
                i5 = YM1.h.f;
            }
            i3 = i5;
            z = false;
            if (z) {
            }
            return d(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        } else if (z8) {
            i4 = YM1.h.i;
        } else {
            i3 = 0;
            z = true;
            if (z) {
                if (z5) {
                    int i11 = (int) (f / i8);
                    if (z9 && z7) {
                        z4 = true;
                    }
                    i7 = i11;
                    z2 = z4;
                } else {
                    i7 = 0;
                    z2 = true;
                }
                i6 = 100;
            } else {
                i6 = 0;
                i7 = 0;
                z2 = false;
            }
            return d(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        }
        i3 = i4;
        z = true;
        if (z) {
        }
        return d(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
    }
}
