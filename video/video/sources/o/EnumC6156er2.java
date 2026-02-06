package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.er2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6156er2 {
    LowerIsBetter("LOWER_IS_BETTER"),
    HigherIsBetter("HIGHER_IS_BETTER");
    
    @NotNull
    public final String X;

    EnumC6156er2(String str) {
        this.X = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC6156er2[] valuesCustom() {
        EnumC6156er2[] valuesCustom = values();
        return (EnumC6156er2[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String g() {
        return this.X;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.X;
    }
}
