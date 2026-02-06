package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum ZM {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");
    
    @NotNull
    public final String X;

    ZM(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ZM[] valuesCustom() {
        ZM[] valuesCustom = values();
        return (ZM[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
