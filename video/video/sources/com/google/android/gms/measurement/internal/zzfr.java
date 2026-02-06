package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoc;
import o.C6566gU0;
import o.InterfaceC5056aJ2;
import o.InterfaceC8557od0;
import o.InterfaceC8710pF0;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzfr extends zzic {
    public char c;
    public long d;
    @InterfaceC8710pF0("this")
    public String e;
    public final zzft f;
    public final zzft g;
    public final zzft h;
    public final zzft i;
    public final zzft j;
    public final zzft k;
    public final zzft l;
    public final zzft m;
    public final zzft n;

    public zzfr(zzhf zzhfVar) {
        super(zzhfVar);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new zzft(this, 6, false, false);
        this.g = new zzft(this, 6, true, false);
        this.h = new zzft(this, 6, false, true);
        this.i = new zzft(this, 5, false, false);
        this.j = new zzft(this, 5, true, false);
        this.k = new zzft(this, 5, false, true);
        this.l = new zzft(this, 4, false, false);
        this.m = new zzft(this, 3, false, false);
        this.n = new zzft(this, 2, false, false);
    }

    @InterfaceC5056aJ2
    public static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            if (zzoc.a() && zzbi.H0.a(null).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new zzfw(str);
    }

    @InterfaceC5056aJ2
    public static String w(boolean z, Object obj) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb = new StringBuilder(th);
                String E = E(zzhf.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof zzfw) {
                return zzfw.a((zzfw) obj);
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    public static String x(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String w = w(z, obj);
        String w2 = w(z, obj2);
        String w3 = w(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        boolean isEmpty = TextUtils.isEmpty(w);
        String str3 = C6566gU0.h;
        if (!isEmpty) {
            sb.append(str2);
            sb.append(w);
            str2 = C6566gU0.h;
        }
        if (!TextUtils.isEmpty(w2)) {
            sb.append(str2);
            sb.append(w2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(w3)) {
            sb.append(str3);
            sb.append(w3);
        }
        return sb.toString();
    }

    @InterfaceC5056aJ2
    public final boolean C(int i) {
        return Log.isLoggable(P(), i);
    }

    public final zzft F() {
        return this.m;
    }

    public final zzft G() {
        return this.f;
    }

    public final zzft H() {
        return this.h;
    }

    public final zzft I() {
        return this.g;
    }

    public final zzft J() {
        return this.l;
    }

    public final zzft K() {
        return this.n;
    }

    public final zzft L() {
        return this.i;
    }

    public final zzft M() {
        return this.k;
    }

    public final zzft N() {
        return this.j;
    }

    public final String O() {
        Pair<String, Long> a;
        if (h().d == null || (a = h().d.a()) == null || a == zzgd.z) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        return valueOf + ":" + ((String) a.first);
    }

    @InterfaceC5056aJ2
    @InterfaceC8557od0({"logTagDoNotUseDirectly"})
    public final String P() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.e == null) {
                    if (this.a.O() != null) {
                        str2 = this.a.O();
                    } else {
                        str2 = "FA";
                    }
                    this.e = str2;
                }
                Preconditions.r(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean s() {
        return false;
    }

    @InterfaceC5056aJ2
    public final void y(int i, String str) {
        Log.println(i, P(), str);
    }

    public final void z(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && C(i)) {
            y(i, x(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Preconditions.r(str);
            zzgy G = this.a.G();
            if (G == null) {
                y(6, "Scheduler not set. Not logging error/warn");
            } else if (!G.r()) {
                y(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i = 8;
                }
                G.D(new zzfu(this, i, str, obj, obj2, obj3));
            }
        }
    }
}
