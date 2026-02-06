package o;

import android.os.Bundle;
import android.view.View;
import com.facebook.S;
import com.facebook.internal.C2359d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import o.C9072qk1;
import o.HT1;
import o.OH2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.X})
/* loaded from: classes2.dex */
public final class OH2 implements View.OnClickListener {
    @NotNull
    public static final String a1 = "%s/suggested_events";
    @NotNull
    public static final String b1 = "other";
    @Nullable
    public final View.OnClickListener X;
    @NotNull
    public final WeakReference<View> Y;
    @NotNull
    public final String Y0;
    @NotNull
    public final WeakReference<View> Z;
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public static final Set<Integer> c1 = new HashSet();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final void g(String str, String str2) {
            C6562gT0.p(str, "$queriedEvent");
            C6562gT0.p(str2, "$buttonText");
            OH2.Z0.e(str, str2, new float[0]);
        }

        @InterfaceC9511sW0
        public final void d(@NotNull View view, @NotNull View view2, @NotNull String str) {
            C6562gT0.p(view, "hostView");
            C6562gT0.p(view2, "rootView");
            C6562gT0.p(str, "activityName");
            int hashCode = view.hashCode();
            if (!OH2.b().contains(Integer.valueOf(hashCode))) {
                C9455sH2 c9455sH2 = C9455sH2.a;
                C9455sH2.r(view, new OH2(view, view2, str, null));
                OH2.b().add(Integer.valueOf(hashCode));
            }
        }

        public final void e(String str, String str2, float[] fArr) {
            C6857hh2 c6857hh2 = C6857hh2.a;
            if (C6857hh2.g(str)) {
                com.facebook.M m = com.facebook.M.a;
                new com.facebook.appevents.K(com.facebook.M.n()).k(str, str2);
            } else if (C6857hh2.e(str)) {
                h(str, str2, fArr);
            }
        }

        public final boolean f(String str, final String str2) {
            C8228nG1 c8228nG1 = C8228nG1.a;
            final String d = C8228nG1.d(str);
            if (d == null) {
                return false;
            }
            if (!C6562gT0.g(d, "other")) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.G0(new Runnable() { // from class: o.NH2
                    @Override // java.lang.Runnable
                    public final void run() {
                        OH2.a.g(d, str2);
                    }
                });
                return true;
            }
            return true;
        }

        public final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString(C2359d.e, str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i = 0;
                while (i < length) {
                    float f = fArr[i];
                    i++;
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                S.c cVar = com.facebook.S.n;
                C8319ne2 c8319ne2 = C8319ne2.a;
                Locale locale = Locale.US;
                com.facebook.M m = com.facebook.M.a;
                String format = String.format(locale, OH2.a1, Arrays.copyOf(new Object[]{com.facebook.M.o()}, 1));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                com.facebook.S N = cVar.N(null, format, null, null);
                N.r0(bundle);
                N.l();
            } catch (JSONException unused) {
            }
        }

        public a() {
        }
    }

    public /* synthetic */ OH2(View view, View view2, String str, C9516sY c9516sY) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (SQ.e(OH2.class)) {
            return null;
        }
        try {
            return c1;
        } catch (Throwable th) {
            SQ.c(th, OH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull View view, @NotNull View view2, @NotNull String str) {
        if (SQ.e(OH2.class)) {
            return;
        }
        try {
            Z0.d(view, view2, str);
        } catch (Throwable th) {
            SQ.c(th, OH2.class);
        }
    }

    public static final void f(JSONObject jSONObject, String str, OH2 oh2, String str2) {
        if (!SQ.e(OH2.class)) {
            try {
                C6562gT0.p(jSONObject, "$viewData");
                C6562gT0.p(str, "$buttonText");
                C6562gT0.p(oh2, "this$0");
                C6562gT0.p(str2, "$pathID");
                try {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.M m = com.facebook.M.a;
                    String v = com.facebook.internal.l0.v(com.facebook.M.n());
                    if (v != null) {
                        String lowerCase = v.toLowerCase();
                        C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                        C3167Hn0 c3167Hn0 = C3167Hn0.a;
                        float[] a2 = C3167Hn0.a(jSONObject, lowerCase);
                        String c = C3167Hn0.c(str, oh2.Y0, lowerCase);
                        if (a2 != null) {
                            C9072qk1 c9072qk1 = C9072qk1.a;
                            String[] q = C9072qk1.q(C9072qk1.a.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{c});
                            if (q != null) {
                                String str3 = q[0];
                                C8228nG1 c8228nG1 = C8228nG1.a;
                                C8228nG1.a(str2, str3);
                                if (!C6562gT0.g(str3, "other")) {
                                    Z0.e(str3, str, a2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, OH2.class);
            }
        }
    }

    public final void d(final String str, final String str2, final JSONObject jSONObject) {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.G0(new Runnable() { // from class: o.MH2
                @Override // java.lang.Runnable
                public final void run() {
                    OH2.f(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void g() {
        if (!SQ.e(this)) {
            try {
                View view = this.Y.get();
                View view2 = this.Z.get();
                if (view != null && view2 != null) {
                    try {
                        C6359fh2 c6359fh2 = C6359fh2.a;
                        String d = C6359fh2.d(view2);
                        C8228nG1 c8228nG1 = C8228nG1.a;
                        String b = C8228nG1.b(view2, d);
                        if (b != null && !Z0.f(b, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C9698tH2.A, C6359fh2.b(view, view2));
                            jSONObject.put(C9698tH2.z, this.Y0);
                            d(b, d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this)) {
                    try {
                        C6562gT0.p(view, C9698tH2.A);
                        View.OnClickListener onClickListener = this.X;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        g();
                    } catch (Throwable th) {
                        SQ.c(th, this);
                    }
                }
            } catch (Throwable th2) {
                SQ.c(th2, this);
            }
        }
    }

    public OH2(View view, View view2, String str) {
        C9455sH2 c9455sH2 = C9455sH2.a;
        this.X = C9455sH2.g(view);
        this.Y = new WeakReference<>(view2);
        this.Z = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.Y0 = C9545sf2.z2(lowerCase, androidx.appcompat.widget.b.r, "", false, 4, null);
    }
}
