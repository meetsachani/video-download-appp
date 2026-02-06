package o;

import android.content.SharedPreferences;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Dd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2723Dd {
    public static final String A = "admob_back_interstitial_id_list";
    public static final String B = "native_border_show";
    public static final String C = "bottom_type";
    public static final String D = "admob_native_bottom_two";
    public static final String E = "admob_bottom_native_list";
    public static final String F = "admob_bannerad_id";
    public static final String G = "admob_banner_list";
    public static final String H = "facebook_interstitialAd_id";
    public static final String I = "facebook_native_banner_id";
    public static final String J = "facebook_native_id";
    public static final String K = "ads_show_type";
    public static final String L = "facebook_interstitial_list";
    public static final String M = "fb_native_list";
    public static final String N = "fb_native_banner_list";
    public static final String O = "Whatsapp_URI";
    public static final String P = "BusinessWhatsapp_URI";
    public static final String Q = "big_native_quiz_show";
    public static final String R = "ads_imagelist";
    public static final String S = "small_native_quiz_show";
    public static final String T = "send_minute";
    public static final String U = "native_ad_pos";
    public static final String V = "inter_ads_type";
    public static final String W = "one_by_one";
    public static final String X = "quiz_text";
    public static final String Y = "collapseBanner";
    public static final String Z = "bottom_show_type";
    public static final String a = "native_show_page";
    public static final String a0 = "StateNameVPN";
    public static final String b = "quiz_link";
    public static final String b0 = "CountryNmeVPN";
    public static final String c = "native_ads_button_color";
    public static final String c0 = "CityNameVPN";
    public static final String d = "native_btn_text_color";
    public static final String d0 = "marketingapp";
    public static final String e = "admob_native_background_color";
    public static final String e0 = "mvideoList";
    public static final String f = "ads_show_type_manage";
    public static final String f0 = "imageSheetUrl";
    public static final String g = "native_ads_type";
    public static final String g0 = "videoSheetUrl";
    public static final String h = "other_bodytxtcolor";
    public static final String h0 = "nameSheetUrl";
    public static final String i = "ads_click_show";
    public static final String i0 = "reels_sheet_uri";
    public static final String j = "back_ads_click_show";
    public static final String j0 = "video_failed_list";
    public static final String k = "all_quiz_show";
    public static final String k0 = "ntvimageList";
    public static final String l = "appopenad_id";
    public static final String l0 = "native_img_show";
    public static final String m = "admob_interstitialAd_id";
    public static final String m0 = "quiz_open_count";
    public static final String n = "admob_native_ads_id";
    public static final String n0 = "inter_by_quiz_show";

    /* renamed from: o  reason: collision with root package name */
    public static final String f441o = "quiz_direct_open_link";
    public static final String o0 = "quiz_click";
    public static final String p = "coming_soon";
    public static final String p0 = "back_quiz_click";
    public static final String q = "exit_ads";
    public static final String q0 = "dialog_native_show";
    public static final String r = "package";
    public static final String r0 = "nativeadspriority";
    public static final String s = "privacy_policy";
    public static final String s0 = "native_id_2";
    public static final String t = "screen_show";
    public static int t0 = 0;
    public static final String u = "referrerUrl";
    public static int u0 = 0;
    public static final String v = "admobappopenids_list";
    public static int v0 = 0;
    public static final String w = "admob_interstitial_list";
    public static int w0 = 0;
    public static final String x = "admob_native_list";
    public static final String y = "link_close_appopen_show";
    public static final String z = "admob_back_interstitialAd_id";

    /* renamed from: o.Dd$a */
    /* loaded from: classes3.dex */
    public class a extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$b */
    /* loaded from: classes3.dex */
    public class b extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$c */
    /* loaded from: classes3.dex */
    public class c extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$d */
    /* loaded from: classes3.dex */
    public class d extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$e */
    /* loaded from: classes3.dex */
    public class e extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$f */
    /* loaded from: classes3.dex */
    public class f extends Rv2<ArrayList<C2904Ez>> {
    }

    /* renamed from: o.Dd$g */
    /* loaded from: classes3.dex */
    public class g extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$h */
    /* loaded from: classes3.dex */
    public class h extends Rv2<ArrayList<G7>> {
    }

    /* renamed from: o.Dd$i */
    /* loaded from: classes3.dex */
    public class i extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$j */
    /* loaded from: classes3.dex */
    public class j extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$k */
    /* loaded from: classes3.dex */
    public class k extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$l */
    /* loaded from: classes3.dex */
    public class l extends Rv2<ArrayList<String>> {
    }

    /* renamed from: o.Dd$m */
    /* loaded from: classes3.dex */
    public class m extends Rv2<ArrayList<String>> {
    }

    public static boolean A() {
        return a().getBoolean(q0, false);
    }

    public static void A0(String str) {
        a().edit().putString(F, str).apply();
    }

    public static void A1(String str) {
        a().edit().putString(u, str).apply();
    }

    public static boolean B() {
        return a().getBoolean(q, false);
    }

    public static void B0(String str) {
        a().edit().putString(m, str).apply();
    }

    public static void B1(String str) {
        a().edit().putString(i0, str).apply();
    }

    public static String C() {
        return a().getString(H, "");
    }

    public static void C0(String str) {
        a().edit().putString(n, str).apply();
    }

    public static void C1(int i2) {
        a().edit().putInt(t, i2).apply();
    }

    public static String D() {
        return a().getString(I, "");
    }

    public static void D0(String str) {
        a().edit().putString(e, str).apply();
    }

    public static void D1(int i2) {
        a().edit().putInt(T, i2).apply();
    }

    public static String E() {
        return a().getString(J, "");
    }

    public static void E0(String str) {
        a().edit().putString(D, str).apply();
    }

    public static void E1(boolean z2) {
        a().edit().putBoolean(S, z2).apply();
    }

    public static String F() {
        return a().getString(f0, "");
    }

    public static void F0(int i2) {
        a().edit().putInt(i, i2).apply();
    }

    public static void F1(String str) {
        a().edit().putString(a0, str).apply();
    }

    public static boolean G() {
        return a().getBoolean(n0, false);
    }

    public static void G0(List<G7> list) {
        a().edit().putString(R, new C5523cF0().C(list)).apply();
    }

    public static void G1(String str) {
        a().edit().putString(j0, str).apply();
    }

    public static String H() {
        return a().getString(V, "");
    }

    public static void H0(String str) {
        a().edit().putString(K, str).apply();
    }

    public static void H1(String str) {
        a().edit().putString(g0, str).apply();
    }

    public static boolean I() {
        return a().getBoolean(y, false);
    }

    public static void I0(String str) {
        a().edit().putString(f, str).apply();
    }

    public static void I1(String str) {
        a().edit().putString(O, str).apply();
    }

    public static boolean J() {
        return a().getBoolean(d0, false);
    }

    public static void J0(boolean z2) {
        a().edit().putBoolean(k, z2).apply();
    }

    public static void J1(List<String> list) {
        a().edit().putString(v, new C5523cF0().C(list)).apply();
    }

    public static String K() {
        return a().getString(h0, "");
    }

    public static void K0(String str) {
        a().edit().putString(l, str).apply();
    }

    public static void K1(List<String> list) {
        a().edit().putString(A, new C5523cF0().C(list)).apply();
    }

    public static int L() {
        return a().getInt(U, 0);
    }

    public static void L0(int i2) {
        u0 = i2;
    }

    public static void L1(List<String> list) {
        a().edit().putString(G, new C5523cF0().C(list)).apply();
    }

    public static String M() {
        return a().getString(h, "");
    }

    public static void M0(int i2) {
        a().edit().putInt(j, i2).apply();
    }

    public static void M1(List<String> list) {
        a().edit().putString(E, new C5523cF0().C(list)).apply();
    }

    public static String N() {
        return a().getString(c, "");
    }

    public static void N0(int i2) {
        a().edit().putInt(p0, i2).apply();
    }

    public static void N1(List<String> list) {
        a().edit().putString(w, new C5523cF0().C(list)).apply();
    }

    public static int O() {
        return a().getInt(r0, 0);
    }

    public static void O0(boolean z2) {
        a().edit().putBoolean(Q, z2).apply();
    }

    public static void O1(List<String> list) {
        a().edit().putString(x, new C5523cF0().C(list)).apply();
    }

    public static String P() {
        return a().getString(g, "");
    }

    public static void P0(int i2) {
        v0 = i2;
    }

    public static void P1(List<String> list) {
        a().edit().putString(L, new C5523cF0().C(list)).apply();
    }

    public static boolean Q() {
        return a().getBoolean(B, false);
    }

    public static void Q0(String str) {
        a().edit().putString(C, str).apply();
    }

    public static void Q1(List<String> list) {
        a().edit().putString(N, new C5523cF0().C(list)).apply();
    }

    public static String R() {
        return a().getString(d, "");
    }

    public static void R0(String str) {
        a().edit().putString(Z, str).apply();
    }

    public static void R1(List<String> list) {
        a().edit().putString(M, new C5523cF0().C(list)).apply();
    }

    public static String S() {
        return a().getString(s0, "");
    }

    public static void S0(String str) {
        a().edit().putString(P, str).apply();
    }

    public static void S1(List<String> list) {
        a().edit().putString(b, new C5523cF0().C(list)).apply();
    }

    public static List<String> T() {
        return (ArrayList) new C5523cF0().m(a().getString(k0, ""), new e().g());
    }

    public static void T0(String str) {
        a().edit().putString(c0, str).apply();
    }

    public static void T1(ArrayList<C2904Ez> arrayList) {
        a().edit().putString(e0, new C5523cF0().C(arrayList)).apply();
    }

    public static boolean U() {
        return a().getBoolean(l0, false);
    }

    public static void U0(boolean z2) {
        a().edit().putBoolean(Y, z2).apply();
    }

    public static void U1(int i2) {
        w0 = i2;
    }

    public static int V() {
        return a().getInt(a, 0);
    }

    public static void V0(boolean z2) {
        a().edit().putBoolean(p, z2).apply();
    }

    public static boolean W() {
        return a().getBoolean(W, false);
    }

    public static void W0(String str) {
        a().edit().putString(b0, str).apply();
    }

    public static String X() {
        return a().getString("package", "");
    }

    public static void X0(boolean z2) {
        a().edit().putBoolean(q0, z2).apply();
    }

    public static String Y() {
        return a().getString(s, "");
    }

    public static void Y0(boolean z2) {
        a().edit().putBoolean(q, z2).apply();
    }

    public static int Z() {
        return a().getInt(o0, 1);
    }

    public static void Z0(String str) {
        a().edit().putString(H, str).apply();
    }

    public static SharedPreferences a() {
        return MyApplication.f().getSharedPreferences("Application_My", 0);
    }

    public static int a0() {
        return a().getInt(m0, 1);
    }

    public static void a1(String str) {
        a().edit().putString(I, str).apply();
    }

    public static int b() {
        return t0;
    }

    public static String b0() {
        return a().getString(X, "");
    }

    public static void b1(String str) {
        a().edit().putString(J, str).apply();
    }

    public static String c() {
        return a().getString(z, "");
    }

    public static boolean c0() {
        return a().getBoolean(f441o, false);
    }

    public static void c1(String str) {
        a().edit().putString(f0, str).apply();
    }

    public static String d() {
        return a().getString(F, "");
    }

    public static String d0() {
        return a().getString(u, "native");
    }

    public static void d1(boolean z2) {
        a().edit().putBoolean(n0, z2).apply();
    }

    public static String e() {
        return a().getString(m, "");
    }

    public static String e0() {
        return a().getString(i0, "");
    }

    public static void e1(String str) {
        a().edit().putString(V, str).apply();
    }

    public static String f() {
        return a().getString(n, "");
    }

    public static int f0() {
        return a().getInt(t, 1);
    }

    public static void f1(boolean z2) {
        a().edit().putBoolean(y, z2).apply();
    }

    public static String g() {
        return a().getString(e, "");
    }

    public static int g0() {
        return a().getInt(T, 0);
    }

    public static void g1(boolean z2) {
        a().edit().putBoolean(d0, z2).apply();
    }

    public static String h() {
        return a().getString(D, "");
    }

    public static boolean h0() {
        return a().getBoolean(S, false);
    }

    public static void h1(String str) {
        a().edit().putString(h0, str).apply();
    }

    public static int i() {
        return a().getInt(i, 0);
    }

    public static String i0() {
        return a().getString(a0, "");
    }

    public static void i1(int i2) {
        a().edit().putInt(U, i2).apply();
    }

    public static List<G7> j() {
        return (ArrayList) new C5523cF0().m(a().getString(R, ""), new h().g());
    }

    public static String j0() {
        return a().getString(j0, "");
    }

    public static void j1(String str) {
        a().edit().putString(h, str).apply();
    }

    public static String k() {
        return a().getString(K, "");
    }

    public static String k0() {
        return a().getString(g0, "");
    }

    public static void k1(String str) {
        a().edit().putString(c, str).apply();
    }

    public static String l() {
        return a().getString(f, "");
    }

    public static String l0() {
        return a().getString(O, "");
    }

    public static void l1(int i2) {
        a().edit().putInt(r0, i2).apply();
    }

    public static boolean m() {
        return a().getBoolean(k, false);
    }

    public static List<String> m0() {
        return (ArrayList) new C5523cF0().m(a().getString(v, ""), new d().g());
    }

    public static void m1(String str) {
        a().edit().putString(g, str).apply();
    }

    public static String n() {
        return a().getString(l, "");
    }

    public static List<String> n0() {
        return (ArrayList) new C5523cF0().m(a().getString(A, ""), new a().g());
    }

    public static void n1(boolean z2) {
        a().edit().putBoolean(B, z2).apply();
    }

    public static int o() {
        return u0;
    }

    public static List<String> o0() {
        return (ArrayList) new C5523cF0().m(a().getString(G, ""), new l().g());
    }

    public static void o1(String str) {
        a().edit().putString(d, str).apply();
    }

    public static int p() {
        return a().getInt(j, 0);
    }

    public static List<String> p0() {
        return (ArrayList) new C5523cF0().m(a().getString(E, ""), new m().g());
    }

    public static void p1(String str) {
        a().edit().putString(s0, str).apply();
    }

    public static int q() {
        return a().getInt(p0, 1);
    }

    public static List<String> q0() {
        return (ArrayList) new C5523cF0().m(a().getString(w, ""), new c().g());
    }

    public static void q1(List<String> list) {
        a().edit().putString(k0, new C5523cF0().C(list)).apply();
    }

    public static boolean r() {
        return a().getBoolean(Q, false);
    }

    public static List<String> r0() {
        return (ArrayList) new C5523cF0().m(a().getString(x, ""), new b().g());
    }

    public static void r1(boolean z2) {
        a().edit().putBoolean(l0, z2).apply();
    }

    public static int s() {
        return v0;
    }

    public static List<String> s0() {
        return (ArrayList) new C5523cF0().m(a().getString(L, ""), new k().g());
    }

    public static void s1(int i2) {
        a().edit().putInt(a, i2).apply();
    }

    public static String t() {
        return a().getString(Z, "");
    }

    public static List<String> t0() {
        return (ArrayList) new C5523cF0().m(a().getString(N, ""), new i().g());
    }

    public static void t1(boolean z2) {
        a().edit().putBoolean(W, z2).apply();
    }

    public static String u() {
        return a().getString(C, "native_banner");
    }

    public static List<String> u0() {
        return (ArrayList) new C5523cF0().m(a().getString(M, ""), new j().g());
    }

    public static void u1(String str) {
        a().edit().putString("package", str).apply();
    }

    public static String v() {
        return a().getString(P, "");
    }

    public static List<String> v0() {
        return (ArrayList) new C5523cF0().m(a().getString(b, ""), new g().g());
    }

    public static void v1(String str) {
        a().edit().putString(s, str).apply();
    }

    public static String w() {
        return a().getString(c0, "");
    }

    public static ArrayList<C2904Ez> w0() {
        return (ArrayList) new C5523cF0().m(a().getString(e0, ""), new f().g());
    }

    public static void w1(int i2) {
        a().edit().putInt(o0, i2).apply();
    }

    public static boolean x() {
        return a().getBoolean(Y, false);
    }

    public static int x0() {
        return w0;
    }

    public static void x1(int i2) {
        a().edit().putInt(m0, i2).apply();
    }

    public static boolean y() {
        return a().getBoolean(p, false);
    }

    public static void y0(int i2) {
        t0 = i2;
    }

    public static void y1(String str) {
        a().edit().putString(X, str).apply();
    }

    public static String z() {
        return a().getString(b0, "");
    }

    public static void z0(String str) {
        a().edit().putString(z, str).apply();
    }

    public static void z1(boolean z2) {
        a().edit().putBoolean(f441o, z2).apply();
    }
}
