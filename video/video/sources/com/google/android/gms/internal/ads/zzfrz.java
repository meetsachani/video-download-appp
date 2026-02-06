package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzfrz {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    @InterfaceC10571ws1
    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, c(intent, 201326592, 0), 201326592);
    }

    @InterfaceC10571ws1
    public static PendingIntent b(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getService(context, 0, c(intent, 1140850688, 0), 1140850688);
    }

    public static Intent c(Intent intent, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 88) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.f(z, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i & 1) == 0 || d(0, 3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfvc.f(z2, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i & 2) == 0 || d(0, 5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzfvc.f(z3, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i & 4) == 0 || d(0, 9)) {
            z4 = true;
        } else {
            z4 = false;
        }
        zzfvc.f(z4, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i & 128) == 0 || d(0, 17)) {
            z5 = true;
        } else {
            z5 = false;
        }
        zzfvc.f(z5, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        zzfvc.f(z6, "Must set component on Intent.");
        if (d(0, 1)) {
            zzfvc.f(!d(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            zzfvc.f(d(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!d(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static boolean d(int i, int i2) {
        return (i & i2) == i2;
    }
}
