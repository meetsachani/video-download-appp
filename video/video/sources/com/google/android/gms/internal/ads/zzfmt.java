package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import o.C5738d80;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfmt {
    public static WindowManager a;
    public static final String[] b = {"x", C5738d80.b, "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put(C5738d80.b, i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
            return jSONObject;
        } catch (JSONException e) {
            zzfmu.a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            zzfmu.a("Error with setting ad session id", e);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void d(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            zzfmu.a("JSONException during JSONObject.put for name [" + str + C6566gU0.g, e);
        }
    }

    public static void f(JSONObject jSONObject) {
        float f;
        float f2;
        Point point;
        if (a != null) {
            a.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f3 = c;
            f = point.x / f3;
            f2 = point.y / f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean g(@InterfaceC5670cr1 JSONObject jSONObject, @InterfaceC11300zs1 JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (h(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (h(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (g(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray != null && jSONArray2 != null && jSONArray.length() == jSONArray2.length()) {
            return true;
        }
        return false;
    }
}
