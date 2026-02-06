package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public final class zzgz {
    public final Resources a;
    public final String b;

    public zzgz(Context context, @InterfaceC11300zs1 String str) {
        Preconditions.r(context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
        } else {
            this.b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @InterfaceC11300zs1
    public final String b(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
