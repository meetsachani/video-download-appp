package o;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.InterfaceC2407p;
import com.facebook.InterfaceC2411u;
import com.facebook.S;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2357b;
import com.facebook.internal.C2361f;
import com.facebook.internal.X;
import com.facebook.share.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D32 {
    @NotNull
    public static final D32 a = new D32();
    @NotNull
    public static final String b = "me/staging_resources";
    @NotNull
    public static final String c = "file";

    /* loaded from: classes2.dex */
    public static final class a extends WT1 {
        public final /* synthetic */ InterfaceC2411u<e.a> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2411u<e.a> interfaceC2411u) {
            super(interfaceC2411u);
            this.b = interfaceC2411u;
        }

        @Override // o.WT1
        public void a(@NotNull C2357b c2357b) {
            C6562gT0.p(c2357b, "appCall");
            D32 d32 = D32.a;
            D32.u(this.b);
        }

        @Override // o.WT1
        public void b(@NotNull C2357b c2357b, @NotNull C2416z c2416z) {
            C6562gT0.p(c2357b, "appCall");
            C6562gT0.p(c2416z, "error");
            D32 d32 = D32.a;
            D32.v(this.b, c2416z);
        }

        @Override // o.WT1
        public void c(@NotNull C2357b c2357b, @Nullable Bundle bundle) {
            C6562gT0.p(c2357b, "appCall");
            if (bundle != null) {
                D32 d32 = D32.a;
                String i = D32.i(bundle);
                if (i != null && !C9545sf2.c2("post", i, true)) {
                    if (C9545sf2.c2("cancel", i, true)) {
                        D32.u(this.b);
                        return;
                    } else {
                        D32.v(this.b, new C2416z(com.facebook.internal.Z.U0));
                        return;
                    }
                }
                D32.y(this.b, D32.k(bundle));
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.S A(@Nullable C0376a c0376a, @Nullable Bitmap bitmap, @Nullable S.b bVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", bitmap);
        return new com.facebook.S(c0376a, b, bundle, com.facebook.Z.POST, bVar, null, 32, null);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.S B(@Nullable C0376a c0376a, @NotNull Uri uri, @Nullable S.b bVar) throws FileNotFoundException {
        C6562gT0.p(uri, "imageUri");
        String path = uri.getPath();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (com.facebook.internal.l0.d0(uri) && path != null) {
            return C(c0376a, new File(path), bVar);
        }
        if (com.facebook.internal.l0.a0(uri)) {
            S.h hVar = new S.h(uri, C4128Rj1.P0);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", hVar);
            return new com.facebook.S(c0376a, b, bundle, com.facebook.Z.POST, bVar, null, 32, null);
        }
        throw new C2416z("The image Uri must be either a file:// or content:// Uri");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final com.facebook.S C(@Nullable C0376a c0376a, @Nullable File file, @Nullable S.b bVar) throws FileNotFoundException {
        S.h hVar = new S.h(ParcelFileDescriptor.open(file, 268435456), C4128Rj1.P0);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", hVar);
        return new com.facebook.S(c0376a, b, bundle, com.facebook.Z.POST, bVar, null, 32, null);
    }

    @InterfaceC9511sW0
    public static final void D(final int i, @Nullable InterfaceC2407p interfaceC2407p, @Nullable final InterfaceC2411u<e.a> interfaceC2411u) {
        if (interfaceC2407p instanceof C2361f) {
            ((C2361f) interfaceC2407p).b(i, new C2361f.a() { // from class: o.B32
                @Override // com.facebook.internal.C2361f.a
                public final boolean a(int i2, Intent intent) {
                    boolean E;
                    E = D32.E(i, interfaceC2411u, i2, intent);
                    return E;
                }
            });
            return;
        }
        throw new C2416z("Unexpected CallbackManager, please use the provided Factory.");
    }

    public static final boolean E(int i, InterfaceC2411u interfaceC2411u, int i2, Intent intent) {
        return q(i, i2, intent, l(interfaceC2411u));
    }

    @InterfaceC9511sW0
    public static final void F(final int i) {
        C2361f.b.c(i, new C2361f.a() { // from class: o.C32
            @Override // com.facebook.internal.C2361f.a
            public final boolean a(int i2, Intent intent) {
                boolean G;
                G = D32.G(i, i2, intent);
                return G;
            }
        });
    }

    public static final boolean G(int i, int i2, Intent intent) {
        return q(i, i2, intent, l(null));
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONArray H(@NotNull JSONArray jSONArray, boolean z) throws JSONException {
        C6562gT0.p(jSONArray, "jsonArray");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = H((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = I((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return jSONArray2;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject I(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            if (names == null) {
                return null;
            }
            int length = names.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String string = names.getString(i);
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = I((JSONObject) obj, true);
                    } else if (obj instanceof JSONArray) {
                        obj = H((JSONArray) obj, true);
                    }
                    C6562gT0.o(string, "key");
                    Pair<String, String> g = g(string);
                    String str = (String) g.first;
                    String str2 = (String) g.second;
                    if (z) {
                        if (str != null && C6562gT0.g(str, C5475c30.g)) {
                            jSONObject2.put(string, obj);
                        } else {
                            if (str != null && !C6562gT0.g(str, "og")) {
                                jSONObject3.put(str2, obj);
                            }
                            jSONObject2.put(str2, obj);
                        }
                    } else if (str != null && C6562gT0.g(str, "fb")) {
                        jSONObject2.put(string, obj);
                    } else {
                        jSONObject2.put(str2, obj);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C2416z("Failed to create json object from share content");
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle f(@Nullable O32 o32, @NotNull UUID uuid) {
        C6562gT0.p(uuid, "appCallId");
        Bundle bundle = null;
        if (o32 != null && o32.k() != null) {
            F32<?, ?> k = o32.k();
            X.a e = a.e(uuid, k);
            if (e == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", k.b().name());
            bundle.putString("uri", e.b());
            String o2 = o(e.e());
            if (o2 != null) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.u0(bundle, C9642t32.g0, o2);
            }
            com.facebook.internal.X x = com.facebook.internal.X.a;
            com.facebook.internal.X.a(C7979mF.k(e));
        }
        return bundle;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Pair<String, String> g(@NotNull String str) {
        String str2;
        String str3;
        int i;
        C6562gT0.p(str, "fullName");
        int I3 = C10763xf2.I3(str, ':', 0, false, 6, null);
        if (I3 != -1 && str.length() > (i = I3 + 1)) {
            str2 = str.substring(0, I3);
            C6562gT0.o(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str3 = str.substring(i);
            C6562gT0.o(str3, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = null;
            str3 = str;
        }
        return new Pair<>(str2, str3);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final List<Bundle> h(@Nullable G32 g32, @NotNull UUID uuid) {
        List<F32<?, ?>> h;
        Bundle bundle;
        C6562gT0.p(uuid, "appCallId");
        if (g32 == null) {
            h = null;
        } else {
            h = g32.h();
        }
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (F32<?, ?> f32 : h) {
            X.a e = a.e(uuid, f32);
            if (e == null) {
                bundle = null;
            } else {
                arrayList.add(e);
                bundle = new Bundle();
                bundle.putString("type", f32.b().name());
                bundle.putString("uri", e.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        com.facebook.internal.X.a(arrayList);
        return arrayList2;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String i(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "result");
        if (bundle.containsKey(com.facebook.internal.Z.U)) {
            return bundle.getString(com.facebook.internal.Z.U);
        }
        return bundle.getString(com.facebook.internal.Z.S);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final List<String> j(@Nullable M32 m32, @NotNull UUID uuid) {
        List<L32> h;
        C6562gT0.p(uuid, "appCallId");
        if (m32 == null) {
            h = null;
        } else {
            h = m32.h();
        }
        if (h == null) {
            return null;
        }
        ArrayList<X.a> arrayList = new ArrayList();
        for (L32 l32 : h) {
            X.a e = a.e(uuid, l32);
            if (e != null) {
                arrayList.add(e);
            }
        }
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
        for (X.a aVar : arrayList) {
            arrayList2.add(aVar.b());
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        com.facebook.internal.X.a(arrayList);
        return arrayList2;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String k(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "result");
        if (bundle.containsKey(C9642t32.G0)) {
            return bundle.getString(C9642t32.G0);
        }
        if (bundle.containsKey(C9642t32.F0)) {
            return bundle.getString(C9642t32.F0);
        }
        return bundle.getString(C9642t32.u);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final WT1 l(@Nullable InterfaceC2411u<e.a> interfaceC2411u) {
        return new a(interfaceC2411u);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle m(@Nullable O32 o32, @NotNull UUID uuid) {
        C6562gT0.p(uuid, "appCallId");
        if (o32 == null || o32.n() == null) {
            return null;
        }
        new ArrayList().add(o32.n());
        X.a e = a.e(uuid, o32.n());
        if (e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", e.b());
        String o2 = o(e.e());
        if (o2 != null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.u0(bundle, C9642t32.g0, o2);
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        com.facebook.internal.X.a(C7979mF.k(e));
        return bundle;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle n(@Nullable C9156r32 c9156r32, @NotNull UUID uuid) {
        C4469Uw m;
        C6562gT0.p(uuid, "appCallId");
        if (c9156r32 == null) {
            m = null;
        } else {
            m = c9156r32.m();
        }
        if (m == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : m.e()) {
            X.a d = a.d(uuid, m.d(str), m.c(str));
            if (d != null) {
                arrayList.add(d);
                bundle.putString(str, d.b());
            }
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        com.facebook.internal.X.a(arrayList);
        return bundle;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String o(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        C6562gT0.o(uri2, "uri.toString()");
        int X3 = C10763xf2.X3(uri2, '.', 0, false, 6, null);
        if (X3 == -1) {
            return null;
        }
        String substring = uri2.substring(X3);
        C6562gT0.o(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String p(@Nullable S32 s32, @NotNull UUID uuid) {
        R32 n;
        Uri d;
        C6562gT0.p(uuid, "appCallId");
        if (s32 == null || (n = s32.n()) == null) {
            d = null;
        } else {
            d = n.d();
        }
        if (d == null) {
            return null;
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        X.a e = com.facebook.internal.X.e(uuid, d);
        com.facebook.internal.X.a(C7979mF.k(e));
        return e.b();
    }

    @InterfaceC9511sW0
    public static final boolean q(int i, int i2, @Nullable Intent intent, @Nullable WT1 wt1) {
        C2416z c2416z;
        C2357b c2 = a.c(i, i2, intent);
        if (c2 == null) {
            return false;
        }
        com.facebook.internal.X x = com.facebook.internal.X.a;
        com.facebook.internal.X.c(c2.d());
        if (wt1 == null) {
            return true;
        }
        Bundle bundle = null;
        if (intent != null) {
            com.facebook.internal.Z z = com.facebook.internal.Z.a;
            c2416z = com.facebook.internal.Z.u(com.facebook.internal.Z.t(intent));
        } else {
            c2416z = null;
        }
        if (c2416z != null) {
            if (c2416z instanceof com.facebook.B) {
                wt1.a(c2);
            } else {
                wt1.b(c2, c2416z);
            }
        } else {
            if (intent != null) {
                com.facebook.internal.Z z2 = com.facebook.internal.Z.a;
                bundle = com.facebook.internal.Z.B(intent);
            }
            wt1.c(c2, bundle);
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final void r(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @Nullable String str) {
        x(interfaceC2411u, str);
    }

    @InterfaceC9511sW0
    public static final void s(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @NotNull Exception exc) {
        C6562gT0.p(exc, "exception");
        if (exc instanceof C2416z) {
            v(interfaceC2411u, (C2416z) exc);
        } else {
            r(interfaceC2411u, C6562gT0.C("Error preparing share content: ", exc.getLocalizedMessage()));
        }
    }

    @InterfaceC9511sW0
    public static final void t(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @Nullable String str, @NotNull com.facebook.Y y) {
        C6562gT0.p(y, "graphResponse");
        com.facebook.C g = y.g();
        if (g != null) {
            String h = g.h();
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.f0(h)) {
                h = "Unexpected error sharing.";
            }
            w(interfaceC2411u, y, h);
            return;
        }
        y(interfaceC2411u, str);
    }

    @InterfaceC9511sW0
    public static final void u(@Nullable InterfaceC2411u<e.a> interfaceC2411u) {
        a.z(C2356a.V, null);
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.onCancel();
    }

    @InterfaceC9511sW0
    public static final void v(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @NotNull C2416z c2416z) {
        C6562gT0.p(c2416z, "ex");
        a.z("error", c2416z.getMessage());
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.b(c2416z);
    }

    @InterfaceC9511sW0
    public static final void w(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @Nullable com.facebook.Y y, @Nullable String str) {
        a.z("error", str);
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.b(new com.facebook.A(y, str));
    }

    @InterfaceC9511sW0
    public static final void x(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @Nullable String str) {
        a.z("error", str);
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.b(new C2416z(str));
    }

    @InterfaceC9511sW0
    public static final void y(@Nullable InterfaceC2411u<e.a> interfaceC2411u, @Nullable String str) {
        a.z(C2356a.U, null);
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.a(new e.a(str));
    }

    public final C2357b c(int i, int i2, Intent intent) {
        com.facebook.internal.Z z = com.facebook.internal.Z.a;
        UUID s = com.facebook.internal.Z.s(intent);
        if (s == null) {
            return null;
        }
        return C2357b.d.b(s, i);
    }

    public final X.a d(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            com.facebook.internal.X x = com.facebook.internal.X.a;
            return com.facebook.internal.X.d(uuid, bitmap);
        } else if (uri != null) {
            com.facebook.internal.X x2 = com.facebook.internal.X.a;
            return com.facebook.internal.X.e(uuid, uri);
        } else {
            return null;
        }
    }

    public final X.a e(UUID uuid, F32<?, ?> f32) {
        Uri uri;
        Bitmap bitmap;
        if (f32 instanceof L32) {
            L32 l32 = (L32) f32;
            bitmap = l32.d();
            uri = l32.f();
        } else if (f32 instanceof R32) {
            uri = ((R32) f32).d();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return d(uuid, uri, bitmap);
    }

    public final void z(String str, String str2) {
        com.facebook.M m = com.facebook.M.a;
        com.facebook.appevents.K k = new com.facebook.appevents.K(com.facebook.M.n());
        Bundle bundle = new Bundle();
        bundle.putString(C2356a.T, str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        k.m(C2356a.l0, bundle);
    }
}
