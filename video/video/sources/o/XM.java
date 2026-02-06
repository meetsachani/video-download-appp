package o;

import com.facebook.appevents.C2326p;
import com.facebook.internal.C2359d;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum XM {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME(C2359d.e),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE(FirebaseAnalytics.Param.h),
    DESCRIPTION("description"),
    LEVEL(FirebaseAnalytics.Param.t),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID("order_id"),
    AD_TYPE(C2326p.e0),
    CURRENCY(FirebaseAnalytics.Param.i);
    
    @NotNull
    public final String X;

    XM(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static XM[] valuesCustom() {
        XM[] valuesCustom = values();
        return (XM[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
