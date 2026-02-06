package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzfna {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();
    public final Map i = new WeakHashMap();
    public boolean j;

    public final View a(String str) {
        return (View) this.c.get(str);
    }

    public final zzfmz b(View view) {
        HashMap hashMap = this.b;
        zzfmz zzfmzVar = (zzfmz) hashMap.get(view);
        if (zzfmzVar != null) {
            hashMap.remove(view);
        }
        return zzfmzVar;
    }

    public final String c(String str) {
        return (String) this.g.get(str);
    }

    public final String d(View view) {
        HashMap hashMap = this.a;
        if (hashMap.size() == 0) {
            return null;
        }
        String str = (String) hashMap.get(view);
        if (str != null) {
            hashMap.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f;
    }

    public final HashSet f() {
        return this.e;
    }

    public final void g() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    public final void h() {
        this.j = true;
    }

    public final void i() {
        String str;
        Activity activity;
        boolean z;
        Boolean bool;
        zzflx a = zzflx.a();
        if (a != null) {
            for (zzflf zzflfVar : a.b()) {
                View f = zzflfVar.f();
                if (zzflfVar.j()) {
                    String h = zzflfVar.h();
                    if (f != null) {
                        Context context = f.getContext();
                        while (true) {
                            str = null;
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                activity = null;
                                break;
                            }
                        }
                        if (activity != null) {
                            z = activity.isInPictureInPictureMode();
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.h.add(h);
                        }
                        if (!f.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (f.hasWindowFocus()) {
                                this.i.remove(f);
                                bool = Boolean.FALSE;
                            } else {
                                Map map = this.i;
                                if (map.containsKey(f)) {
                                    bool = (Boolean) map.get(f);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(f, bool2);
                                    bool = bool2;
                                }
                            }
                            if (bool.booleanValue() && !z) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view != null) {
                                        String a2 = zzfmy.a(view);
                                        if (a2 != null) {
                                            str = a2;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.d.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.e.add(h);
                            this.a.put(f, h);
                            for (zzfma zzfmaVar : zzflfVar.i()) {
                                View view2 = (View) zzfmaVar.b().get();
                                if (view2 != null) {
                                    HashMap hashMap = this.b;
                                    zzfmz zzfmzVar = (zzfmz) hashMap.get(view2);
                                    if (zzfmzVar != null) {
                                        zzfmzVar.c(zzflfVar.h());
                                    } else {
                                        hashMap.put(view2, new zzfmz(zzfmaVar, zzflfVar.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(h);
                            this.c.put(h, f);
                            this.g.put(h, str);
                        }
                    } else {
                        this.f.add(h);
                        this.g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(String str) {
        return this.h.contains(str);
    }

    public final boolean k(View view) {
        Map map = this.i;
        if (map.containsKey(view)) {
            map.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int l(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        if (this.j) {
            return 2;
        }
        return 3;
    }
}
