package o;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.zw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC11316zw1 {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP(FirebaseMessaging.r),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    
    @NotNull
    public final String X;

    EnumC11316zw1(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC11316zw1[] valuesCustom() {
        EnumC11316zw1[] valuesCustom = values();
        return (EnumC11316zw1[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
