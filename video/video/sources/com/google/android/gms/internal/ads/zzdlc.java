package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdlc {
    public final com.google.android.gms.ads.internal.util.zzbo a;
    public final Clock b;
    public final Executor c;

    public zzdlc(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.a = zzboVar;
        this.b = clock;
        this.c = executor;
    }

    public static /* synthetic */ Bitmap a(zzdlc zzdlcVar, double d, boolean z, zzapq zzapqVar) {
        byte[] bArr = zzapqVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdlcVar.c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q6)).intValue())) / 2);
            }
        }
        return zzdlcVar.c(bArr, options);
    }

    public final InterfaceFutureC8411o11 b(String str, final double d, final boolean z) {
        return zzgcy.m(this.a.a(str), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdlb
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return zzdlc.a(zzdlc.this, d, z, (zzapq) obj);
            }
        }, this.c);
    }

    public final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.b;
        long b = clock.b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = clock.b();
        if (decodeByteArray != null) {
            long j = b2 - b;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            com.google.android.gms.ads.internal.util.zze.k("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }
}
