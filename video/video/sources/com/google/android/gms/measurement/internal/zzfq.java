package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o.C6566gU0;
import o.C9811tl1;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class zzfq {
    public static final AtomicReference<String[]> b = new AtomicReference<>();
    public static final AtomicReference<String[]> c = new AtomicReference<>();
    public static final AtomicReference<String[]> d = new AtomicReference<>();
    public final zzfp a;

    public zzfq(zzfp zzfpVar) {
        this.a = zzfpVar;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        Preconditions.r(strArr);
        Preconditions.r(strArr2);
        Preconditions.r(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || (str != null && str.equals(str3))) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + C9811tl1.c + strArr[i] + C9811tl1.d;
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(C6566gU0.h);
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = e(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String b(zzbg zzbgVar) {
        String str = null;
        if (zzbgVar == null) {
            return null;
        }
        if (!this.a.a()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzbgVar.Z);
        sb.append(",name=");
        sb.append(c(zzbgVar.X));
        sb.append(",params=");
        zzbb zzbbVar = zzbgVar.Y;
        if (zzbbVar != null) {
            if (!this.a.a()) {
                str = zzbbVar.toString();
            } else {
                str = a(zzbbVar.G0());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        return d(str, zzii.c, zzii.a, b);
    }

    public final String e(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C6566gU0.f);
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(C6566gU0.h);
                }
                sb.append(valueOf);
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        return d(str, zzik.b, zzik.a, c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id" + C9811tl1.c + str + C9811tl1.d;
        }
        return d(str, zzij.b, zzij.a, d);
    }
}
