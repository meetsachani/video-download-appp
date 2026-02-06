package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC3408Ka;
import o.AbstractC7080ic2;

/* renamed from: o.hK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6771hK2 {
    public static final AbstractC3408Ka.b a = new AbstractC3408Ka.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final AbstractC3408Ka.b b = new AbstractC3408Ka.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final AbstractC3408Ka.e c = new AbstractC3408Ka.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final AbstractC3408Ka.c d = new AbstractC3408Ka.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final AbstractC3408Ka.f e = new AbstractC3408Ka.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    @Deprecated
    public static final AbstractC3408Ka.f f = new AbstractC3408Ka.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    @Deprecated
    public static final AbstractC3408Ka.f g = new AbstractC3408Ka.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final AbstractC3408Ka.f h = new AbstractC3408Ka.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final AbstractC3408Ka.f i = new AbstractC3408Ka.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final AbstractC3408Ka.f j = new AbstractC3408Ka.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final AbstractC3408Ka.c k = new AbstractC3408Ka.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final AbstractC3408Ka.c l = new AbstractC3408Ka.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final AbstractC3408Ka.c m = new AbstractC3408Ka.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final AbstractC3408Ka.c n = new AbstractC3408Ka.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o  reason: collision with root package name */
    public static final AbstractC3408Ka.c f758o = new AbstractC3408Ka.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final AbstractC3408Ka.c p = new AbstractC3408Ka.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final AbstractC3408Ka.b q = new AbstractC3408Ka.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final AbstractC3408Ka.b r = new AbstractC3408Ka.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final AbstractC3408Ka.c s = new AbstractC3408Ka.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final AbstractC3408Ka.f t = new AbstractC3408Ka.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final AbstractC3408Ka.c u = new AbstractC3408Ka.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final AbstractC3408Ka.b v = new AbstractC3408Ka.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final AbstractC3408Ka.b w = new AbstractC3408Ka.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final AbstractC3408Ka.f x = new AbstractC3408Ka.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final AbstractC3408Ka.f y = new AbstractC3408Ka.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final AbstractC3408Ka.f z = new AbstractC3408Ka.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final AbstractC3408Ka.b A = new AbstractC3408Ka.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final AbstractC3408Ka.b B = new AbstractC3408Ka.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final AbstractC3408Ka.d C = new AbstractC3408Ka.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final AbstractC3408Ka.b D = new AbstractC3408Ka.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final AbstractC3408Ka.b E = new AbstractC3408Ka.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final AbstractC3408Ka.b F = new AbstractC3408Ka.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final AbstractC3408Ka.b G = new AbstractC3408Ka.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final AbstractC3408Ka.e H = new AbstractC3408Ka.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final AbstractC3408Ka.e I = new AbstractC3408Ka.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final AbstractC3408Ka.h J = new AbstractC3408Ka.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final AbstractC3408Ka.h K = new AbstractC3408Ka.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final AbstractC3408Ka.g L = new AbstractC3408Ka.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final AbstractC7080ic2.b M = new AbstractC7080ic2.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final AbstractC7080ic2.a N = new AbstractC7080ic2.a(C6528gK2.X, C7564kc2.b);
    public static final AbstractC3408Ka.h O = new AbstractC3408Ka.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final AbstractC3408Ka.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final AbstractC3408Ka.d Q = new AbstractC3408Ka.d(C6528gK2.L, C3363Jn0.J);
    public static final AbstractC3408Ka.d R = new AbstractC3408Ka.d(C6528gK2.M, C3363Jn0.Q);
    public static final AbstractC3408Ka.h S = new AbstractC3408Ka.h("FORCE_DARK", "FORCE_DARK");
    public static final AbstractC3408Ka.d T = new AbstractC3408Ka.d(C6528gK2.O, C3363Jn0.S);
    public static final AbstractC3408Ka.d U = new AbstractC3408Ka.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final AbstractC3408Ka.d V = new AbstractC3408Ka.d(C6528gK2.R, C3363Jn0.V);
    public static final AbstractC3408Ka.d W = new AbstractC3408Ka.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final AbstractC3408Ka.d X = new AbstractC3408Ka.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final AbstractC3408Ka.d Y = new AbstractC3408Ka.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final AbstractC3408Ka.d Z = new AbstractC3408Ka.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final AbstractC3408Ka.d a0 = new AbstractC3408Ka.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final AbstractC3408Ka.d b0 = new AbstractC3408Ka.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    public static final AbstractC3408Ka.d c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");
    public static final AbstractC3408Ka.d d0 = new AbstractC3408Ka.d(C6528gK2.b0, C3363Jn0.g0);
    public static final AbstractC3408Ka.d e0 = new AbstractC3408Ka.d(C6528gK2.c0, C3363Jn0.h0);
    public static final AbstractC3408Ka.d f0 = new AbstractC3408Ka.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* renamed from: o.hK2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3408Ka.i {
        public final Pattern d;

        public a(String str, String str2) {
            super(str, str2);
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // o.AbstractC3408Ka
        public boolean d() {
            boolean d = super.d();
            if (d && Build.VERSION.SDK_INT < 29) {
                PackageInfo f = C6273fK2.f();
                if (f == null) {
                    return false;
                }
                Matcher matcher = this.d.matcher(f.versionName);
                if (!matcher.find() || Integer.parseInt(f.versionName.substring(matcher.start(), matcher.end())) < 105) {
                    return false;
                }
                return true;
            }
            return d;
        }
    }

    /* renamed from: o.hK2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3408Ka.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC3408Ka
        public boolean d() {
            if (!super.d() || !C6528gK2.a(C6528gK2.M)) {
                return false;
            }
            return C6273fK2.t();
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str, Context context) {
        return c(str, AbstractC7080ic2.g(), context);
    }

    public static boolean c(String str, Collection<AbstractC7080ic2> collection, Context context) {
        HashSet<AbstractC7080ic2> hashSet = new HashSet();
        for (AbstractC7080ic2 abstractC7080ic2 : collection) {
            if (abstractC7080ic2.b().equals(str)) {
                hashSet.add(abstractC7080ic2);
            }
        }
        if (!hashSet.isEmpty()) {
            for (AbstractC7080ic2 abstractC7080ic22 : hashSet) {
                if (abstractC7080ic22.d(context)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    public static boolean d(String str) {
        return e(str, AbstractC3408Ka.e());
    }

    public static <T extends GJ> boolean e(String str, Collection<T> collection) {
        HashSet<GJ> hashSet = new HashSet();
        for (T t2 : collection) {
            if (t2.a().equals(str)) {
                hashSet.add(t2);
            }
        }
        if (!hashSet.isEmpty()) {
            for (GJ gj : hashSet) {
                if (gj.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
