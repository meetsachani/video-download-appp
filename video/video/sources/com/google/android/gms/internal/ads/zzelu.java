package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.b;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzelu implements zzetu {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzr b;
    public final List c;

    public zzelu(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, List list) {
        this.a = context;
        this.b = zzrVar;
        this.c = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!((Boolean) zzbey.a.e()).booleanValue()) {
            return;
        }
        Bundle bundle = new Bundle();
        com.google.android.gms.ads.internal.zzv.v();
        String str = null;
        try {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService(b.r);
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                componentName = runningTaskInfo.topActivity;
                if (componentName != null) {
                    componentName2 = runningTaskInfo.topActivity;
                    str = componentName2.getClassName();
                }
            }
        } catch (Exception unused) {
        }
        bundle.putString(b.r, str);
        Bundle bundle2 = new Bundle();
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.b;
        bundle2.putInt("width", zzrVar.Z0);
        bundle2.putInt("height", zzrVar.Y);
        bundle.putBundle("size", bundle2);
        List list = this.c;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
        zzcuvVar.a.putBundle("view_hierarchy", bundle);
    }
}
