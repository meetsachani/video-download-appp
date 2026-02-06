package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzesp implements zzetv {
    public final Context a;
    public final zzgdj b;
    public final zzfcp c;
    public final VersionInfoParcel d;

    public zzesp(Context context, zzgdj zzgdjVar, zzfcp zzfcpVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = zzgdjVar;
        this.c = zzfcpVar;
        this.d = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.o3)).booleanValue() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.q3)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        r1 = com.google.android.gms.internal.ads.zzfrt.k(r0).i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.z3)).longValue(), com.google.android.gms.ads.internal.zzv.t().j().M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.p3)).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.r3)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
        r4 = com.google.android.gms.internal.ads.zzfru.j(r0);
        r0 = com.google.android.gms.internal.ads.zzfrq.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
        if (r9.d.Z < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.v3)).intValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
        r2 = r4.i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.A3)).longValue(), com.google.android.gms.ads.internal.zzv.t().j().M());
        r3 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
        r6 = r0.e();
        r4 = r2;
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ zzesq c(zzesp zzespVar) {
        try {
            Context context = zzespVar.a;
            boolean a = zzespVar.c.a();
            zzfrp zzfrpVar = new zzfrp();
            zzfrp zzfrpVar2 = new zzfrp();
            boolean z = true;
            if (a) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s3)).booleanValue()) {
                    return new zzesq(true);
                }
            }
            if (!a) {
            }
            if (a) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w3)).booleanValue()) {
                if (zzespVar.d.Z < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v3)).intValue()) {
                    zzfru.j(context).k();
                }
            }
            if (!a) {
            }
            if (a) {
            }
            zzfrp zzfrpVar3 = zzfrpVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzesq(zzfrpVar, zzfrpVar3, z2, z3, a);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "PerAppIdSignal");
            return new zzesq(zzespVar.c.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.b.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeso
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesp.c(zzesp.this);
            }
        });
    }
}
