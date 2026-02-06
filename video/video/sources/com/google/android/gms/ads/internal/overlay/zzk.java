package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzm c;

    public /* synthetic */ zzk(zzm zzmVar, zzl zzlVar) {
        this.c = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        zzm zzmVar = this.c;
        Bitmap a = com.google.android.gms.ads.internal.zzv.A().a(Integer.valueOf(zzmVar.Y.j1.a1));
        if (a != null) {
            com.google.android.gms.ads.internal.zzv.v();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.Y.j1;
            boolean z = zzlVar.Y0;
            float f = zzlVar.Z0;
            Activity activity = zzmVar.X;
            if (z && f > 0.0f && f <= 25.0f) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, a.getWidth(), a.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
                }
            } else {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
            }
            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    zzk.this.c.X.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
