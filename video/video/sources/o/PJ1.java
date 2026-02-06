package o;

import android.os.Bundle;
import com.facebook.appevents.C2326p;
import com.facebook.internal.C2379y;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class PJ1 {
    public static boolean b = false;
    @NotNull
    public static final String c = "pm";
    @NotNull
    public static final String d = "1";
    @Nullable
    public static HashSet<String> f;
    @NotNull
    public static final PJ1 a = new PJ1();
    @NotNull
    public static final EY0 e = WY0.b(a.X);

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<HashSet<String>> {
        public static final a X = new a();

        public a() {
            super(0);
        }

        @Override // o.FA0
        @NotNull
        /* renamed from: c */
        public final HashSet<String> invoke() {
            return B22.m("_currency", C2326p.g0, "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", C2326p.P, "fb_contents", "fb_country", C2326p.N, "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", C2326p.W, C2326p.f0, "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", C2326p.S, "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", FK.c, FK.d, "_implicitlyLogged", "_inBackground", "_isTimedEvent", FK.b, "_session_id", "_ui", "_valueToUpdate", EK.c, "_is_suggested_event", com.facebook.appevents.G.e, "fb_pixel_id", "trace_id", "subscription_id", "event_id", NT1.i, RR0.e, "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", C2326p.a0, C2326p.b0, "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", C2326p.e0, C2326p.Q, C2326p.R, C2326p.Y, C2326p.X, C2326p.U, C2326p.V, C2326p.O, C2326p.T, PJ1.c, "_audiencePropertyIds", "cs_maca");
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (SQ.e(PJ1.class)) {
            return;
        }
        try {
            b = false;
        } catch (Throwable th) {
            SQ.c(th, PJ1.class);
        }
    }

    @InterfaceC9511sW0
    public static final void c() {
        if (SQ.e(PJ1.class)) {
            return;
        }
        try {
            b = true;
            a.e();
        } catch (Throwable th) {
            SQ.c(th, PJ1.class);
        }
    }

    @InterfaceC9511sW0
    public static final void f(@Nullable Bundle bundle) {
        if (!SQ.e(PJ1.class)) {
            try {
                if (b && bundle != null && !bundle.isEmpty() && f != null) {
                    ArrayList<String> arrayList = new ArrayList();
                    Set<String> keySet = bundle.keySet();
                    C6562gT0.o(keySet, "parameters.keySet()");
                    for (String str : keySet) {
                        HashSet<String> hashSet = f;
                        C6562gT0.m(hashSet);
                        if (!hashSet.contains(str)) {
                            C6562gT0.o(str, "param");
                            arrayList.add(str);
                        }
                    }
                    for (String str2 : arrayList) {
                        bundle.remove(str2);
                    }
                    bundle.putString(c, "1");
                }
            } catch (Throwable th) {
                SQ.c(th, PJ1.class);
            }
        }
    }

    public final HashSet<String> a(JSONArray jSONArray) {
        if (!SQ.e(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            String string = jSONArray.getString(i);
                            C6562gT0.o(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
        return null;
    }

    @NotNull
    public final HashSet<String> d() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return (HashSet) e.getValue();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void e() {
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q == null) {
                    return;
                }
                HashSet<String> a2 = a(q.n());
                if (a2 == null) {
                    a2 = d();
                }
                f = a2;
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean g(@NotNull Bundle bundle) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
            if (bundle.containsKey(c)) {
                if (C6562gT0.g(bundle.get(c), "1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
