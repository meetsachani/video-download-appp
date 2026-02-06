package o;

import com.android.installreferrer.api.ReferrerDetails;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.ad  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5127ad {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID(com.facebook.p0.g),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER(ReferrerDetails.b),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public final String X;

    /* renamed from: o.ad$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final EnumC5127ad a(@NotNull String str) {
            EnumC5127ad[] valuesCustom;
            C6562gT0.p(str, "rawValue");
            for (EnumC5127ad enumC5127ad : EnumC5127ad.valuesCustom()) {
                if (C6562gT0.g(enumC5127ad.g(), str)) {
                    return enumC5127ad;
                }
            }
            return null;
        }

        public a() {
        }
    }

    EnumC5127ad(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC5127ad[] valuesCustom() {
        EnumC5127ad[] valuesCustom = values();
        return (EnumC5127ad[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
