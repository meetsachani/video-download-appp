package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdjn implements zzbfu {
    public final /* synthetic */ zzdkm a;
    public final /* synthetic */ ViewGroup b;

    public zzdjn(zzdkm zzdkmVar, ViewGroup viewGroup) {
        this.a = zzdkmVar;
        this.b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final JSONObject a() {
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final JSONObject b() {
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void c() {
        zzfyc zzfycVar = zzdjk.j1;
        zzdkm zzdkmVar = this.a;
        Map m = zzdkmVar.m();
        if (m != null) {
            int size = zzfycVar.size();
            int i = 0;
            while (i < size) {
                Object obj = m.get((String) zzfycVar.get(i));
                i++;
                if (obj != null) {
                    zzdkmVar.onClick(this.b);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void d(MotionEvent motionEvent) {
        this.a.onTouch(null, motionEvent);
    }
}
