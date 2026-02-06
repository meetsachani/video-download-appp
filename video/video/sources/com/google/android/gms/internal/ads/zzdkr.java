package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzdkr implements zzdiw {
    @InterfaceC11300zs1
    public final zzbqa a;
    public final zzcwl b;
    public final zzcvr c;
    public final zzddw d;
    public final Context e;
    public final zzfbu f;
    public final VersionInfoParcel g;
    public final zzfcp h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    @InterfaceC11300zs1
    public final zzbpw l;
    @InterfaceC11300zs1
    public final zzbpx m;

    public zzdkr(@InterfaceC11300zs1 zzbpw zzbpwVar, @InterfaceC11300zs1 zzbpx zzbpxVar, @InterfaceC11300zs1 zzbqa zzbqaVar, zzcwl zzcwlVar, zzcvr zzcvrVar, zzddw zzddwVar, Context context, zzfbu zzfbuVar, VersionInfoParcel versionInfoParcel, zzfcp zzfcpVar) {
        this.l = zzbpwVar;
        this.m = zzbpxVar;
        this.a = zzbqaVar;
        this.b = zzcwlVar;
        this.c = zzcvrVar;
        this.d = zzddwVar;
        this.e = context;
        this.f = zzfbuVar;
        this.g = versionInfoParcel;
        this.h = zzfcpVar;
    }

    public static final HashMap x(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void B0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean F() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void b(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void c(zzbhx zzbhxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void d(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        try {
            if (!this.i) {
                this.i = com.google.android.gms.ads.internal.zzv.y().n(this.e, this.g.X, this.f.C.toString(), this.h.f);
            }
            if (this.k) {
                zzbqa zzbqaVar = this.a;
                if (zzbqaVar != null && !zzbqaVar.R()) {
                    zzbqaVar.y();
                    this.b.a();
                    return;
                }
                zzbpw zzbpwVar = this.l;
                if (zzbpwVar != null && !zzbpwVar.w()) {
                    zzbpwVar.v();
                    this.b.a();
                    return;
                }
                zzbpx zzbpxVar = this.m;
                if (zzbpxVar != null && !zzbpxVar.B()) {
                    zzbpxVar.x();
                    this.b.a();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void e(View view, View view2, Map map, Map map2, boolean z, @InterfaceC11300zs1 ImageView.ScaleType scaleType, int i) {
        if (!this.j) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f.L) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            v(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void e0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void f(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void g(View view, @InterfaceC11300zs1 Map map) {
        try {
            IObjectWrapper V3 = ObjectWrapper.V3(view);
            zzbqa zzbqaVar = this.a;
            if (zzbqaVar != null) {
                zzbqaVar.X5(V3);
                return;
            }
            zzbpw zzbpwVar = this.l;
            if (zzbpwVar != null) {
                zzbpwVar.G4(V3);
                return;
            }
            zzbpx zzbpxVar = this.m;
            if (zzbpxVar != null) {
                zzbpxVar.Z7(V3);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void h(View view, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper n;
        try {
            IObjectWrapper V3 = ObjectWrapper.V3(view);
            JSONObject jSONObject = this.f.j0;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J1)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K1)).booleanValue() && next.equals("3010")) {
                                zzbqa zzbqaVar = this.a;
                                Object obj2 = null;
                                if (zzbqaVar != null) {
                                    try {
                                        n = zzbqaVar.n();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpw zzbpwVar = this.l;
                                    if (zzbpwVar != null) {
                                        n = zzbpwVar.S7();
                                    } else {
                                        zzbpx zzbpxVar = this.m;
                                        if (zzbpxVar != null) {
                                            n = zzbpxVar.s7();
                                        } else {
                                            n = null;
                                        }
                                    }
                                }
                                if (n != null) {
                                    obj2 = ObjectWrapper.o1(n);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.c(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzv.v();
                                ClassLoader classLoader = this.e.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.k = z;
            HashMap x = x(map);
            HashMap x2 = x(map2);
            zzbqa zzbqaVar2 = this.a;
            if (zzbqaVar2 != null) {
                zzbqaVar2.g7(V3, ObjectWrapper.V3(x), ObjectWrapper.V3(x2));
                return;
            }
            zzbpw zzbpwVar2 = this.l;
            if (zzbpwVar2 != null) {
                zzbpwVar2.Y7(V3, ObjectWrapper.V3(x), ObjectWrapper.V3(x2));
                zzbpwVar2.X7(V3);
                return;
            }
            zzbpx zzbpxVar2 = this.m;
            if (zzbpxVar2 != null) {
                zzbpxVar2.Y7(V3, ObjectWrapper.V3(x), ObjectWrapper.V3(x2));
                zzbpxVar2.X7(V3);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean h0() {
        return this.f.L;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void i() {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final boolean l(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void m(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void n(View view, MotionEvent motionEvent, @InterfaceC11300zs1 View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void o(View view, @InterfaceC11300zs1 View view2, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, boolean z, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        if (this.j && this.f.L) {
            return;
        }
        v(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    @InterfaceC11300zs1
    public final JSONObject p(View view, Map map, Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void q(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void r(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    @InterfaceC11300zs1
    public final JSONObject u(View view, Map map, Map map2, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        return null;
    }

    public final void v(View view) {
        try {
            zzbqa zzbqaVar = this.a;
            if (zzbqaVar != null && !zzbqaVar.L()) {
                zzbqaVar.G4(ObjectWrapper.V3(view));
                this.c.y();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
                    this.d.X0();
                    return;
                }
                return;
            }
            zzbpw zzbpwVar = this.l;
            if (zzbpwVar != null && !zzbpwVar.y()) {
                zzbpwVar.W7(ObjectWrapper.V3(view));
                this.c.y();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
                    this.d.X0();
                    return;
                }
                return;
            }
            zzbpx zzbpxVar = this.m;
            if (zzbpxVar != null && !zzbpxVar.q()) {
                zzbpxVar.W7(ObjectWrapper.V3(view));
                this.c.y();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.bb)).booleanValue()) {
                    this.d.X0();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void w() {
        this.j = true;
    }
}
