package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.XT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.vE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10169vE {
    public static final int a = 5;
    public static boolean b = false;
    public static C10241vW1 c;

    public static List<String> a(String permissionsString) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (!permissionsString.isEmpty()) {
            JSONArray jSONArray = new JSONArray(permissionsString);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
        }
        return arrayList;
    }

    public static void b(Context context, XT.c callback) {
        XT.m(context, null, callback, EnumC10487wW1.MARK_GAME_LOADED);
    }

    @InterfaceC11300zs1
    public static synchronized C0376a c(Context context) throws C2416z {
        C0376a d;
        synchronized (C10169vE.class) {
            d = d(context, 5);
        }
        return d;
    }

    @InterfaceC11300zs1
    public static synchronized C0376a d(Context context, int timeoutInSec) throws C2416z {
        C0376a g;
        synchronized (C10169vE.class) {
            if (timeoutInSec <= 0) {
                timeoutInSec = 5;
            }
            if (e(context, timeoutInSec)) {
                c = C10241vW1.b(context);
                com.facebook.Y j = XT.j(context, null, EnumC10487wW1.GET_ACCESS_TOKEN, timeoutInSec);
                if (j != null && j.i() != null) {
                    if (j.g() == null) {
                        h(j.i(), context);
                        try {
                            g = g(j.i());
                            com.facebook.gamingservices.q.d(j.i().optString("payload"));
                            com.facebook.d0.b();
                            b = true;
                            c.h();
                        } catch (JSONException e) {
                            throw new C2416z("Cannot properly handle response.", e);
                        }
                    } else {
                        throw new C2416z(j.g().h());
                    }
                } else {
                    throw new C2416z("Cannot receive response.");
                }
            } else {
                throw new C2416z("Not running in Cloud environment.");
            }
        }
        return g;
    }

    public static boolean e(Context context, int timeoutInSec) {
        com.facebook.Y j = XT.j(context, null, EnumC10487wW1.IS_ENV_READY, timeoutInSec);
        if (j == null || j.i() == null || j.g() != null) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        return b;
    }

    @InterfaceC11300zs1
    public static C0376a g(JSONObject jsonObject) throws JSONException {
        EnumC2354h enumC2354h;
        Date date;
        long j;
        Date date2;
        Date date3;
        Date date4;
        String str;
        List<String> list;
        String str2;
        Date date5;
        Date date6;
        Date date7;
        List<String> list2;
        EnumC2354h enumC2354h2;
        String optString = jsonObject.optString(C9998uW1.m);
        String optString2 = jsonObject.optString(C9998uW1.n);
        String optString3 = jsonObject.optString(C9998uW1.f886o);
        String optString4 = jsonObject.optString(C9998uW1.r);
        String optString5 = jsonObject.optString(C9998uW1.s);
        String optString6 = jsonObject.optString(C9998uW1.t);
        String optString7 = jsonObject.optString(C9998uW1.q);
        String optString8 = jsonObject.optString(C9998uW1.u);
        String optString9 = jsonObject.optString(C9998uW1.v);
        String optString10 = jsonObject.optString("permissions");
        String optString11 = jsonObject.optString(C9998uW1.y);
        String optString12 = jsonObject.optString(C9998uW1.B);
        if (optString.isEmpty() || optString3.isEmpty() || optString11.isEmpty()) {
            return null;
        }
        C10241vW1 c10241vW1 = c;
        if (c10241vW1 != null) {
            c10241vW1.m(optString3);
            c.o(optString11);
            c.n(optString12);
        }
        List<String> a2 = a(optString10);
        List<String> a3 = a(optString4);
        List<String> a4 = a(optString5);
        if (!optString2.isEmpty()) {
            enumC2354h = EnumC2354h.valueOf(optString2);
        } else {
            enumC2354h = null;
        }
        if (!optString6.isEmpty()) {
            date = null;
            j = 1000;
            date2 = new Date(Integer.parseInt(optString6) * 1000);
        } else {
            date = null;
            j = 1000;
            date2 = null;
        }
        if (!optString9.isEmpty()) {
            date3 = new Date(Integer.parseInt(optString9) * j);
        } else {
            date3 = date;
        }
        if (!optString7.isEmpty()) {
            date4 = new Date(Integer.parseInt(optString7) * j);
        } else {
            date4 = date;
        }
        if (!optString8.isEmpty()) {
            str = optString8;
            date5 = date2;
            list = a4;
            date7 = date4;
            str2 = optString11;
            enumC2354h2 = enumC2354h;
            date6 = date3;
            list2 = a2;
        } else {
            str = date;
            list = a4;
            str2 = optString11;
            date5 = date2;
            date6 = date3;
            date7 = date4;
            list2 = a2;
            enumC2354h2 = enumC2354h;
        }
        C0376a c0376a = new C0376a(optString, optString3, str2, list2, a3, list, enumC2354h2, date5, date6, date7, str);
        C0376a.K(c0376a);
        return c0376a;
    }

    public static void h(JSONObject jsonObject, Context context) {
        String optString = jsonObject.optString(C9998uW1.z);
        if (!optString.isEmpty()) {
            SharedPreferences.Editor edit = context.getSharedPreferences(C9998uW1.I, 0).edit();
            edit.putString(C9998uW1.z, optString);
            edit.commit();
            return;
        }
        throw new C2416z("Could not establish a secure connection.");
    }
}
