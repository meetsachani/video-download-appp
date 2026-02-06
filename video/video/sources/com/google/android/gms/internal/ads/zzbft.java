package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbft extends zzbgf {
    public final Drawable X;
    public final Uri Y;
    public final int Y0;
    public final double Z;
    public final int Z0;

    public zzbft(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.X = drawable;
        this.Y = uri;
        this.Z = d;
        this.Y0 = i;
        this.Z0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final double b() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final int c() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final Uri d() throws RemoteException {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final IObjectWrapper e() throws RemoteException {
        return ObjectWrapper.V3(this.X);
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final int f() {
        return this.Y0;
    }
}
