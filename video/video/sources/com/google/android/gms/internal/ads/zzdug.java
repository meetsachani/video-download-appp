package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdug extends zzblx {
    public final /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzfhc Y0;
    public final /* synthetic */ long Z;
    public final /* synthetic */ zzcaf Z0;
    public final /* synthetic */ zzduh a1;

    public zzdug(zzduh zzduhVar, Object obj, String str, long j, zzfhc zzfhcVar, zzcaf zzcafVar) {
        this.X = obj;
        this.Y = str;
        this.Z = j;
        this.Y0 = zzfhcVar;
        this.Z0 = zzcafVar;
        this.a1 = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void e() {
        zzdso zzdsoVar;
        zzdcx zzdcxVar;
        zzfhq zzfhqVar;
        synchronized (this.X) {
            zzduh zzduhVar = this.a1;
            String str = this.Y;
            zzduhVar.v(str, true, "", (int) (com.google.android.gms.ads.internal.zzv.d().b() - this.Z));
            zzdsoVar = zzduhVar.l;
            zzdsoVar.d(str);
            zzdcxVar = zzduhVar.f272o;
            zzdcxVar.p0(str);
            zzfhqVar = zzduhVar.p;
            zzfhc zzfhcVar = this.Y0;
            zzfhcVar.c(true);
            zzfhqVar.c(zzfhcVar.m());
            this.Z0.c(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void u(String str) {
        zzdso zzdsoVar;
        zzdcx zzdcxVar;
        zzfhq zzfhqVar;
        synchronized (this.X) {
            zzduh zzduhVar = this.a1;
            String str2 = this.Y;
            zzduhVar.v(str2, false, str, (int) (com.google.android.gms.ads.internal.zzv.d().b() - this.Z));
            zzdsoVar = zzduhVar.l;
            zzdsoVar.b(str2, "error");
            zzdcxVar = zzduhVar.f272o;
            zzdcxVar.u(str2, "error");
            zzfhqVar = zzduhVar.p;
            zzfhc zzfhcVar = this.Y0;
            zzfhcVar.Q(str);
            zzfhcVar.c(false);
            zzfhqVar.c(zzfhcVar.m());
            this.Z0.c(Boolean.FALSE);
        }
    }
}
