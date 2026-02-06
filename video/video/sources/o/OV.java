package o;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import java.util.Locale;
import o.HD1;

@Deprecated
/* loaded from: classes2.dex */
public class OV {
    public static final int e = 1000;
    public final InterfaceC3921Pg0 a;
    public final TextView b;
    public final b c;
    public boolean d;

    /* loaded from: classes2.dex */
    public final class b implements HD1.g, Runnable {
        public b() {
        }

        @Override // o.HD1.g
        public void O(int i) {
            OV.this.k();
        }

        @Override // o.HD1.g
        public void R(HD1.k kVar, HD1.k kVar2, int i) {
            OV.this.k();
        }

        @Override // java.lang.Runnable
        public void run() {
            OV.this.k();
        }

        @Override // o.HD1.g
        public void w0(boolean z, int i) {
            OV.this.k();
        }
    }

    public OV(InterfaceC3921Pg0 interfaceC3921Pg0, TextView textView) {
        boolean z;
        if (interfaceC3921Pg0.h1() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.a = interfaceC3921Pg0;
        this.b = textView;
        this.c = new b();
    }

    public static String b(@InterfaceC11300zs1 IF r2) {
        if (r2 != null && r2.h()) {
            return " colr:" + r2.k();
        }
        return "";
    }

    public static String d(C8775pW c8775pW) {
        if (c8775pW == null) {
            return "";
        }
        c8775pW.c();
        return " sib:" + c8775pW.d + " sb:" + c8775pW.f + " rb:" + c8775pW.e + " db:" + c8775pW.g + " mcdb:" + c8775pW.i + " dk:" + c8775pW.j;
    }

    public static String e(float f) {
        if (f != -1.0f && f != 1.0f) {
            return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f));
        }
        return "";
    }

    public static String g(long j, int i) {
        if (i == 0) {
            return "N/A";
        }
        return String.valueOf((long) (j / i));
    }

    public String a() {
        C10833xx0 Q1 = this.a.Q1();
        C8775pW q2 = this.a.q2();
        if (Q1 != null && q2 != null) {
            return "\n" + Q1.g1 + "(id:" + Q1.X + " hz:" + Q1.u1 + " ch:" + Q1.t1 + d(q2) + C9811tl1.d;
        }
        return "";
    }

    public String c() {
        return f() + h() + a();
    }

    public String f() {
        String str;
        int X = this.a.X();
        if (X != 1) {
            if (X != 2) {
                if (X != 3) {
                    if (X != 4) {
                        str = "unknown";
                    } else {
                        str = "ended";
                    }
                } else {
                    str = "ready";
                }
            } else {
                str = "buffering";
            }
        } else {
            str = "idle";
        }
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.a.u1()), str, Integer.valueOf(this.a.c2()));
    }

    public String h() {
        C10833xx0 I0 = this.a.I0();
        C8775pW O1 = this.a.O1();
        if (I0 != null && O1 != null) {
            return "\n" + I0.g1 + "(id:" + I0.X + " r:" + I0.l1 + "x" + I0.m1 + b(I0.s1) + e(I0.p1) + d(O1) + " vfpo: " + g(O1.k, O1.l) + C9811tl1.d;
        }
        return "";
    }

    public final void i() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.l1(this.c);
        k();
    }

    public final void j() {
        if (!this.d) {
            return;
        }
        this.d = false;
        this.a.f1(this.c);
        this.b.removeCallbacks(this.c);
    }

    @SuppressLint({"SetTextI18n"})
    public final void k() {
        this.b.setText(c());
        this.b.removeCallbacks(this.c);
        this.b.postDelayed(this.c, 1000L);
    }
}
