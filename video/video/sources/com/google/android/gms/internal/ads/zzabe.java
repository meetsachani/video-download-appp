package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzabe implements zzca {
    public final zzby a;

    public zzabe(zzby zzbyVar) {
        this.a = zzbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzca
    public final zzcc a(Context context, zzk zzkVar, zzn zznVar, zzcb zzcbVar, Executor executor, zzbv zzbvVar, List list, long j, boolean z) {
        try {
            return ((zzca) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzby.class).newInstance(this.a)).a(context, zzkVar, zznVar, zzcbVar, executor, zzbvVar, list, 0L, false);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
