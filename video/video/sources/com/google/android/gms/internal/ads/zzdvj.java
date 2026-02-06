package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdvj implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final JSONObject a = new JSONObject();
    public List b;

    public final JSONObject a() throws JSONException {
        return this.a;
    }

    public final void b(SharedPreferences sharedPreferences, List list) {
        this.b = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @InterfaceC11300zs1 String str) {
        if (str != null && this.b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.a.remove(str);
                } else {
                    this.a.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.t().w(e, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }
}
