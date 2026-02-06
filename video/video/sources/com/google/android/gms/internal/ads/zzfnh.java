package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfnh implements zzfmi {
    public static final zzfnh i = new zzfnh();
    public static final Handler j = new Handler(Looper.getMainLooper());
    public static Handler k = null;
    public static final Runnable l = new zzfnd();
    public static final Runnable m = new zzfne();
    public int b;
    public long h;
    public final List a = new ArrayList();
    public boolean c = false;
    public final List d = new ArrayList();
    public final zzfna f = new zzfna();
    public final zzfmk e = new zzfmk();
    public final zzfnb g = new zzfnb(new zzfnk());

    public static zzfnh d() {
        return i;
    }

    public static /* bridge */ /* synthetic */ void g(zzfnh zzfnhVar) {
        zzfnh zzfnhVar2;
        zzfnhVar.b = 0;
        zzfnhVar.d.clear();
        zzfnhVar.c = false;
        for (zzflf zzflfVar : zzflx.a().b()) {
        }
        zzfnhVar.h = System.nanoTime();
        zzfna zzfnaVar = zzfnhVar.f;
        zzfnaVar.i();
        long nanoTime = System.nanoTime();
        zzfmk zzfmkVar = zzfnhVar.e;
        zzfmj a = zzfmkVar.a();
        if (zzfnaVar.e().size() > 0) {
            Iterator it = zzfnaVar.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a2 = a.a(null);
                View a3 = zzfnaVar.a(str);
                zzfmj b = zzfmkVar.b();
                String c = zzfnaVar.c(str);
                if (c != null) {
                    JSONObject a4 = b.a(a3);
                    zzfmt.b(a4, str);
                    try {
                        a4.put("notVisibleReason", c);
                    } catch (JSONException e) {
                        zzfmu.a("Error with setting not visible reason", e);
                    }
                    zzfmt.c(a2, a4);
                }
                zzfmt.f(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfnhVar.g.c(a2, hashSet, nanoTime);
            }
        }
        zzfna zzfnaVar2 = zzfnhVar.f;
        if (zzfnaVar2.f().size() > 0) {
            JSONObject a5 = a.a(null);
            zzfnhVar2 = zzfnhVar;
            zzfnhVar2.k(null, a, a5, 1, false);
            zzfmt.f(a5);
            zzfnhVar2.g.d(a5, zzfnaVar2.f(), nanoTime);
        } else {
            zzfnhVar2 = zzfnhVar;
            zzfnhVar2.g.b();
        }
        zzfnaVar2.g();
        long nanoTime2 = System.nanoTime() - zzfnhVar2.h;
        List<zzfng> list = zzfnhVar2.a;
        if (list.size() > 0) {
            for (zzfng zzfngVar : list) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfngVar.b();
                if (zzfngVar instanceof zzfnf) {
                    ((zzfnf) zzfngVar).a();
                }
            }
        }
        zzfmh.a().c();
    }

    public static final void l() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final void a(View view, zzfmj zzfmjVar, JSONObject jSONObject, boolean z) {
        zzfna zzfnaVar;
        int l2;
        boolean z2;
        zzfnh zzfnhVar;
        View view2;
        zzfmj zzfmjVar2;
        boolean z3;
        if (zzfmy.a(view) == null && (l2 = (zzfnaVar = this.f).l(view)) != 3) {
            JSONObject a = zzfmjVar.a(view);
            zzfmt.c(jSONObject, a);
            String d = zzfnaVar.d(view);
            if (d != null) {
                zzfmt.b(a, d);
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(this.f.k(view)));
                } catch (JSONException e) {
                    zzfmu.a("Error with setting has window focus", e);
                }
                boolean j2 = this.f.j(d);
                Boolean valueOf = Boolean.valueOf(j2);
                if (j2) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException e2) {
                        zzfmu.a("Error with setting is picture-in-picture active", e2);
                    }
                }
                this.f.h();
                zzfnhVar = this;
            } else {
                zzfmz b = zzfnaVar.b(view);
                if (b != null) {
                    zzfma a2 = b.a();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList b2 = b.b();
                    int size = b2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        jSONArray.put((String) b2.get(i2));
                    }
                    try {
                        a.put("isFriendlyObstructionFor", jSONArray);
                        a.put("friendlyObstructionClass", a2.d());
                        a.put("friendlyObstructionPurpose", a2.a());
                        a.put("friendlyObstructionReason", a2.c());
                    } catch (JSONException e3) {
                        zzfmu.a("Error with setting friendly obstruction", e3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    zzfnhVar = this;
                    view2 = view;
                    zzfmjVar2 = zzfmjVar;
                    z3 = true;
                } else {
                    view2 = view;
                    zzfmjVar2 = zzfmjVar;
                    z3 = false;
                    zzfnhVar = this;
                }
                zzfnhVar.k(view2, zzfmjVar2, a, l2, z3);
            }
            zzfnhVar.b++;
        }
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    public final void j() {
        l();
        this.a.clear();
        j.post(new zzfnc(this));
    }

    public final void k(View view, zzfmj zzfmjVar, JSONObject jSONObject, int i2, boolean z) {
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        zzfmjVar.b(view, jSONObject, this, z2, z);
    }
}
