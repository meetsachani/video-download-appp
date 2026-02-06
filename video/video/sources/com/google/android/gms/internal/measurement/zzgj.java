package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import o.AbstractC4468Uv1;
import o.C4500Ve2;
import o.C9654t62;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public final class zzgj {

    /* loaded from: classes3.dex */
    public static class zza {
        public static volatile AbstractC4468Uv1<zzgh> a;

        private zza() {
        }

        public static AbstractC4468Uv1<zzgh> a(Context context) {
            AbstractC4468Uv1<zzgh> abstractC4468Uv1;
            AbstractC4468Uv1<zzgh> c;
            synchronized (zza.class) {
                try {
                    abstractC4468Uv1 = a;
                    if (abstractC4468Uv1 == null) {
                        new zzgj();
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            c = AbstractC4468Uv1.a();
                            abstractC4468Uv1 = c;
                            a = abstractC4468Uv1;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            c = AbstractC4468Uv1.a();
                            abstractC4468Uv1 = c;
                            a = abstractC4468Uv1;
                        }
                        if (zzfw.a() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        c = zzgj.c(context);
                        abstractC4468Uv1 = c;
                        a = abstractC4468Uv1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return abstractC4468Uv1;
        }
    }

    public static zzgh a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            C9654t62 c9654t62 = new C9654t62();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(C4500Ve2.b, 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String b = b(split[0]);
                        String decode = Uri.decode(b(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String b2 = b(split[2]);
                            str = Uri.decode(b2);
                            if (str.length() < 1024 || str == b2) {
                                hashMap.put(b2, str);
                            }
                        }
                        if (!c9654t62.containsKey(b)) {
                            c9654t62.put(b, new C9654t62());
                        }
                        ((C9654t62) c9654t62.get(b)).put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    zzgc zzgcVar = new zzgc(c9654t62);
                    bufferedReader.close();
                    return zzgcVar;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String b(String str) {
        return new String(str);
    }

    @InterfaceC5056aJ2
    public static AbstractC4468Uv1<zzgh> c(Context context) {
        AbstractC4468Uv1<zzgh> a;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC4468Uv1<File> d = d(context);
            if (d.e()) {
                a = AbstractC4468Uv1.f(a(context, d.d()));
            } else {
                a = AbstractC4468Uv1.a();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static AbstractC4468Uv1<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return AbstractC4468Uv1.f(file);
            }
            return AbstractC4468Uv1.a();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return AbstractC4468Uv1.a();
        }
    }
}
