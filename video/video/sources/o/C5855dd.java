package o;

import android.content.SharedPreferences;
import com.facebook.S;
import com.facebook.internal.V;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.dd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5855dd {
    @NotNull
    public static final String b = "/cloudbridge_settings";
    public static boolean d;
    @NotNull
    public static final C5855dd a = new C5855dd();
    public static final String c = C5855dd.class.getCanonicalName();

    @InterfaceC9511sW0
    public static final void b() {
        try {
            S.b bVar = new S.b() { // from class: o.cd
                @Override // com.facebook.S.b
                public final void a(com.facebook.Y y) {
                    C5855dd.c(y);
                }
            };
            com.facebook.M m = com.facebook.M.a;
            com.facebook.S s = new com.facebook.S(null, C6562gT0.C(com.facebook.M.o(), b), null, com.facebook.Z.GET, bVar, null, 32, null);
            V.a aVar = com.facebook.internal.V.e;
            com.facebook.b0 b0Var = com.facebook.b0.APP_EVENTS;
            String str = c;
            if (str != null) {
                aVar.e(b0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", s);
                s.n();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException e) {
            V.a aVar2 = com.facebook.internal.V.e;
            com.facebook.b0 b0Var2 = com.facebook.b0.APP_EVENTS;
            String str2 = c;
            if (str2 != null) {
                aVar2.e(b0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", C3917Pf0.i(e));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public static final void c(com.facebook.Y y) {
        C6562gT0.p(y, "response");
        a.d(y);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Map<String, Object> e() {
        if (SQ.e(C5855dd.class)) {
            return null;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(com.facebook.M.X, 0);
            if (sharedPreferences == null) {
                return null;
            }
            G22 g22 = G22.DATASETID;
            String string = sharedPreferences.getString(g22.g(), null);
            G22 g222 = G22.URL;
            String string2 = sharedPreferences.getString(g222.g(), null);
            G22 g223 = G22.ACCESSKEY;
            String string3 = sharedPreferences.getString(g223.g(), null);
            if (string != null && !C10763xf2.O3(string) && string2 != null && !C10763xf2.O3(string2) && string3 != null && !C10763xf2.O3(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(g222.g(), string2);
                linkedHashMap.put(g22.g(), string);
                linkedHashMap.put(g223.g(), string3);
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, c.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, C5855dd.class);
            return null;
        }
    }

    public final void d(@NotNull com.facebook.Y y) {
        Object obj;
        boolean z;
        C6562gT0.p(y, "response");
        if (y.g() != null) {
            V.a aVar = com.facebook.internal.V.e;
            com.facebook.b0 b0Var = com.facebook.b0.APP_EVENTS;
            String str = c;
            if (str != null) {
                aVar.e(b0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", y.g().toString(), String.valueOf(y.g().q()));
                Map<String, Object> e = e();
                if (e != null) {
                    URL url = new URL(String.valueOf(e.get(G22.URL.g())));
                    C6595gd c6595gd = C6595gd.a;
                    String valueOf = String.valueOf(e.get(G22.DATASETID.g()));
                    C6595gd.d(valueOf, url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e.get(G22.ACCESSKEY.g())));
                    d = true;
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        V.a aVar2 = com.facebook.internal.V.e;
        com.facebook.b0 b0Var2 = com.facebook.b0.APP_EVENTS;
        String str2 = c;
        if (str2 != null) {
            aVar2.e(b0Var2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", y);
            JSONObject i = y.i();
            try {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (i == null) {
                    obj = null;
                } else {
                    obj = i.get("data");
                }
                if (obj != null) {
                    Map<String, ? extends Object> o2 = com.facebook.internal.l0.o(new JSONObject((String) C10662xF.J2(com.facebook.internal.l0.n((JSONArray) obj))));
                    String str3 = (String) o2.get(G22.URL.g());
                    String str4 = (String) o2.get(G22.DATASETID.g());
                    String str5 = (String) o2.get(G22.ACCESSKEY.g());
                    if (str3 != null && str4 != null && str5 != null) {
                        try {
                            C6595gd c6595gd2 = C6595gd.a;
                            C6595gd.d(str4, str3, str5);
                            h(o2);
                            G22 g22 = G22.ENABLED;
                            if (o2.get(g22.g()) != null) {
                                Object obj2 = o2.get(g22.g());
                                if (obj2 != null) {
                                    z = ((Boolean) obj2).booleanValue();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                            } else {
                                z = false;
                            }
                            d = z;
                            return;
                        } catch (MalformedURLException e2) {
                            V.a aVar3 = com.facebook.internal.V.e;
                            com.facebook.b0 b0Var3 = com.facebook.b0.APP_EVENTS;
                            String str6 = c;
                            C6562gT0.o(str6, "TAG");
                            aVar3.e(b0Var3, str6, "CloudBridge Settings API response doesn't have valid url\n %s ", C3917Pf0.i(e2));
                            return;
                        }
                    }
                    C6562gT0.o(str2, "TAG");
                    aVar2.d(b0Var2, str2, "CloudBridge Settings API response doesn't have valid data");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            } catch (NullPointerException e3) {
                V.a aVar4 = com.facebook.internal.V.e;
                com.facebook.b0 b0Var4 = com.facebook.b0.APP_EVENTS;
                String str7 = c;
                C6562gT0.o(str7, "TAG");
                aVar4.e(b0Var4, str7, "CloudBridge Settings API response is not a valid json: \n%s ", C3917Pf0.i(e3));
                return;
            } catch (JSONException e4) {
                V.a aVar5 = com.facebook.internal.V.e;
                com.facebook.b0 b0Var5 = com.facebook.b0.APP_EVENTS;
                String str8 = c;
                C6562gT0.o(str8, "TAG");
                aVar5.e(b0Var5, str8, "CloudBridge Settings API response is not a valid json: \n%s ", C3917Pf0.i(e4));
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean f() {
        return d;
    }

    public final void g(boolean z) {
        d = z;
    }

    public final void h(@Nullable Map<String, ? extends Object> map) {
        com.facebook.M m = com.facebook.M.a;
        SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(com.facebook.M.X, 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
                return;
            }
            G22 g22 = G22.DATASETID;
            Object obj = map.get(g22.g());
            G22 g222 = G22.URL;
            Object obj2 = map.get(g222.g());
            G22 g223 = G22.ACCESSKEY;
            Object obj3 = map.get(g223.g());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(g22.g(), obj.toString());
                edit2.putString(g222.g(), obj2.toString());
                edit2.putString(g223.g(), obj3.toString());
                edit2.apply();
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, c.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
