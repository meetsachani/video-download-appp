package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfpr {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final zzfoy d;
    public boolean e;

    public zzfpr(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 int i, @InterfaceC5670cr1 zzfoy zzfoyVar, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = zzfoyVar;
        this.e = z;
    }

    public static String f(@InterfaceC5670cr1 zzayg zzaygVar) {
        zzayh u2 = zzayj.u2();
        u2.c2(zzaygVar.u2().A2());
        u2.Y1(zzaygVar.u2().z2());
        u2.Z1(zzaygVar.u2().s2());
        u2.b2(zzaygVar.u2().c());
        u2.a2(zzaygVar.u2().t2());
        return Hex.a(((zzayj) u2.V1()).b1());
    }

    public final boolean a(@InterfaceC5670cr1 zzayg zzaygVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                if (!zzfpl.e(new File(e(zzaygVar.u2().A2()), "pcbc"), zzaygVar.v2().d())) {
                    i(4020, currentTimeMillis);
                    return false;
                }
                String f2 = f(zzaygVar);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(h(), f2);
                boolean commit = edit.commit();
                if (commit) {
                    i(5015, currentTimeMillis);
                } else {
                    i(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(@InterfaceC5670cr1 zzayg zzaygVar, @InterfaceC11300zs1 zzfpq zzfpqVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                zzayj k = k(1);
                String A2 = zzaygVar.u2().A2();
                if (k != null && k.A2().equals(A2)) {
                    i(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = e(A2);
                if (e.exists()) {
                    String str = "1";
                    if (true != e.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != e.isFile()) {
                        str2 = "0";
                    }
                    j(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    String str3 = "1";
                    if (true != e.canWrite()) {
                        str3 = "0";
                    }
                    j(4024, currentTimeMillis2, "cw:".concat(str3));
                    i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = e(A2);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!zzfpl.e(file, zzaygVar.w2().d())) {
                    i(4016, currentTimeMillis);
                    return false;
                } else if (!zzfpl.e(file2, zzaygVar.v2().d())) {
                    i(4017, currentTimeMillis);
                    return false;
                } else if (zzfpqVar != null && !zzfpqVar.a(file)) {
                    i(4018, currentTimeMillis);
                    zzfpl.d(e2);
                    return false;
                } else {
                    String f2 = f(zzaygVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    SharedPreferences sharedPreferences = this.b;
                    String string = sharedPreferences.getString(h(), null);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(h(), f2);
                    if (string != null) {
                        edit.putString(g(), string);
                    }
                    if (!edit.commit()) {
                        i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    zzayj k2 = k(1);
                    if (k2 != null) {
                        hashSet.add(k2.A2());
                    }
                    zzayj k3 = k(2);
                    if (k3 != null) {
                        hashSet.add(k3.A2());
                    }
                    for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            zzfpl.d(file3);
                        }
                    }
                    i(5014, currentTimeMillis);
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public final zzfpj c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                zzayj k = k(1);
                if (k == null) {
                    i(4022, currentTimeMillis);
                    return null;
                }
                File e = e(k.A2());
                File file = new File(e, "pcam.jar");
                if (!file.exists()) {
                    file = new File(e, "pcam");
                }
                File file2 = new File(e, "pcbc");
                File file3 = new File(e, "pcopt");
                i(5016, currentTimeMillis);
                return new zzfpj(k, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            try {
                zzayj k = k(1);
                if (k == null) {
                    i(4025, currentTimeMillis);
                    return false;
                }
                File e = e(k.A2());
                if (!new File(e, "pcam.jar").exists()) {
                    i(4026, currentTimeMillis);
                    return false;
                } else if (!new File(e, "pcbc").exists()) {
                    i(4027, currentTimeMillis);
                    return false;
                } else {
                    i(5019, currentTimeMillis);
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final File e(@InterfaceC5670cr1 String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final String g() {
        return "FBAMTD".concat(String.valueOf(this.c));
    }

    public final String h() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    public final void i(int i, long j) {
        this.d.b(i, j);
    }

    public final void j(int i, long j, String str) {
        this.d.a(i, j, str);
    }

    @InterfaceC11300zs1
    public final zzayj k(int i) {
        String string;
        zzgyc b;
        if (i == 1) {
            string = this.b.getString(h(), null);
        } else {
            string = this.b.getString(g(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] d = Hex.d(string);
            zzgxk zzgxkVar = zzgxk.Y;
            zzgxk U = zzgxk.U(d, 0, d.length);
            if (this.e) {
                b = zzgyc.a();
            } else {
                b = zzgyc.b();
            }
            return zzayj.y2(U, b);
        } catch (zzgzh unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, currentTimeMillis);
            return null;
        }
    }
}
