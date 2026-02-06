package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum G22 {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");
    
    @NotNull
    public final String X;

    G22(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static G22[] valuesCustom() {
        G22[] valuesCustom = values();
        return (G22[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }
}
