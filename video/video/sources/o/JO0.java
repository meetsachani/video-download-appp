package o;

import android.content.Context;
import o.XT;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JO0 {
    public static void a(Context context, String placementID, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.l, placementID), callback, EnumC10487wW1.LOAD_INTERSTITIAL_AD);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.LOAD_INTERSTITIAL_AD, e);
        }
    }

    public static void b(Context context, String placementID, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.l, placementID), callback, EnumC10487wW1.LOAD_REWARDED_VIDEO);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.LOAD_REWARDED_VIDEO, e);
        }
    }

    public static void c(Context context, String placementID, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.l, placementID), callback, EnumC10487wW1.SHOW_INTERSTITIAL_AD);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.SHOW_INTERSTITIAL_AD, e);
        }
    }

    public static void d(Context context, String placementID, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.l, placementID), callback, EnumC10487wW1.SHOW_REWARDED_VIDEO);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.SHOW_REWARDED_VIDEO, e);
        }
    }
}
