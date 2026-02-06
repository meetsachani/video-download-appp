package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class StringResourceValueReader {
    public final Resources a;
    public final String b;

    public StringResourceValueReader(@InterfaceC5670cr1 Context context) {
        Preconditions.r(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.a);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String a(@InterfaceC5670cr1 String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
