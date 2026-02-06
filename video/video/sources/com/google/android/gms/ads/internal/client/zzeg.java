package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzeg {
    public String g;
    public String i;
    public String j;
    public boolean l;
    public String m;
    public final HashSet a = new HashSet();
    public final Bundle b = new Bundle();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final List h = new ArrayList();
    public int k = -1;
    public int n = 60000;

    public final void A(int i) {
        this.n = i;
    }

    @Deprecated
    public final void B(boolean z) {
        this.l = z;
    }

    public final void C(List list) {
        List list2 = this.h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void D(Bundle bundle) {
        this.b.putAll(bundle);
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void b(String str) {
        this.j = str;
    }

    @Deprecated
    public final void c(boolean z) {
        this.k = z ? 1 : 0;
    }

    public final void r(String str) {
        this.f.add(str);
    }

    public final void s(Class cls, Bundle bundle) {
        Bundle bundle2 = this.b;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.r(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void t(String str, String str2) {
        this.e.putString(str, str2);
    }

    public final void u(String str) {
        this.a.add(str);
    }

    public final void v(Class cls, @InterfaceC11300zs1 Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    public final void w(String str) {
        this.d.add(str);
    }

    public final void x(String str) {
        this.d.remove(AdRequest.k);
    }

    public final void y(String str) {
        this.m = str;
    }

    public final void z(String str) {
        this.g = str;
    }
}
