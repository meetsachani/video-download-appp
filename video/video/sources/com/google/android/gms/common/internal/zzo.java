package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzo {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public zzo(ComponentName componentName, int i) {
        this.a = null;
        this.b = null;
        Preconditions.r(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    @InterfaceC11300zs1
    public final ComponentName a() {
        return this.c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.a != null) {
            Intent intent = null;
            if (this.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.a);
                try {
                    bundle = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
                }
            }
            if (intent == null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return intent;
        }
        return new Intent().setComponent(this.c);
    }

    @InterfaceC11300zs1
    public final String c() {
        return this.b;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        if (Objects.b(this.a, zzoVar.a) && Objects.b(this.b, zzoVar.b) && Objects.b(this.c, zzoVar.c) && this.e == zzoVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.c(this.a, this.b, this.c, 4225, Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str == null) {
            Preconditions.r(this.c);
            return this.c.flattenToString();
        }
        return str;
    }

    public zzo(String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(String str, String str2, int i, boolean z) {
        Preconditions.l(str);
        this.a = str;
        Preconditions.l(str2);
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
    }
}
