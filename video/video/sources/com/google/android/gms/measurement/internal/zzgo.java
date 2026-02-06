package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
final class zzgo implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzby X;
    public final /* synthetic */ ServiceConnection Y;
    public final /* synthetic */ zzgl Z;

    public zzgo(zzgl zzglVar, com.google.android.gms.internal.measurement.zzby zzbyVar, ServiceConnection serviceConnection) {
        this.Z = zzglVar;
        this.X = zzbyVar;
        this.Y = serviceConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        long j;
        boolean z;
        Bundle C;
        zzgl zzglVar = this.Z;
        zzgm zzgmVar = zzglVar.Y;
        str = zzglVar.X;
        com.google.android.gms.internal.measurement.zzby zzbyVar = this.X;
        ServiceConnection serviceConnection = this.Y;
        Bundle a = zzgmVar.a(str, zzbyVar);
        zzgmVar.a.l().n();
        zzgmVar.a.Q();
        if (a != null) {
            long j2 = a.getLong(ReferrerDetails.d, 0L) * 1000;
            if (j2 == 0) {
                zzgmVar.a.j().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString(ReferrerDetails.b);
                if (string != null && !string.isEmpty()) {
                    zzgmVar.a.j().K().b("InstallReferrer API result", string);
                    zznd L = zzgmVar.a.L();
                    Uri parse = Uri.parse("?" + string);
                    boolean z2 = false;
                    if (zzpy.a()) {
                        j = 1000;
                        if (zzgmVar.a.z().s(zzbi.F0)) {
                            z = true;
                            if (zzoi.a() && zzgmVar.a.z().s(zzbi.a1)) {
                                z2 = true;
                            }
                            C = L.C(parse, z, z2);
                            if (C != null) {
                                zzgmVar.a.j().G().a("No campaign params defined in Install Referrer result");
                            } else {
                                String string2 = C.getString("medium");
                                if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                    long j3 = a.getLong(ReferrerDetails.c, 0L) * j;
                                    if (j3 == 0) {
                                        zzgmVar.a.j().G().a("Install Referrer is missing click timestamp for ad campaign");
                                    } else {
                                        C.putLong("click_timestamp", j3);
                                    }
                                }
                                if (j2 == zzgmVar.a.F().f.a()) {
                                    zzgmVar.a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (zzgmVar.a.p()) {
                                    zzgmVar.a.F().f.b(j2);
                                    zzgmVar.a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    C.putString("_cis", "referrer API v2");
                                    zzgmVar.a.H().Z("auto", Constants.ScionAnalytics.l, C, str);
                                }
                            }
                        }
                    } else {
                        j = 1000;
                    }
                    z = false;
                    if (zzoi.a()) {
                        z2 = true;
                    }
                    C = L.C(parse, z, z2);
                    if (C != null) {
                    }
                } else {
                    zzgmVar.a.j().G().a("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.b().c(zzgmVar.a.a(), serviceConnection);
        }
    }
}
