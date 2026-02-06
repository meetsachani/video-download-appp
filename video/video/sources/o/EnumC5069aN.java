package o;

import com.android.installreferrer.api.ReferrerDetails;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.aN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5069aN {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
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
    public final String X;

    EnumC5069aN(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC5069aN[] valuesCustom() {
        EnumC5069aN[] valuesCustom = values();
        return (EnumC5069aN[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
