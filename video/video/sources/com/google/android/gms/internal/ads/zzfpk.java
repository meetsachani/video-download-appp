package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfpk {
    public final File a;
    @InterfaceC5056aJ2
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public zzfpk(@InterfaceC5670cr1 Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpl.a(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpl.a(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@InterfaceC5670cr1 zzayg zzaygVar, @InterfaceC11300zs1 zzfpq zzfpqVar) {
        boolean z;
        zzayj b;
        zzayj b2;
        String A2 = zzaygVar.u2().A2();
        byte[] d = zzaygVar.w2().d();
        byte[] d2 = zzaygVar.v2().d();
        if (!TextUtils.isEmpty(A2) && d2 != null && d2.length != 0) {
            File file = this.b;
            zzfpl.d(file);
            file.mkdirs();
            zzfpl.c(A2, file).mkdirs();
            File b3 = zzfpl.b(A2, "pcam.jar", file);
            if ((d == null || d.length <= 0 || zzfpl.e(b3, d)) && zzfpl.e(zzfpl.b(A2, "pcbc", file), d2)) {
                File b4 = zzfpl.b(zzaygVar.u2().A2(), "pcam.jar", file);
                if (b4.exists() && zzfpqVar != null && !zzfpqVar.a(b4)) {
                    return false;
                }
                String A22 = zzaygVar.u2().A2();
                if (!TextUtils.isEmpty(A22)) {
                    File b5 = zzfpl.b(A22, "pcam.jar", file);
                    File b6 = zzfpl.b(A22, "pcbc", file);
                    File b7 = zzfpl.b(A22, "pcam.jar", d());
                    File b8 = zzfpl.b(A22, "pcbc", d());
                    if ((!b5.exists() || b5.renameTo(b7)) && b6.exists() && b6.renameTo(b8)) {
                        zzayh u2 = zzayj.u2();
                        u2.c2(zzaygVar.u2().A2());
                        u2.Y1(zzaygVar.u2().z2());
                        u2.Z1(zzaygVar.u2().s2());
                        u2.b2(zzaygVar.u2().c());
                        u2.a2(zzaygVar.u2().t2());
                        zzayj zzayjVar = (zzayj) u2.V1();
                        zzayj b9 = b(1);
                        SharedPreferences.Editor edit = this.c.edit();
                        if (b9 != null && !zzayjVar.A2().equals(b9.A2())) {
                            edit.putString(e(), Hex.a(b9.b1()));
                        }
                        edit.putString(f(), Hex.a(zzayjVar.b1()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            b = b(1);
                            if (b != null) {
                                hashSet.add(b.A2());
                            }
                            b2 = b(2);
                            if (b2 != null) {
                                hashSet.add(b2.A2());
                            }
                            for (File file2 : d().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    zzfpl.d(zzfpl.c(name, d()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                b = b(1);
                if (b != null) {
                }
                b2 = b(2);
                if (b2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public final zzayj b(int i) {
        String string;
        if (i == 1) {
            string = this.c.getString(f(), null);
        } else {
            string = this.c.getString(e(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] d = Hex.d(string);
            zzgxk zzgxkVar = zzgxk.Y;
            zzayj x2 = zzayj.x2(zzgxk.U(d, 0, d.length));
            String A2 = x2.A2();
            File b = zzfpl.b(A2, "pcam.jar", d());
            if (!b.exists()) {
                b = zzfpl.b(A2, "pcam", d());
            }
            File b2 = zzfpl.b(A2, "pcbc", d());
            if (b.exists()) {
                if (b2.exists()) {
                    return x2;
                }
            }
        } catch (zzgzh unused) {
        }
        return null;
    }

    @InterfaceC11300zs1
    public final zzfpj c(int i) {
        zzayj b = b(1);
        if (b == null) {
            return null;
        }
        String A2 = b.A2();
        File b2 = zzfpl.b(A2, "pcam.jar", d());
        if (!b2.exists()) {
            b2 = zzfpl.b(A2, "pcam", d());
        }
        return new zzfpj(b, b2, zzfpl.b(A2, "pcbc", d()), zzfpl.b(A2, "pcopt", d()));
    }

    public final File d() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }
}
