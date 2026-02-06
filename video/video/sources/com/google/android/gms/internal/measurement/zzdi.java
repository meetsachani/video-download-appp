package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdi extends zzdf.zza {
    public final /* synthetic */ String Z0;
    public final /* synthetic */ String a1;
    public final /* synthetic */ Context b1;
    public final /* synthetic */ Bundle c1;
    public final /* synthetic */ zzdf d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdfVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdfVar);
        this.d1 = zzdfVar;
        this.Z0 = str;
        this.a1 = str2;
        this.b1 = context;
        this.c1 = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        boolean P;
        String str;
        String str2;
        String str3;
        zzcu zzcuVar;
        boolean z;
        zzcu zzcuVar2;
        String str4;
        String str5;
        try {
            P = this.d1.P(this.Z0, this.a1);
            if (P) {
                String str6 = this.a1;
                String str7 = this.Z0;
                str5 = this.d1.a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.r(this.b1);
            zzdf zzdfVar = this.d1;
            zzdfVar.i = zzdfVar.d(this.b1, true);
            zzcuVar = this.d1.i;
            if (zzcuVar == null) {
                str4 = this.d1.a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.a(this.b1, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.c(this.b1, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, c);
            if (c < a) {
                z = true;
            } else {
                z = false;
            }
            zzdd zzddVar = new zzdd(82001L, max, z, str, str2, str3, this.c1, com.google.android.gms.measurement.internal.zzgz.a(this.b1));
            zzcuVar2 = this.d1.i;
            ((zzcu) Preconditions.r(zzcuVar2)).initialize(ObjectWrapper.V3(this.b1), zzddVar, this.X);
        } catch (Exception e) {
            this.d1.v(e, true, false);
        }
    }
}
