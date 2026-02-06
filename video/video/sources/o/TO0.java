package o;

import android.content.Context;
import o.XT;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TO0 {
    public static void a(Context context, String purchaseToken, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.j, purchaseToken), callback, EnumC10487wW1.CANCEL_SUBSCRIPTION);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.CANCEL_SUBSCRIPTION, e);
        }
    }

    public static void b(Context context, String purchaseToken, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.j, purchaseToken), callback, EnumC10487wW1.CONSUME_PURCHASE);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.CONSUME_PURCHASE, e);
        }
    }

    public static void c(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.GET_CATALOG);
    }

    public static void d(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.GET_PURCHASES);
    }

    public static void e(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.GET_SUBSCRIBABLE_CATALOG);
    }

    public static void f(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.GET_SUBSCRIPTIONS);
    }

    public static void g(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.ON_READY);
    }

    public static void h(Context context, String productID, @InterfaceC11300zs1 String developerPayload, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.i, productID).put(C9998uW1.k, developerPayload), callback, EnumC10487wW1.PURCHASE);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.PURCHASE, e);
        }
    }

    public static void i(Context context, String productID, XT.c callback) {
        try {
            XT.m(context, new JSONObject().put(C9998uW1.i, productID), callback, EnumC10487wW1.PURCHASE_SUBSCRIPTION);
        } catch (JSONException e) {
            C10241vW1.f(context, EnumC10487wW1.PURCHASE_SUBSCRIPTION, e);
        }
    }
}
