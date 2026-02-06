package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfml implements zzfmj {
    public final zzfmj a;

    public zzfml(zzfmj zzfmjVar) {
        this.a = zzfmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final JSONObject a(View view) {
        boolean z = false;
        JSONObject a = zzfmt.a(0, 0, 0, 0);
        int b = zzfmw.b();
        int i = b - 1;
        if (b != 0) {
            if (i == 0) {
                z = true;
            }
            try {
                a.put("noOutputDevice", z);
                return a;
            } catch (JSONException e) {
                zzfmu.a("Error with setting output device status", e);
                return a;
            }
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final void b(View view, JSONObject jSONObject, zzfmi zzfmiVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzflx a = zzflx.a();
        if (a != null) {
            Collection<zzflf> b = a.b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzflf zzflfVar : b) {
                View f = zzflfVar.f();
                if (f != null && f.isAttachedToWindow() && f.isShown()) {
                    View view2 = f;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfmiVar.a((View) arrayList.get(i2), this.a, jSONObject, z2);
        }
    }
}
