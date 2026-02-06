package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.FacebookActivity;
import com.facebook.S;
import com.facebook.W;
import com.facebook.Y;
import com.facebook.Z;
import com.facebook.common.b;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2379y;
import com.facebook.internal.c0;
import com.facebook.internal.d0;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import com.facebook.login.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ActivityC4864Yy0;
import o.BY0;
import o.C5475c30;
import o.C6562gT0;
import o.C8319ne2;
import o.C8926q81;
import o.C9516sY;
import o.C9998uW1;
import o.DialogInterface$OnCancelListenerC6458g30;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2397n extends DialogInterface$OnCancelListenerC6458g30 {
    @NotNull
    public static final String W2 = "request_state";
    public static final int X2 = 1349172;
    public static final int Y2 = 1349173;
    public static final int a3 = 1349152;
    public View I2;
    public TextView J2;
    public TextView K2;
    @Nullable
    public C2398o L2;
    @NotNull
    public final AtomicBoolean M2 = new AtomicBoolean();
    @Nullable
    public volatile W N2;
    @Nullable
    public volatile ScheduledFuture<?> O2;
    @Nullable
    public volatile c P2;
    public boolean Q2;
    public boolean R2;
    @Nullable
    public w.e S2;
    @NotNull
    public static final a T2 = new a(null);
    @NotNull
    public static final String U2 = "device/login";
    @NotNull
    public static final String V2 = "device/login_status";
    public static final int Z2 = 1349174;

    /* renamed from: com.facebook.login.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC5056aJ2
        public static /* synthetic */ void c() {
        }

        @InterfaceC5056aJ2
        public static /* synthetic */ void e() {
        }

        @InterfaceC5056aJ2
        public static /* synthetic */ void g() {
        }

        @NotNull
        public final String b() {
            return C2397n.U2;
        }

        @NotNull
        public final String d() {
            return C2397n.V2;
        }

        public final int f() {
            return C2397n.Z2;
        }

        public final b h(JSONObject jSONObject) throws JSONException {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString2 = optJSONObject.optString("permission");
                    C6562gT0.o(optString2, "permission");
                    if (optString2.length() != 0 && !C6562gT0.g(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.login.n$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NotNull
        public List<String> a;
        @NotNull
        public List<String> b;
        @NotNull
        public List<String> c;

        public b(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
            C6562gT0.p(list, "grantedPermissions");
            C6562gT0.p(list2, C9998uW1.r);
            C6562gT0.p(list3, C9998uW1.s);
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        @NotNull
        public final List<String> a() {
            return this.b;
        }

        @NotNull
        public final List<String> b() {
            return this.c;
        }

        @NotNull
        public final List<String> c() {
            return this.a;
        }

        public final void d(@NotNull List<String> list) {
            C6562gT0.p(list, "<set-?>");
            this.b = list;
        }

        public final void e(@NotNull List<String> list) {
            C6562gT0.p(list, "<set-?>");
            this.c = list;
        }

        public final void f(@NotNull List<String> list) {
            C6562gT0.p(list, "<set-?>");
            this.a = list;
        }
    }

    /* renamed from: com.facebook.login.n$c */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable {
        @Nullable
        public String X;
        @Nullable
        public String Y;
        public long Y0;
        @Nullable
        public String Z;
        public long Z0;
        @NotNull
        public static final b a1 = new b(null);
        @InterfaceC7058iW0
        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: com.facebook.login.n$c$a */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public c createFromParcel(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        /* renamed from: com.facebook.login.n$c$b */
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            public b() {
            }
        }

        public c() {
        }

        @Nullable
        public final String a() {
            return this.X;
        }

        public final long b() {
            return this.Y0;
        }

        @Nullable
        public final String c() {
            return this.Z;
        }

        @Nullable
        public final String d() {
            return this.Y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j) {
            this.Y0 = j;
        }

        public final void f(long j) {
            this.Z0 = j;
        }

        public final void g(@Nullable String str) {
            this.Z = str;
        }

        public final void h(@Nullable String str) {
            this.Y = str;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            this.X = format;
        }

        public final boolean k() {
            if (this.Z0 == 0 || (new Date().getTime() - this.Z0) - (this.Y0 * 1000) >= 0) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            C6562gT0.p(parcel, "dest");
            parcel.writeString(this.X);
            parcel.writeString(this.Y);
            parcel.writeString(this.Z);
            parcel.writeLong(this.Y0);
            parcel.writeLong(this.Z0);
        }

        public c(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            this.X = parcel.readString();
            this.Y = parcel.readString();
            this.Z = parcel.readString();
            this.Y0 = parcel.readLong();
            this.Z0 = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.n$d */
    /* loaded from: classes2.dex */
    public static final class d extends Dialog {
        public d(ActivityC4864Yy0 activityC4864Yy0, int i) {
            super(activityC4864Yy0, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (C2397n.this.w3()) {
                super.onBackPressed();
            }
        }
    }

    public static final void A3(C2397n c2397n, String str, Date date, Date date2, Y y) {
        C2397n c2397n2;
        JSONException jSONException;
        EnumSet<d0> w;
        C6562gT0.p(c2397n, "this$0");
        C6562gT0.p(str, "$accessToken");
        C6562gT0.p(y, "response");
        if (c2397n.M2.get()) {
            return;
        }
        com.facebook.C g = y.g();
        if (g != null) {
            C2416z q = g.q();
            if (q == null) {
                q = new C2416z();
            }
            c2397n.y3(q);
            return;
        }
        try {
            JSONObject i = y.i();
            if (i == null) {
                try {
                    i = new JSONObject();
                } catch (JSONException e) {
                    jSONException = e;
                    c2397n2 = c2397n;
                    c2397n2.y3(new C2416z(jSONException));
                    return;
                }
            }
            String string = i.getString("id");
            C6562gT0.o(string, "jsonObject.getString(\"id\")");
            b h = T2.h(i);
            String string2 = i.getString("name");
            C6562gT0.o(string2, "jsonObject.getString(\"name\")");
            c cVar = c2397n.P2;
            if (cVar != null) {
                C5475c30 c5475c30 = C5475c30.a;
                C5475c30.a(cVar.d());
            }
            com.facebook.internal.C c2 = com.facebook.internal.C.a;
            com.facebook.M m = com.facebook.M.a;
            C2379y f = com.facebook.internal.C.f(com.facebook.M.o());
            Boolean bool = null;
            if (f != null && (w = f.w()) != null) {
                bool = Boolean.valueOf(w.contains(d0.RequireConfirm));
            }
            if (C6562gT0.g(bool, Boolean.TRUE) && !c2397n.R2) {
                c2397n.R2 = true;
                c2397n.C3(string, h, str, string2, date, date2);
                return;
            }
            c2397n.q3(string, h, str, date, date2);
        } catch (JSONException e2) {
            c2397n2 = c2397n;
            jSONException = e2;
        }
    }

    public static final void D3(C2397n c2397n, String str, b bVar, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        C6562gT0.p(c2397n, "this$0");
        C6562gT0.p(str, "$userId");
        C6562gT0.p(bVar, "$permissions");
        C6562gT0.p(str2, "$accessToken");
        c2397n.q3(str, bVar, str2, date, date2);
    }

    public static final void E3(C2397n c2397n, DialogInterface dialogInterface, int i) {
        C6562gT0.p(c2397n, "this$0");
        View u3 = c2397n.u3(false);
        Dialog N2 = c2397n.N2();
        if (N2 != null) {
            N2.setContentView(u3);
        }
        w.e eVar = c2397n.S2;
        if (eVar == null) {
            return;
        }
        c2397n.I3(eVar);
    }

    public static final void G3(C2397n c2397n) {
        C6562gT0.p(c2397n, "this$0");
        c2397n.B3();
    }

    public static final void J3(C2397n c2397n, Y y) {
        C2416z q;
        C6562gT0.p(c2397n, "this$0");
        C6562gT0.p(y, "response");
        if (c2397n.Q2) {
            return;
        }
        if (y.g() != null) {
            com.facebook.C g = y.g();
            if (g == null) {
                q = null;
            } else {
                q = g.q();
            }
            if (q == null) {
                q = new C2416z();
            }
            c2397n.y3(q);
            return;
        }
        JSONObject i = y.i();
        if (i == null) {
            i = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.h(i.getString("user_code"));
            cVar.g(i.getString("code"));
            cVar.e(i.getLong("interval"));
            c2397n.H3(cVar);
        } catch (JSONException e) {
            c2397n.y3(new C2416z(e));
        }
    }

    public static final void l3(C2397n c2397n, Y y) {
        C2416z q;
        C6562gT0.p(c2397n, "this$0");
        C6562gT0.p(y, "response");
        if (c2397n.M2.get()) {
            return;
        }
        com.facebook.C g = y.g();
        if (g != null) {
            int v = g.v();
            if (v == Z2 || v == 1349172) {
                c2397n.F3();
                return;
            } else if (v == 1349152) {
                c cVar = c2397n.P2;
                if (cVar != null) {
                    C5475c30 c5475c30 = C5475c30.a;
                    C5475c30.a(cVar.d());
                }
                w.e eVar = c2397n.S2;
                if (eVar != null) {
                    c2397n.I3(eVar);
                    return;
                } else {
                    c2397n.x3();
                    return;
                }
            } else if (v == 1349173) {
                c2397n.x3();
                return;
            } else {
                com.facebook.C g2 = y.g();
                if (g2 == null) {
                    q = null;
                } else {
                    q = g2.q();
                }
                if (q == null) {
                    q = new C2416z();
                }
                c2397n.y3(q);
                return;
            }
        }
        try {
            JSONObject i = y.i();
            if (i == null) {
                i = new JSONObject();
            }
            String string = i.getString("access_token");
            C6562gT0.o(string, "resultObject.getString(\"access_token\")");
            c2397n.z3(string, i.getLong(C0376a.i1), Long.valueOf(i.optLong(C0376a.k1)));
        } catch (JSONException e) {
            c2397n.y3(new C2416z(e));
        }
    }

    public static final void v3(C2397n c2397n, View view) {
        C6562gT0.p(c2397n, "this$0");
        c2397n.x3();
    }

    public final void B3() {
        c cVar = this.P2;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.N2 = t3().n();
    }

    public final void C3(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = Y().getString(b.l.W);
        C6562gT0.o(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = Y().getString(b.l.V);
        C6562gT0.o(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = Y().getString(b.l.U);
        C6562gT0.o(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(v());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2397n.D3(C2397n.this, str, bVar, str2, date, date2, dialogInterface, i);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2397n.E3(C2397n.this, dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public final void F3() {
        Long valueOf;
        c cVar = this.P2;
        if (cVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(cVar.b());
        }
        if (valueOf != null) {
            this.O2 = C2398o.c1.a().schedule(new Runnable() { // from class: com.facebook.login.k
                @Override // java.lang.Runnable
                public final void run() {
                    C2397n.G3(C2397n.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void H3(c cVar) {
        this.P2 = cVar;
        TextView textView = this.J2;
        if (textView != null) {
            textView.setText(cVar.d());
            C5475c30 c5475c30 = C5475c30.a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Y(), C5475c30.c(cVar.a()));
            TextView textView2 = this.K2;
            if (textView2 != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
                TextView textView3 = this.J2;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    View view = this.I2;
                    if (view != null) {
                        view.setVisibility(8);
                        if (!this.R2 && C5475c30.g(cVar.d())) {
                            new com.facebook.appevents.K(v()).l(C2356a.y0);
                        }
                        if (cVar.k()) {
                            F3();
                            return;
                        } else {
                            B3();
                            return;
                        }
                    }
                    C6562gT0.S("progressBar");
                    throw null;
                }
                C6562gT0.S("confirmationCode");
                throw null;
            }
            C6562gT0.S("instructions");
            throw null;
        }
        C6562gT0.S("confirmationCode");
        throw null;
    }

    public void I3(@NotNull w.e eVar) {
        Map J0;
        C6562gT0.p(eVar, "request");
        this.S2 = eVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", eVar.s()));
        l0 l0Var = l0.a;
        l0.u0(bundle, c0.w, eVar.k());
        l0.u0(bundle, C5475c30.d, eVar.h());
        bundle.putString("access_token", r3());
        C5475c30 c5475c30 = C5475c30.a;
        Map<String, String> p3 = p3();
        if (p3 == null) {
            J0 = null;
        } else {
            J0 = C8926q81.J0(p3);
        }
        bundle.putString(C5475c30.c, C5475c30.e(J0));
        com.facebook.S.n.O(null, U2, bundle, new S.b() { // from class: com.facebook.login.m
            @Override // com.facebook.S.b
            public final void a(Y y) {
                C2397n.J3(C2397n.this, y);
            }
        }).n();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View R0(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        c cVar;
        w N2;
        C6562gT0.p(layoutInflater, "inflater");
        View R0 = super.R0(layoutInflater, viewGroup, bundle);
        A a2 = (A) ((FacebookActivity) S1()).m1();
        I i = null;
        if (a2 != null && (N2 = a2.N2()) != null) {
            i = N2.q();
        }
        this.L2 = (C2398o) i;
        if (bundle == null || (cVar = (c) bundle.getParcelable(W2)) == null) {
            return R0;
        }
        H3(cVar);
        return R0;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    @NotNull
    public Dialog R2(@Nullable Bundle bundle) {
        boolean z;
        d dVar = new d(S1(), b.m.W5);
        C5475c30 c5475c30 = C5475c30.a;
        if (C5475c30.f() && !this.R2) {
            z = true;
        } else {
            z = false;
        }
        dVar.setContentView(u3(z));
        return dVar;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void U0() {
        this.Q2 = true;
        this.M2.set(true);
        super.U0();
        W w = this.N2;
        if (w != null) {
            w.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.O2;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void j1(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "outState");
        super.j1(bundle);
        if (this.P2 != null) {
            bundle.putParcelable(W2, this.P2);
        }
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        C6562gT0.p(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.Q2) {
            x3();
        }
    }

    @Nullable
    public Map<String, String> p3() {
        return null;
    }

    public final void q3(String str, b bVar, String str2, Date date, Date date2) {
        C2398o c2398o = this.L2;
        if (c2398o != null) {
            com.facebook.M m = com.facebook.M.a;
            c2398o.J(str2, com.facebook.M.o(), str, bVar.c(), bVar.a(), bVar.b(), EnumC2354h.DEVICE_AUTH, date, null, date2);
        }
        Dialog N2 = N2();
        if (N2 == null) {
            return;
        }
        N2.dismiss();
    }

    @NotNull
    public String r3() {
        StringBuilder sb = new StringBuilder();
        m0 m0Var = m0.a;
        sb.append(m0.c());
        sb.append('|');
        sb.append(m0.f());
        return sb.toString();
    }

    @BY0
    public int s3(boolean z) {
        if (z) {
            return b.k.H;
        }
        return b.k.F;
    }

    public final com.facebook.S t3() {
        String c2;
        Bundle bundle = new Bundle();
        c cVar = this.P2;
        if (cVar == null) {
            c2 = null;
        } else {
            c2 = cVar.c();
        }
        bundle.putString("code", c2);
        bundle.putString("access_token", r3());
        return com.facebook.S.n.O(null, V2, bundle, new S.b() { // from class: com.facebook.login.l
            @Override // com.facebook.S.b
            public final void a(Y y) {
                C2397n.l3(C2397n.this, y);
            }
        });
    }

    @NotNull
    public View u3(boolean z) {
        LayoutInflater layoutInflater = S1().getLayoutInflater();
        C6562gT0.o(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(s3(z), (ViewGroup) null);
        C6562gT0.o(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(b.h.o1);
        C6562gT0.o(findViewById, "view.findViewById(R.id.progress_bar)");
        this.I2 = findViewById;
        View findViewById2 = inflate.findViewById(b.h.z0);
        if (findViewById2 != null) {
            this.J2 = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(b.h.p0);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2397n.v3(C2397n.this, view);
                    }
                });
                View findViewById4 = inflate.findViewById(b.h.u0);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.K2 = textView;
                    textView.setText(Html.fromHtml(f0(b.l.B)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public boolean w3() {
        return true;
    }

    public void x3() {
        if (this.M2.compareAndSet(false, true)) {
            c cVar = this.P2;
            if (cVar != null) {
                C5475c30 c5475c30 = C5475c30.a;
                C5475c30.a(cVar.d());
            }
            C2398o c2398o = this.L2;
            if (c2398o != null) {
                c2398o.E();
            }
            Dialog N2 = N2();
            if (N2 == null) {
                return;
            }
            N2.dismiss();
        }
    }

    public void y3(@NotNull C2416z c2416z) {
        C6562gT0.p(c2416z, "ex");
        if (this.M2.compareAndSet(false, true)) {
            c cVar = this.P2;
            if (cVar != null) {
                C5475c30 c5475c30 = C5475c30.a;
                C5475c30.a(cVar.d());
            }
            C2398o c2398o = this.L2;
            if (c2398o != null) {
                c2398o.I(c2416z);
            }
            Dialog N2 = N2();
            if (N2 == null) {
                return;
            }
            N2.dismiss();
        }
    }

    public final void z3(final String str, long j, Long l) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j != 0) {
            date = new Date(new Date().getTime() + (j * 1000));
        } else {
            date = null;
        }
        if ((l == null || l.longValue() != 0) && l != null) {
            date2 = new Date(l.longValue() * 1000);
        }
        final Date date3 = date2;
        com.facebook.M m = com.facebook.M.a;
        final Date date4 = date;
        com.facebook.S H = com.facebook.S.n.H(new C0376a(str, com.facebook.M.o(), "0", null, null, null, null, date, null, date3, null, 1024, null), "me", new S.b() { // from class: com.facebook.login.j
            @Override // com.facebook.S.b
            public final void a(Y y) {
                C2397n.A3(C2397n.this, str, date4, date3, y);
            }
        });
        H.q0(Z.GET);
        H.r0(bundle);
        H.n();
    }
}
