package o;

import android.os.Bundle;
import com.facebook.C2416z;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Ao1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2475Ao1 {
    @NotNull
    public static final C2475Ao1 a = new C2475Ao1();

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle a(@NotNull UUID uuid, @NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
        C6562gT0.p(uuid, "callId");
        C6562gT0.p(abstractC9885u32, "shareContent");
        if (abstractC9885u32 instanceof E32) {
            return a.c((E32) abstractC9885u32, z);
        }
        if (abstractC9885u32 instanceof M32) {
            D32 d32 = D32.a;
            M32 m32 = (M32) abstractC9885u32;
            List<String> j = D32.j(m32, uuid);
            if (j == null) {
                j = C8222nF.H();
            }
            return a.e(m32, j, z);
        } else if (abstractC9885u32 instanceof S32) {
            D32 d322 = D32.a;
            S32 s32 = (S32) abstractC9885u32;
            return a.g(s32, D32.p(s32, uuid), z);
        } else if (abstractC9885u32 instanceof G32) {
            D32 d323 = D32.a;
            G32 g32 = (G32) abstractC9885u32;
            List<Bundle> h = D32.h(g32, uuid);
            if (h == null) {
                h = C8222nF.H();
            }
            return a.d(g32, h, z);
        } else if (abstractC9885u32 instanceof C9156r32) {
            D32 d324 = D32.a;
            C9156r32 c9156r32 = (C9156r32) abstractC9885u32;
            return a.b(c9156r32, D32.n(c9156r32, uuid), z);
        } else if (abstractC9885u32 instanceof O32) {
            D32 d325 = D32.a;
            O32 o32 = (O32) abstractC9885u32;
            return a.f(o32, D32.f(o32, uuid), D32.m(o32, uuid), z);
        } else {
            return null;
        }
    }

    public final Bundle b(C9156r32 c9156r32, Bundle bundle, boolean z) {
        Bundle h = h(c9156r32, z);
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(h, C9642t32.h0, c9156r32.k());
        if (bundle != null) {
            h.putBundle(C9642t32.j0, bundle);
        }
        try {
            C4372Tw c4372Tw = C4372Tw.a;
            JSONObject b = C4372Tw.b(c9156r32.h());
            if (b != null) {
                com.facebook.internal.l0.u0(h, C9642t32.i0, b.toString());
                return h;
            }
            return h;
        } catch (JSONException e) {
            throw new C2416z(C6562gT0.C("Unable to create a JSON Object from the provided CameraEffectArguments: ", e.getMessage()));
        }
    }

    public final Bundle c(E32 e32, boolean z) {
        Bundle h = h(e32, z);
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(h, C9642t32.b0, e32.h());
        com.facebook.internal.l0.v0(h, C9642t32.K, e32.a());
        com.facebook.internal.l0.v0(h, C9642t32.T, e32.a());
        return h;
    }

    public final Bundle d(G32 g32, List<Bundle> list, boolean z) {
        Bundle h = h(g32, z);
        h.putParcelableArrayList(C9642t32.c0, new ArrayList<>(list));
        return h;
    }

    public final Bundle e(M32 m32, List<String> list, boolean z) {
        Bundle h = h(m32, z);
        h.putStringArrayList(C9642t32.Z, new ArrayList<>(list));
        return h;
    }

    public final Bundle f(O32 o32, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle h = h(o32, z);
        if (bundle != null) {
            h.putParcelable(C9642t32.T0, bundle);
        }
        if (bundle2 != null) {
            h.putParcelable(C9642t32.U0, bundle2);
        }
        List<String> m = o32.m();
        if (m != null && !m.isEmpty()) {
            h.putStringArrayList(C9642t32.R0, new ArrayList<>(m));
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(h, C9642t32.S0, o32.h());
        return h;
    }

    public final Bundle g(S32 s32, String str, boolean z) {
        Bundle h = h(s32, z);
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(h, C9642t32.N, s32.k());
        com.facebook.internal.l0.u0(h, C9642t32.W, s32.h());
        com.facebook.internal.l0.u0(h, "VIDEO", str);
        return h;
    }

    public final Bundle h(AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
        String a2;
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.v0(bundle, C9642t32.J, abstractC9885u32.a());
        com.facebook.internal.l0.u0(bundle, C9642t32.G, abstractC9885u32.d());
        com.facebook.internal.l0.u0(bundle, C9642t32.I, abstractC9885u32.b());
        com.facebook.internal.l0.u0(bundle, C9642t32.X, abstractC9885u32.e());
        com.facebook.internal.l0.u0(bundle, C9642t32.X, abstractC9885u32.e());
        bundle.putBoolean(C9642t32.Y, z);
        List<String> c = abstractC9885u32.c();
        if (c != null && !c.isEmpty()) {
            bundle.putStringArrayList(C9642t32.H, new ArrayList<>(c));
        }
        A32 f = abstractC9885u32.f();
        if (f == null) {
            a2 = null;
        } else {
            a2 = f.a();
        }
        com.facebook.internal.l0.u0(bundle, C9642t32.L, a2);
        return bundle;
    }
}
