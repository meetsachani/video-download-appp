package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C9273rY;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8557od0;
import o.KS1;
import o.M82;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final zzdf a;
    public ExecutorService b;

    /* loaded from: classes3.dex */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* loaded from: classes3.dex */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    /* loaded from: classes3.dex */
    public static class Event {
        @InterfaceC5670cr1
        public static final String A = "screen_view";
        @InterfaceC5670cr1
        public static final String B = "remove_from_cart";
        @InterfaceC5670cr1
        public static final String C = "add_shipping_info";
        @InterfaceC5670cr1
        public static final String D = "purchase";
        @InterfaceC5670cr1
        public static final String E = "refund";
        @InterfaceC5670cr1
        public static final String F = "select_item";
        @InterfaceC5670cr1
        public static final String G = "select_promotion";
        @InterfaceC5670cr1
        public static final String H = "view_cart";
        @InterfaceC5670cr1
        public static final String I = "view_promotion";
        @InterfaceC5670cr1
        public static final String a = "ad_impression";
        @InterfaceC5670cr1
        public static final String b = "add_payment_info";
        @InterfaceC5670cr1
        public static final String c = "add_to_cart";
        @InterfaceC5670cr1
        public static final String d = "add_to_wishlist";
        @InterfaceC5670cr1
        public static final String e = "app_open";
        @InterfaceC5670cr1
        public static final String f = "begin_checkout";
        @InterfaceC5670cr1
        public static final String g = "campaign_details";
        @InterfaceC5670cr1
        public static final String h = "generate_lead";
        @InterfaceC5670cr1
        public static final String i = "join_group";
        @InterfaceC5670cr1
        public static final String j = "level_end";
        @InterfaceC5670cr1
        public static final String k = "level_start";
        @InterfaceC5670cr1
        public static final String l = "level_up";
        @InterfaceC5670cr1
        public static final String m = "login";
        @InterfaceC5670cr1
        public static final String n = "post_score";
        @InterfaceC5670cr1

        /* renamed from: o  reason: collision with root package name */
        public static final String f334o = "search";
        @InterfaceC5670cr1
        public static final String p = "select_content";
        @InterfaceC5670cr1
        public static final String q = "share";
        @InterfaceC5670cr1
        public static final String r = "sign_up";
        @InterfaceC5670cr1
        public static final String s = "spend_virtual_currency";
        @InterfaceC5670cr1
        public static final String t = "tutorial_begin";
        @InterfaceC5670cr1
        public static final String u = "tutorial_complete";
        @InterfaceC5670cr1
        public static final String v = "unlock_achievement";
        @InterfaceC5670cr1
        public static final String w = "view_item";
        @InterfaceC5670cr1
        public static final String x = "view_item_list";
        @InterfaceC5670cr1
        public static final String y = "view_search_results";
        @InterfaceC5670cr1
        public static final String z = "earn_virtual_currency";
    }

    /* loaded from: classes3.dex */
    public static class Param {
        @InterfaceC5670cr1
        public static final String A = "origin";
        @InterfaceC5670cr1
        public static final String B = "price";
        @InterfaceC5670cr1
        public static final String C = "quantity";
        @InterfaceC5670cr1
        public static final String D = "score";
        @InterfaceC5670cr1
        public static final String E = "shipping";
        @InterfaceC5670cr1
        public static final String F = "transaction_id";
        @InterfaceC5670cr1
        public static final String G = "search_term";
        @InterfaceC5670cr1
        public static final String H = "success";
        @InterfaceC5670cr1
        public static final String I = "tax";
        @InterfaceC5670cr1
        public static final String J = "value";
        @InterfaceC5670cr1
        public static final String K = "virtual_currency_name";
        @InterfaceC5670cr1
        public static final String L = "campaign";
        @InterfaceC5670cr1
        public static final String M = "source";
        @InterfaceC5670cr1
        public static final String N = "medium";
        @InterfaceC5670cr1
        public static final String O = "term";
        @InterfaceC5670cr1
        public static final String P = "content";
        @InterfaceC5670cr1
        public static final String Q = "aclid";
        @InterfaceC5670cr1
        public static final String R = "cp1";
        @InterfaceC5670cr1
        public static final String S = "campaign_id";
        @InterfaceC5670cr1
        public static final String T = "source_platform";
        @InterfaceC5670cr1
        public static final String U = "creative_format";
        @InterfaceC5670cr1
        public static final String V = "marketing_tactic";
        @InterfaceC5670cr1
        public static final String W = "item_brand";
        @InterfaceC5670cr1
        public static final String X = "item_variant";
        @InterfaceC5670cr1
        public static final String Y = "creative_name";
        @InterfaceC5670cr1
        public static final String Z = "creative_slot";
        @InterfaceC5670cr1
        public static final String a = "achievement_id";
        @InterfaceC5670cr1
        public static final String a0 = "affiliation";
        @InterfaceC5670cr1
        public static final String b = "ad_format";
        @InterfaceC5670cr1
        public static final String b0 = "index";
        @InterfaceC5670cr1
        public static final String c = "ad_platform";
        @InterfaceC5670cr1
        public static final String c0 = "discount";
        @InterfaceC5670cr1
        public static final String d = "ad_source";
        @InterfaceC5670cr1
        public static final String d0 = "item_category2";
        @InterfaceC5670cr1
        public static final String e = "ad_unit_name";
        @InterfaceC5670cr1
        public static final String e0 = "item_category3";
        @InterfaceC5670cr1
        public static final String f = "character";
        @InterfaceC5670cr1
        public static final String f0 = "item_category4";
        @InterfaceC5670cr1
        public static final String g = "travel_class";
        @InterfaceC5670cr1
        public static final String g0 = "item_category5";
        @InterfaceC5670cr1
        public static final String h = "content_type";
        @InterfaceC5670cr1
        public static final String h0 = "item_list_id";
        @InterfaceC5670cr1
        public static final String i = "currency";
        @InterfaceC5670cr1
        public static final String i0 = "item_list_name";
        @InterfaceC5670cr1
        public static final String j = "coupon";
        @InterfaceC5670cr1
        public static final String j0 = "items";
        @InterfaceC5670cr1
        public static final String k = "start_date";
        @InterfaceC5670cr1
        public static final String k0 = "location_id";
        @InterfaceC5670cr1
        public static final String l = "end_date";
        @InterfaceC5670cr1
        public static final String l0 = "payment_type";
        @InterfaceC5670cr1
        public static final String m = "extend_session";
        @InterfaceC5670cr1
        public static final String m0 = "promotion_id";
        @InterfaceC5670cr1
        public static final String n = "flight_number";
        @InterfaceC5670cr1
        public static final String n0 = "promotion_name";
        @InterfaceC5670cr1

        /* renamed from: o  reason: collision with root package name */
        public static final String f335o = "group_id";
        @InterfaceC5670cr1
        public static final String o0 = "screen_class";
        @InterfaceC5670cr1
        public static final String p = "item_category";
        @InterfaceC5670cr1
        public static final String p0 = "screen_name";
        @InterfaceC5670cr1
        public static final String q = "item_id";
        @InterfaceC5670cr1
        public static final String q0 = "shipping_tier";
        @InterfaceC5670cr1
        public static final String r = "item_name";
        @InterfaceC5670cr1
        public static final String s = "location";
        @InterfaceC5670cr1
        public static final String t = "level";
        @InterfaceC5670cr1
        public static final String u = "level_name";
        @InterfaceC5670cr1
        public static final String v = "method";
        @InterfaceC5670cr1
        public static final String w = "number_of_nights";
        @InterfaceC5670cr1
        public static final String x = "number_of_passengers";
        @InterfaceC5670cr1
        public static final String y = "number_of_rooms";
        @InterfaceC5670cr1
        public static final String z = "destination";
    }

    /* loaded from: classes3.dex */
    public static class UserProperty {
        @InterfaceC5670cr1
        public static final String a = "sign_up_method";
        @InterfaceC5670cr1
        public static final String b = "allow_personalized_ads";
    }

    public FirebaseAnalytics(zzdf zzdfVar) {
        Preconditions.r(zzdfVar);
        this.a = zzdfVar;
    }

    @InterfaceC5670cr1
    @Keep
    @KS1(allOf = {"android.permission.INTERNET", C9273rY.b, "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@InterfaceC5670cr1 Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(zzdf.f(context));
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @InterfaceC11300zs1
    @Keep
    public static zzjz getScionFrontendApiImplementation(Context context, @InterfaceC11300zs1 Bundle bundle) {
        zzdf g = zzdf.g(context, null, null, null, bundle);
        if (g == null) {
            return null;
        }
        return new zzc(g);
    }

    @InterfaceC5670cr1
    public final Task<String> a() {
        try {
            return Tasks.d(l(), new zza(this));
        } catch (RuntimeException e) {
            this.a.k(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.f(e);
        }
    }

    @InterfaceC5670cr1
    public final Task<Long> b() {
        try {
            return Tasks.d(l(), new zzd(this));
        } catch (RuntimeException e) {
            this.a.k(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.f(e);
        }
    }

    public final void c(@M82(max = 40, min = 1) @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Bundle bundle) {
        this.a.w(str, bundle);
    }

    public final void d() {
        this.a.Y();
    }

    public final void e(boolean z) {
        this.a.u(Boolean.valueOf(z));
    }

    public final void f(@InterfaceC5670cr1 Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bundle.putString("ad_storage", "denied");
                }
            } else {
                bundle.putString("ad_storage", "granted");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    bundle.putString("analytics_storage", "denied");
                }
            } else {
                bundle.putString("analytics_storage", "granted");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int ordinal3 = consentStatus3.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    bundle.putString("ad_user_data", "denied");
                }
            } else {
                bundle.putString("ad_user_data", "granted");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int ordinal4 = consentStatus4.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    bundle.putString("ad_personalization", "denied");
                }
            } else {
                bundle.putString("ad_personalization", "granted");
            }
        }
        this.a.M(bundle);
    }

    public final void g(@InterfaceC11300zs1 Bundle bundle) {
        this.a.R(bundle);
    }

    @InterfaceC5670cr1
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.b(FirebaseInstallations.u().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long j) {
        this.a.l(j);
    }

    public final void i(@InterfaceC11300zs1 String str) {
        this.a.S(str);
    }

    public final void j(@M82(max = 24, min = 1) @InterfaceC5670cr1 String str, @InterfaceC11300zs1 @M82(max = 36) String str2) {
        this.a.I(str, str2);
    }

    @InterfaceC8557od0({"this.executor"})
    public final ExecutorService l() {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.b = new zzb(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Keep
    @InterfaceC10389w71
    @Deprecated
    public final void setCurrentScreen(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 @M82(max = 36, min = 1) String str, @InterfaceC11300zs1 @M82(max = 36, min = 1) String str2) {
        this.a.m(activity, str, str2);
    }
}
