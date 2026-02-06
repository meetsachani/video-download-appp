package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.internal.l0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import o.QB;

/* JADX INFO: Access modifiers changed from: package-private */
@QB
/* loaded from: classes2.dex */
public final class zzn {
    public static volatile zzag e;
    public static Context g;
    public static final zzl a = new zzf(zzj.o1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final zzl b = new zzg(zzj.o1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final zzl c = new zzh(zzj.o1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final zzl d = new zzi(zzj.o1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object f = new Object();

    public static zzx a(String str, zzj zzjVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, zzjVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static zzx b(String str, boolean z, boolean z2, boolean z3) {
        return i(str, z, false, false, true);
    }

    public static zzx c(String str, boolean z, boolean z2, boolean z3) {
        return i(str, z, false, false, false);
    }

    public static /* synthetic */ String d(boolean z, String str, zzj zzjVar) throws Exception {
        String str2;
        if (!z && h(str, zzjVar, true, false).a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest b2 = AndroidUtilsLight.b(l0.e);
        Preconditions.r(b2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.a(b2.digest(zzjVar.V3())), Boolean.valueOf(z), "12451000.false");
    }

    public static synchronized void e(Context context) {
        synchronized (zzn.class) {
            if (g == null) {
                if (context != null) {
                    g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static boolean f() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                z = e.g();
            } catch (RemoteException | DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                z = false;
            }
            return z;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static boolean g() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                z = e.i();
            } catch (RemoteException | DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                z = false;
            }
            return z;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static zzx h(final String str, final zzj zzjVar, final boolean z, boolean z2) {
        try {
            j();
            Preconditions.r(g);
            try {
                if (e.a5(new zzs(str, zzjVar, z, z2), ObjectWrapper.V3(g.getPackageManager()))) {
                    return zzx.b();
                }
                return new zzv(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.d(z, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return zzx.d("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return zzx.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public static zzx i(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        zzx d2;
        zzq F6;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.r(g);
            try {
                j();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.V3(g), false, true);
                try {
                    if (z4) {
                        F6 = e.k6(zzoVar);
                    } else {
                        F6 = e.F6(zzoVar);
                    }
                    if (F6.B0()) {
                        d2 = zzx.f(F6.E0());
                    } else {
                        String m0 = F6.m0();
                        if (F6.G0() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (m0 == null) {
                            m0 = "error checking package certificate";
                        }
                        d2 = zzx.g(F6.E0(), F6.G0(), m0, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    d2 = zzx.d("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                d2 = zzx.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static void j() throws DynamiteModule.LoadingException {
        if (e != null) {
            return;
        }
        Preconditions.r(g);
        synchronized (f) {
            try {
                if (e == null) {
                    e = zzaf.g1(DynamiteModule.e(g, DynamiteModule.j, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
