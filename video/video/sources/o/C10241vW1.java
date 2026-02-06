package o;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: o.vW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10241vW1 {
    public static C10241vW1 f;
    public final com.facebook.appevents.K a;
    public String b = null;
    public String c = null;
    public String d = null;
    public ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    public C10241vW1(Context context) {
        this.a = new com.facebook.appevents.K(context);
    }

    public static synchronized C10241vW1 b(Context context) {
        C10241vW1 c10241vW1;
        synchronized (C10241vW1.class) {
            try {
                if (f == null) {
                    f = new C10241vW1(context);
                }
                c10241vW1 = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10241vW1;
    }

    public static void f(Context context, EnumC10487wW1 functionType, Exception e) {
        b(context).g(functionType, e);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            bundle.putString(C9755tW1.p, str2);
        }
        return bundle;
    }

    public final Bundle c(@InterfaceC11300zs1 String requestID) {
        Bundle a = a();
        if (requestID != null) {
            String orDefault = this.e.getOrDefault(requestID, null);
            a.putString(C9755tW1.f875o, requestID);
            if (orDefault != null) {
                a.putString(C9755tW1.h, orDefault);
                this.e.remove(requestID);
            }
        }
        return a;
    }

    public final Bundle d(String requestID, String functionType) {
        Bundle a = a();
        a.putString(C9755tW1.f875o, requestID);
        a.putString(C9755tW1.h, functionType);
        return a;
    }

    public void e() {
        this.a.m(C9755tW1.g, a());
    }

    public void g(EnumC10487wW1 functionType, Exception e) {
        Bundle a = a();
        a.putString(C9755tW1.h, functionType.toString());
        a.putString("error_type", e.getClass().getName());
        a.putString("error_message", e.getMessage());
        this.a.m(C9755tW1.f, a);
    }

    public void h() {
        this.a.m(C9755tW1.e, a());
    }

    public void i(String functionType, String requestID, JSONObject payloads) {
        Bundle d = d(requestID, functionType);
        d.putString("payload", payloads.toString());
        this.a.m(C9755tW1.a, d);
    }

    public void j(com.facebook.C error, @InterfaceC11300zs1 String requestID) {
        Bundle c = c(requestID);
        c.putString("error_code", Integer.toString(error.g()));
        c.putString("error_type", error.m());
        c.putString("error_message", error.h());
        this.a.m(C9755tW1.d, c);
    }

    public void k(String requestID) {
        this.a.m(C9755tW1.c, c(requestID));
    }

    public void l(String functionType, String requestID, JSONObject payloads) {
        Bundle d = d(requestID, functionType);
        this.e.put(requestID, functionType);
        d.putString("payload", payloads.toString());
        this.a.m(C9755tW1.b, d);
    }

    public void m(String appID) {
        this.b = appID;
    }

    public void n(String sessionID) {
        this.d = sessionID;
    }

    public void o(String userID) {
        this.c = userID;
    }
}
