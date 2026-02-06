package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: o.qC1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8942qC1 {
    public final Context a;
    public final int b;
    public final Intent c;
    public final int d;
    public final Bundle e;
    public final PendingIntent f;
    public final boolean g;

    public C8942qC1(Context context, int i, Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    public final PendingIntent a() {
        Bundle bundle = this.e;
        if (bundle == null) {
            return C9191rC1.e(this.a, this.b, this.c, this.d, this.g);
        }
        return C9191rC1.d(this.a, this.b, this.c, this.d, bundle, this.g);
    }

    public Context b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public Intent d() {
        return this.c;
    }

    public Bundle e() {
        return this.e;
    }

    public PendingIntent f() {
        return this.f;
    }

    public int g() {
        return this.b;
    }

    public boolean h() {
        return this.g;
    }

    public C8942qC1(Context context, int i, Intent intent, int i2, Bundle bundle, boolean z) {
        this.a = context;
        this.b = i;
        this.c = intent;
        this.d = i2;
        this.e = bundle;
        this.g = z;
        this.f = a();
    }
}
