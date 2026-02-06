package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzfun;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C10928yK2;
import o.C5738d80;
import o.C9698tH2;
import o.InterfaceC11300zs1;
import o.InterfaceC7866lr1;
import o.InterfaceC8148mw2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbv {
    public static Point a(MotionEvent motionEvent, @InterfaceC11300zs1 View view) {
        int[] k = k(view);
        return new Point(((int) motionEvent.getRawX()) - k[0], ((int) motionEvent.getRawY()) - k[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p8)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(@InterfaceC11300zs1 String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, point2.x));
                    jSONObject3.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbb.b().g(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    int i = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                int i2 = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static JSONObject d(Context context, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 Map map2, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        boolean z;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] k = k(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] k2 = k(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = k;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzbb.b().g(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzbb.b().g(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, k2[0] - iArr[0]));
                            jSONObject4.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, k2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put(InterfaceC8148mw2.a.L, jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = l(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, k2[0] - iArr[0]));
                                jSONObject.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, k2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j8)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k8)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", m(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", m(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l8)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join(RemoteSettings.i, arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put(C9698tH2.s, textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i = zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Unable to get asset views information");
                                    it2 = it;
                                    k = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if (map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jSONObject3.put("is_clickable", z);
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    k = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject e(Context context, @InterfaceC11300zs1 View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzv.v();
                jSONObject.put("can_show_on_lock_screen", zzs.U(view));
                com.google.android.gms.ads.internal.zzv.v();
                jSONObject.put("is_keyguard_locked", zzs.e(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i = zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    @InterfaceC11300zs1
    public static JSONObject f(@InterfaceC7866lr1 Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzv.v();
        DisplayMetrics a0 = zzs.a0((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.b().g(context, a0.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.b().g(context, a0.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject g(@InterfaceC11300zs1 View view) {
        int positionForView;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i8)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.v();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent == null) {
                        z = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                    return jSONObject;
                }
                com.google.android.gms.ads.internal.zzv.v();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if (parent2 == null) {
                    positionForView = -1;
                } else {
                    positionForView = ((AdapterView) parent2).getPositionForView(view);
                }
                if (positionForView == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|4|5|(5:8|9|10|11|6)|57|58|(1:60)(1:63)|61|14|(7:49|50|17|18|19|20|(8:22|(6:26|27|(2:29|(1:31)(1:40))(1:41)|32|33|(2:35|36))|42|27|(0)(0)|32|33|(0))(8:43|(6:45|27|(0)(0)|32|33|(0))|42|27|(0)(0)|32|33|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
        r3 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169 A[Catch: JSONException -> 0x0162, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0162, blocks: (B:32:0x0131, B:49:0x015e, B:52:0x0164, B:53:0x0169), top: B:65:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject h(Context context, @InterfaceC11300zs1 View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i3 = 1;
            try {
                int[] k = k(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i3;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i] = Math.min(viewGroup.getMeasuredHeight(), iArr[i]);
                        parent2 = parent2.getParent();
                        i3 = i;
                    } catch (Exception unused) {
                        int i4 = zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i3;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzbb.b().g(context, view.getMeasuredWidth()));
                jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzbb.b().g(context, view.getMeasuredHeight()));
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, k[0]));
                jSONObject3.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, k[i]));
                jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzbb.b().g(context, iArr[0]));
                jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzbb.b().g(context, iArr[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put(InterfaceC8148mw2.a.L, jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = l(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, k[0]));
                    jSONObject4.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, k[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i3;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                } catch (IllegalAccessException e) {
                    e = e;
                    int i5 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e2) {
                    e = e2;
                    int i52 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    int i522 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i2 = i;
                        if (i2 == 0) {
                            if (i2 != i) {
                                jSONObject2.put("native_template_type", 0);
                            } else {
                                jSONObject2.put("native_template_type", 2);
                            }
                        } else {
                            jSONObject2.put("native_template_type", i);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k8)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject2.put("view_width_layout_type", m(layoutParams.width) - 1);
                                jSONObject2.put("view_height_layout_type", m(layoutParams.height) - 1);
                            } catch (Exception unused4) {
                                zze.k("Unable to get native ad view layout types");
                            }
                        }
                    }
                    i2 = -1;
                    if (i2 == 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k8)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i2 = 0;
                        if (i2 == 0) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k8)).booleanValue()) {
                        }
                    }
                    i2 = -1;
                    if (i2 == 0) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k8)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static boolean i(Context context, zzfbu zzfbuVar) {
        if (!zzfbuVar.N) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m8)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q8)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n8);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String str2 : zzfvr.b(zzfun.c(C10928yK2.l)).d(str)) {
                if (str2.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L3)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M3)).booleanValue() && i > 15299999) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int[] k(@InterfaceC11300zs1 View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static JSONObject l(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.b().g(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.b().g(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbb.b().g(context, rect.left));
        jSONObject.put(C5738d80.b, com.google.android.gms.ads.internal.client.zzbb.b().g(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int m(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
