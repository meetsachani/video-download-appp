package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.V;
import java.util.Arrays;
import java.util.Collection;
import o.C6562gT0;
import o.C8222nF;
import o.C8319ne2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c0 {
    @NotNull
    public static final String A = "sso";
    @NotNull
    public static final String B = "default_audience";
    @NotNull
    public static final String C = "sdk";
    @NotNull
    public static final String D = "state";
    @NotNull
    public static final String E = "fail_on_logged_out";
    @NotNull
    public static final String F = "cct_over_app_switch";
    @NotNull
    public static final String G = "messenger_page_id";
    @NotNull
    public static final String H = "reset_messenger_state";
    @NotNull
    public static final String I = "rerequest";
    @NotNull
    public static final String J = "fx_app";
    @NotNull
    public static final String K = "skip_dedupe";
    @NotNull
    public static final String L = "code,signed_request,graph_domain";
    @NotNull
    public static final String M = "token,signed_request,graph_domain,granted_scopes";
    @NotNull
    public static final String N = "token,signed_request,graph_domain";
    @NotNull
    public static final String O = "id_token,token,signed_request,graph_domain";
    @NotNull
    public static final String P = "true";
    @NotNull
    public static final String Q = "fbconnect://success";
    @NotNull
    public static final String R = "fbconnect://chrome_os_success";
    @NotNull
    public static final String S = "fbconnect://cancel";
    @NotNull
    public static final String T = "app_id";
    @NotNull
    public static final String U = "bridge_args";
    @NotNull
    public static final String V = "android_key_hash";
    @NotNull
    public static final String W = "method_args";
    @NotNull
    public static final String X = "method_results";
    @NotNull
    public static final String Y = "version";
    @NotNull
    public static final String Z = "touch";
    @NotNull
    public static final String a0 = "oauth/authorize";
    @NotNull
    public static final String b0 = "https://graph-video.%s";
    @NotNull
    public static final String c = "m.%s";
    @NotNull
    public static final String c0 = "https://graph.%s";
    @NotNull
    public static final String d = "%s";
    @NotNull
    public static final String e = "dialog/";
    @NotNull
    public static final String f = "access_token";
    @NotNull
    public static final String g = "app_id";
    @NotNull
    public static final String h = "auth_type";
    @NotNull
    public static final String i = "cbt";
    @NotNull
    public static final String j = "client_id";
    @NotNull
    public static final String k = "code_challenge";
    @NotNull
    public static final String l = "code_challenge_method";
    @NotNull
    public static final String m = "code_redirect_uri";
    @NotNull
    public static final String n = "cct_prefetching";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f114o = "display";
    @NotNull
    public static final String p = "touch";
    @NotNull
    public static final String q = "e2e";
    @NotNull
    public static final String r = "id_token";
    @NotNull
    public static final String s = "ies";
    @NotNull
    public static final String t = "legacy_override";
    @NotNull
    public static final String u = "login_behavior";
    @NotNull
    public static final String v = "nonce";
    @NotNull
    public static final String w = "redirect_uri";
    @NotNull
    public static final String x = "response_type";
    @NotNull
    public static final String y = "return_scopes";
    @NotNull
    public static final String z = "scope";
    @NotNull
    public static final c0 a = new c0();
    public static final String b = c0.class.getName();

    @InterfaceC9511sW0
    @NotNull
    public static final String a() {
        return "v16.0";
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String b() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format(c, Arrays.copyOf(new Object[]{com.facebook.M.z()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Collection<String> d() {
        return C8222nF.O("service_disabled", "AndroidAuthKillSwitchException");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Collection<String> e() {
        return C8222nF.O("access_denied", "OAuthAccessDeniedException");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String f() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format(c0, Arrays.copyOf(new Object[]{com.facebook.M.z()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String g() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{com.facebook.M.A()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String h() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format(c0, Arrays.copyOf(new Object[]{com.facebook.M.C()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String i(@NotNull String str) {
        C6562gT0.p(str, "subdomain");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(c0, Arrays.copyOf(new Object[]{str}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String j() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format(b0, Arrays.copyOf(new Object[]{com.facebook.M.C()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String k() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        com.facebook.M m2 = com.facebook.M.a;
        String format = String.format(c, Arrays.copyOf(new Object[]{com.facebook.M.D()}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle l(@NotNull String str, int i2, @Nullable Bundle bundle) {
        C6562gT0.p(str, "callId");
        com.facebook.M m2 = com.facebook.M.a;
        String q2 = com.facebook.M.q(com.facebook.M.n());
        l0 l0Var = l0.a;
        if (l0.f0(q2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(V, q2);
        bundle2.putString("app_id", com.facebook.M.o());
        bundle2.putInt("version", i2);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        try {
            C2360e c2360e = C2360e.a;
            JSONObject b2 = C2360e.b(bundle3);
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject b3 = C2360e.b(bundle);
            if (b2 != null && b3 != null) {
                bundle2.putString("bridge_args", b2.toString());
                bundle2.putString("method_args", b3.toString());
                return bundle2;
            }
            return null;
        } catch (IllegalArgumentException e2) {
            V.a aVar = V.e;
            com.facebook.b0 b0Var = com.facebook.b0.DEVELOPER_ERRORS;
            String str2 = b;
            C6562gT0.o(str2, "TAG");
            aVar.b(b0Var, 6, str2, C6562gT0.C("Error creating Url -- ", e2));
            return null;
        } catch (JSONException e3) {
            V.a aVar2 = V.e;
            com.facebook.b0 b0Var2 = com.facebook.b0.DEVELOPER_ERRORS;
            String str3 = b;
            C6562gT0.o(str3, "TAG");
            aVar2.b(b0Var2, 6, str3, C6562gT0.C("Error creating Url -- ", e3));
            return null;
        }
    }
}
