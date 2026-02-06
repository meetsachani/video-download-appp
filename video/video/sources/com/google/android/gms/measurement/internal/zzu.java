package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import o.C9998uW1;
import o.InterfaceC10697xN2;

/* loaded from: classes3.dex */
public final class zzu {
    public final zzhf a;

    public zzu(zzhf zzhfVar) {
        this.a = zzhfVar;
    }

    @InterfaceC10697xN2
    public final void a() {
        String str;
        this.a.l().n();
        if (!d()) {
            return;
        }
        if (e()) {
            this.a.F().w.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", C9998uW1.R);
            bundle.putLong("_cc", 1L);
            this.a.H().A0("auto", "_cmpx", bundle);
        } else {
            String a = this.a.F().w.a();
            if (TextUtils.isEmpty(a)) {
                this.a.j().I().a("Cache still valid but referrer not found");
            } else {
                long a2 = ((this.a.F().x.a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(a);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", a2);
                Object obj = pair.first;
                if (obj == null) {
                    str = FirebaseMessaging.r;
                } else {
                    str = (String) obj;
                }
                this.a.H().A0(str, Constants.ScionAnalytics.l, (Bundle) pair.second);
            }
            this.a.F().w.b(null);
        }
        this.a.F().x.b(0L);
    }

    @InterfaceC10697xN2
    public final void b(String str, Bundle bundle) {
        String str2;
        this.a.l().n();
        if (!this.a.p()) {
            if (bundle != null && !bundle.isEmpty()) {
                str = (str == null || str.isEmpty()) ? "auto" : "auto";
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.F().w.b(str2);
                this.a.F().x.b(this.a.b().a());
            }
        }
    }

    public final void c() {
        if (d() && e()) {
            this.a.F().w.b(null);
        }
    }

    public final boolean d() {
        if (this.a.F().x.a() > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (!d() || this.a.b().a() - this.a.F().x.a() <= this.a.z().x(null, zzbi.V)) {
            return false;
        }
        return true;
    }
}
