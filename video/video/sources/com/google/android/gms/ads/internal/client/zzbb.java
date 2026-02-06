package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbxc;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzbb {
    public static final zzbb f = new zzbb();
    public static final /* synthetic */ int g = 0;
    public final com.google.android.gms.ads.internal.util.client.zzf a;
    public final zzaz b;
    public final String c;
    public final VersionInfoParcel d;
    public final Random e;

    public zzbb() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaz zzazVar = new zzaz(new zzk(), new zzi(), new zzfa(), new zzbic(), new zzbxc(), new zzbti(), new zzbid(), new zzl());
        String k = com.google.android.gms.ads.internal.util.client.zzf.k();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.a = zzfVar;
        this.b = zzazVar;
        this.c = k;
        this.d = versionInfoParcel;
        this.e = random;
    }

    public static zzaz a() {
        return f.b;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf b() {
        return f.a;
    }

    public static VersionInfoParcel c() {
        return f.d;
    }

    public static String d() {
        return f.c;
    }

    public static Random e() {
        return f.e;
    }
}
