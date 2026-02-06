package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbca;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbbt {
    public final zzbbz a;
    public final zzbca.zzt.zza b;
    public final boolean c;

    private zzbbt() {
        this.b = zzbca.zzt.Q3();
        this.c = false;
        this.a = new zzbbz();
    }

    public static zzbbt a() {
        return new zzbbt();
    }

    public final synchronized void b(zzbbs zzbbsVar) {
        if (this.c) {
            try {
                zzbbsVar.a(this.b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i) {
        if (!this.c) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r5)).booleanValue()) {
            e(i);
        } else {
            f(i);
        }
    }

    public final synchronized String d(int i) {
        zzbca.zzt.zza zzaVar;
        zzaVar = this.b;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.W(), Long.valueOf(com.google.android.gms.ads.internal.zzv.d().b()), Integer.valueOf(i - 1), Base64.encodeToString(zzaVar.V1().b1(), 3));
    }

    public final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqi.a(zzfqh.a(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.k("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.k("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                com.google.android.gms.ads.internal.util.zze.k("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.k("Could not find file for Clearcut");
        }
    }

    public final synchronized void f(int i) {
        zzbca.zzt.zza zzaVar = this.b;
        zzaVar.J2();
        zzaVar.C2(com.google.android.gms.ads.internal.util.zzs.J());
        zzbbx zzbbxVar = new zzbbx(this.a, zzaVar.V1().b1(), null);
        int i2 = i - 1;
        zzbbxVar.a(i2);
        zzbbxVar.c();
        com.google.android.gms.ads.internal.util.zze.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public zzbbt(zzbbz zzbbzVar) {
        this.b = zzbca.zzt.Q3();
        this.a = zzbbzVar;
        this.c = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q5)).booleanValue();
    }
}
