package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes3.dex */
public final class zzio {
    public final Context a;
    @InterfaceC11300zs1
    public String b;
    @InterfaceC11300zs1
    public String c;
    @InterfaceC11300zs1
    public String d;
    @InterfaceC11300zs1
    public Boolean e;
    public long f;
    @InterfaceC11300zs1
    public com.google.android.gms.internal.measurement.zzdd g;
    public boolean h;
    @InterfaceC11300zs1
    public Long i;
    @InterfaceC11300zs1
    public String j;

    @InterfaceC5056aJ2
    public zzio(Context context, @InterfaceC11300zs1 com.google.android.gms.internal.measurement.zzdd zzddVar, @InterfaceC11300zs1 Long l) {
        this.h = true;
        Preconditions.r(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.r(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzddVar != null) {
            this.g = zzddVar;
            this.b = zzddVar.a1;
            this.c = zzddVar.Z0;
            this.d = zzddVar.Y0;
            this.h = zzddVar.Z;
            this.f = zzddVar.Y;
            this.j = zzddVar.c1;
            Bundle bundle = zzddVar.b1;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
